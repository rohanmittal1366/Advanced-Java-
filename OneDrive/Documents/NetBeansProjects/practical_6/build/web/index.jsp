<%-- 
    Document   : index
    Created on : Mar 23, 2021, 3:13:04 PM
    Author     : asus
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Practical 6</title>
    </head>
    <body>
        <h1>Hello World!</h1>
         <form action="servlet1" method="POST">
                <div style="font-size: 34px; color: green; text-align:center"><p>User Login</p> </div>
                <div class ="log">
                    <h2>Enter Username : <input type="text" name="username" /></h2>

                    <h2>Enter Password : <input type="text" name="password" /></h2> 
                    <h2><input type ="submit" style="font-size: 20px"></h2>
                </div>
            </form>
    </body>
</html>
