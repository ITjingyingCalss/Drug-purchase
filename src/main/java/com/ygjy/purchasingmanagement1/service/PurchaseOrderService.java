package com.ygjy.purchasingmanagement1.service;

import com.ygjy.purchasingmanagement1.pojo.PurchaseOrder;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

public interface PurchaseOrderService {

    public List<PurchaseOrder> selectPurchaseOrder();

    public PurchaseOrder selectOne(Integer id);

    public int updatePurchaseOrder(PurchaseOrder purchaseOrder);

    public int deletePurchaseOrder(Integer id);

    public int addPurchaseOrder(PurchaseOrder purchaseOrder);

    public List<PurchaseOrder> selectLikePurchaseOrder(String purchaseOrderNumber,
                                                      String nameOfPurchaseOrder,
                                                     Integer purchaseState,
                                                     Date submissionTime,
                                                       Integer hospitalId);

}
