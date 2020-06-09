$(function(){
    $.post("/findSelectOption",{},function(data){
        $("#durgfrom").empty();

        for (var i=0;i<data.length;i++){
            $("#durgfrom").append("<option value='"+data[i].durgFromId+"'>"+data[i].drugFrom+"</option>")
        }
        console.log(data);
    })
})

function findDrugItem() {
    alert("进来了");
}
//查询剂型和药品类别
function findDrugFromAndDrugCategory() {
    $.post("/findDrugFromAndDrugCategory",{},function (data) {
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
        console.log(data);
    })
}