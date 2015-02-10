/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myServlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.*;

/**
 *
 * @author Ethan
 */
public class SimpleServlet extends GenericServlet {

    @Override
    public void service(ServletRequest req, ServletResponse res) 
            throws ServletException, IOException {
        PrintWriter out = res.getWriter();
        out.println("<HTML><HEAD><TITLE>");
        out.println("ServletResponse");
        out.println("</TITLE></HEAD>");
        out.println("<BODY style=\"text-align: center\">");
        out.println("<H1>Hello World<H1>");
        out.println("</BODY>");
        out.println("</HTML>");
    }
    
}
