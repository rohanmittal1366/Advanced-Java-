package com.asim;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Login
 */
@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login() {
        super();
        // TODO Auto-generated constructor stub
    }
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
			String jdbcurl = "jdbc:mysql://localhost:3306/sample_database";
	        String Username = "root";
	        String driverclassname = "com.mysql.cj.jdbc.Driver";
	        try {
				Class.forName(driverclassname);
				Connection con = DriverManager.getConnection(jdbcurl,Username,"");
				PrintWriter out = response.getWriter();
				Statement st = con.createStatement();
				
				String email = request.getParameter("email");
				String pwd = request.getParameter("pwd");
				
				String sqlcheck = "SELECT * FROM student_info where EmailAddress = '"+email+"' AND PassWord = '"+pwd+"'";
				ResultSet res = st.executeQuery(sqlcheck);
				
				int row = 0;
				String name1="",email1="",pwd1="";
				while(res.next()) {
					name1 = res.getString(1);
					email1 = res.getString(2);
					pwd1 = res.getString(3);
					row++;
				}
				if(row>0) {
					HttpSession sc = request.getSession();
					//ServletContext sc = getServletContext();
					sc.setAttribute("name1", name1);
					sc.setAttribute("email1", email1);
					sc.setAttribute("pwd1", pwd1);
					RequestDispatcher rd = request.getRequestDispatcher("welcome-login.html");
					rd.include(request, response);
				}
				else {
					out.println("<script>alert(\"Incorrect Email or Password Please Enter again"+name1+"\")</script>");
					RequestDispatcher rd = request.getRequestDispatcher("index.html");
					rd.include(request, response);
				}
				
            } catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}

}
