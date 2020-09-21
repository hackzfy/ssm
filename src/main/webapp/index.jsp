<%--
  Created by IntelliJ IDEA.
  User: yang
  Date: 2020/9/22
  Time: 12:24 上午
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<a href="account/findAll">findAll</a>
<%--<img src="static/images/WechatIMG13.jpeg" alt="">--%>
<div>

    <form method="get" action="account/saveAccount">
        name: <input type="text" name="name">
        money: <input type="text" name="money">
        <input type="submit" value="submit"/>
    </form>


</div>

<div>
    <form action="account/transfer">
        source: <input type="text" name="sourceName">
        target: <input type="text" name="targetName">
        money: <input type="text" name="money">
        <input type="submit" value="transfer"/>
    </form>
</div>
</body>
</html>
