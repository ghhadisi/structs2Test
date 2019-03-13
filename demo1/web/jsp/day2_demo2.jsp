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
<h1>Struts2的数据封装</h1>
<h3>方式一：属性驱动-提供set方法的方式</h3>

<s:fielderror/>

<form action="${ pageContext.request.contextPath }/day2_demo2_action1.action" method="post">
    用户名:<input type="text" name="username"/><br/>
    密码:<input type="password" name="password"><br/>
    年龄:<input type="text" name="age"/><br/>
    生日:<input type="text" name="birthday"/><br/>
    工资:<input type="text" name="salary"/><br/>
    <input type="submit" value="提交">
</form>

<h3>方式二：属性驱动-在页面中提供表达式方式</h3>
<form action="${ pageContext.request.contextPath }/day2_demo2_action2.action" method="post">
    用户名:<input type="text" name="user.username"/><br/>
    密码:<input type="password" name="user.password"><br/>
    年龄:<input type="text" name="user.age"/><br/>
    生日:<input type="text" name="user.birthday"/><br/>
    工资:<input type="text" name="user.salary"/><br/>
    <input type="submit" value="提交">
</form>

<h3>方式三：模型驱动-模型驱动方式</h3>
<form action="${ pageContext.request.contextPath }/day2_demo2_action3.action" method="post">
    用户名:<input type="text" name="username"/><br/>
    密码:<input type="password" name="password"><br/>
    年龄:<input type="text" name="age"/><br/>
    生日:<input type="text" name="birthday"/><br/>
    工资:<input type="text" name="salary"/><br/>
    <input type="submit" value="提交">
</form>
</body>
</html>
