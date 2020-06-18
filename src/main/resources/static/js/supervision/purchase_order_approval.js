var aa; var ff;
//全局加载
$(function () {
    //查询采购单状态和医院名称
    findHospitalAndPurchaseOrderStatus();
    fenye();
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
            var a = "";
            for (var i=0;i<value.length;i++){
                a+="<tr>";
                a+="<td>"+value[i].id+"</td>";
                a+='<td><input onchange="checkOne()" value="'+value[i].id+'" type="checkbox"></td>';
                a+='<td><select><option value="0">请选择</option><option value="4">审核通过</option><option value="5">审核不通过</option> </select><br><span id="err"></span></td><td><input type="text" style="width: 100%"></td>';
                for (var k=0;k<aa.length;k++){
                    if (value[i].hospitalId==aa[k].id){
                        a+="<td>"+aa[k].hospitalName+"</td>";
                        break;
                    }
                }
                if (k==aa.length){
                    a+="<td></td>";
                }
                a+='<td>'+value[i].purchaseOrderNumber+'</td>';
                a+='<td>'+value[i].nameOfPurchaseOrder+'</td>';
                a+='<td>'+value[i].startTime+'</td>';
                a+='<td>'+value[i].endTime+'</td>';
                a+='<td>'+value[i].createReceiptsTime+'</td>';
                a+='<td>'+value[i].submissionTime+'</td>';
                if (value[i].auditTime==null){
                    a+='<td></td>'
                }else {
                    a+='<td>'+value[i].auditTime+'</td>';
                }
                for (var j=1;j<ff.length;j++){
                    if (value[i].purchaseState==ff[j].id){
                        a+='<td>'+ff[j].purchaseOrdersExplain+'</td>';
                        break;
                    }
                }
                a+='<td><a onclick="findOne('+value[i].id+')" data-toggle="modal" data-target="#editModal1">查看</a></td>';
                a+="</tr>"
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

//提交审核结果
function submitAuditResults() {
    var ids = [];
    var purchaseStateS = [];
    var auditOpinionS = [];
    var i = 0;
    checkAuditResults();
    $(".context input[type=checkbox]").each(function () {
        if ($(this).prop('checked')){
            var result = $(this).parent().siblings().find("select").val();
            var auditOpinion = $(this).parent().siblings().find("input[type=text]").val();
            ids.push($(this).val());
            purchaseStateS.push(result);
            auditOpinionS.push(auditOpinion);
        }
    })
    //console.log(auditOpinionS);
    //console.log(purchaseStateS);
    if (ok1){
        $.ajax({
            type:"post",
            url:"PurchaseOrderApprovalController/submitAuditResults",
            data: {"ids":ids,"purchaseStateS":purchaseStateS,"auditOpinionS":auditOpinionS},
            dataType : 'json',
            success:function (data) {
                alert("成功审核"+data+"条");
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
           if (result==0){
               $(this).parent().siblings().find("span[id=err]").html("请选择审核结果").css("color","red");
               ok1=false;
           }else {
               ok1=true;
           }
        }
    })
}
function findOne(id) {
    $.ajax({
        type:"post",
        url:'PurchaseOrderApprovalController/findOne',
        data:{"id":id},
        success:function (data) {
            for (var i=0;i<aa.length;i++){
                if (data.hospitalId==aa[i].id){
                    $("#hospital").html(aa[i].hospitalName);
                }
            }
            $("#purchaseOrderNumber").html(data.purchaseOrderNumber);
            $("#nameOfPurchaseOrder").html(data.nameOfPurchaseOrder);
            for (var i=0;i<ff.length;i++){
                if (data.purchaseState==ff[i].id){
                    $("#purchaseState").html(ff[i].purchaseOrdersExplain);
                    break;
                }
            }
            $("#startTime").html(data.startTime);
            $("#endTime").html(data.endTime);
            $("#createReceiptsTime").html(data.createReceiptsTime);
            $("#submissionTime").html(data.submissionTime);
//console.log(data);
        }
    })
}