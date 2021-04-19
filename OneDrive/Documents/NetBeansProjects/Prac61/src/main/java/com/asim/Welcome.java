package com.asim;

import java.io.IOException;
import java.io.PrintWriter;

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
public class Welcome extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Welcome() {
        super();
        // TODO Auto-generated constructor stub
    }

	
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
    	HttpSession sc = request.getSession();
		//ServletContext sc = getServletContext();
    	
		String name = (String) sc.getAttribute("name1");
		String email = (String) sc.getAttribute("email1");
		String pass = (String) sc.getAttribute("pwd1");
		PrintWriter out = response.getWriter();
		out.println("<table style=\"margin-left:auto margin-right:auto\">"
				+ "<tr><td><span>Name</span></td></tr>"
				+ "<td><span>"
				+ name
				+ "</span></td>"
				+ "<tr><td><span>EmailAddress</span></td></tr>"
				+ "<td><span>"
				+ email
				+ "</span></td>"
				+ "<tr><td><span>Password</span></td></tr>"
				+ "<td><span>"
				+ pass
				+ "</span></td>"
				+ "</table>");
		
	}

}
