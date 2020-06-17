package com.ygjy.supervision.service;

import com.github.pagehelper.PageInfo;
import com.ygjy.pojo.DrugInformation;
import com.ygjy.pojo.Suppliers;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface SupplierAuditService {
    PageInfo findAllAudit(DrugInformation drugInformation, Suppliers suppliers);

    Integer submitAuditResults(List<Integer> ids, List<Integer> purchaseStateS);
}
