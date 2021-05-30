package Attributes_Session;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class AS_Servlet_1 extends HttpServlet {

    private int counter;

    @Override
    public void init() {
        counter = 0;
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html;charset=UTF-8");
        try ( PrintWriter out = response.getWriter()) {
            counter++;

            ServletContext sc = request.getServletContext();
            String u_phonenum = sc.getInitParameter("PhoneNumber");

            String u_name = request.getParameter("StudentName");
            int u_age = Integer.parseInt(request.getParameter("age"));

            sc.setAttribute("app_att", "Application Attribute");

            HttpSession ss = request.getSession();

            sc.setAttribute("Visitor", "0");

            int visitor = Integer.parseInt((String) sc.getAttribute("Visitor"));
            visitor++;

            request.setAttribute("req_att", "Request Attribute");

            String appatt_value = (String) sc.getAttribute("app_att");

            String reqatt_value = (String) request.getAttribute("req_att");

            Cookie cook1 = new Cookie("College", "Nirma");
            response.addCookie(cook1);

            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet AS_Servlet_1</title>");
            out.println("</head>");
            //out.println("<body>");
            out.println("<p>Username: " + u_name + " </p>");
            out.println("<p>Phone Number: " + u_phonenum + " </p>");
            out.println("<p>Age: " + u_age + " </p>");
            out.println("<p> Application Level Attribute : " + appatt_value + " </p>");
            out.println("<p> Request Level Attribute : " + reqatt_value + " </p>");
            out.println("<p> Visitor : " + visitor + " </p>");
            out.println("<p> Counter : " + counter + " </p>");
            out.println("<form action='AS_Servlet_2' >");
            out.println("<input type='submit' value='next'>");

            out.println("</form>");
            //out.println("</body>");
            out.println("</html>");
        }

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try ( PrintWriter out = response.getWriter()) {

            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet AS_Servlet_1</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet AS_Servlet_1 at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
