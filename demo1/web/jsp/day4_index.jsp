<%--
  Created by IntelliJ IDEA.
  User: acerdeepin
  Date: 19-3-15
  Time: 上午10:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="/struts-tags" prefix="s" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <a href="${pageContext.request.contextPath}/day4_demo1_action1.action">action1</a><br>

    <a href="${pageContext.request.contextPath}/jsp/day4_tag1.jsp">tagjsp</a><br>


    <a href="${pageContext.request.contextPath}/jsp/day4_tag2.jsp">tag2jsp</a><br>

    <a href="${pageContext.request.contextPath}/jsp/day4_tag3.jsp">tag4jsp</a><br>

<%--
<s:a href="${pageContext.request.contextPath}/jsp/day4_tag3.jsp">tag4jsp</s:a><br>
--%>
 <s:a href="#" value="tag5jsp"/>
</body>
</html>
