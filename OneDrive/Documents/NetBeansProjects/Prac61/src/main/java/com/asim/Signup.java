package com.asim;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Signup
 */
@WebServlet("/Signup")
public class Signup extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Signup() {
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
				
				String name = request.getParameter("name");
				String email = request.getParameter("email");
				String pwd = request.getParameter("pwd");
				
				String sqlcheck = "SELECT * FROM student_info where EmailAddress = '"+email+"'";
				ResultSet res = st.executeQuery(sqlcheck);
				
				int row = 0;
				
				while(res.next()) row++;
				
				if(row == 0) {
				
					String sql = "INSERT INTO student_info values('"+name+"','"+email+"','"+pwd+"')";
					int rowcount = st.executeUpdate(sql);
					out.println("<script>alert(\"You are Successfully Signed Up\")</script>");
					
				}
				else {
					out.println("<script>alert(\"Data already existed Please Enter unique one OR Login\")</script>");
				}
				RequestDispatcher rd = request.getRequestDispatcher("index.html");
				rd.include(request, response);
				
            } catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
            
    	
	}

}
