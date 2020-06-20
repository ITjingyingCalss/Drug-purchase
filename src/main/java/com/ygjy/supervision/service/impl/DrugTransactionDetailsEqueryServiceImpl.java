package com.ygjy.supervision.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.ygjy.dao.DrugInformationDAO;
import com.ygjy.dao.HospitalTransactionDetailsDAO;
import com.ygjy.dao.PurchaseOrderDAO;
import com.ygjy.dao.PurchaseStatusDAO;
import com.ygjy.pojo.*;
import com.ygjy.supervision.dao.DrugInformationMapper;
import com.ygjy.supervision.dao.PurchaseOrderApprovalMapper;
import com.ygjy.supervision.service.DrugTransactionDetailsEqueryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class DrugTransactionDetailsEqueryServiceImpl implements DrugTransactionDetailsEqueryService {
    @Autowired private HospitalTransactionDetailsDAO hospitalTransactionDetailsDAO;
    @Autowired private PurchaseOrderDAO purchaseOrderDAO;
    @Autowired private DrugInformationDAO drugInformationDAO;
    @Autowired private PurchaseStatusDAO purchaseStatusDAO;
    @Autowired private DrugInformationMapper drugInformationMapper;
    @Autowired private PurchaseOrderApprovalMapper purchaseOrderApprovalMapper;
    @Override
    public List<HospitalTransactionDetails> findAllDetailsEquery(DrugInformation drugInformation,PurchaseOrder purchaseOrder,String procurementStartTime,String procurementEndTime) {
        List<HospitalTransactionDetails> list = new ArrayList<HospitalTransactionDetails>();
        HospitalTransactionDetailsExample hospitalTransactionDetailsExample = new HospitalTransactionDetailsExample();
        List<HospitalTransactionDetails> hospitalTransactionDetailsList = hospitalTransactionDetailsDAO.selectByExample(hospitalTransactionDetailsExample);
        List<DrugInformation> drugInformationList = drugInformationMapper.findAllDrugInformation(drugInformation, null, null);
        List<PurchaseOrder> purchaseOrderList = purchaseOrderApprovalMapper.findAllPurchaseOrder(purchaseOrder, procurementStartTime, procurementEndTime);
        for (HospitalTransactionDetails hospitalTransactionDetails : hospitalTransactionDetailsList ) {
            for (PurchaseOrder purchaseOrder1: purchaseOrderList) {
                for (DrugInformation drugInformation1: drugInformationList) {
                    if (hospitalTransactionDetails.getPurchaseOrdersId()==purchaseOrder1.getId()&&hospitalTransactionDetails.getDrugInformationId()==drugInformation1.getId()){
                        list.add(hospitalTransactionDetails);
                    }
                }
            }
        }
        return list;
    }

    @Override
    public Map findAllPurchaseOrder() {
        Map map = new HashMap();
        PurchaseOrderExample purchaseOrderExample = new PurchaseOrderExample();
        DrugInformationExample drugInformationExample = new DrugInformationExample();
        PurchaseStatusExample purchaseStatusExample =new PurchaseStatusExample();
        List<PurchaseOrder> purchaseOrderList = purchaseOrderDAO.selectByExample(purchaseOrderExample);
        List<DrugInformation> drugInformationList = drugInformationDAO.selectByExample(drugInformationExample);
        List<PurchaseStatus> purchaseStatusList = purchaseStatusDAO.selectByExample(purchaseStatusExample);
        map.put("purchaseOrderList",purchaseOrderList);
        map.put("drugInformationList",drugInformationList);
        map.put("purchaseStatusList",purchaseStatusList);
        return map;
    }
}
