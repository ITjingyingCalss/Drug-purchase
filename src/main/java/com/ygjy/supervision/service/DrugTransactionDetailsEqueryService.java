package com.ygjy.supervision.service;

import com.github.pagehelper.PageInfo;
import com.ygjy.pojo.DrugInformation;
import com.ygjy.pojo.HospitalTransactionDetails;
import com.ygjy.pojo.PurchaseOrder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public interface DrugTransactionDetailsEqueryService {
    List<HospitalTransactionDetails> findAllDetailsEquery(DrugInformation drugInformation, PurchaseOrder purchaseOrder, String procurementStartTime, String procurementEndTime);

    Map findAllPurchaseOrder();
}
