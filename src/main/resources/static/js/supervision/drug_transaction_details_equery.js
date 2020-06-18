var po;var di;
$(function () {
//加载全部药品品目信息和药品类别
    findDrugFromAndDrugCategory();
    findDrugFromAndDrugCategory();
    findQualityLevelAndDrugTradingStatus();
    findAllEnterprise();
    findSupplier();
    findHospitalAndPurchaseOrderStatus();
    findAllPurchaseOrder();
    fenye(1);
})
//分页查询
function fenye(pageNum) {
    if (pageNum==null){
        var formData = $("#fuzzyFormId").serialize()+"&pageNum="+1;
    }else {
        var formData = $("#fuzzyFormId").serialize()+"&pageNum="+pageNum;
    }
    console.log(formData);
    var a='';
    $.ajax({
        type:'post',
        url:'DrugTransactionDetailsEqueryController/findAllDetailsEquery',
        data:formData,
        success:function (data) {
            var result = data.list;
            for (var i=0;i<data.list.length;i++){
                a+='<tr>';
                a+='<td>'+result[i].id+'</td>';
                for (var j=0;j<po.purchaseOrderList.length;j++){
                    if (result[i].purchaseOrdersId==po.purchaseOrderList[j].id){
                        for (var k=0;k<aa.length;k++){
                            if (po.purchaseOrderList[j].id==aa[k].id){
                                a+='<td>'+aa[k].hospitalName+'</td>';
                                break;
                            }
                        }
                        a+='<td>'+po.purchaseOrderList[j].purchaseOrderNumber+'</td>';
                        a+='<td>'+po.purchaseOrderList[j].nameOfPurchaseOrder+'</td>';
                        a+='<td>'+po.purchaseOrderList[j].startTime+'</td>';
                        a+='<td>'+po.purchaseOrderList[j].endTime+'</td>';
                        break;
                    }
                }
                for (var l=0;l<po.drugInformationList.length;l++){
                    if (result[i].drugInformationId==po.drugInformationList[l].id){
                        a+='<td>'+po.drugInformationList[l].serialNumber+'</td>';
                        a+='<td>'+po.drugInformationList[l].commonName+'</td>';
                        a+='<td>'+po.drugInformationList[l].tradeName+'</td>';
                        for (var j = 0;j < dd.list_durgsFrom.length;j++){
                            if (po.drugInformationList[l].dosageFormId==dd.list_durgsFrom[j].durgFromId){
                                a+="<td>"+dd.list_durgsFrom[j].drugFrom+"</td>";
                                break;
                            }
                        }
                        a+='<td>'+po.drugInformationList[l].specification+'</td>';
                        a+='<td>'+po.drugInformationList[l].unit+'</td>';
                        a+='<td>'+po.drugInformationList[l].conversionFraction+'</td>';
                        for (var m = 0;m < cc.list_qualityLevel.length;l++){
                            if (po.drugInformationList[l].qualityLevelId==cc.list_qualityLevel[m].quaId){
                                a+="<td>"+cc.list_qualityLevel[m].level+"</td>";
                                break;
                            }
                        }
                        for (var n = 0;n < bb.length;n++){
                            if (po.drugInformationList[l].enterpriseNameId==bb[n].id){
                                a+="<td>"+bb[n].enterpriseName+"</td>";
                                break;
                            }
                        }
                    }
                }
                a+='<td>'+result[i].biddingPrice+'</td>';
                a+='<td>'+result[i].transactionPrice+'</td>';
                a+='<td>'+result[i].purchasedAmount+'</td>';
                a+='<td>'+result[i].purchasedMoney+'</td>';
                for (var q=0;q< po.purchaseStatusList.length;q++){
                    if (result[i].purchasedState==po.purchaseStatusList[q].id){
                        a+='<td>'+po.purchaseStatusList[q].purchasedExplain+'</td>';
                    }
                }
                a+='<td>'+result[i].receiptAmount+'</td>';
                a+='<td>'+result[i].receiptMoney+'</td>';
                a+='</tr>'
            }
            $(".context").append(a);
console.log(data);
        }
    })
}
//查询所有采购单
function findAllPurchaseOrder() {
    $.ajax({
        type: 'post',
        url: 'DrugTransactionDetailsEqueryController/findAllPurchaseOrder',
        async:false,
        success:function (data) {
            po=data;
        }
    })
}
//模糊查询
function selectByEntity(pageNum){
    $("#tbody").empty();
    var purchaseOrderNumber=$("#purchaseOrderNumber").val();
    var nameOfPurchaseOrder=$("#nameOfPurchaseOrder").val();
    var purchaseOrdersStatesId=$("#purchaseOrdersStatesId").val();
    var hospitalName=$("#hospitalId").val();
    var createTime=$("#createTime").val();
    var subTime=$("#subTime").val();
    var serialNumber=$("#serialNumber").val();
    var commonName=$("#commonName").val();
    var dosageFormId=$("#drugsFromId").val();
    var specification=$("#specification").val();
    var unit=$("#unit").val();
    var conversionFraction=$("#conversionFraction").val();
    var tradeName=$("#tradeName").val();
    var enterpriseNameId=$("#enterpriseNameId").val();
    var drugCategoryId=$("#drugCategoryId").val();
    var suppliersid=$("#drugCategory_id").val();
    $.ajax({
        url:"selectPurchaseToOrder",
        data:{
            "purchaseOrderNumber":purchaseOrderNumber,
            "nameOfPurchaseOrder":nameOfPurchaseOrder,
            "purchaseOrdersStatesId":purchaseOrdersStatesId,
            "hospitalName":hospitalName,
            "createTime":createTime,
            "subTime":subTime,
            "serialNumber":serialNumber,
            "commonName":commonName,
            "dosageFormId":dosageFormId,
            "specification":specification,
            "unit":unit,
            "conversionFraction":conversionFraction,
            "tradeName":tradeName,
            "enterpriseNameId":enterpriseNameId,
            "drugCategoryId":drugCategoryId,
            "suppliersid":suppliersid,
            "pageNum":pageNum
        },
        type:"post",
        dataType:"json",
        success:function (result) {
            console.log(result);
            /*var v = "";
            for(var i=0;i<result.list.length;i++){
                var data=result.list;
                var date1=data[i].purchaseOrder.startTime;
                var date2=data[i].purchaseOrder.endTime;
                var date3=data[i].purchaseOrder.createReceiptsTime;
                var date4=data[i].purchaseOrder.submissionTime;
                var date5=data[i].purchaseOrder.auditTime;
                var s2=new Date(date2);
                var s1=new Date(date1);
                var s3=new Date(date3);
                var s4=new Date(date4);
                var s5=new Date(date5);
                year=s1.getFullYear();
                month=s1.getMonth()+1;
                day=s1.getDate();
                time=year+'-'+getzf(month)+'-'+getzf(day);
                year1=s2.getFullYear();
                month1=s2.getMonth()+1;
                day1=s2.getDate();
                time2=year1+'-'+getzf(month1)+'-'+getzf(day1);
                year2=s3.getFullYear();
                month2=s3.getMonth()+1;
                day2=s3.getDate();
                time3=year2+'-'+getzf(month2)+'-'+getzf(day2);
                year3=s4.getFullYear();
                month3=s4.getMonth()+1;
                day3=s4.getDate();
                time4=year3+'-'+getzf(month3)+'-'+getzf(day3);
                year4=s5.getFullYear();
                month4=s5.getMonth()+1;
                day4=s5.getDate();
                time5=year4+'-'+getzf(month4)+'-'+getzf(day4);
                v+='<tr>';
                v+='<td>'+(i+1)+'</td>'
                v+='<td><input type="checkbox" name="del" value='+data[i].id+'></td>';
                v+='<td>'+data[i].purchaseOrder.purchaseOrderNumber+'</td>'
                v+='<td>'+data[i].purchaseOrder.nameOfPurchaseOrder+'</td>'
                v+='<td>'+data[i].hospital.hospitalName+'</td>'
                v+='<td>'+time+'</td>'
                v+='<td>'+time2+'</td>'
                v+='<td>'+time3+'</td>'
                v+='<td>'+time4+'</td>';
                v+='<td>'+time5+'</td>';
                v+='<td>'+data[i].hospitalTransactionDetails.purchasedAmount+'</td>';
                v+='<td>'+data[i].hospitalTransactionDetails.purchasedMoney+'</td>';
                v+='<td>'+data[i].hospitalTransactionDetails.receiptAmount+'</td>'
                v+='<td>'+data[i].hospitalTransactionDetails.receiptMoney+'</td>'
                v+='<td>'+data[i].hospitalTransactionDetails.returnsTheAmount+'</td>'
                v+='<td>'+data[i].hospitalTransactionDetails.returnsTheMoney+'</td>'
                v+='<td>'+data[i].hospitalTransactionDetails.finalSettlementAmount+'</td>'
                v+='<td>'+data[i].hospitalTransactionDetails.finalSettlementMoney+'</td>'
                v+='<td><a href="#" data-target="#editModal1" data-toggle="modal" onclick="saw('+data[i].id+')">查看</a></td>'
                v+='</tr>';
            }
            $("#tbody").append(v);
            qian=result.pageNum==1?1:result.pageNum-1;
            hou=result.pageNum==result.pages?result.pages:result.pageNum+1;*/
        }
    })
}
