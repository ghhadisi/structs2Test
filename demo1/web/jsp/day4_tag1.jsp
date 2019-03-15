<%--
  Created by IntelliJ IDEA.
  User: acerdeepin
  Date: 19-3-15
  Time: 上午11:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="/struts-tags" prefix="s"%>

<html>
<head>
    <title>Title</title>
</head>
<body>
<s:set var="i" value="2" scope="request" />
<s:if test="#request.i>3">
    i 大于 3
</s:if>
<s:elseif test="#i<3">
    i 小于 3
</s:elseif>
<s:else>
    i 等于 3
</s:else>
</body>
</html>
