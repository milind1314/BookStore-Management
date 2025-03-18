package test;

import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.annotation.*;
import jakarta.servlet.http.*;

@SuppressWarnings("serial")
@WebServlet("/reg")
public class RegisterServlet extends HttpServlet{

	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException
	{
		String uN = req.getParameter("uname");
		String pW = req.getParameter("pass");
		String fN = req.getParameter("fName");
		String lN = req.getParameter("lName");
		String mI = req.getParameter("mid");
		Long mN =Long.parseLong(req.getParameter("mob"));
		
		PrintWriter pw = res.getWriter();
		
		AdminBean ab = new RegisterServletDAO().register(uN, pW, fN, lN, mI, mN);
		
		if (ab==null) {
			pw.println("<p style='text-align: center; color: red; font-size: 40px; font-weight: bold; padding-top: 20px;'>Registration failed...</p>");

			RequestDispatcher rd = req.getRequestDispatcher("AdminRegister.html");
			rd.include(req, res);
		}
		else {
			pw.println("<p style='text-align: center; color: green; font-size: 40px; font-weight: bold; padding-top: 20px;'>Registration Successful...</p>");
			RequestDispatcher rd = req.getRequestDispatcher("home.html");
			rd.include(req, res);

		}
		
	}
}
