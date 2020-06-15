package com.ygjy.purchasingmanagement1.service;

import com.ygjy.purchasingmanagement1.pojo.PurchaseOrder;

import java.util.List;

public interface PurchaseOrderService {

    public List<PurchaseOrder> selectPurchaseOrder();

    public PurchaseOrder selectOne(Integer id);

    public int updatePurchaseOrder(PurchaseOrder purchaseOrder);

    public int deletePurchaseOrder(Integer id);
}
