package test;

import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.annotation.*;
import jakarta.servlet.http.*;

@SuppressWarnings("serial")
@WebServlet("/logout")
public class LogoutServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        HttpSession hs = req.getSession(false);

        if (hs == null) {
            req.setAttribute("msgs", "Session Expired...<br>");
            req.getRequestDispatcher("AlreadyLogout.jsp").forward(req, res);
        } else {
//        	hs.invalidate();
            hs.removeAttribute("abean");
            hs.removeAttribute("alist");
            req.setAttribute("msgs", "Admin Logged Out Successfully...<br>");
            req.getRequestDispatcher("logout.jsp").forward(req, res);
        }
    }
}
