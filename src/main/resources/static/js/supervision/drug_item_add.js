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
            url:"DrugItemMaintenanceController/drugItemsAdd",
            data:formData,
            success:function (data) {
                if (data.value==1){
                    $("#modalTitle").empty();
                    $("#modalBody").empty();
                    $("#editModal1").modal("hide");
                    $("#modalTitle").html("成功提示信息");
                    $("#modalBody").append("<p style='color: green'>插入"+data.value+"条数据</p>");
                    $("#modal").modal("show");
                }else {
                   for (var i=0;i<dd.list_durgsFrom.length;i++){
                       if (data.drugItems.dosageFormId==dd.list_durgsFrom[i].durgFromId){
                           data.drugItems.dosageFormId=dd.list_durgsFrom[i].drugFrom;
                           break;
                       }
                   }
                   var a="药品品目已存在,通用名："+data.drugItems.commonName+",剂型："+data.drugItems.dosageFormId+",规格："+data.drugItems.specification;
                   a+=",单位："+data.drugItems.unit+",转换系数："+data.drugItems.conversionFraction;
                    $("#modalTitle").empty();
                    $("#modalBody").empty();
                    $("#editModal1").modal("hide");
                    $("#modalTitle").html("失败提示信息");
                    $("#modalBody").append("<p style='color: red'>"+data.value+"</p>");
                    $("#modalBody").append("<p style='color: red'>"+a+"</p>");
                    $("#modal").modal("show");
                }
            },
            error:function () {

            }
        })
      //  console.log(formData);
    }
}
function updateState(itemsId) {
    $.ajax({
        type:"post",
        url:"updateItemsState",
        data:{"id":itemsId},
        success:function (data) {
            alert("成功删除"+data+"条数据！")
            window.location.reload();
        }
    })
}