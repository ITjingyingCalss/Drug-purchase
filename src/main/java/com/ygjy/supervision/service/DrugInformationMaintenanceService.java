package com.ygjy.supervision.service;

import com.github.pagehelper.PageInfo;
import com.ygjy.pojo.DrugInformation;
import com.ygjy.pojo.DrugItems;
import com.ygjy.pojo.Enterprise;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.Map;
@Service
public interface DrugInformationMaintenanceService {
    Map findQualityLevelAndDrugTradingStatus();

    PageInfo findAllDrugInformation(Integer pageNum, DrugInformation drugInformation,Float startPrice,Float endPrice);

    List<Enterprise> findAllEnterprise();

    Map saveDrugInformation(DrugItems drugItems, DrugInformation drugInformation);

    DrugInformation findDrugInformationById(Integer id);

    Integer updateDrugInformationState(Integer id);

    List<DrugInformation> exportDrugInformationExcle(DrugInformation drugInformation,Float startPrice,Float endPrice);

    Integer multipartFileToFile(MultipartFile file) throws Exception;
}
