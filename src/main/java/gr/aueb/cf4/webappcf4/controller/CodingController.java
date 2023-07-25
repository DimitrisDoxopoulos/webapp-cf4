package gr.aueb.cf4.webappcf4.controller;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/get-coding-title")
public class CodingController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String title = "Coding Factory";

        req.setAttribute("codingTitle", title);
        req.getRequestDispatcher("/coding.jsp").forward(req, resp);
    }
}
