
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
function findSupplier() {
    //供货商
    $.ajax({
        url:"supplierSelect",
        data:{},
        type:"post",
        dataType:"json",
        success:function (result) {
            ee=result.data;
            $("#suppliers_id").empty();
            $("#suppliers_id").append('<option value="0">请选择</option>')
            for(var i=0;i<result.data.length;i++){
                var list=result.data;
                $("#suppliers_id").append('<option value="' + list[i].suppliersid + '">' + list[i].suppliername + '</option>')
            }
        }
    })
}
//查询采购单状态和医院
function findHospitalAndPurchaseOrderStatus() {

    $.ajax({
        type: "post",
        url: "PurchaseOrderApprovalController/findHospitalAndPurchaseOrderStatus",
        async:false,
        success:function (data) {
            aa=data.hospitalList;
            ff=data.purchaseOrdersStatesList;
            var a = "<option value='0'>请选择</option>";
            for (var i=0;i<aa.length;i++){
                a+="<option value='"+aa[i].id+"'>"+aa[i].hospitalName+"</option>";
            }
            $("#hospitalId").empty();
            $("#hospitalId").append(a);
            var b = "<option value='0'>请选择</option>";
            for (var i=1;i<ff.length;i++){
                b+="<option value='"+ff[i].id+"'>"+ff[i].purchaseOrdersExplain+"</option>";
            }
            $(".table select[name=purchaseState]").empty();
            $(".table select[name=purchaseState]").append(b);
            console.log(data);
        }
    });
}