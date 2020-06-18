var dd;
$(function(){
    //加载全部药品品目信息和药品类别
    findDrugFromAndDrugCategory();
    fenye(1);
    console.log(dd)
        var durgFrom = dd.list_durgsFrom;
        var drugCategory = dd.list_drugCategory;
        //模糊查询select
        $("#durgfrom").empty();
        $("#drugcategory1").empty();
    $("#durgfrom").append("<option value='0'>请选择</option>")
    $("#drugcategory1").append("<option value='0'>请选择</option>")
        for (var i=0;i<durgFrom.length;i++){
            $("#durgfrom").append("<option value='"+durgFrom[i].durgFromId+"'>"+durgFrom[i].drugFrom+"</option>")
        }
        for (var i=0;i<drugCategory.length;i++){
            $("#drugcategory1").append("<option value='"+drugCategory[i].drugCategoryId+"'>"+drugCategory[i].drugCategoryName+"</option>")
        }
})
//分页
function fenye(pageNum) {
    if (pageNum==null){
        var formData = $("#fuzzyFormId").serialize()+"&pageNum="+1;
    }else {
        var formData = $("#fuzzyFormId").serialize()+"&pageNum="+pageNum;
    }
        //console.log(formData);
        $.ajax({
            type:"post",
            url:"DrugItemMaintenanceController/findAllDrugItems",
            data: formData,
            success:function (value) {

                console.log(value)
                var result = value.list;
                var a = "";
                var durgFrom = dd.list_durgsFrom;
                var drugCategory = dd.list_drugCategory;
                for (var i = 0;i < result.length;i++){
                    a+="<tr>";
                    a+="<td>"+result[i].drugItemsNumber+"</td>";
                    a+="<td>"+result[i].commonName+"</td>";
                    for (var j = 0;j < durgFrom.length;j++){
                        if (result[i].dosageFormId==durgFrom[j].durgFromId){
                            a+="<td>"+durgFrom[j].drugFrom+"</td>";
                        }
                    }
                    a+="<td>"+result[i].specification+"</td>";
                    a+="<td>"+result[i].unit+"</td>";
                    a+="<td>"+result[i].conversionFraction+"</td>";
                    for (var k = 0;k < drugCategory.length;k++){
                        if (result[i].drugCategoryId==drugCategory[k].drugCategoryId){
                            a+="<td>"+drugCategory[k].drugCategoryName+"</td>";
                        }
                    }
                    a+="<td>正常</td>";
                    a+="<td><a href='#'>查看</a></td>"+
                        "<td><a onclick='findDrugItem("+result[i].itemsId+")' data-toggle='modal' data-target='#editModal1'>修改</a></td>"+
                        "<td><a onclick='updateState("+result[i].itemsId+")'>删除</a></td>"
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
function findDrugItem(itemsId) {
    $.ajax({
        type: "post",
        url:"DrugItemMaintenanceController/findItemsById",
        data:{"id":itemsId},
        success:function (data) {
            $("#id_table input[name=itemsId]").val(data.itemsId);
            $("#id_table span[id=drugItemsNumber]").html(data.drugItemsNumber);
            $("#id_table input[name=commonName]").val(data.commonName);
            $("#id_table select[name=dosageFormId]").val(data.dosageFormId);
            $("#id_table input[name=specification]").val(data.specification);
            $("#id_table input[name=unit]").val(data.unit);
            $("#id_table input[name=conversionFraction]").val(data.conversionFraction);
            $("#id_table select[name=drugCategoryId]").val(data.drugCategoryId);
            $("#id_table select[name=state]").val(data.state);

        },
        error:function () {
            alert("有问题")
        }
    })
}

//导出文档
function exportExcle() {
    var formData = $("#fuzzyFormId").serialize()
    if (confirm("确定导出文件吗？")){
        location.href="DrugItemMaintenanceController/exportExcle?"+formData;
    }
}
//上传文件
function uploadfile() {
    var formData = new FormData();
    formData.append("file",$('#file')[0].files[0])
    $.ajax({
        url:'DrugItemMaintenanceController/readExcel',
        dataType:'json',
        type:'POST',
        async: false,
        data: formData,
        processData : false, // 使数据不做处理
        contentType : false, // 不要设置Content-Type请求头
        success: function(data){
            if (data == 0) {
                $("#modalTitle").empty();
                $("#modalBody").empty();
                $("#editModal").modal("hide");
                $("#modalTitle").html("失败提示信息");
                $("#modalBody").append("<p style='color: red'>插入"+data+"条数据,请检查是否重复,正确填写文档</p>");
                $("#modal").modal("show");
            }else {
                $("#modalTitle").empty();
                $("#modalBody").empty();
                $("#editModal").modal("hide");
                $("#modalTitle").html("成功提示信息");
                $("#modalBody").append("<p style='color: green'>插入"+data+"条数据</p>");
                $("#modal").modal("show");
            }
        }
    });
}