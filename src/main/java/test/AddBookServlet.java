package test;

import java.io.*;

import jakarta.servlet.*;

import jakarta.servlet.http.*;

import jakarta.servlet.annotation.*;

@SuppressWarnings("serial")
@WebServlet("/add")

public class AddBookServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		int id = Integer.parseInt(req.getParameter("id"));
		String name = req.getParameter("name");
		String author = req.getParameter("author");
		float price = Float.parseFloat(req.getParameter("price"));
		int qty = Integer.parseInt(req.getParameter("qty"));
		
		BookStoreBean bk = AddBookDAO.add(id, name, author, price, qty);
		
		PrintWriter pw = res.getWriter();
		
		if (bk == null) {
			pw.println("<p style='text-align: center; color: red; font-size: 40px; font-weight: bold; padding-top: 20px;'>failed. Book not Add....</p>");

			RequestDispatcher rd = req.getRequestDispatcher("addBook.html");
			rd.include(req, res);
		}
		else {
			pw.println("<p style='text-align: center; color: green; font-size: 40px; font-weight: bold; padding-top: 20px;'>Book Added Successful...</p>");
			RequestDispatcher rd = req.getRequestDispatcher("AdminLoginSuccess.jsp");
			rd.include(req, res);

		}
		
	}
}
