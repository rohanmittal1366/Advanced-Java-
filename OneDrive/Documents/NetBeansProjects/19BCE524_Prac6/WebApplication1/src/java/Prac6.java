/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
//import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import javax.servlet.http.HttpSession;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
/**
 *
 * @author Hp
 */
@WebServlet(urlPatterns = {"/Prac6"})
public class Prac6 extends HttpServlet {

   
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException, ClassNotFoundException {
        response.setContentType("text/html;charset=UTF-8");
        response.setIntHeader("Refresh", 5);
        
        String count="";
        String title = "Welcome to Student Portal";
        String userID = new String("19BCE524");
        String name=new String("Shah Tirth");
        String mobileno=new String("7874720982");
        String email=new String("19bce524@nirmauni.ac.in");
        
        
         Class.forName("com.mysql.jdbc.Driver");

            java.sql.Connection con2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/data", "root", "");
            PreparedStatement ps = con2.prepareStatement("select * from ajava_prac6");
            ResultSet rs =ps.executeQuery();
            //st = rs.next();
           
            
        
        try (PrintWriter out = response.getWriter()) {
            
            
            HttpSession session=request.getSession(true);
            
            if(session.getAttribute("count")==null)
            {
                session.setAttribute("count",1);
            }
            else
            {
                session.setAttribute("count",((int)session.getAttribute("count"))+1);
            }
            out.println("<html><body><center><h1>"+title+"</h1></center></body></html>");
            
            out.println("<html><body><center><h1>No of Time visited="+(int)session.getAttribute("count")+"</h1></center></body></html>");
            
            
             int i=1;
              while(rs.next()){
                    
                    name=rs.getString(2);
                    out.println("<h1>"+i+")"+name+"</h1>");
                    i++;
                   
                    
                    
                }
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
          /*  
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Prac6</title>");            
            out.println("</head>");
            out.println("<body style='background-color: lightblue'>");
            out.println("<h1 align ='center'>" +"Total No Of Hits"  +"</h1>");
         
            out.println("<h1 align='center'>"+(int)session.getAttribute("count")+"</h1>");
            out.println("</body>");
            out.println("</html>");
             */
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
        String count="";
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(Prac6.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Prac6.class.getName()).log(Level.SEVERE, null, ex);
        }
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
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(Prac6.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Prac6.class.getName()).log(Level.SEVERE, null, ex);
        }
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

}
