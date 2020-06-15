package com.ygjy.supervision.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.ygjy.dao.DrugInformationDAO;
import com.ygjy.dao.DrugTransactionStatusDAO;
import com.ygjy.dao.EnterpriseDAO;
import com.ygjy.dao.QualityLevelDAO;
import com.ygjy.pojo.*;
import com.ygjy.supervision.dao.DrugInformationMapper;
import com.ygjy.supervision.dao.DrugItemsMapper;
import com.ygjy.supervision.service.DrugInformationMaintenanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

@Service
public class DrugInformationMaintenanceServiceImpl implements DrugInformationMaintenanceService {
    @Autowired private QualityLevelDAO qualityLevelDAO;
    @Autowired private DrugTransactionStatusDAO drugTransactionStatusDAO;
    @Autowired private EnterpriseDAO enterpriseDAO;
    @Autowired private DrugInformationDAO drugInformationDAO;
    @Autowired private DrugItemsMapper drugItemsMapper;
    @Autowired private DrugInformationMapper drugInformationMapper;
    @Override
    public Map findQualityLevelAndDrugTradingStatus() {
        Map map = new HashMap();
        QualityLevelExample qualityLevelExample = new QualityLevelExample();
        DrugTransactionStatusExample drugTransactionStatusExample = new DrugTransactionStatusExample();
        List<QualityLevel> list_qualityLevel = qualityLevelDAO.selectByExample(qualityLevelExample);
        List<DrugTransactionStatus> list_drugTransactionStatus = drugTransactionStatusDAO.selectByExample(drugTransactionStatusExample);
        map.put("list_qualityLevel",list_qualityLevel);
        map.put("list_drugTransactionStatus",list_drugTransactionStatus);
        return map;
    }
//分页查询
    @Override
    public PageInfo findAllDrugInformation(Integer pageNum, DrugInformation drugInformation,Float startPrice,Float endPrice) {
        int count = drugInformationMapper.findDrugInformationCount();
       // System.err.println(count);
        PageHelper.startPage(pageNum, 5);
        List<DrugInformation> drugInformationList = drugInformationMapper.findAllDrugInformation(drugInformation,startPrice,endPrice);
        return new PageInfo(drugInformationList);
    }

    @Override
    public List<Enterprise> findAllEnterprise() {
        EnterpriseExample enterpriseExample = new EnterpriseExample();
        return enterpriseDAO.selectByExample(enterpriseExample);
    }

    @Override
    public Map saveDrugInformation(DrugItems drugItems, DrugInformation drugInformation) {
        Map map = new HashMap();
        if (drugInformation.getId()==null){
            map.put("drugItems",drugItems);
            DrugItems drugItems1 = drugItemsMapper.findDrugItemsByDrugItems(drugItems);
            if (drugItems1!=null){
                DrugInformationExample drugInformationExample = new DrugInformationExample();
                List<DrugInformation> list = drugInformationDAO.selectByExample(drugInformationExample);
                //获取随机数并判断数据库是否存在
                String random = "";
                random = this.redom();
                for (DrugInformation drugInformation1:list){
                    if (random!=drugInformation1.getSerialNumber()){
                        drugInformation.setSerialNumber(random);
                    }else {
                        random = this.redom();
                    }
                }
                drugInformation.setDrugCategoryId(drugItems1.getDrugCategoryId());
                int i = drugInformationMapper.insertDrugInformation(drugInformation);
                map.put("drugInformation",drugInformation);
                map.put("i",i);
            }else {
                map.put("i",0);
            }
            return map;
        }else {
            Integer i = drugInformationDAO.updateByPrimaryKeySelective(drugInformation);
            map.put("i",i);
            return map;
        }
    }
//根据ID查询
    @Override
    public DrugInformation findDrugInformationById(Integer id) {
        return drugInformationDAO.selectByPrimaryKey(id);
    }
//根据ID删除
    @Override
    public Integer updateDrugInformationState(Integer id) {
        DrugInformation drugInformation = new DrugInformation();
        drugInformation.setId(id);
        drugInformation.setDelState(1);
        return drugInformationDAO.updateByPrimaryKeySelective(drugInformation);
    }

    @Override
    public List<DrugInformation> exportDrugInformationExcle(DrugInformation drugInformation,Float startPrice,Float endPrice ) {
        return drugInformationMapper.findAllDrugInformation(drugInformation,startPrice,endPrice);
    }

    //获取随机数
    public String redom(){
        Random random = new Random();
        int i = random.nextInt(1000000);
        String str = Integer.toString(i);
        return str;
    }
}
