package test;

import java.io.*;

import jakarta.servlet.*;

import jakarta.servlet.annotation.*;

import jakarta.servlet.http.*;

@SuppressWarnings("serial")
@WebServlet("/delete")

public class DeleteServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			int bookId = Integer.parseInt(req.getParameter("id"));
			
			int delete = DeleteServletDAO.delete(bookId);
			
			if (delete == 0) {
				req.setAttribute("message", "Book deletion failed!");
				req.getRequestDispatcher("msg.jsp").forward(req, resp);
			}
			else {
				req.setAttribute("message", "Book Delated successfully!");
				req.getRequestDispatcher("DeleteBook.jsp").forward(req, resp);
			}
		} catch (NumberFormatException e) {

			
		}
	}
}
