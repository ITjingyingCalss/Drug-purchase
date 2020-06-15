var dd;var cc;var bb;
$(function(){
    //加载全部药品品目信息
    findDrugFromAndDrugCategory();
    //查出所有企业信息
    findAllEnterprise();
    //查询质量层次和药品交易状态
    findQualityLevelAndDrugTradingStatus();
    fenye(1);
    //console.log(dd)
    var durgFrom = dd.list_durgsFrom;
    var drugCategory = dd.list_drugCategory;
    var qualityLevel = cc.list_qualityLevel;
    var drugTransactionStatus = cc.list_drugTransactionStatus;
    console.log(bb);
    //模糊查询select
    $("#durgfrom").empty();
    $("#drugcategory1").empty();
    $("#qualityLevel").empty();
    $("#drugTransactionStatus").empty();
    $("#enterprise").empty();

    $("#durgfrom").append("<option value='0'>请选择</option>")
    $("#drugcategory1").append("<option value='0'>请选择</option>")
    $("#qualityLevel").append("<option value='0'>请选择</option>")
    $("#drugTransactionStatus").append("<option value='0'>请选择</option>")
    $("#enterprise").append("<option value='0'>请选择</option>")

    for (var i=0;i<durgFrom.length;i++){
        $("#durgfrom").append("<option value='"+durgFrom[i].durgFromId+"'>"+durgFrom[i].drugFrom+"</option>")
    }
    for (var i=0;i<drugCategory.length;i++){
        $("#drugcategory1").append("<option value='"+drugCategory[i].drugCategoryId+"'>"+drugCategory[i].drugCategoryName+"</option>")
    }
    for (var i=0;i<qualityLevel.length;i++){
        $("#qualityLevel").append("<option value='"+qualityLevel[i].quaId+"'>"+qualityLevel[i].level+"</option>")
    }
    for (var i=0;i<drugTransactionStatus.length;i++){
        $("#drugTransactionStatus").append("<option value='"+drugTransactionStatus[i].id+"'>"+drugTransactionStatus[i].drugTransactionExplain+"</option>")
    }
    for (var i=0;i<bb.length;i++){
        $("#enterprise").append("<option value='"+bb[i].id+"'>"+bb[i].enterpriseName+"</option>")
    }
})
//分页查询全部
function fenye(pageNum) {
    if (pageNum==null){
        var formData = $("#fuzzyFormId").serialize()+"&pageNum="+1;
    }else {
        var formData = $("#fuzzyFormId").serialize()+"&pageNum="+pageNum;
    }
   // console.log(formData)
    $.ajax({
        type:"post",
        url:"DrugInformationMaintenance/findAllDrugInformation",
        data: formData,
        success:function (value) {
            console.log(value)
            var result = value.list;
            var a = "";
            var durgFrom = dd.list_durgsFrom;
            var drugCategory = dd.list_drugCategory;
            var qualityLevel = cc.list_qualityLevel;
            var drugTransactionStatus = cc.list_drugTransactionStatus;

            for (var i = 0;i < result.length;i++){
                a+="<tr>";
                a+="<td>"+result[i].serialNumber+"</td>";
                a+="<td>"+result[i].commonName+"</td>";
                for (var j = 0;j < durgFrom.length;j++){
                    if (result[i].dosageFormId==durgFrom[j].durgFromId){
                        a+="<td>"+durgFrom[j].drugFrom+"</td>";
                        break;
                    }
                }
                a+="<td>"+result[i].specification+"</td>";
                a+="<td>"+result[i].unit+"</td>";
                a+="<td>"+result[i].conversionFraction+"</td>";
                for (var n = 0;n < bb.length;n++){
                    if (result[i].enterpriseNameId==bb[n].id){
                        a+="<td>"+bb[n].enterpriseName+"</td>";
                        break;
                    }
                }
                a+="<td>"+result[i].tradeName+"</td>";
                a+="<td>"+result[i].biddingPrice+"</td>";
                for (var l = 0;l < qualityLevel.length;l++){
                    if (result[i].qualityLevelId==qualityLevel[l].quaId){
                        a+="<td>"+qualityLevel[l].level+"</td>";
                        break;
                    }
                }
                for (var k = 0;k < drugCategory.length;k++){
                    if (result[i].drugCategoryId==drugCategory[k].drugCategoryId){
                        a+="<td>"+drugCategory[k].drugCategoryName+"</td>";
                        break;
                    }
                }
                for (var m = 0;m < drugTransactionStatus.length;m++){
                    if (result[i].drugTransactionStatusId==drugTransactionStatus[m].id){
                        a+="<td>"+drugTransactionStatus[m].drugTransactionExplain+"</td>";
                        break;
                    }
                }
                a+="<td><a href='#'>查看</a></td>"+
                    "<td><a onclick='findDrugInformationById("+result[i].id+")' data-toggle='modal' data-target='#editModal1'>修改</a></td>"+
                    "<td><a onclick='updateState("+result[i].id+")'>删除</a></td>"
                a+="</tr>";
            }
            $(".context").empty();
            $(".context").append(a)
            $(".pagination").empty();
            var p = '<li><a onclick="fenye('+value.firstPage+')" aria-label="Previous"><span aria-hidden="true">&laquo;</span></a></li>'
            for(var i = 1;i<=value.lastPage;i++){
                p+=' <li><a onclick="fenye('+i+')">'+i+'</a></li>'
            }
            p+='<li><a onclick="fenye('+value.lastPage+')" aria-label="Next"><span aria-hidden="true">&raquo;</span></a></li>'
            $(".pagination").append(p);

        }
    })
}
//查询剂型和药品类别
function findDrugFromAndDrugCategory() {
    $.ajax({
        type:"post",
        url:"DrugItemMaintenanceController/findDrugFromAndDrugCategory",
        async : false,
        success:function (data) {
            var a = "<option value='0'>请选择</option>>";
            for (var i=0;i<data.list_durgsFrom.length;i++){
                a+="<option value='"+data.list_durgsFrom[i].durgFromId+"'>"+data.list_durgsFrom[i].drugFrom+"</option>"
            }
            //添加模态框select
            $("#dosageFormId").empty();
            $("#dosageFormId").append(a);
            dd=data;
        }
    })
}
//查询质量层次和药品交易状态
function findQualityLevelAndDrugTradingStatus() {
    //清空模态框里面的数据
    emptydata();
    findDrugFromAndDrugCategory();
    findAllEnterprise();
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
//添加保存修改药品信息
function saveDrugInformation() {
    checkCommonName();checkDosageForm();checkSpecification();chenkUnit();checkConversionFraction();checkEnterpriseName();
    checkTradeName();checkBiddingPrice();checkApprovalNumber();checkImportedDrug();checkValidityOfApprovalNumber();checkpackagingMaterial();
    checkPackingUnit();checkSourceOfRetailPrice();checkLatestRetailPrice();checkQualityLevel();checkQualityLevelDescription();
    checkDrugInspectionReport();checkDrugInspectionReportNumber();checkValidityOfDrugInspectionReport();checkDrugTransactionStatus();
    if (ok1&ok2&ok3&ok4&ok5&ok8&ok9&ok10&ok11&ok12&ok13&ok14&ok15&ok16&ok17&ok18&ok19&ok20&ok21&ok22&ok23){
        var formData = $("#addForm").serialize();
        //console.log(formData);
        $.ajax({
            type:"post",
            url:"DrugInformationMaintenance/saveDrugInformation",
            data: formData,
            success:function (data) {
                if (data.i!=0){
                    $("#modalTitle").empty();
                    $("#modalBody").empty();
                    $("#editModal1").modal("hide");
                    $("#modalTitle").html("成功提示信息");
                    $("#modalBody").append("<p style='color: green'>插入"+data.i+"条数据</p>");
                    $("#modal").modal("show");
                }else {
                    if (data.drugInformation==null){
                        $("#modalTitle").empty();
                        $("#modalBody").empty();
                        $("#editModal1").modal("hide");
                        $("#modalTitle").html("失败提示信息");
                        $("#modalBody").append("<p style='color: red'>药品品目信息不存在请先添加药品品目信息</p>");
                        $("#modal").modal("show");
                    }else {
                        for (var i=0;i<dd.list_durgsFrom.length;i++){
                            if (data.drugInformation.dosageFormId==dd.list_durgsFrom[i].durgFromId){
                                data.drugInformation.dosageFormId=dd.list_durgsFrom[i].drugFrom;
                                break;
                            }
                        }
                        for (var i=0;i<bb.length;i++){
                            if (data.drugInformation.enterpriseNameId==bb.id){
                                data.drugInformation.enterpriseNameId=bb.enterpriseName;
                                break;
                            }
                        }
                        var a = "药品信息已存在,通用名："+data.drugInformation.commonName+",剂型："+data.drugInformation.dosageFormId+",规格："+data.drugInformation.specification;
                        a+=",单位："+data.drugInformation.unit+",转换系数："+data.drugInformation.conversionFraction+",生产企业名称："+data.drugInformation.enterpriseNameId+",商品名称："+data.drugInformationtradeName;
                        $("#modalTitle").empty();
                        $("#modalBody").empty();
                        $("#editModal1").modal("hide");
                        $("#modalTitle").html("失败提示信息");
                        $("#modalBody").append("<p style='color: red'>您的操作失败，请尝试刷新页面重新操作</p>");
                        $("#modalBody").append("<p style='color: red'>"+a+"</p>");
                        $("#modal").modal("show");
                    }
                }
            }
        })
    }
}
//根据id查找药品信息
function findDrugInformationById(id) {
    $.ajax({
        type:"post",
        url:"DrugInformationMaintenance/findDrugInformationById",
        data:{"id":id},
        async:false,
        success:function (data) {
            $("#id_table input[name=id]").val(data.id);
            $("#serialNumber").html(data.serialNumber);
            $("#id_table input[name=commonName]").val(data.commonName);
            $("#id_table select[name=dosageFormId]").val(data.dosageFormId);
            $("#id_table input[name=specification]").val(data.specification);
            $("#id_table input[name=unit]").val(data.unit);
            $("#id_table input[name=conversionFraction]").val(data.conversionFraction);
            $("#id_table select[name=enterpriseNameId]").val(data.enterpriseNameId);
            $("#id_table input[name=tradeName]").val(data.tradeName);
            $("#id_table input[name=biddingPrice]").val(data.biddingPrice);
            $("#id_table input[name=approvalNumber]").val(data.approvalNumber);
            if (data.importedDrug==1){
                $("#yes1").attr("checked","checked");
            }else {
                $("#no1").attr("checked","checked");
            }
            $("#id_table input[name=validityOfApprovalNumber]").val(data.validityOfApprovalNumber);
            $("#id_table input[name=packagingMaterial]").val(data.packagingMaterial);
            $("#id_table input[name=packingUnit]").val(data.packingUnit);
            $("#id_table input[name=latestRetailPrice]").val(data.latestRetailPrice);
            $("#id_table input[name=sourceOfRetailPrice]").val(data.sourceOfRetailPrice);
            $("#id_table select[name=qualityLevelId]").val(data.qualityLevelId);
            $("#id_table input[name=qualityLevelDescription]").val(data.qualityLevelDescription);
            if (data.drugInspectionReport==1){
                $("#yes2").attr("checked","checked");
            }else {
                $("#no2").attr("checked","checked");
            }
            $("#id_table input[name=drugInspectionReportNumber]").val(data.drugInspectionReportNumber);
            $("#id_table input[name=validityOfDrugInspectionReport]").val(data.validityOfDrugInspectionReport);
            $("#id_table select[name=drugTransactionStatusId]").val(data.drugTransactionStatusId);
            $("#id_table textarea[name=descriptionOfProducts]").val(data.descriptionOfProducts);
        }
    })
}
//删除
function updateState(id) {
    $.ajax({
        type:"post",
        url:"DrugInformationMaintenance/updateDrugInformationState",
        data:{"id":id},
        success:function (data) {
            alert("成功删除"+data+"条数据");
            window.location.reload();
        }
    })
}
//导出数据
function exportDrugInformationExcle() {
    var formData = $("#fuzzyFormId").serialize()
    if (confirm("确定导出文件吗？")){
        location.href="DrugInformationMaintenance/exportDrugInformationExcle?"+formData;
    }
}
//清除模态框数据
function emptydata() {
    document.getElementById("addForm").reset();
};
//刷新
function refresh() {
    window.location.reload();
}
