<%@ page language="java" pageEncoding="gb2312" isELIgnored="false" %>
<html>
<head>
	<title>欢迎使用</title>
</head>
<body>
	${requestScope.user.name}，您好！欢迎使用图书管理系统。
	<form action="../upload/fileupload" method="post" enctype="multipart/form-data">
		选择上传文件：<input type="file" name="upload"/><br>
		<input type="submit" value="上传">
	</form>
</body>
</html>
