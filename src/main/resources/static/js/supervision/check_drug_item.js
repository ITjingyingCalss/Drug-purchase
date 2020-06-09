var ok1=false;var ok2=false;var ok3=false;var ok4=false;
var ok5=false;var ok6=false;var ok7=false;
//检查通用名是否填写
function checkCommonName() {
    var commonName = $("input[name=commonName]").val();
    if (commonName==''||commonName==null){
        $("#commonName").html("通用名不能为空").css("color","red");ok1=false;
    }else{
        $("#commonName").html("√").css("color","green");ok1=true;
    }
}
//检查剂型是否填写
function checkDosageForm() {
    var dosageForm = $("select[name=dosageForm]").val();
    if (dosageForm==0||dosageForm==null){
        $("#dosageForm").html("剂型不能为空").css("color","red");ok2=false;
    }else{
        $("#dosageForm").html("√").css("color","green");ok2=true;
    }
}
//检查规格是否为空
function checkSpecification() {
    var specification = $("input[name=specification]").val();
    if (specification==''||specification==null){
        $("#specification").html("规格不能为空").css("color","red");ok3=false;
    }else{
        $("#specification").html("√").css("color","green");ok3=true;
    }
}
//检查单位是否为空
function chenkUnit() {
    var unit = $("input[name=unit]").val();
    if (unit==''||unit==null){
        $("#unit").html("单位不能为空").css("color","red");ok4=false;
    }else{
        $("#unit").html("√").css("color","green");ok4=true;
    }
}
//检查转换系数是否为空
function checkConversionFraction() {
    var conversionFraction = $("input[name=conversionFraction]").val();
    if (conversionFraction==''||conversionFraction==null){
        $("#conversionFraction").html("转换系数不能为空").css("color","red");ok5=false;
    }else{
        $("#conversionFraction").html("√").css("color","green");ok5=true;
    }
}
//检查药品类别是否为空
function checkDrugCategory() {
    var drugCategory = $("select[name=drugCategory]").val();
    if (drugCategory==0||drugCategory==null){
        $("#drugCategory").html("药品类别不能为空").css("color","red");ok6=false;
    }else{
        $("#drugCategory").html("√").css("color","green");ok6=true;
    }
}
//检查状态是否为空
function checkDrugTransactionStatusId() {
    var drugTransactionStatusId = $("select[name=drugTransactionStatusId]").val();
    if (drugTransactionStatusId==0||drugTransactionStatusId==null){
        $("#drugTransactionStatusId").html("状态不能为空").css("color","red");ok7=false;
    }else{
        $("#drugTransactionStatusId").html("√").css("color","green");ok7=true;
    }
}