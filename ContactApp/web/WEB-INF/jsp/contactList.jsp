<%-- 
    Document   : userDashBoard
    Created on : Jun 25, 2020, 1:45:14 PM
    Author     : IFM-COMPLIANCE
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="s" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="h" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
     <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Welcome Contact Listing Page</title>
        <link rel="stylesheet" href="https://Resources/stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous">
        <s:url var="csu" value="Resources/css/styles.css" />
        <link href="${csu}" rel ="stylesheet" type="text/css" />
        
        <style type="text/css">
            table, tr, td{
                border:1;
            }
            </style>
    </head>

    <body>
       <!-- <h1 class="text-primary">Testing bootstrap plug in</h1>-->
                <table border="1" width="80%" align="center" id="dt">
            
            <tr>
                <td height="80px">
                     <jsp:include page="include/logotop.jsp" />
                   <!-- <jsp:include page="include/header.jsp" />-->
                </td>
            </tr>
            
            <tr>
                <s:url var="mn" value="include/menu.jsp" />

                <td height="35px" id="men"><jsp:include page="include/menu.jsp" />
</td>
            </tr>
            
            <tr>
                <td height="450px" valign="top">
                    
                    
                    <h1>Contact Listing</h1>
                    
                     <table width="10px">
                        <tr width="10px">
                           <td width="10px">   
                           <form action="freetext" width="10px">
                               <input type="text" name="freetext" value ="${param.freetext}" placeholder="Enter text to find" />
                               <Button type="submit">Find</button>
                            </form>   
                           </td>
                        </tr>
                       </table>
                      
                         <br/>
                        <c:if test="${param.act eq 'bk'}">
                              <p class="success"> Contacts deleted, thanks.</p>
                           </c:if>
     
                    
                    <br/>
                  <form action="bulkDelete">
                      <Button>Delete selected values</button><br/><br/>
                    <table border="1">
                        <tr>
                            <th>SELECT</th>
                            <th>CONTACTID</th>
                            <th>NAME</th>
                            <th>PHONE</th>
                            <th>EMAIL</th>
                            <th>ADDRESS</th>
                            <th>REMARK</th>
                            <th>ACTION</th>
                        </tr>
                        
                        <c:if test="${empty contactList}">
                            <p class="success">No Contact Listed, thanks.</p>
                        </c:if>
                                                     
                        <c:forEach var="cl" items="${contactList}" varStatus="vs" >
                           <tr id="me">
                               <td align="center"><input type="checkbox" name="cid" value="${cl.contactId}"></td>
                             <td>${cl.contactId}</td>
                             <td>${cl.name}</td>
                             <td>${cl.phone}</td>
                             <td>${cl.email}</td>
                             <td>${cl.address}</td>
                             <td>${cl.remark}</td>
                             
                             <s:url var="del" value="/delete">
                                 <s:param name="cid" value="${cl.contactId}" />
                             </s:url>
                             <s:url var="up" value="/update">
                                 <s:param name="cid" value="${cl.contactId}" />
                             </s:url>
                             
                             <td><a href="${up}">update</a> | <a href="${del}">delete</a></td>
                           </tr>
                        </c:forEach>
                    </table>
                  </form>
                    
                </td>
            </tr>
            
            <tr>
                <td height="25px"><jsp:include page="include/footer.jsp" />
</td>
            </tr>
         </table>
        

<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js" integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js" integrity="sha384-B4gt1jrGC7Jh4AgTPSdUtOBvfO8shuf57BaghqFfPlYxofvL8/KUEfYiJOMMV+rV" crossorigin="anonymous"></script>
    </body>
</html>
