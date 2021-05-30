import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import javax.servlet.RequestDispatcher;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Welcome
 */
@WebServlet("/Welcome")
public class welcome extends HttpServlet {

    private static final long serialVersionUID = 1L;
    int hitCount;

    @Override
    public void init() {
        // Reset hit counter.
       hitCount = 0;
    }
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException {
        PrintWriter out = response.getWriter();

    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
       
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
//        response.setIntHeader("Refresh", 5);
        
        hitCount++;
        PrintWriter out = response.getWriter();
        String title = "Total Number of Visitor";
      
        out.println(title+" :"+hitCount);
        
        
        HttpSession sc = request.getSession();
        String name = (String) sc.getAttribute("name");
        String pass = (String) sc.getAttribute("pass");
        out.println("name:"+name);
        out.println("password:"+pass);

    }

}