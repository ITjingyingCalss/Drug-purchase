function save(){
    checkCommonName();
    checkDosageForm();
    checkSpecification();
    chenkUnit();
    checkConversionFraction();
    checkDrugCategory();
    checkDrugTransactionStatusId();
    if (ok1&&ok2&&ok3&&ok4&&ok5&&ok6&&ok7){
        var formData = $("#formId").serialize();
        $.ajax({
            type:"post",
            url:"drugItemsAdd",
            data:formData,
            success:function (data) {
                alert(data);
                window.location.reload();
            },
            error:function () {

            }
        })
        console.log(formData);
    }
}