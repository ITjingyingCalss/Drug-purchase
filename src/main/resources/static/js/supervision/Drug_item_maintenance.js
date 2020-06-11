var dd;
$(function(){
    //加载全部药品品目信息
    findDrugFromAndDrugCategory();
    fenye(1);
        var durgFrom = dd[0][0];
        var drugCategory = dd[1][0];
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
        console.log(formData);
        $.ajax({
            type:"post",
            url:"/findAllDrugItems",
            data: formData,
            success:function (value) {

                console.log(value)
                var result = value.list;
                var a = "";
                var durgFrom = dd[0][0];
                var drugCategory = dd[1][0];
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
        url:"findItemsById",
        data:{"id":itemsId},
        success:function (data) {
            $("input[name=itemsId]").val(data.itemsId);
            $("span[id=drugItemsNumber]").html(data.drugItemsNumber);
            $("input[name=commonName]").val(data.commonName);
            $("select[name=dosageFormId]").val(data.dosageFormId);
            $("input[name=specification]").val(data.specification);
            $("input[name=unit]").val(data.unit);
            $("input[name=conversionFraction]").val(data.conversionFraction);
            $("select[name=drugCategoryId]").val(data.drugCategoryId);
            $("select[name=state]").val(data.state);

        },
        error:function () {
            alert("有问题")
        }
    })
}
//查询剂型和药品类别
function findDrugFromAndDrugCategory() {
    $.ajax({
        type:"post",
        url:"/findDrugFromAndDrugCategory",
        async : false,
        success:function (data) {
            var a = "<option value='0'>请选择</option>>";
            var b = "<option value='0'>请选择</option>>";
            for (var i=0;i<data[0][0].length;i++){
                a+="<option value='"+data[0][0][i].durgFromId+"'>"+data[0][0][i].drugFrom+"</option>"
            }
            for (var i=0;i<data[1][0].length;i++){
                b+="<option value='"+data[1][0][i].drugCategoryId+"'>"+data[1][0][i].drugCategoryName+"</option>"
            }
            $("#drugsFromId").empty();
            $("#drugCategory_id").empty();
            $("#drugsFromId").append(a);
            $("#drugCategory_id").append(b);
            dd=data;
        }
    })
}
//导出文档
function exportExcle() {
    $.ajax({
        type:"post",
        url:"exportExcle",
        success:function (data) {
            alert(data)
        }
    })
}