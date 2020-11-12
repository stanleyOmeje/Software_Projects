<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="s" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="h" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Welcome to Spring Web MVC project</title>
        <s:url var="cs" value="Resources/css/maincss.css" />
        <link href="${cs}" rel ="stylesheet" type="text/css" />
    </head>

    <body>
                <table border="1" width="80%" align="center">
                    
                     <tr>
                <td height="50px">
                    <jsp:include page="include/logotop.jsp" />
                </td>
            </tr>
            
           
            
            <tr>
                <td height="35px" id="men"><jsp:include page="include/menu.jsp" />
</td>
            </tr>
            
            <tr>
                <td height="750px" valign="top"><jsp:include page="include/bodys.jsp" /></td>

            </tr>   
            
            <tr>
                <td height="25px"><jsp:include page="include/footer.jsp" /></td>
            </tr>
         </table>
        
    </body>
</html>
