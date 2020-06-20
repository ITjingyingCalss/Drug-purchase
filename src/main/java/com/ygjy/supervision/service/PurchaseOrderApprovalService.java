package com.ygjy.supervision.service;

import com.ygjy.pojo.PurchaseOrder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public interface PurchaseOrderApprovalService {
    List<PurchaseOrder> findAllPurchaseOrder(PurchaseOrder purchaseOrder, String procurementStartTime, String procurementEndTime);

    Map findHospitalAndPurchaseOrderStatus();

    Integer submitAuditResults(List<Integer> ids, List<Integer> purchaseStateS, List<String> auditOpinionS);

    PurchaseOrder findOne(Integer id);
}
