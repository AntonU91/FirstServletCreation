<%--
  Created by IntelliJ IDEA.
  User: mac
  Date: 5/27/22
  Time: 3:14 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="com.example.firstservletcreation.somePackage.Cart" %>
<html>
<head>
    <title>Cart</title>
</head>
<body>
<% Cart cart = (Cart) session.getAttribute("cart"); %>

<p >Name: <%= cart.getName()%></p>
<p> Quantity: <%= cart.getQuantity()%></p>


</body>
</html>
