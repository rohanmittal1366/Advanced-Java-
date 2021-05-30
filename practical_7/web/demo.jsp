<%-- 
    Document   : demo
    Created on : Apr 20, 2021, 3:08:08 PM
    Author     : asus
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>

        <jsp:useBean id = "students" class = "student.StudentBean" > 
            <jsp:setProperty name = "students" property = "firstName" />
            <jsp:setProperty name = "students" property = "lastName" />
            <jsp:setProperty name = "students" property = "age" />

        </jsp:useBean>
        
        <p><b>Student First Name: </b> 
            <jsp:getProperty name = "students" property = "firstName"/>
        </p>

        <p><b>Student Last Name: </b>
            <jsp:getProperty name = "students" property = "lastName"/>
        </p>
        <p><b>Student Age: </b>
            <jsp:getProperty name = "students" property = "age"/>
        </p>

    </body>
</html>
