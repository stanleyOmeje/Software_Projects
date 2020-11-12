<%-- 
    Document   : adminDashBoard
    Created on : Jun 25, 2020, 1:44:22 PM
    Author     : IFM-COMPLIANCE
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="s" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="h" %>
<!DOCTYPE html>
<html>
     <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Welcome to Spring Web MVC project</title>
        <s:url var="csa" value="Resources/css/style.css" />
        <link href="${csa}" rel ="stylesheet" type="text/css" />
        
    </head>

    <body>
                <table border="1" width="80%" align="center">
            
            <tr>
                <td height="80px">
                    <jsp:include page="include/header.jsp" />
                </td>
            </tr>
            
            <tr>
                <s:url var="mn" value="include/menu.jsp" />

                <td height="35px" id="men"><jsp:include page="include/menu.jsp" />
               
</td>
            </tr>
            
            <tr>
                <td height="450px" valign="top">
                    <h1>Admin DashBoard </h1>
                    
                </td>
            </tr>
            
            <tr>
                <td height="25px"><jsp:include page="include/footer.jsp" />
</td>
            </tr>
         </table>
       
    </body>
</html>
