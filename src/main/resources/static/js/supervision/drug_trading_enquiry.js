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
function fenye(pageNum) {
    if (pageNum==null){
        var formData = $("#fuzzyFormId").serialize()+"&pageNum="+1;
    }else {
        var formData = $("#fuzzyFormId").serialize()+"&pageNum="+pageNum;
    }
    //console.log(formData);
    var a='';
    $.ajax({
        type:'post',
        url:'DrugTransactionDetailsEqueryController/findAllDetailsEquery',
        data:formData,
        success:function (data) {
            var result = data.list;
            for (var i=0;i<result.length;i++){
                a+='<tr>';
                a+='<td>'+result[i].id+'</td>';
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
                        for (var m = 0;m < cc.list_qualityLevel.length;m++){
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
                a+='<td>'+result[i].purchasedAmount+'</td>';
                a+='<td>'+result[i].purchasedMoney+'</td>';
                for (var q=0;q< po.purchaseStatusList.length;q++){
                    if (result[i].purchasedState==po.purchaseStatusList[q].id){
                        a+='<td>'+po.purchaseStatusList[q].purchasedExplain+'</td>';
                    }
                }
                a+='<td>'+result[i].receiptAmount+'</td>';
                a+='<td>'+result[i].receiptMoney+'</td>';
                a+='<td>'+result[i].returnsTheAmount+'</td>';
                a+='<td>'+result[i].returnsTheMoney+'</td>';
                a+='</tr>'
            }
            $(".context").empty();
            $(".context").append(a);
            $(".pagination").empty();
            var p = '<li><a onclick="fenye('+data.firstPage+')" aria-label="Previous"><span aria-hidden="true">&laquo;</span></a></li>'
            for(var i = 1;i<=data.lastPage;i++){
                p+=' <li><a onclick="fenye('+i+')">'+i+'</a></li>'
            }
            p+='<li><a onclick="fenye('+data.lastPage+')" aria-label="Next"><span aria-hidden="true">&raquo;</span></a></li>'
            $(".pagination").append(p);

            console.log(data)
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
//导出
function download() {
    var formData = $("#fuzzyFormId").serialize()
    if (confirm("确定导出文件吗？")){
        location.href="DrugTradingEnquiryController/downloadDrugTradeQuery?"+formData;
    }

}