
This is my first java fullstack project






# 📚 Bookstore Management System

## 📖 Overview
The **Bookstore Management System** is a web-based application that allows admins to manage a bookstore's inventory. Admins can add, update, delete, and view books with details like title, author, price, quantity, and book ID.

## 🚀 Features
- 🔐 **Admin Authentication** (Login & Logout)
- 📄 **View Book Inventory**
- ➕ **Add New Books**
- ✏️ **Update Existing Books**
- ❌ **Delete Books**
- 🏠 **Admin Dashboard**

## 🛠️ Technologies Used
- **Frontend**: HTML, CSS, Bootstrap
- **Backend**: Java (JSP, Servlets)
- **Database**: Oracle

## 🔧 Setup Instructions
### Prerequisites:
- Java JDK
- Apache Tomcat Server
- Oracle Database
- IDE (Eclipse/IntelliJ IDEA/VS Code)

### Steps to Run the Project:
1. **Clone the Repository:**
   ```sh
   git clone https://github.com/milind1314/BookStore-Management.git
   ```
2. **Import into IDE** (Eclipse or IntelliJ IDEA).
3. **Setup Database:**
   - Create `Bookstore` table in Oracle(or any) database.
4. **Configure Database Connection:**
   - Update `DBInfo.java` with your database credentials.
5. **Deploy to Tomcat:**
   - Run the project on Tomcat Server.
6. **Access the Application:**
   - Open `http://localhost:8080/Bookstore` in your browser.

## 📂 Project Structure
```
Bookstore/
├── src/
│   ├── AdminBean.java
│   ├── AdminLoginDAO.java
│   ├── AdminLoginServlet.java
│   ├── BookStoreBean.java
│   ├── DBConnection.java
│   ├── DBInfo.java
│   ├── DeleteServlet.java
│   ├── DeleteServletDAO.java
│   ├── LogoutServlet.java
│   ├── RegisterServlet.java
│   ├── RegisterServletDAO.java
│   ├── UpdateBookDAO.java
│   ├── UpdateBookServlet.java
│   ├── ViewAllBooksDAO.java
│   ├── ViewAllBooksServlet.java
│
├── WEB-INF/lib
│   ├── web.xml
│
├── Web Pages/
│   ├── AdminLogin.html
│   ├── AdminLoginSuccess.jsp
│   ├── AdminRegister.html
│   ├── AlreadyLogout.jsp
│   ├── DeleteBook.jsp
│   ├── Details.html
│   ├── ErrorUpdate.jsp
│   ├── UpdateBook.jsp
│   ├── addBook.html
│   ├── deleteBook.html
│   ├── index.html
│   ├── logout.jsp
│   ├── msg.jsp
│   ├── updateBook.html
│   ├── viewAllBook.jsp
│
└── README.md
```

## 📜 License
This project is **open-source** and available for modification.

## 🙌 Author
- **Milind** (Developer)
- Feel free to contribute via Pull Requests!

---
✨ **Happy Coding!** 🚀

