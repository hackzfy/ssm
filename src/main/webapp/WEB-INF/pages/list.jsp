<%--
  Created by IntelliJ IDEA.
  User: yang
  Date: 2020/9/22
  Time: 12:27 上午
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>List</title>
</head>
<body>

<c:forEach items="${accounts}" var="account">
    ${account.name}<br/>
</c:forEach>
</body>
</html>
