<%--
  Created by IntelliJ IDEA.
  User: 26762
  Date: 2020/4/16
  Time: 22:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%--常用的注解--%>
    <a href="anno/testRequestParam?uname=你好凌柚">RequestParam</a> <br>
    <hr>

    <form action="anno/testRequestBody" method="post">
        用户姓名：<input type="text" name="username" /><br/>
        用户年龄：<input type="text" name="age" /><br/>
        <input type="submit" value="RequestBody获取请求体的内容提交" />
    </form>

    <hr>
    <a href="anno/testPathVariable/10">testPathVariable绑定url中的占位符</a> <br>

    <hr>
    <a href="anno/testRequestHeader">RequestHeader</a>

    <hr>
    <a href="anno/testCookieValue">CookieValue</a>

    <hr>
    <form action="anno/testModelAttribute" method="post">
        用户姓名：<input type="text" name="uname" /><br/>
        用户年龄：<input type="text" name="age" /><br/>
        <input type="submit" value="提交" />
    </form>

    <hr>
    <a href="anno/testSessionAttributes">SessionAttributes存入seesion域中</a><br/>

    <a href="anno/getSessionAttributes">得到seesion域中的值</a><br/>

    <a href="anno/delSessionAttributes">删除seesion域中的值</a>

    <hr>
</body>
</html>
