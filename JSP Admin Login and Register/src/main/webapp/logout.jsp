<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Admin Logout</title>
    <style>
        /* Center the content */
        body {
            display: flex;
            flex-direction: column;
            justify-content: center;
            align-items: center;
            height: 100vh;
            background-color: #f4f4f4;
            font-family: Arial, sans-serif;
        }

        /* Style the logout message */
        .message {
            font-size: 20px;
            font-weight: bold;
            color: green;
            margin-bottom: 20px;
        }

        /* Style the button */
        .btn {
            display: inline-block;
            padding: 12px 24px;
            font-size: 18px;
            font-weight: bold;
            color: white;
            background-color: #ff6600;
            text-decoration: none;
            border-radius: 8px;
            transition: 0.3s ease-in-out;
            box-shadow: 0px 4px 6px rgba(0, 0, 0, 0.1);
        }

        .btn:hover {
            background-color: #d35400;
            transform: scale(1.05);
        }
    </style>
</head>
<body>

<%
    String msg = (String) request.getAttribute("msg");
    if (msg == null) {
        msg = "You have been logged out.";
    }
%>

<p class="message"><%= msg %></p>
<a href="index.html" class="btn">🏠 Go to Home</a>

</body>
</html>
