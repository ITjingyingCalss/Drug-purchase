package com.ygjy.supervision.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.ygjy.dao.DrugInformationDAO;
import com.ygjy.dao.HospitalTransactionDetailsDAO;
import com.ygjy.dao.PurchaseOrderDAO;
import com.ygjy.dao.PurchaseStatusDAO;
import com.ygjy.pojo.*;
import com.ygjy.supervision.service.DrugTransactionDetailsEqueryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class DrugTransactionDetailsEqueryServiceImpl implements DrugTransactionDetailsEqueryService {
    @Autowired private HospitalTransactionDetailsDAO hospitalTransactionDetailsDAO;
    @Autowired private PurchaseOrderDAO purchaseOrderDAO;
    @Autowired private DrugInformationDAO drugInformationDAO;
    @Autowired private PurchaseStatusDAO purchaseStatusDAO;
    @Override
    public PageInfo findAllDetailsEquery(Integer pageNum) {
        PageHelper.startPage(pageNum,5);
        HospitalTransactionDetailsExample hospitalTransactionDetailsExample = new HospitalTransactionDetailsExample();
        List<HospitalTransactionDetails> hospitalTransactionDetails = hospitalTransactionDetailsDAO.selectByExample(hospitalTransactionDetailsExample);
        return new PageInfo(hospitalTransactionDetails);
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
