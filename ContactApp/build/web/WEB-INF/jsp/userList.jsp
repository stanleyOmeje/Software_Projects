<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="s" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="h" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
     <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Welcome Usert Listing Page</title>
        <s:url var="csu" value="Resources/css/styles.css" />
        <link href="${csu}" rel ="stylesheet" type="text/css" />
        
        <style type="text/css">
            table, tr, td{
                border:1;
            }
            </style>
    </head>

    <body>
                <table border="1" width="80%" align="center" id="dt">
            
            <tr>
                <td height="80px">
                     <jsp:include page="include/logotop.jsp" />
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
                    
                    
                    <h1>User Listing</h1>
                   
                       <table border="1">
                        <tr>
                            <th>S/N</th>
                            <th>USERID</th>
                            <th>NAME</th>
                            <th>PHONE</th>
                            <th>EMAIL</th>
                            <th>ADDRESS</th>
                            <th>USERNAME</th>
                            <th>STATUS</th>
                        </tr>
                        
                        <c:if test="${empty userList}">
                            <p class="success">No User Listed, thanks.</p>
                        </c:if>
                                                     
                        <c:forEach var="ul" items="${userList}" varStatus="us" >
                           <tr id="me">
                              <td>${us.count}</td>
                               <td>${ul.userId}</td>
                               <td>${ul.name}</td>
                               <td>${ul.phone}</td>
                               <td>${ul.email}</td>
                               <td>${ul.address}</td>
                               <td>${ul.loginName}</td>
                               <td>${ul.loginStatus}</td>
                           </tr>
                        </c:forEach>
                    </table>
                                      
                </td>
            </tr>
            
            <tr>
                <td height="25px"><jsp:include page="include/footer.jsp" />
</td>
            </tr>
         </table>
        
    </body>
</html>

