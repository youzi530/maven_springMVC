<%--
  Created by IntelliJ IDEA.
  User: 26762
  Date: 2020/4/16
  Time: 10:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>请求参数绑定</title>
</head>
<body>

    <a href="param/testParam?username=lisi&password=132">零散数据--请求参数绑定</a>

    <hr >

    <form action="param/saveAccount" method="post">
        姓名：<input type="text" name="username"/><br>
        密码：<input type="text" name="password"/><br>
        金额：<input type="text" name="money"/><br>
        <input type="submit" value="封装到javaBean的请求参数提交"/>
    </form>

    <hr>

    <form action="param/saveAccount" method="post">
        姓  名：<input type="text" name="username"/><br>
        密  码：<input type="text" name="password"/><br>
        金  额：<input type="text" name="money"/><br>
        用户姓名：<input type="text" name="user.uname"/><br>
        用户年龄：<input type="text" name="user.age"/><br>
        <input type="submit" value="封装到javaBean的POJO请求参数提交"/>
    </form>

    <hr>

    <form action="param/saveAccounttoList" method="post">
        姓  名：<input type="text" name="username"/><br>
        密  码：<input type="text" name="password"/><br>
        金额：<input type="text" name="money"/><br>

        用户姓名：<input type="text" name="userList[0].uname"/><br>
        用户年龄：<input type="text" name="userList[0].age"/><br>

        用户姓名：<input type="text" name="userMap['one'].uname"/><br>
        用户年龄：<input type="text" name="userMap['one'].age"/><br>
        <input type="submit" value="封装到javaBean的集合里面请求参数提交"/>
    </form>

    <hr>

    <form action="param/saveCustom" method="post">
        用户姓名：<input type="text" name="uname"/><br>
        用户年龄：<input type="text" name="age"/><br>
        用户生日：<input type="text" name="date"/><br>
        <input type="submit" value="自定义类型转换器提交(出错案例)"/>
    </form>

</body>
</html>
