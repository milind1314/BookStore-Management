package test;

import java.io.*;

import jakarta.servlet.*;

import jakarta.servlet.annotation.*;

import jakarta.servlet.http.*;

@SuppressWarnings("serial")
@WebServlet("/login")
public class AdminLoginServlet extends HttpServlet {

	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException
	{
		
		
		String uN = req.getParameter("uname");

		String pW = req.getParameter("pword");

		AdminBean ab = new AdminLoginDAO().login(uN, pW);

		if (ab == null) {
			
			PrintWriter pw = res.getWriter();
			
			pw.println("<div style='clear: both; margin-top: 20px;'>");
			pw.println("<div style='text-align: center; color: red; font-size: 18px; padding: 20px;'><p>Invalid Username or Password!</p></div>");

			RequestDispatcher rd = req.getRequestDispatcher("AdminLogin.html");
            rd.include(req, res);
			
		} else {
			HttpSession hs = req.getSession();
			hs.setAttribute("abean", ab);

			RequestDispatcher rd = req.getRequestDispatcher("AdminLoginSuccess.jsp");
			rd.forward(req, res);
		}
	}
}
