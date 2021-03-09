
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class s2 extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
//        System.out.println("helllo");
        ServletConfig scg = getServletConfig();
        String param1 = scg.getInitParameter("roll");
//        System.out.println("roll");
        PrintWriter out = response.getWriter();
        try {
            /* TODO output your page here. You may use following sample code. */
//            out.println("<!DOCTYPE html>");
//            out.println("<html>");
//            out.println("<head>");
//            out.println("<title>Servlet s2</title>");
//            out.println("</head>");
//            out.println("<body>");
//            out.println("<h1>Servlet s2 at " + request.getContextPath() + "</h1>");
//            out.println("<h1>Servlet s1 at " + request.getParameter("first_name") + "</h1>");
//            out.println("<h1>Servlet s1 at " + request.getParameter("roll") + "</h1>");
//            out.println("<h1>"+ param1 + "</h1>");
//            out.println("</body>");
//            out.println("</html>");

            String title = "Using GET Method to Read Form Data";
            String docType
                    = "<!doctype html public \"-//w3c//dtd html 4.0 "
                    + "transitional//en\">\n";
            out.println(docType
                    + "<html>\n"
                    + "<head><title>" + title + "</title></head>\n"
                    + "<body bgcolor=\"#f0f0f0\">\n"
                    + "<h1 align=\"center\">" + title + "</h1>\n"
                    + "<ul>\n"
                    + " <li><b>First Name</b>: "
                    + request.getParameter("first_name") + "\n"
                    + " <li><b>Last Name</b>: "
                    + request.getParameter("last_name") + "\n"
                    + "</ul>\n"
                    + "</body></html>");

        } finally {
            out.close();
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }
}
