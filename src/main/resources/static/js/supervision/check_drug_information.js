var ok8=false;var ok9=false;var ok10=false;var ok11=false;
var ok12=false;var ok13=false;var ok14=false;var ok15=false;
var ok16=false;var ok17=false;var ok18=false;var ok19=false;
var ok20=false;var ok21=false;var ok22=false;var ok23=false;
//检查生产企业名称是否为空
function checkEnterpriseName() {
    var enterpriseName = $("#id_table select[name=enterpriseNameId]").val();
    if (enterpriseName==0||enterpriseName==null){
        $("#enterpriseName").html("生产企业名称不能为空").css("color","red");ok8=false;
    }else{
        $("#enterpriseName").html("√").css("color","green");ok8=true;
    }
}
//检查商品名是否填写
function checkTradeName() {
    var tradeName = $("#id_table input[name=tradeName]").val();
    if (tradeName==0||tradeName==null){
        $("#tradeName").html("商品名不能为空").css("color","red");ok9=false;
    }else{
        $("#tradeName").html("√").css("color","green");ok9=true;
    }
}
//检查中标价格是否为空
function checkBiddingPrice() {
    var biddingPrice = $("#id_table input[name=biddingPrice]").val();
    if (biddingPrice==''||biddingPrice==null){
        $("#biddingPrice").html("中标价格不能为空").css("color","red");ok10=false;
    }else{
        $("#biddingPrice").html("√").css("color","green");ok10=true;
    }
}
//检查批准文号是否为空
function checkApprovalNumber() {
    var approvalNumber = $("#id_table input[name=approvalNumber]").val();
    if (approvalNumber==''||approvalNumber==null){
        $("#approvalNumber").html("批准文号不能为空").css("color","red");ok11=false;
    }else{
        $("#approvalNumber").html("√").css("color","green");ok11=true;
    }
}
//检查是否进口药是否为空
function checkImportedDrug() {
    var importedDrug = $("#id_table input[name=importedDrug]:checked").val();
    if (importedDrug==0||importedDrug==null){
        $("#importedDrug").html("是否进口药不能为空").css("color","red");ok12=false;
    }else{
        $("#importedDrug").html("√").css("color","green");ok12=true;
    }
}
//检查批准文号有效期是否为空
function checkValidityOfApprovalNumber() {
    var validityOfApprovalNumber = $("#id_table input[name=validityOfApprovalNumber]").val();
    if (validityOfApprovalNumber==0||validityOfApprovalNumber==null){
        $("#validityOfApprovalNumber").html("批准文号有效期不能为空").css("color","red");ok13=false;
    }else{
        $("#validityOfApprovalNumber").html("√").css("color","green");ok13=true;
    }
}
//检查包装材质是否为空
function checkpackagingMaterial() {
    var packagingMaterial = $("#id_table input[name=packagingMaterial]").val();
    if (packagingMaterial==0||packagingMaterial==null){
        $("#packagingMaterial").html("包装材质不能为空").css("color","red");ok14=false;
    }else{
        $("#packagingMaterial").html("√").css("color","green");ok14=true;
    }
}
//检查包装单位是否为空
function checkPackingUnit() {
    var packingUnit = $("#id_table input[name=packingUnit]").val();
    if (packingUnit==0||packingUnit==null){
        $("#packingUnit").html("包装单位不能为空").css("color","red");ok15=false;
    }else{
        $("#packingUnit").html("√").css("color","green");ok15=true;
    }
}
//检查零售价出处是否为空
function checkSourceOfRetailPrice() {
    var sourceOfRetailPrice = $("#id_table input[name=sourceOfRetailPrice]").val();
    if (sourceOfRetailPrice==0||sourceOfRetailPrice==null){
        $("#sourceOfRetailPrice").html("零售价出处不能为空").css("color","red");ok16=false;
    }else{
        $("#sourceOfRetailPrice").html("√").css("color","green");ok16=true;
    }
}
//检查最新零售价是否为空
function checkLatestRetailPrice() {
    var latestRetailPrice = $("#id_table input[name=latestRetailPrice]").val();
    if (latestRetailPrice==0||latestRetailPrice==null){
        $("#latestRetailPrice").html("最新零售价不能为空").css("color","red");ok17=false;
    }else{
        $("#latestRetailPrice").html("√").css("color","green");ok17=true;
    }
}
//检查质量层次是否为空
function checkQualityLevel() {
    var qualityLevel = $("#id_table select[name=qualityLevelId]").val();
    if (qualityLevel==0||qualityLevel==null){
        $("#qualityLevel1").html("质量层次不能为空").css("color","red");ok18=false;
    }else{
        $("#qualityLevel1").html("√").css("color","green");ok18=true;
    }
}
//检查质量层次说明是否为空
function checkQualityLevelDescription() {
    var qualityLevelDescription = $("#id_table input[name=qualityLevelDescription]").val();
    if (qualityLevelDescription==0||qualityLevelDescription==null){
        $("#qualityLevelDescription").html("质量层次说明不能为空").css("color","red");ok19=false;
    }else{
        $("#qualityLevelDescription").html("√").css("color","green");ok19=true;
    }
}
//检查有无药检报告是否为空
function checkDrugInspectionReport() {
    var drugInspectionReport = $("#id_table input[name=drugInspectionReport]:checked").val();
    if (drugInspectionReport==0||drugInspectionReport==null){
        $("#drugInspectionReport").html("药检报告不能为空").css("color","red");ok20=false;
    }else{
        $("#drugInspectionReport").html("√").css("color","green");ok20=true;
    }
}
//检查药检报告编号是否为空
function checkDrugInspectionReportNumber() {
    var drugInspectionReportNumber = $("#id_table input[name=drugInspectionReportNumber]").val();
    if (drugInspectionReportNumber==0||latestRetailPrice==null){
        $("#drugInspectionReportNumber").html("药检报告编号不能为空").css("color","red");ok21=false;
    }else{
        $("#drugInspectionReportNumber").html("√").css("color","green");ok21=true;
    }
}
//检查药品检验报告有效期是否为空
function checkValidityOfDrugInspectionReport() {
    var validityOfDrugInspectionReport = $("#id_table input[name=validityOfDrugInspectionReport]").val();
    if (validityOfDrugInspectionReport==0||validityOfDrugInspectionReport==null){
        $("#validityOfDrugInspectionReport").html("检验报告有效期不能为空").css("color","red");ok22=false;
    }else{
        $("#validityOfDrugInspectionReport").html("√").css("color","green");ok22=true;
    }
}
//检查药品交易状态是否为空
function checkDrugTransactionStatus() {
    var drugTransactionStatus = $("#id_table select[name=drugTransactionStatusId]").val();
    if (drugTransactionStatus==0||drugTransactionStatus==null){
        $("#drugTransactionStatus1").html("药品交易状态不能为空").css("color","red");ok23=false;
    }else{
        $("#drugTransactionStatus1").html("√").css("color","green");ok23=true;
    }
}