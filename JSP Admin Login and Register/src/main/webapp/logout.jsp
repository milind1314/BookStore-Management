<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" import="test.*"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Admin Logout</title>
</head>
<body>
<%
    String msg = (String) request.getAttribute("msg");
    session.invalidate();
    out.println(msg);
%>
<a href="index.html" class="btn">🏠 Go to Home</a>
</body>
</html>
