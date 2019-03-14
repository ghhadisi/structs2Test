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

<form action="${ pageContext.request.contextPath }/day3_demo1_action3.action" method="post">
    姓名:<input type="text" name="name"/><br/>
    密码:<input type="password" name="password"><br/>
    <input type="submit" value="提交">
</form>
#request.name=<s:property value="#request.name" /><br/>

#name=<s:property value="#name" /><br/>
username=<s:property value="username" /><br/>
height=<s:property value="height" /><br/>


    <s:iterator value="#{'aaa':'111', 'bbb':'2222', 'ccc':'3333'}">
        <s:property value="key" />---<s:property value="value" /><br/>
        <s:property value="#entry.key" />---<s:property value="#entry.value" /><br/>

    </s:iterator>

<s:debug />
</body>
</html>
