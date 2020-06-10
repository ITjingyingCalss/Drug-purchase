var dd;
$(function(){
    /*$.post("/findSelectOption",{},function(data){
        $("#durgfrom").empty();
        for (var i=0;i<data.length;i++){
            $("#durgfrom").append("<option value='"+data[i].durgFromId+"'>"+data[i].drugFrom+"</option>")
        }
    })*/
    //加载全部药品品目信息
    $.post("/findAllDrugItems",{"pageNum":1},function (value) {
        var result = value.list;
        findDrugFromAndDrugCategory();
        var durgFrom = dd[0][0];
        var drugCategory = dd[1][0];
        var a = "";
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
                "<td><a href='#'>删除</a></td>"
            a+="</tr>";
        }
        $(".context").empty();
        $(".context").append(a)
        //模糊查询select
        $("#durgfrom").empty();
        $("#drugcategory1").empty();
        for (var i=0;i<durgFrom.length;i++){
            $("#durgfrom").append("<option value='"+durgFrom[i].durgFromId+"'>"+durgFrom[i].drugFrom+"</option>")
        }
        for (var i=0;i<drugCategory.length;i++){
            $("#drugcategory1").append("<option value='"+drugCategory[i].drugCategoryId+"'>"+drugCategory[i].drugCategoryName+"</option>")
        }
    })
})

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