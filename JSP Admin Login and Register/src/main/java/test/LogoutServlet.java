package test;

import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/logout")
public class LogoutServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        System.out.println("LogoutServlet: Received logout request.");
        
        HttpSession hs = req.getSession(false);
        if (hs == null) {
            req.setAttribute("msg", "Session Expired...<br>");
            req.getRequestDispatcher("msg.jsp").forward(req, res);
        } else {
            hs.invalidate(); // Destroy session completely
            req.setAttribute("msg", "Admin Logged Out Successfully...<br>");
            req.getRequestDispatcher("logout.jsp").forward(req, res);
        }
    }

}
