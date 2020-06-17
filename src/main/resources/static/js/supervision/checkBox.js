function checkAll() {
    if ($("#checkAll").prop("checked")){
        $(".context input[type=checkbox]").prop("checked",true);
    }else {
        $(".context input[type=checkbox]").prop("checked",false);
    }
}
function checkOne() {
    var bb=false;
    $(".context input[type=checkbox]").each(function () {
        if ($(this). prop('checked')){
            bb=true;
        }else {
            bb=false;
            return false;
        }
    })
    if (bb){
        $("#checkAll").prop("checked",true);
    }else {
        $("#checkAll").prop("checked",false);
    }
}