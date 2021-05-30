

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="newjsp.jsp" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Practise Page</title>
    </head>
    <body>
   
        <h1>Pradumna's World!</h1>
        <%! int a = 10;%>
        <c:set var="name" value="10" ></c:set>
        <c:out value="${name}"></c:out>
        <%= a%>
        <c:if test="${name==10}">
            <h2>I am rohan </h2>
        </c:if>
            
           <%  %> 
<%@include file="newjsp.jsp" %>

    </body>
</html>
