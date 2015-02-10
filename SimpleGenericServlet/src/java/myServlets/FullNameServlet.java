/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myServlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.*;

/**
 *
 * @author Ethan
 */
public class FullNameServlet extends GenericServlet {
    private ServletConfig config;
    private String firstName;
    private String lastName;

    @Override
    public void service(ServletRequest req, ServletResponse res) 
            throws ServletException, IOException {
        PrintWriter out = res.getWriter();
        firstName = req.getParameter("firstName");
        lastName = req.getParameter("lastName");
        config.getServletContext().setAttribute("firstName", firstName);
        config.getServletContext().setAttribute("lastName", lastName);
        out.println("<HTML><HEAD><TITLE>");
        out.println("Full name");
        out.println("</TITLE></HEAD>");
        out.println("<BODY style=\"text-align: center\">");
        out.println("first: " + firstName);
        out.println("<br>");
        out.println("last: " + lastName);
        out.println("<br>");
        out.println("int: " + config.getServletContext().getAttribute("formInt"));
        out.println("<br>");
        out.println("float: " + config.getServletContext().getAttribute("formFloat"));
        out.println("<br>");
        out.println("<br><a href=\"forms.html\">Back to forms</a>");
        out.println("</BODY>");
        out.println("</HTML>");
    }
    
     @Override
    public void init(ServletConfig config){
        this.config = config;
        firstName = "blank";
        lastName = "blank";
        config.getServletContext().setAttribute("firstName", firstName);
        config.getServletContext().setAttribute("lastName", lastName);
    }
}
