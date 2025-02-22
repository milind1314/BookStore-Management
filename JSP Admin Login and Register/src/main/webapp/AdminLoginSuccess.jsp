<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" import="test.AdminBean" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Admin Dashboard</title>
    <style>
        body {
            font-family: 'Arial', sans-serif;
            background: linear-gradient(135deg, #fdfcfb 0%, #e2d1c3 100%);
            text-align: center;
            margin: 40px 20px;
            color: #333;
        }
        .container {
            display: flex;
            flex-direction: column;
            align-items: center;
            gap: 15px;
            margin-top: 50px;
        }
        .welcome {
            font-size: 26px;
            font-weight: bold;
            color: #6a0dad;
        }
        .adminName {
            color: #ff6600;
        }
        .btn {
            display: inline-block;
            width: 220px;
            padding: 12px;
            font-size: 16px;
            font-weight: bold;
            color: white;
            background: #6a0dad;
            border-radius: 8px;
            text-decoration: none;
            transition: 0.3s ease;
        }
        .btn:hover {
            background: #ff914d;
        }
    </style>
</head>
<body>

<%
    AdminBean ab = (AdminBean) session.getAttribute("abean");
    if (ab == null) {
%>
    <p style="color: #d35400; font-size: 20px;">Unauthorized Access</p>
<%
        return;
    }
%>

<div class="container">
    <p class="welcome">Welcome Admin: <span class="adminName"><%= ab.getFname() %></span></p>
    
    <a href="addBook.html" class="btn">➕ ADD BOOK</a>
    <a href="deleteBook.html" class="btn">🗑 DELETE BOOK</a>
    <a href="updateBook.html" class="btn">✏ UPDATE BOOK</a>
    <a href="viewBook" class="btn">📚 VIEW ALL BOOKS</a>
    <a href="logout" class="btn">🚪 LOG OUT</a>
</div>

</body>
</html>
