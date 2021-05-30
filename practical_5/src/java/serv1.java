/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import javax.servlet.RequestDispatcher;
import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/**
 *
 * @author asus
 */
public class serv1 implements Servlet {

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

        System.out.println("serv1.service()");
        res.setContentType("text/html");
        String name = req.getParameter("username");
        String pass = req.getParameter("password");
        int ok = 0;
        
        System.out.println(name + pass);
        try {
//            Class.forName("com.mysql.jdbc.Driver");
//            c = (Connection) DriverManager.getConnection("jdbc:mysql:///prac5", "root", "");
            //Peoples?autoReconnect=true&amp;useSSL=false&amp;allowPublicKeyRetrieval=true
            conn c = new conn();

            //ResultSet rs = c.s.executeQuery("select * from login where user = '"+name+"' and password = '"+pass+"'");
            ResultSet rs = c.s.executeQuery("select * from login where user = '"+name+"' and password = '"+pass+"'");
            while (rs.next()) {
                ok++;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        PrintWriter out = res.getWriter();
        System.out.println(ok);
        if (ok > 0) {
            RequestDispatcher rd = req.getRequestDispatcher("welcome");
            rd.forward(req, res);

        } else {
            out.print("<p style='color:red;'>Incorrect Password</p>");
            RequestDispatcher rd = req.getRequestDispatcher("login.html");
            rd.include(req, res);
        }
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
