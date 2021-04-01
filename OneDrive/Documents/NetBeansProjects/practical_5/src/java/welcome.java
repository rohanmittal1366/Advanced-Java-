/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;
import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author asus
 */
public class welcome implements Servlet {

    @Override
    public void init(ServletConfig config) throws ServletException {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ServletConfig getServletConfig() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.

        res.setContentType("text/html");
        String user = req.getParameter("username");
        PrintWriter out = res.getWriter();
        out.println("<h1>Welcome</h1> " + user + " in the Login page");
        out.println("<br><a href='random'>Random</a><br> ");
        out.println("<a href='random2?user=" + user + "'>Random1</a> ");

        HttpServletResponse response = (HttpServletResponse) res;
        Cookie c = new Cookie("user", user);
        response.addCookie(c);
        HttpServletRequest request = (HttpServletRequest) req;
        HttpSession session = request.getSession();
        
        session.setAttribute("username",user);
        String user1 = (String) session.getAttribute("username");

        out.println("<h2>Welcome " + user1 + "</h2>");

    }

    @Override
    public String getServletInfo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void destroy() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
