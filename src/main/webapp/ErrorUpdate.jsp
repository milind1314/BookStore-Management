<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="test.*"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Update Failed</title>
    <style>
        body {
            font-family: 'Poppins', sans-serif;
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
            background: white;
            padding: 25px;
            border-radius: 12px;
            box-shadow: 0px 5px 15px rgba(0, 0, 0, 0.3);
            width: 350px;
        }
        h2 {
            color: #6a0dad; /* Violet heading */
            font-size: 22px;
        }
        .message {
            color: white;
            font-size: 18px;
            font-weight: bold;
            margin-top: 10px;
            padding: 12px;
            background: #d32f2f; /* Dark red */
            border-radius: 8px;
            border: 1px solid #b71c1c;
            width: 90%;
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
            box-shadow: 0px 3px 8px rgba(0, 0, 0, 0.2);
        }
        .btn:hover {
            background: #ff914d;
            transform: scale(1.05);
            box-shadow: 0px 5px 12px rgba(0, 0, 0, 0.3);
        }
        a {
            color: white;
            text-decoration: none;
        }
    </style> 
</head>
<body>
    <div class="container">
        <h2>⚠ Update Failed</h2>
        <p class="message"> <%= request.getAttribute("errormessage") %> </p>
        <a href="UpdateBook.html" class="btn">🔄 Try Again</a>
        <a href="AdminLoginSuccess.jsp" class="btn">🏠 Go to Home</a>
        <a href="logout.jsp" class="btn">🚪 Log Out</a>
    </div>
</body>
</html>
