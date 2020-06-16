package com.ygjy.supervision.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
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
    @Override
    public PageInfo findAllPurchaseOrder(PurchaseOrder purchaseOrder,String procurementStartTime,String procurementEndTime,Integer pageNum){
        PageHelper.startPage(pageNum,5);
        List<PurchaseOrder> list = purchaseOrderApprovalMapper.findAllPurchaseOrder(purchaseOrder,procurementStartTime,procurementEndTime);
        return new PageInfo(list);
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
}
