<%--
  Created by IntelliJ IDEA.
  User: acerdeepin
  Date: 19-3-15
  Time: 上午11:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="/struts-tags" prefix="s" %>
<%@ taglib prefix="c" uri="/struts-tags" %>

<html>
<head>
    <title>Title</title>
</head>
<body>
<s:iterator var="i" value="{'aaa', 'bbb','cccc'}">
    <c:property value="#i"/>
</s:iterator>
<hr/>
<s:iterator var="entry" value="#{'aaa':'1111', 'bbb':'2222','cccc':'33333'}">
    <s:property value="#entry.key"/> : <s:property value="#entry.value"/>
</s:iterator>
<hr/>

<s:iterator var="i" begin="1" end="20" step="2">
    <s:property value="#i"/>
</s:iterator>
<hr/>

<s:iterator var="i" begin="100" end="300" step="5" status="status">
    <s:if test="#status.count %3 ==0">
        <font color="red" size="24"><s:property value="#i"/></font>
    </s:if>
    <s:else>
        <s:property value="#i"/>

    </s:else>
</s:iterator>
</body>
</html>
