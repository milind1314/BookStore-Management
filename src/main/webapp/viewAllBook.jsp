<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" import="test.*,java.util.*" %>
<%
    response.setContentType("text/html; charset=UTF-8");

    HttpSession userSession = request.getSession(false); // Do not create a new session if it doesn't exist
    if (userSession == null || userSession.getAttribute("abean") == null) {
        response.sendRedirect("login.jsp"); // Redirect unauthorized users
        return;
    }

    AdminBean ab = (AdminBean) userSession.getAttribute("abean");
    ArrayList<BookStoreBean> al = (ArrayList<BookStoreBean>) userSession.getAttribute("alist");
%>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>BookStore Inventory</title>
    <style>
        body {
            font-family: 'Arial', sans-serif;
            background: linear-gradient(135deg, #fdfcfb 0%, #e2d1c3 100%);
            text-align: center;
            margin: 40px 20px;
            color: #333;
        }
        .title {
            font-size: 30px;
            font-weight: 700;
            margin-bottom: 20px;
            color: #6a0dad;
            display: inline-block;
            padding-bottom: 8px;
        }
        .container {
            display: flex;
            flex-wrap: wrap;
            justify-content: center;
            gap: 20px;
            padding: 20px;
        }
        .book-card {
            background: white;
            border-radius: 12px;
            box-shadow: 0px 5px 15px rgba(0, 0, 0, 0.08);
            width: 280px;
            padding: 20px;
            text-align: left;
            transition: transform 0.3s ease;
        }
        .book-card:hover {
            transform: translateY(-5px);
        }
        .book-title {
            font-size: 18px;
            font-weight: bold;
            color: #6a0dad;
        }
        .book-author {
            font-size: 16px;
            color: #555;
            margin-top: 5px;
        }
        .book-price {
            font-size: 16px;
            color: #ff914d;
            font-weight: bold;
            margin-top: 10px;
        }
        .book-qty {
            font-size: 14px;
            color: #333;
            margin-top: 5px;
        }
        .btn-container {
            margin-top: 20px;
        }
        .btn {
            display: inline-block;
            margin: 10px;
            padding: 12px 18px;
            text-decoration: none;
            font-size: 16px;
            font-weight: bold;
            color: white;
            background: #6a0dad;
            border-radius: 8px;
            transition: 0.3s ease;
        }
        .btn:hover {
            background: #ff914d;
        }
    </style>
</head>
<body>

<div class="title">📚 BookStore Inventory</div>

<%
    if (al == null || al.isEmpty()) {
%>
    <p style="color: #c0392b; font-size: 18px;">No books available.</p>
<%
    } else {
%>
    <div class="container">
<%
        for (int i = al.size() - 1; i >= 0; i--) { // Iterate in reverse order
            BookStoreBean bk = al.get(i);
%>
        <div class="book-card">
            <div class="book-title"><%= bk.getName() %></div>
            <div class="book-author">by <%= bk.getAuthor() %></div>
            <div class="book-price">&#8377; <%= bk.getPrice() %></div>
            <div class="book-qty">Quantity: <%= bk.getQty() %></div>
            <div class="book-qty">Book Id: <%= bk.getId() %></div>
        </div>
<%
        }
%>
    </div>
<%
    }
%>

<div class="btn-container">
    <a href="addBook.html" class="btn">➕ Add Book</a>
    <a href="AdminLoginSuccess.jsp" class="btn">🔙 Go to Home</a>
    <a href="logout.jsp" class="btn">🚪 Log out</a>
</div>

</body>
</html>
