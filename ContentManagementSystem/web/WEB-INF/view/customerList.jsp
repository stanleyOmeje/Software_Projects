<%-- 
    Document   : customerList
    Created on : Sep 11, 2020, 9:23:38 AM
    Author     : IFM-COMPLIANCE
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <!--<link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/Resources/css/me.css" />-->
        <!-- <link type="text/css" rel="stylesheet" href="Resources/css/me.css" />
         <meta charset="utf-8">-->
	
<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
	

	<!-- Reference Bootstrap files -->

	<link rel="stylesheet"
 href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">

	
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.min.js"></script>
	

	<script	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>


    </head>
    <body>
        <div class="container">
        <center><div>
        <h1 class="text-primary jumbotron">Stan Content Management App.</h1><br/>
        <div align="left">
            <button class="btn btn-success" type="submit" onclick="window.location.href='register';return false;"><strong>Add New Customer</strong>
           </button>
        </div>
        <br/>
        <div align="left">
            <form action="findt">
                <input type="text" name="sval" />
                <!--<input btn type="submit" value="Search"/>-->
                <button type="submit" class="btn btn-primary"><span class="glyphicon glyphicon-search"></span> Search</button>
             </form>
        </div>
        
        <br/>
        <div width="860px">
            <table class="table table-striped table-bordered">
        <!--<table border="1" cellmargin="10px" cellpadding="10px" width="98%" text-align="center">-->
            <tr><th>ID</th><th>FIRST NAME</th><th>LAST NAME </th><th>E_MAIL</th><th>ACTION</th>
                <c:forEach var="cust" items="${customer}">
                    <c:url var="ulink" value="update">
                        <c:param name="cid" value="${cust.id}" />
                    </c:url>
                
                    <c:url var="dlink" value="delete">
                        <c:param name="cid" value="${cust.id}" />
                    </c:url>
                
                   <tr><td>${cust.id}</td><td>${cust.firstName}</td><td>${cust.lastName}</td><td>${cust.email}</td>
                       <td><center><a href="${ulink}">Update</a>&nbsp;|&nbsp;
                           <a href="${dlink}" onlick="(confirm('Are you sure you want to delete customer?')">Delete</a></td>
                       </center>   
                </tr>
                </c:forEach> 
        </table>
            </div>
        <br/>
        <div width="80%" align="center">
           <p align="left"><a href="/ContentManagementSystem" class=" btn btn-link">Back To Home Page</a></p>
        </div>
        
            </div>
        </center>
            </div>
    </body>
</html>
