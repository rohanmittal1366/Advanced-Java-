<%-- 
    Document   : index
    Created on : Apr 20, 2021, 2:00:41 PM
    Author     : asus
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Practical 7</title>
        <style>

            .log{

                border: 1px solid ;
                width: 450px;
                padding: 20px ;
                margin-left: 500px;
                margin-top: 200px;
            }
        </style>
    </head>

    <body>

        <div>
            <form action="demo.jsp" method="POST">

                <div class ="log">

                    <h2>First name : <input type="text" name="firstName" /></h2>
                    <h2>Last name  : <input type="text" name="lastName" /></h2> 
                    <h2>Age : <input type="text" name="age" /></h2> 
                    <h2><input type ="submit" style="font-size: 20px"></h2>

                </div>
            </form>
        </div>


    </body>
</html>