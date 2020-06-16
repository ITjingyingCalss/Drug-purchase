var aa; var bb;
//全局加载
$(function () {
    fenye();
    //查询采购单状态和医院名称
    findHospitalAndPurchaseOrderStatus();
})
//分页查询
function fenye(pageNum) {
    if (pageNum==null){
        var formData = $("#fuzzyFormId").serialize()+"&pageNum="+1;
    }else {
        var formData = $("#fuzzyFormId").serialize()+"&pageNum="+pageNum;
    }
    console.log(formData);
    $.ajax({
        type: "post",
        url: "PurchaseOrderApprovalController/findAllPurchaseOrder",
        data: formData,
        success: function (data) {
            $(".context").empty();
            var value = data.list;
            var a = "<tr>";
            for (var i=0;i<value.length;i++){
                a+="<td>"+value[i].id+"</td>";
                a+='<td><input type="checkbox"></td><td><select><option value="0">请选择</option></select></td><td><input type="text" style="width: 100%"></td>';
                a+="<td>"+value[i].hospitalId+"</td>";
                a+='<td>'+value[i].purchaseOrderNumber+'</td>';
                a+='<td>'+value[i].nameOfPurchaseOrder+'</td>';
                a+='<td>'+value[i].startTime+'</td>';
                a+='<td>'+value[i].endTime+'</td>';
                a+='<td>'+value[i].createReceiptsTime+'</td>';
                a+='<td>'+value[i].submissionTime+'</td>';
                a+='<td>'+value[i].auditTime+'</td>';
                a+='<td>'+value[i].purchaseState+'</td>';
                a+='<td><a href="#">查看</a></td>';
            }
            $(".context").append(a);
            $(".pagination").empty();
            var p = '<li><a onclick="fenye('+data.firstPage+')" aria-label="Previous"><span aria-hidden="true">&laquo;</span></a></li>'
            for(var i = 1;i<=data.lastPage;i++){
                p+=' <li><a onclick="fenye('+i+')">'+i+'</a></li>'
            }
            p+='<li><a onclick="fenye('+data.lastPage+')" aria-label="Next"><span aria-hidden="true">&raquo;</span></a></li>'
            $(".pagination").append(p);
            //console.log(value);
        }
    });
}
//查询采购单状态和医院
function findHospitalAndPurchaseOrderStatus() {

    $.ajax({
        type: "post",
        url: "PurchaseOrderApprovalController/findHospitalAndPurchaseOrderStatus",
        async:false,
        success:function (data) {
            aa=data.hospitalList;
            bb=data.purchaseOrdersStatesList;
            var a = "<option value='0'>请选择</option>";
            for (var i=0;i<aa.length;i++){
                a+="<option value='"+aa[i].id+"'>"+aa[i].hospitalName+"</option>";
            }
            $("#hospitalId").empty();
            $("#hospitalId").append(a);
            var b = "<option value='0'>请选择</option>";
            for (var i=1;i<bb.length;i++){
                b+="<option value='"+bb[i].id+"'>"+bb[i].purchaseOrdersExplain+"</option>";
            }
            $(".table select[name=purchaseState]").empty();
            $(".table select[name=purchaseState]").append(b);
            console.log(data);
        }
    });
}