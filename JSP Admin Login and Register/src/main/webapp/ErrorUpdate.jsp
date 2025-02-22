<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="test.*"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Update failed</title>
    <style>
        body {
            font-family: 'Arial', sans-serif;
            background: linear-gradient(135deg, #fdfcfb 0%, #e2d1c3 100%);
            text-align: center;
            margin: 40px 20px;
            color: #333;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
        }
        .container {
            display: flex;
            flex-direction: column;
            align-items: center;
            gap: 15px;
            margin-top: 50px;
            background: white;
            padding: 20px;
            border-radius: 10px;
            box-shadow: 0px 0px 10px rgba(0, 0, 0, 0.5);
            width: 350px;
        }
        h2 {
            color: #6a0dad; /* Violet heading */
        }
        .message {
            color: #008000;
            font-size: 20px;
            font-weight: bold;
            margin-top: 10px;
            padding: 10px;
            background: red;
            border-radius: 5px;
            border: 1px solid #008000;
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
            margin-top: 10px;
            text-align: center;
        }
        .btn:hover {
            background: #ff914d;
            
        }
        a {
            color: #6a0dad;
            font-weight: bold;
            text-decoration: none;
            transition: color 0.3s ease;
        }
        a:hover {
			color: white;
            text-decoration: underline;
        }
    </style> 
</head>
<body>
    <div class="container">
    <h2>Update Book</h2>
    <p class="message"> <%= request.getAttribute("errormessage") %> </p>
    <a href="UpdateBook.html" class="btn">Try again</a>
    <a href="AdminLoginSuccess.jsp" class="btn">Go to Home</a>
    <a href="logout" class="btn">Log out</a>
    </div>
    
</body>
</html>