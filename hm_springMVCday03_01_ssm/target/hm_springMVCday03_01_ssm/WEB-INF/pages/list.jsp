<%--
  Created by IntelliJ IDEA.
  User: 26762
  Date: 2020/4/19
  Time: 11:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h3>查询到所有的账户信息</h3>
        ${accounts}

        <c:forEach items="${accounts}" var="account">
            ${account.name}
        </c:forEach>
</body>
</html>
