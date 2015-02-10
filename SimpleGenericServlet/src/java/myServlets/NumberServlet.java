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
 * @author puser
 */
public class NumberServlet extends GenericServlet {
    
    private ServletConfig config;
    private String formInt;
    private String formFloat;
    
    @Override
    public void service(ServletRequest req, ServletResponse res) 
            throws ServletException, IOException {
        formInt = req.getParameter("formInt");
        formFloat = req.getParameter("formFloat");
        config.getServletContext().setAttribute("formInt", formInt);
        config.getServletContext().setAttribute("formFloat", formFloat);
        PrintWriter out = res.getWriter();
        out.println("<HTML><HEAD><TITLE>");
        out.println("two numbers");
        out.println("</TITLE></HEAD>");
        out.println("<BODY style=\"text-align: center\">");
        out.println("first: " + config.getServletContext().getAttribute("firstName"));
        out.println("<br>");
        out.println("last: " + config.getServletContext().getAttribute("lastName"));
        out.println("<br>");
        out.println("int: " + formInt);
        out.println("<br>");
        out.println("float: " + formFloat);
        out.println("<br>");
        out.println("<br><a href=\"forms.html\">Back to forms</a>");
        out.println("</BODY>");
        out.println("</HTML>");
    }
     @Override
    public void init(ServletConfig config){
        this.config = config;
        formInt = "blank";
        formFloat = "blank";
        config.getServletContext().setAttribute("formInt", formInt);
        config.getServletContext().setAttribute("formFloat", formFloat);
    }
}
