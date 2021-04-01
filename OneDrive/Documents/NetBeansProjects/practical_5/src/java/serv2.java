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
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author asus
 */
public class serv2 implements Servlet {

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
        System.out.println("serv2");
        res.setContentType("text/html");
        String name = req.getParameter("username");
        String pass = req.getParameter("password");
        int ok = 0;

        conn c = new conn();

        System.out.println(name + pass);
        try {
//            Class.forName("com.mysql.jdbc.Driver");
//            c = (Connection) DriverManager.getConnection("jdbc:mysql:///prac5", "root", "");
            //Peoples?autoReconnect=true&amp;useSSL=false&amp;allowPublicKeyRetrieval=true

            ResultSet rs = c.s.executeQuery("select * from login where user = '" + name + "'");
            while (rs.next()) {
                ok++;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        PrintWriter out = res.getWriter();
        if (ok == 0) {
            try {
                c.s.executeUpdate("insert into login (user,password) values('" + name + "','" + pass + "')");
            } catch (Exception e) {
            }
            System.out.println(ok);

            RequestDispatcher rd = req.getRequestDispatcher("login.html");
            out.print("<p style='color:red;'><h1>Registered Successfully</h1></p>");
            rd.forward(req, res);
        } else {

            out.print("<p style='color:red;'>User is already registered</p>");
            RequestDispatcher rd = req.getRequestDispatcher("signup.html");
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
