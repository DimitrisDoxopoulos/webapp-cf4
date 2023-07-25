package gr.aueb.cf4.webappcf4.controller;

import gr.aueb.cf4.webappcf4.model.Student;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/get-student")
public class StudentController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Student student = new Student(1, "Alice", "Wonderland");
        req.setAttribute("student", student);
        req.getRequestDispatcher("/student.jsp").forward(req, resp);
    }
}
