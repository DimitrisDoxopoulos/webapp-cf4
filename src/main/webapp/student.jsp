<%--
  Created by IntelliJ IDEA.
  User: Dimitris
  Date: 24/7/2023
  Time: 8:44 μ.μ.
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Student</title>
</head>
<body>
    <h2>ID: ${requestScope.student.id}</h2>
    <h2>Firstname: ${requestScope.student.firstname}</h2>
    <h2>Lastname: ${requestScope.student.lastname}</h2>
</body>
</html>
