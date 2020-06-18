var bb;var cc;var dd;var ee;
$(function () {
    findDrugFromAndDrugCategory();
    findQualityLevelAndDrugTradingStatus();
    findAllEnterprise();
    findSupplier();
    selectByEntity();
    //fenye();
})


//查询
function selectByEntity(pageNum){
    $("#tbody").empty();
    var serial_number=$("#serial_number").val();
    var common_name=$("#common_name").val();
    var dosage_form_id=$("#drugsFromId").val();
    var specification=$("#specification").val();
    var unit=$("#unit").val();
    var conversion_fraction=$("#conversion_fraction").val();
    var drug_category_id=$("#drugCategory_id").val();
    var drug_transaction_status_id=$("#drugTransactionStatusId").val();
    var enterpriseName=$("#enterpriseNameId").val();
    var tradeName=$("#tradeName").val();
    var qualityLevelId=$("#qualityLevelId").val();
    var suppliers_id=$("#suppliers_id").val();
    var auditStatus=$("#auditStatus").val();
    var price1=$("#price1").val();
    $.ajax({
        url:"backSelect",
        data:{
            "serialNumber":serial_number,
            "commonName":common_name,
            "dosageFormId":dosage_form_id,
            "specification":specification,
            "unit":unit,
            "conversionFraction":conversion_fraction,
            "drugCategoryId":drug_category_id,
            "drugTransactionStatusId":drug_transaction_status_id,
            "enterpriseNameId":enterpriseName,
            "tradeName":tradeName,
            "qualityLevelId":qualityLevelId,
            "suppliersid":suppliers_id,
            "latestRetailPrice":price1,
            "auditStatus":auditStatus,
            "pageNum":pageNum
        },
        type:"post",
        dataType:"json",
        success:function (result) {
            console.log(result);
            var v = "";
            for(var i=0;i<result.list.length;i++){
                var data=result.list;
                if (data[i].auditStatus!=0&&data[i].auditStatus!=1){
                    var auditStatus=data[i].auditStatus==0?"审核通过":"审核不通过";
                    v+='<tr>';
                    v+='<td>'+data[i].id+'</td>'
                    v+='<td><input onchange="checkOne()" value="'+data[i].id+'" type="checkbox"></td>';
                    v+='<td><select><option value="-1">请选择</option><option value="0">审核通过</option><option value="1">审核不通过</option> </select><br><span id="err"></span></td>';
                    v+='<td>'+data[i].suppliers.suppliername+'</td>'
                    v+='<td>'+data[i].serialNumber+'</td>'
                    v+='<td>'+data[i].commonName+'</td>'
                    v+='<td>'+data[i].durgsFrom.drugFrom+'</td>'
                    v+='<td>'+data[i].specification+'</td>'
                    v+='<td>'+data[i].unit+'</td>'
                    v+='<td>'+data[i].conversionFraction+'</td>'
                    v+='<td>'+data[i].enterprise.enterpriseName+'</td>';
                    v+='<td>'+data[i].tradeName+'</td>';
                    v+='<td>'+data[i].biddingPrice+'</td>';
                    v+='<td>'+data[i].qualityLevel.level+'</td>';
                    v+='<td>'+data[i].drugCategory.drugCategoryName+'</td>'
                    v+='<td>'+data[i].drugTransactionStatus.drugTransactionExplain+'</td>'
                    v+='<td><a href="#" data-target="#editModal1" data-toggle="modal" onclick="findOne('+data[i].id+')">查看</a></td>'
                    v+='</tr>';
                }
            }
            $("#tbody").append(v);
            $(".pagination").empty();
            var p = '<li><a onclick="selectByEntity('+result.firstPage+')" aria-label="Previous"><span aria-hidden="true">&laquo;</span></a></li>'
            for(var i = 1;i<=result.lastPage;i++){
                p+=' <li><a onclick="selectByEntity('+i+')">'+i+'</a></li>'
            }
            p+='<li><a onclick="selectByEntity('+result.lastPage+')" aria-label="Next"><span aria-hidden="true">&raquo;</span></a></li>'
            $(".pagination").append(p);
        }
    })
}
//商品信息查看
function findOne(id) {
    $.ajax({
        url:"supplierAuditController/findOne",
        data:{
            "id":id
        },
        type:"post",
        dataType:"json",
        success:function (result) {
            console.log(result);
            var data=result;
            $("#serialNumber").val(data.serialNumber);
            $("#commonName").val(data.commonName);
            for (var i=0;i<dd.list_durgsFrom.length;i++){
                if (data.dosageFormId==dd.list_durgsFrom[i].durgFromId){
                    $("#dosageFormId").val(dd.list_durgsFrom[i].drugFrom);
                    break;
                }
            }
            $("#specifications").val(data.specification);
            $("#units").val(data.unit);
            $("#conversionFraction").val(data.conversionFraction);
            for (var j=0;j<bb.length;j++){

                if (bb[j].id==data.enterpriseNameId){
                    $("#enterpriseNames").val(bb[j].enterpriseName);
                    for (var n=0;n<ee.length;n++){
                        if (ee[n].suppliersid==bb[j].id)
                            $("#suppliername").val(ee[n].suppliername);
                            }
                    break;
                }
            }
            $("#tradeNames").val(data.tradeName);
            $("#biddingPrice").val(data.biddingPrice);
            for (var k=0;k<cc.list_qualityLevel.length;k++){
                if (cc.list_qualityLevel[k].quaId==data.qualityLevelId){
                    $("#qualityLevelIds").val(cc.list_qualityLevel[k].level);
                    break;
                }
            }
            for (var l=0;l<dd.list_drugCategory.length;l++){
                if (dd.list_drugCategory[l].drugCategoryId==data.drugCategoryId){
                    $("#drugCategoryId").val(dd.list_drugCategory[l].drugCategoryName);
                    break;
                }
            }
            for (var m=0;m<cc.list_drugTransactionStatus.length;m++){
                if (cc.list_drugTransactionStatus[m].id==data.drugTransactionStatusId){
                    $("#drugTransactionStatusIds").val(cc.list_drugTransactionStatus[m].drugTransactionExplain);
                    break;
                }
            }
            $("#common_name_pinyin").val(data.commonNamePinyin);
            $("#source_of_retail_price").val(data.sourceOfRetailPrice);
            if (data.auditStatus==0){
                $("#auditStatu").val("审核通过");
            }else {
                $("#auditStatu").val("审核不通过");
            }
        }
    })
}
//提交审核结果
function submitAuditResults() {
    var ids = [];
    var purchaseStateS = [];
    var i = 0;
    checkAuditResults();
    $(".context input[type=checkbox]").each(function () {
        if ($(this).prop('checked')){
            var result = $(this).parent().siblings().find("select").val();
            var auditOpinion = $(this).parent().siblings().find("input[type=text]").val();
            ids.push($(this).val());
            purchaseStateS.push(result);
        }
    })
    //console.log(auditOpinionS);
    //console.log(purchaseStateS);
    if (ok1){
        $.ajax({
            type:"post",
            url:"supplierAuditController/submitAuditResults",
            data: {"ids":ids,"purchaseStateS":purchaseStateS},
            dataType : 'json',
            success:function (data) {
                alert("成功审核"+data+"条");
                window.location.reload();
                //console.log(data);
            }
        })
    }
}
var ok1=false;
//判断审核结果是否为空
function checkAuditResults() {
    $(".context input[type=checkbox]").each(function () {
        if ($(this).prop('checked')){
            var result = $(this).parent().siblings().find("select").val();
            if (result==-1){
                $(this).parent().siblings().find("span[id=err]").html("请选择审核结果").css("color","red");
                ok1=false;
            }else {
                ok1=true;
            }
        }
    })
}