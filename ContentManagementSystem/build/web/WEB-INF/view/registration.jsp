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
        <div width="80%" align="center">
         <div width="80%" align="center">
            <h1>
            Content Management System
            </h1>
             

         </div>
        <br/>
                <div width="80%" align="center">
                    <h3><font color="red">Save Customer</font></h3>
            <form:form modelAttribute="customer" action="save">
                <form:hidden path="id" />
                 <table >
                     <tr>
                         <td width="50%">
                             <label><font size="6" color="darkblue">First Name</font></label>
                         </td>
                         <td>
                             <form:input type="text" path="firstName" clss="form-control"/>
                         </td>
                      </tr>
                      
                       <tr>
                         <td>
                             <label><font size="6" color="darkblue">Last Name</font></label>
                         </td>
                         <td>
                             <form:input type="text" path="lastName" width="100%" />
                         </td>
                      </tr>
                   
                       <tr>
                         <td>
                             <label><font size="6" color="blue">Email</font></label>
                         </td>
                         <td>
                             <form:input type="text" path="email"/>
                         </td>
                      </tr>
                      
                      <tr>
                         <td>  </td>
                         <td>  </td>
                      </tr>

                       <tr>
                         <td>
                             <label></label>
                         </td>
                         <td>
                             <input type="submit" value="Enter"/>&nbsp;
                              <input type="Reset" value="Clear"/>
                         </td>
                      </tr>

                 </table>
             </form:form>
                 
                    <br/><br/><br/>
                    <br/><br/><br/>
                    <br/><br/><br/>
           <div width="80%" align="center">
            <p><a href="list">Back To Table</a></p>
            </div>
                    
         </div>
        </div>
    </body>
</html>
