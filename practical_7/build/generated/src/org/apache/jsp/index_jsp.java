package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("   <head>\n");
      out.write("      <title>get and set properties Example</title>\n");
      out.write("   </head>\n");
      out.write("   \n");
      out.write("   <body>\n");
      out.write("      ");
      student.StudentBean students = null;
      synchronized (_jspx_page_context) {
        students = (student.StudentBean) _jspx_page_context.getAttribute("students", PageContext.PAGE_SCOPE);
        if (students == null){
          students = new student.StudentBean();
          _jspx_page_context.setAttribute("students", students, PageContext.PAGE_SCOPE);
          out.write(" \n");
          out.write("         ");
          org.apache.jasper.runtime.JspRuntimeLibrary.introspecthelper(_jspx_page_context.findAttribute("students"), "firstName", "Zara", null, null, false);
          out.write("\n");
          out.write("         ");
          org.apache.jasper.runtime.JspRuntimeLibrary.introspecthelper(_jspx_page_context.findAttribute("students"), "lastName", "Ali", null, null, false);
          out.write("\n");
          out.write("         ");
          org.apache.jasper.runtime.JspRuntimeLibrary.introspecthelper(_jspx_page_context.findAttribute("students"), "age", "10", null, null, false);
          out.write("\n");
          out.write("      ");
        }
      }
      out.write("\n");
      out.write("\n");
      out.write("      <p>Student First Name: \n");
      out.write("         ");
      out.write(org.apache.jasper.runtime.JspRuntimeLibrary.toString((((student.StudentBean)_jspx_page_context.findAttribute("students")).getFirstName())));
      out.write("\n");
      out.write("      </p>\n");
      out.write("      \n");
      out.write("      <p>Student Last Name: \n");
      out.write("         ");
      out.write(org.apache.jasper.runtime.JspRuntimeLibrary.toString((((student.StudentBean)_jspx_page_context.findAttribute("students")).getLastName())));
      out.write("\n");
      out.write("      </p>\n");
      out.write("      \n");
      out.write("      <p>Student Age: \n");
      out.write("         ");
      out.write(org.apache.jasper.runtime.JspRuntimeLibrary.toString((((student.StudentBean)_jspx_page_context.findAttribute("students")).getAge())));
      out.write("\n");
      out.write("      </p>\n");
      out.write("\n");
      out.write("   </body>\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
