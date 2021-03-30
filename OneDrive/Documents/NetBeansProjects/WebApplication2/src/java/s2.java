import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;
import javax.servlet.RequestDispatcher;
import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class s2 implements Servlet {

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
//        String s1 = req.getParameter("first_name");
//        String s2 = req.getParameter("last_name");
//        out.println("hello" + s1);
//        out.println("bye" + s2);
        res.setContentType("text/html");
        ServletContext scontext = req.getServletContext();
        //int sem = scontext.getInitParameter("Semester");

        String s_name = req.getParameter("first_name");
        System.out.println(s_name);

        PrintWriter pw = res.getWriter();
//        pw.write(s_name+"::::::"+scontext.getInitParameter("Semester")+":::"+cn.getInitParameter("Rollno"));

        if (s_name.equals("java")) {
            // Go to next page
            RequestDispatcher rd = req.getRequestDispatcher("newhtml.html");
            rd.forward(req, res);
        } else {
            // Go to Same page 
            pw.write("<p>Incorrect Username");
            RequestDispatcher rd1 = req.getRequestDispatcher("index.jsp");
            rd1.include(req, res);

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


