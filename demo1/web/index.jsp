<%--
  Created by IntelliJ IDEA.
  User: acerdeepin
  Date: 19-3-12
  Time: 上午10:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  $END$

  <a href="${pageContext.request.contextPath}/actionDemo3.action">student</a>


  <hr/>
  <a href="${pageContext.request.contextPath}/studentAdd.action">studentAdd</a>
  <a href="${pageContext.request.contextPath}/studentDel.action">studentDel</a>
  <a href="${pageContext.request.contextPath}/studentSave.action">studentSave</a>


  <hr/>
  <a href="${pageContext.request.contextPath}/student_add.action">studentAdd</a>
  <a href="${pageContext.request.contextPath}/student_del.action">studentDel</a>
  <a href="${pageContext.request.contextPath}/student_save.action">studentSave</a>


  <hr/>
  <a href="${pageContext.request.contextPath}/userAction!find.action">find</a>
  <a href="${pageContext.request.contextPath}/userAction!update.action">update</a>
  <a href="${pageContext.request.contextPath}/userAction!delete.action">delete</a>
  <a href="${pageContext.request.contextPath}/userAction!save.action">save</a>

  </body>
</html>
