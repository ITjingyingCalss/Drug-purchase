package com.ygjy.supervision.service;

import com.github.pagehelper.PageInfo;
import com.ygjy.pojo.PurchaseOrder;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.util.Map;

@Service
public interface PurchaseOrderApprovalService {
    PageInfo findAllPurchaseOrder(PurchaseOrder purchaseOrder,String procurementStartTime,String procurementEndTime,Integer pageNum);

    Map findHospitalAndPurchaseOrderStatus();
}
