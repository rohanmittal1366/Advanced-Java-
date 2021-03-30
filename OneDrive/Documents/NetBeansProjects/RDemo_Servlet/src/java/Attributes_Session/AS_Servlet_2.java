package Attributes_Session;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AS_Servlet_2 extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        ServletContext sc = request.getServletContext();
        String appatt_value = (String) sc.getAttribute("app_att");

        String reqatt_value = (String) request.getAttribute("req_att");

        int visitor = Integer.parseInt((String) sc.getAttribute("Visitor"));
        visitor++;

        sc.setAttribute("Visitor", String.valueOf(visitor));

        Cookie ck[] = request.getCookies();

        // response.setIntHeader("Refresh", 10);
        try ( PrintWriter out = response.getWriter()) {

            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet AS_Servlet_2</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<p> Application Level Attribute : " + appatt_value + " </p>");
            out.println("<p> Request Level Attribute : " + reqatt_value + " </p>");
            out.println("<p> Visitor : " + visitor + " </p>");
            for (int i = 0; i < ck.length; i++) {
                out.println("<p>" + ck[i].getName() + ":::" + ck[i].getValue() + "</p>");
            }

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

}
