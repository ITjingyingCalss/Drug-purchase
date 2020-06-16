package com.ygjy.purchasingmanagement1.service.impl;

import com.ygjy.purchasingmanagement1.pojo.PurchaseOrder;
import com.ygjy.purchasingmanagement1.dao.PurchaseOrderDao;
import com.ygjy.purchasingmanagement1.service.PurchaseOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
@Service
public class PurchaseOrderImpl implements PurchaseOrderService {

    @Autowired
    PurchaseOrderDao purchaseOrderDao;

    @Override
    public List<PurchaseOrder> selectPurchaseOrder() {
        return purchaseOrderDao.selectPurchaseOrder();
    }

    @Override
    public PurchaseOrder selectOne(Integer id) {
        return purchaseOrderDao.selectOne(id);
    }

    @Override
    public int updatePurchaseOrder(PurchaseOrder purchaseOrder) {
        return purchaseOrderDao.updatePurchaseOrder(purchaseOrder);
    }

    @Override
    public int deletePurchaseOrder(Integer id) {
        return purchaseOrderDao.deletePurchaseOrder(id);
    }

    @Override
    public int addPurchaseOrder(PurchaseOrder purchaseOrder) {
        return purchaseOrderDao.addPurchaseOrder(purchaseOrder);
    }

    @Override
    public List<PurchaseOrder> selectLikePurchaseOrder(String purchaseOrderNumber, String nameOfPurchaseOrder, Integer purchaseState, Date submissionTime, Integer hospitalId) {
        return purchaseOrderDao.selectLikePurchaseOrder(purchaseOrderNumber,nameOfPurchaseOrder,purchaseState,submissionTime,hospitalId);
    }

}
