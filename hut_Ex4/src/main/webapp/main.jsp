<%@ page language="java" pageEncoding="gb2312" isELIgnored="false" %>
<html>
<head>
	<title>��ӭʹ��</title>
</head>
<body>
	${requestScope.user.name}�����ã���ӭʹ��ͼ�����ϵͳ��
	<form action="../upload/fileupload" method="post" enctype="multipart/form-data">
		ѡ���ϴ��ļ���<input type="file" name="upload"/><br>
		<input type="submit" value="�ϴ�">
	</form>
</body>
</html>
