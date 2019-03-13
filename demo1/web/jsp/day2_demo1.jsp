<%--
  Created by IntelliJ IDEA.
  User: acerdeepin
  Date: 19-3-13
  Time: 上午10:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h3>方式一：完成解耦合的方式</h3>
<form action="${pageContext.request.contextPath}/day2_demo1_action1.action" method="post">
    姓名:<input type="text" name="name"/><br/>
    密码:<input type="password" name="password"><br/>
    <input type="submit" value="提交">
</form>


<h3>方式二：使用原生的方式访问 request</h3>
<form action="${ pageContext.request.contextPath }/day2_demo1_action2.action" method="post">
    姓名:<input type="text" name="name"/><br/>
    密码:<input type="password" name="password"><br/>
    <input type="submit" value="提交">
</form>

<h3>方式三：接口注入的方式</h3>
<form action="${ pageContext.request.contextPath }/day2_demo1_action3.action" method="post">
    姓名:<input type="text" name="name"/><br/>
    密码:<input type="password" name="password"><br/>
    <input type="submit" value="提交">
</form>
</body>
</html>
