<%--
  Created by IntelliJ IDEA.
  User: acerdeepin
  Date: 19-3-13
  Time: 下午2:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Struts2的复杂类型的数据封装</h1>
<h3>封装到List集合中：批量插入商品</h3>
<form action="${ pageContext.request.contextPath }/day2_demo2_action4.action" method="post">
    商品名称:<input type="text" name="products[0].name"><br/>
    商品价格:<input type="text" name="products[0].price"><br/>
    商品名称:<input type="text" name="products[1].name"><br/>
    商品价格:<input type="text" name="products[1].price"><br/>
    商品名称:<input type="text" name="products[2].name"><br/>
    商品价格:<input type="text" name="products[2].price"><br/>
    <input type="submit" value="提交">
</form>

<h3>封装到Map集合中：批量插入商品</h3>
<form action="${ pageContext.request.contextPath }/day2_demo2_action5.action" method="post">
    商品名称:<input type="text" name="map['one'].name"><br/>
    商品价格:<input type="text" name="map['one'].price"><br/>
    商品名称:<input type="text" name="map['two'].name"><br/>
    商品价格:<input type="text" name="map['two'].price"><br/>
    商品名称:<input type="text" name="map['three'].name"><br/>
    商品价格:<input type="text" name="map['three'].price"><br/>
    <input type="submit" value="提交">
</form>
</body>
</html>
