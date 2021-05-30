
package DemoPack;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;


public class Servlet1 implements Servlet {

    ServletConfig cn;
    @Override
    public void init(ServletConfig config) throws ServletException {
       
cn = config;
// throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ServletConfig getServletConfig() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        
        
        ServletContext scontext = req.getServletContext();
        //int sem = scontext.getInitParameter("Semester");
        
        
        String s_name = req.getParameter("StudentName");
        System.out.println(s_name);
        
        PrintWriter pw = res.getWriter();
//        pw.write(s_name+"::::::"+scontext.getInitParameter("Semester")+":::"+cn.getInitParameter("Rollno"));
  
        if(s_name.equals("java"))
        {
            // Go to next page
            RequestDispatcher rd = req.getRequestDispatcher("Welcome.html");
            rd.forward(req, res);
        }
        else
        {
            // Go to Same page 
            pw.write("<p>Incorrect Username");
            RequestDispatcher rd1 = req.getRequestDispatcher("index.html");
            rd1.include(req, res);
            
        }
        
        
//throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
