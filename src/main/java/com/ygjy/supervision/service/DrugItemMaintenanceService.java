package com.ygjy.supervision.service;

import com.ygjy.pojo.DurgsFrom;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DrugItemMaintenanceService {
    List<DurgsFrom> findSelectOption();
}
