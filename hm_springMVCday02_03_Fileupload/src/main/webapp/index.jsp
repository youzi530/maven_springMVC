<%--
  Created by IntelliJ IDEA.
  User: 26762
  Date: 2020/4/18
  Time: 12:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
        <h3>文件上传</h3> <hr>

        <h4>一、传统方式：</h4>
        <form action="file/fileupload1" method="post" enctype="multipart/form-data">
            选择文件：<input type="file"name="upload">
            <input type="submit" value="上传">
        </form>
        <hr>

        <h4>二、SpringMVC的方式：</h4>
        <form action="file/fileupload2" method="post" enctype="multipart/form-data">
            选择文件：<input type="file"name="upload">
            <input type="submit" value="上传">
        </form>
        <hr>

        <h4>三、SpringMVC跨服务器文件上传的方式：</h4>
        <form action="file/fileupload3" method="post" enctype="multipart/form-data">
            选择文件：<input type="file"name="upload">
            <input type="submit" value="上传">
        </form>
        <hr>


</body>
</html>
