package test;

import java.io.IOException;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet("/update")
public class UpdateBookServlet extends HttpServlet 
{
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException
    {
        try 
        {
            int bookId = Integer.parseInt(req.getParameter("id"));
            String bookName = req.getParameter("name");
            String bookAuthorName = req.getParameter("author");
            double price = Double.parseDouble(req.getParameter("price"));
            int qty = Integer.parseInt(req.getParameter("qty"));

            boolean isUpdated = UpdateBookDAO.update(bookId, bookName, bookAuthorName, price, qty);

            if (isUpdated)
            {
                req.setAttribute("message", "Book updated successfully!");
                RequestDispatcher rd = req.getRequestDispatcher("UpdateBook.jsp");
                rd.forward(req, res);
            }
            else 
            {
                req.setAttribute("errormessage", "Book update failed! Book ID not found.");
                RequestDispatcher rd = req.getRequestDispatcher("ErrorUpdate.jsp");
                rd.include(req, res);
            }
        } 
        catch (NumberFormatException e) 
        {
            req.setAttribute("errormessage", "Invalid input! Please enter valid data.");
            RequestDispatcher rd = req.getRequestDispatcher("ErrorUpdate.jsp");
            rd.include(req, res);
        }
    }
}