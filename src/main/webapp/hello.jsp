<%--
  Created by IntelliJ IDEA.
  User: Dimitris
  Date: 24/7/2023
  Time: 8:14 μ.μ.
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" pageEncoding="utf-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1><%= request.getAttribute("codingTitle") %></h1>
    <h2>${requestScope.codingTitle}</h2>
</body>
</html>
