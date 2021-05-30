
package DemoPack;

import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;


public class Filter1 implements Filter {
    
    private static final boolean debug = true;

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
    response.setContentType("text/html");
    PrintWriter out=response.getWriter();
    out.println("InFilter1,atrequest");
    chain.doFilter(request,response);
    out.println("InFilter1,atresponse");
    }

    @Override
    public void destroy() {
        
    }

}