
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
   git clone https://github.com/your-repo/bookstore-management.git
   ```
2. **Import into IDE** (Eclipse or IntelliJ IDEA).
3. **Setup Database:**
   - Import `bookstore.sql` schema into Oracle.
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
│   ├── test/ (Java Classes - DAO, Beans, Servlets)
│   ├── DBConnection.java
│   ├── AdminLoginServlet.java
│   ├── AddBookServlet.java
│   ├── DeleteServlet.java
│   ├── UpdateServlet.java
│   ├── LogoutServlet.java
│
├── WebContent/
│   ├── index.html
│   ├── login.jsp
│   ├── adminDashboard.jsp
│   ├── addBook.html
│   ├── updateBook.html
│   ├── deleteBook.html
│   ├── logout.jsp
│
├── README.md
├── bookstore.sql
└── pom.xml (if using Maven)
```

## 📜 License
This project is **open-source** and available for modification.

## 🙌 Contributors
- **Milind** (Developer)
- Feel free to contribute via Pull Requests!

---
✨ **Happy Coding!** 🚀

