package com.ygjy.supervision.service.impl;

import com.github.pagehelper.PageInfo;
import com.ygjy.dao.DrugInformationDAO;
import com.ygjy.pojo.DrugInformation;
import com.ygjy.pojo.PurchaseOrder;
import com.ygjy.pojo.Suppliers;
import com.ygjy.supervision.service.SupplierAuditService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class supplierAuditServiceImpl implements SupplierAuditService {
    @Autowired private DrugInformationDAO drugInformationDAO;
    @Override
    public PageInfo findAllAudit(DrugInformation drugInformation, Suppliers suppliers) {
        return null;
    }

    @Override
    public Integer submitAuditResults(List<Integer> ids, List<Integer> purchaseStateS) {
        int sum = 0;
        for (int i=0;i<ids.size();i++){
            DrugInformation drugInformation = drugInformationDAO.selectByPrimaryKey(ids.get(i));
            drugInformation.setAuditStatus(purchaseStateS.get(i));
            sum+=drugInformationDAO.updateByPrimaryKeySelective(drugInformation);
        }
        return sum;
    }

    @Override
    public DrugInformation findOne(Integer id) {
        return drugInformationDAO.selectByPrimaryKey(id);
    }
}

