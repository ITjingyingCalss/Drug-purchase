package com.ygjy.supervision.dao;

import com.ygjy.pojo.PurchaseOrder;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Mapper
@Repository
public interface PurchaseOrderApprovalMapper {
    List<PurchaseOrder> findAllPurchaseOrder(@Param("purchaseOrder") PurchaseOrder purchaseOrder, @Param("procurementStartTime") String procurementStartTime,@Param("procurementEndTime") String procurementEndTime);

    int findCount();
}
