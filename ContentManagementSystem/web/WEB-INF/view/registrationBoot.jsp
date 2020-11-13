<%-- 
    Document   : registration
    Created on : Sep 16, 2020, 6:24:15 AM
    Author     : IFM-COMPLIANCE
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
	

	<!-- Reference Bootstrap files -->

	<link rel="stylesheet"
 href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">

	
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.min.js"></script>
	

	<script	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>


    </head>
    <body>
        <div class="container">
         <div width="80%" align="center">
            <h1 class="text-primary jumbotron">
            Content Management System
            </h1>
             

         </div>
        
        <div class="row"> 
            <div class="col-md-6" >
                 <h2 class="text-danger">Save Customer</font></h2><br/>
                     <form:form modelAttribute="customer" action="save">
                         <form:hidden path="id" />
                         
                           <div class="button-group">
                                <label><font size="5" color="blue" for="fn">First Name</font></label>
                                <form:input type="text" path="firstName" id="fn" class="form-control"/>
                            </div>
                        
                            <div class="button-group">
                               <label><font size="5" color="blue">Last Name</font></label>
                               <form:input type="text" path="lastName" width="100%" class="form-control" />
                             </div>               
                         
                             <div class="button-group">
                               <label><font size="5" color="blue">Email</font></label>
                                <form:input type="text" path="email" class="form-control"/>
                             </div>               
                      <br/>
                            <div>
                              <input type="submit" value="Enter" class="btn btn-success" />
                              <input type="Reset" value="Clear" class="btn btn-success"/>
                            </div>
                 
                   </form:form>
              </div>
          </div>
                    <br/><br/>
                   
          
            <p><a href="list">Back To Table</a></p>
           
                    
         
        </div>
    </body>
</html>
