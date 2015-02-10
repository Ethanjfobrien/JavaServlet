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
public class NamedHelloWorld extends GenericServlet {
    private ServletConfig config;
    @Override
    public void service(ServletRequest req, ServletResponse res) 
            throws ServletException, IOException {
        PrintWriter out = res.getWriter();
        out.println("<HTML><HEAD><TITLE>");
        out.println("ServletResponse");
        out.println("</TITLE></HEAD>");
        out.println("<BODY style=\"text-align: center\">");
        out.println("<H1>Hello ");
        out.println(req.getParameter("name")+ "</H1><br>");
        out.println("init name param: " + config.getInitParameter("name") 
                    + "<br>");
        out.println("init phone param: " + config.getInitParameter("phone") 
                    + "<br>");        
        out.println("</BODY>");
        out.println("</HTML>");
    }
    
    @Override
    public void init(ServletConfig config){
        this.config = config;
    }
}
