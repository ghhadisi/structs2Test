<%--
  Created by IntelliJ IDEA.
  User: acerdeepin
  Date: 19-3-13
  Time: 上午10:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<form action="${ pageContext.request.contextPath }/day3_demo1_action1.action" method="post">
    姓名:<input type="text" name="username"/><br/>
    密码:<input type="password" name="password"><br/>

    <s:radio list="#{'1':'男', '2':'女'}" name="sex" />

    <input type="submit" value="提交">
</form>
</body>
</html>
