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