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
                <td height="80px">
                     <jsp:include page="include/logotop.jsp" />
                    <jsp:include page="include/header.jsp" />
                </td>
            </tr>
            
            <tr>
                <td height="35px" id="men"><jsp:include page="include/menu.jsp" />
</td>
            </tr>
            
            <tr>
                <td height="450px" valign="top">
                    <h1>User Login</h1>
                    
                    <c:if test="${err!=null}">
                        <p class="error">${err}</p>
                    </c:if>
                        
                    <c:if test="${param.act eq 'log'}">
                        <p class="success">You are successfully logged out. Thanks for using Contact Application</p>
                    </c:if>
                        
                     <c:if test="${param.act eq 'rg'}">
                        <p class="success">You are successfully registered. Kindly login to proceed.</p>
                    </c:if>
                        
                    <s:url var="lgn" value="/login"/>
                    <h:form action="${lgn}" modelAttribute="command" method="Post">
                        <table border="1">
                            <tr>
                                <td>Login Name</td><td><h:input type="text" path="loginName" /></td>
                            </tr>
                            
                             <tr>
                                 <td>Password</td><td><h:password path="password" /></td>
                            </tr>
                            
                            <tr>
                                <td colspan="2" align="right"><Button>Submit</Button><br/>
                                    <a href="reg">New Registration</a></td>
                            </tr>
                        </table>
                    </h:form>
                </td>
            </tr>
            
            <tr>
                <td height="25px"><jsp:include page="include/footer.jsp" />
</td>
            </tr>
         </table>
        
    </body>
</html>
