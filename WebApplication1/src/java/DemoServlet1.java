/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JTable;

/**
 *
 * @author Asus
 */
public class DemoServlet1 extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        ServletConfig scg =getServletConfig();
       String param1= scg.getInitParameter("Roll");
       //System.out.println(param1);
        
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet DemoServlet1</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet DemoServlet1 at " + request.getParameter("name") + "</h1>");
            out.println("kmfkmfvmfkmvfkvmf");
            out.println("<h2>"+param1+"</h2>");
            out.println("</body>");
            out.println("</html>");
        }
    }
    
    
    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
    
    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException{
       
       String user = req.getParameter("name");
       String pass = req.getParameter("password");
       PrintWriter out = res.getWriter();
       
       
       //Data Base
       int count =0;
       try {
            Conn c1 = new Conn();
            ResultSet rs = c1.s.executeQuery("select * from login where user like '"+user+"' and password like '"+pass+"'" );

            while (rs.next()) {
                count++;
            }
           
        } catch (SQLException e) {
        }
       if(count>0)
       {
           RequestDispatcher rd= req.getRequestDispatcher("Welcome.html");
          rd.forward(req, res);
       }
       else
       {
           out.println("<p>"+"Incorrect Username or Password"+"</p>");
           RequestDispatcher rd= req.getRequestDispatcher("login.html");
           rd.include(req, res);
       }
       
//       if(user.equals("Kishan"))
//       {
//          
//           RequestDispatcher rd= req.getRequestDispatcher("Welcome.html");
//           rd.forward(req, res);
//           
//       }
//       else
//       {
//           out.println("<p>"+"Incorrect Data"+"</p>");
//           RequestDispatcher rd= req.getRequestDispatcher("index.html");
//           rd.include(req, res);
//           
//           
//       }
    }

}
