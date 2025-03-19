<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" import="test.*" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Admin Logout</title>
    <style>
        /* Center align everything */
        body {
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
            text-align: center;
            font-family: Arial, sans-serif;
            background-color: #f4f4f4;
        }

        .container {
            background: white;
            padding: 20px;
            border-radius: 10px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
        }

        p {
            color: red;
            font-size: 18px;
            margin-bottom: 20px;
        }

        /* Styled anchor button */
        .btn {
            display: inline-block;
            padding: 10px 20px;
            font-size: 16px;
            color: white;
            background-color: #ff6600;
            border: none;
            border-radius: 5px;
            text-decoration: none;
            transition: background 0.3s ease-in-out;
        }

        .btn:hover {
            background-color: #cc5200;
        }
    </style>
</head>
<body>
    <div class="container">
        <h2>Logout Successful</h2>
        <%
            String msg = (String) request.getAttribute("msgs");
            if (msg != null) {
                out.println("<p>" + msg + "</p>");
            } else {
                out.println("<p>You have been logged out successfully.</p>");
            }
            session.invalidate();
        %>
        <a href="index.html" class="btn">🏠 Go to Home</a>
    </div>
</body>
</html>
