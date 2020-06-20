package com.ygjy.supervision.service.impl;

import com.ygjy.dao.HospitalDAO;
import com.ygjy.dao.PurchaseOrderDAO;
import com.ygjy.dao.PurchaseOrdersStatesDAO;
import com.ygjy.pojo.*;
import com.ygjy.supervision.dao.PurchaseOrderApprovalMapper;
import com.ygjy.supervision.service.PurchaseOrderApprovalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class PurchaseOrderApprovalServiceImpl implements PurchaseOrderApprovalService {
    @Autowired private PurchaseOrderApprovalMapper purchaseOrderApprovalMapper;
    @Autowired private HospitalDAO hospitalDAO;
    @Autowired private PurchaseOrdersStatesDAO purchaseOrdersStatesDAO;
    @Autowired private PurchaseOrderDAO purchaseOrderDAO;
    @Override
    public List<PurchaseOrder> findAllPurchaseOrder(PurchaseOrder purchaseOrder, String procurementStartTime, String procurementEndTime){
        List<PurchaseOrder> list = purchaseOrderApprovalMapper.findAllPurchaseOrder(purchaseOrder,procurementStartTime,procurementEndTime);
        return list;
    }

    @Override
    public Map findHospitalAndPurchaseOrderStatus() {
        Map map = new HashMap();
        HospitalExample hospitalExample = new HospitalExample();
        PurchaseOrdersStatesExample purchaseOrdersStatesExample = new PurchaseOrdersStatesExample();
        List<Hospital> hospitalList = hospitalDAO.selectByExample(hospitalExample);
        List<PurchaseOrdersStates> purchaseOrdersStatesList = purchaseOrdersStatesDAO.selectByExample(purchaseOrdersStatesExample);
        map.put("hospitalList",hospitalList);
        map.put("purchaseOrdersStatesList",purchaseOrdersStatesList);
        return map;
    }

    @Override
    public Integer submitAuditResults(List<Integer> ids, List<Integer> purchaseStateS, List<String> auditOpinionS) {
        int sum = 0;
        for (int i=0;i<ids.size();i++){
            PurchaseOrder purchaseOrder = purchaseOrderDAO.selectByPrimaryKey(ids.get(i));
            purchaseOrder.setPurchaseState(purchaseStateS.get(i));
            purchaseOrder.setAuditOpinion(auditOpinionS.get(i));
            sum+=purchaseOrderDAO.updateByPrimaryKeySelective(purchaseOrder);
        }
        return sum;
    }

    @Override
    public PurchaseOrder findOne(Integer id) {
        return purchaseOrderDAO.selectByPrimaryKey(id);
    }
}
