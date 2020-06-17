var bb;var cc;var dd;
$(function () {
    findDrugFromAndDrugCategory();
    findQualityLevelAndDrugTradingStatus();
    findAllEnterprise();
    findSupplier();
    selectByEntity();
    //fenye();
})

//查询剂型和药品类别
function findDrugFromAndDrugCategory() {
    $.ajax({
        type:"post",
        url:"DrugItemMaintenanceController/findDrugFromAndDrugCategory",
        async : false,
        success:function (data) {
            var a = "<option value='0'>请选择</option>>";
            var b = "<option value='0'>请选择</option>>";
            for (var i=0;i<data.list_durgsFrom.length;i++){
                a+="<option value='"+data.list_durgsFrom[i].durgFromId+"'>"+data.list_durgsFrom[i].drugFrom+"</option>"
            }
            for (var i=0;i<data.list_drugCategory.length;i++){
                b+="<option value='"+data.list_drugCategory[i].drugCategoryId+"'>"+data.list_drugCategory[i].drugCategoryName+"</option>"
            }
            //添加模态框select
            $("#drugsFromId").empty();
            $("#drugCategory_id").empty();
            $("#drugsFromId").append(a);
            $("#drugCategory_id").append(b);
            dd=data;
        }
    })
}
//查询质量层次和药品交易状态
function findQualityLevelAndDrugTradingStatus() {
    //清空模态框里面的数据
    /*emptydata();
    findDrugFromAndDrugCategory();
    findAllEnterprise();*/
    $.ajax({
        type:"post",
        url:"DrugInformationMaintenance/findQualityLevelAndDrugTradingStatus",
        async : false,
        success:function (data) {
            console.log(data);
            //添加模态框select
            $("#qualityLevelId").empty();
            $("#drugTransactionStatusId").empty();
            $("#qualityLevelId").append("<option value='0'>请选择</option>");
            $("#drugTransactionStatusId").append("<option value='0'>请选择</option>>");
            for (var i=0;i<data.list_qualityLevel.length;i++){
                $("#qualityLevelId").append("<option value='"+data.list_qualityLevel[i].quaId+"'>"+data.list_qualityLevel[i].level+"</option>")
            }
            for (var i=0;i<data.list_drugTransactionStatus.length;i++){
                $("#drugTransactionStatusId").append("<option value='"+data.list_drugTransactionStatus[i].id+"'>"+data.list_drugTransactionStatus[i].drugTransactionExplain+"</option>")
            }

            cc=data;
        }
    })
}
//查出所有企业信息
function findAllEnterprise() {
    $.ajax({
        type:"post",
        url:"DrugInformationMaintenance/findAllEnterprise",
        async : false,
        success:function (data) {
            //console.log(data);
            bb=data;
            $("#enterpriseNameId").empty();
            $("#enterpriseNameId").append("<option value='0'>请选择</option>");
            for (var i=0;i<bb.length;i++){
                $("#enterpriseNameId").append("<option value='"+bb[i].id+"'>"+bb[i].enterpriseName+"</option>")
            }
        }
    })
}
function findSupplier() {
    //供货商
    $.ajax({
        url:"supplierSelect",
        data:{},
        type:"post",
        dataType:"json",
        success:function (result) {
            $("#suppliers_id").empty();
            $("#suppliers_id").append('<option value="0">请选择</option>')
            for(var i=0;i<result.data.length;i++){
                var list=result.data;
                $("#suppliers_id").append('<option value="' + list[i].suppliersid + '">' + list[i].suppliername + '</option>')
            }
        }
    })
}
//查询
var qian;
var hou;
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
                    v+='<td><a href="#" data-target="#editModal1" data-toggle="modal" onclick="saw('+data[i].id+')">查看</a></td>'
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
function saw(id) {
    $.ajax({
        url:"getSelect",
        data:{
            "id":id
        },
        type:"post",
        dataType:"json",
        success:function (result) {
            console.log(result);
            var data=result.data;
            $("#serialNumber").val(data.serialNumber);
            $("#commonName").val(data.commonName);
            $("#dosageFormId").val(data.durgsFrom.drugFrom);
            $("#specifications").val(data.specification);
            $("#units").val(data.unit);
            $("#conversionFraction").val(data.conversionFraction);
            $("#enterpriseNames").val(data.enterprise.enterpriseName);
            $("#tradeNames").val(data.tradeName);
            $("#biddingPrice").val(data.biddingPrice);
            $("#qualityLevelIds").val(data.qualityLevel.level);
            $("#drugCategoryId").val(data.drugCategory.drugCategoryName);
            $("#drugTransactionStatusIds").val(data.drugTransactionStatus.drugTransactionExplain);
            $("#common_name_pinyin").val(data.commonNamePinyin);
            $("#source_of_retail_price").val(data.sourceOfRetailPrice);
            $("#suppliername").val(data.suppliers.suppliername);
            $("#auditStatu").val(data.auditStatus);
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