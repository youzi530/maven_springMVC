<%--
  Created by IntelliJ IDEA.
  User: 26762
  Date: 2020/4/17
  Time: 9:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script src="js/jquery.min.js"></script>
    <script>
        //页面加载，绑定点击事件
        $(function () {
            $("#btn").click(function () {
                $.ajax({
                    url:"user/testAjax",
                    contentType:"application/json;charset=utf-8",
                    data:'{"username":"呵呵","password":"1232","age":30}',
                    dataType:"json",
                    type:"POST",
                    success:function (data) { //data是服务器响应的json数据，进行解析
                        //解析data：
                        alert(data);
                        alert(data.username);
                        // alert(data.age);
                    }
                });
            });
        });
    </script>

</head>
<body>

    <button id="btn">发送ajax的请求</button>

</body>
</html>
