$(function () {
        readList();
    })
layui.use(['laypage', 'layer','form','upload'], function() {
    var laypage = layui.laypage;
    layer = layui.layer;
    var $ = layui.jquery
        ,upload = layui.upload;
    //自定义样式
    laypage.render({
        elem: 'demo2'
        , count: 100
        , theme: '#1E9FFF'
    });
    upload.render({
        elem: '#uploadFile'
        ,url: 'http://localhost:8080/uploadFile' //自己的上传接口
        ,accept: 'file' //普通文件
        ,done: function(res){
            layer.msg('上传成功');
            console.log(res);
        }
    });
})

/*  查询所有信息*/
function readList() {
    $("#tbody").empty();
    var userId = $("#userId").val();
    var userAccount = $("#userAccount").val();
    var contactAddress = $("#contactAddress").val();
    $.ajax({
        url:"findUserAll",
        data:{
            "userId":userId,
            "userAccount":userAccount,
            "contactAddress":contactAddress,
            "userState":0
        },
        type:"post",
        dataType:"json",
        success:function (data) {
            /*layer.open({
                title: '执行结果'
                ,content: '查询成功'
                ,time: 1000
                ,anim: 5
            });*/
            var v = "";
            for (var i = 0; i < data.length; i++) {
                v += "<tr>";
                v += '<td><input type="checkbox" value="'+data[i].userId+'" name="chose" /></td>'
                /* v += "<td>"+data[i].userId+"</td>"*/
                v += "<td>"+data[i].userAccount+"</td>"
                v += "<td>"+data[i].role.roleDescription+"</td>"
                v += "<td>"+data[i].username+"</td>"
                v += "<td>"+data[i].userUnit+"</td>"
                v += "<td>"+data[i].contactAddress+"</td>"
                v += "<td>"+data[i].postalCode+"</td>"
                v += "<td>"+data[i].contacts+"</td>"
                v += "<td>"+data[i].userPhone+"</td>"
                v += "<td>"+data[i].userEmail+"</td>"
                /*                        v += '<td><button class="layui-btn  layui-btn-normal layui-btn-sm" onclick="lookInformation('+data[i].userId+')">查看</button></td>';*/
                v += '<td><button class="layui-btn  layui-btn-warm layui-btn-sm" onclick="editInformation('+data[i].userId+')">修改</button></td>';
                v += '<td><button class="layui-btn  layui-btn-danger layui-btn-sm " lay-event="del" onclick="removeInformation('+data[i].userId+')">删除</button></td>';
                v += "</tr>";
            }
            $("#tbody").append(v);
        }
    })
}

/*添加页面弹出层*/
function addInformation() {
    layer.open({
        //layer提供了5种层类型。可传入的值有：0（信息框，默认）1（页面层）2（iframe层）3（加载层）4（tips层）
        type:1,
        title:['添加卫生局用户','font-size:18px;'],
        area:['50%','60%'],
        anim:5,
        scrollbar: false,
        content:$("#form_add")
    })
}
/*修改页面弹出层*/
function editInformation(){
    layer.open({
        type:1,
        title:['修改卫生局信息','font-size:18px;'],
        area:['50%','60%'],
        anim:5,
        scrollbar:false,
        content:$("#edit_add")
    })
}
/*删除提示弹出框*/
function removeInformation(userId) {
    layui.use('layer',function () {
        var layer = layui.layer;
        layer.msg('确定要删除吗?',{
            time:2000,
            btn:['确定','取消'],
            yes:function (index) {
                console.log(userId);
                $.ajax({
                    url:"updateUserSave",
                    type:"post",
                    dataType:"json",
                    async:false,
                    data:{
                        "userId":userId,
                        "userState":1
                    },
                    success:function(data){
                        console.log(data);
                        layer.msg(data.msg);
                        location.reload();
                    },error:function (data) {
                        $.message('错误',data.msg);
                    }
                })
                layer.close(index);
            }
        })

    })
}
function downExcel() {
    var v = document.getElementsByName("chose");
    var array = new Array();
    for (var i = 0; i < v.length; i++) {
        if (v[i].checked){
            array.push(v[i].value);
        }
    }
    window.location.href="outputUserExcel?ids="+array.toString();
}
function down() {
    window.location.href="down";
}