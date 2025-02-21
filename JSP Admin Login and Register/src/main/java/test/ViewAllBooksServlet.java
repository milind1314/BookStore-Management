package test;
import java.io.*;
import java.util.ArrayList;

import jakarta.servlet.*;
import jakarta.servlet.annotation.*;
import jakarta.servlet.http.*;

@SuppressWarnings("serial")
@WebServlet("/viewBook")
public class ViewAllBooksServlet extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		HttpSession hs = req.getSession(false);
		
		if (hs==null) {
			req.setAttribute("msg", "Session expired...<br>");
			req.getRequestDispatcher("msg.jsp").forward(req, resp);
			
		}
		else
		{
			ArrayList<BookStoreBean> al = new ViewAllBooksDAO().retrive();
			hs.setAttribute("alist", al);
			req.getRequestDispatcher("viewAllBooks.jsp").forward(req, resp);
			
		}
		
	}

}
