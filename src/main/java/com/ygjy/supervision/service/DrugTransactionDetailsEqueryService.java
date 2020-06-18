package com.ygjy.supervision.service;

import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public interface DrugTransactionDetailsEqueryService {
    PageInfo findAllDetailsEquery(Integer pageNum);

    Map findAllPurchaseOrder();
}
