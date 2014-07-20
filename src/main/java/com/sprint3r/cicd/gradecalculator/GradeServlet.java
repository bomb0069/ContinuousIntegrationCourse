package com.sprint3r.cicd.gradecalculator;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet( name="GradeServlet", urlPatterns = {"/home"})
public class GradeServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException
    {
        String myResult = "XXX";

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Test</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>" +myResult +"</h1>");
        out.println("</body>");
        out.println("</html>");
    }

}
