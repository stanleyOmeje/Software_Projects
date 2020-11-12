<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="s" %>



<c:if test="${sessionScope.userid==null}">
<a href ="uLog">Home</a> | <a href ="login">Login</a> | <a href ="reg">Register</a> | <a href ="index">Blog</a> | <a href ="#">About Us</a> | <a href ="#">FAQ</a> 
</c:if>

<c:if test="${(sessionScope.userid != null) && (sessionScope.role == 1)}">
<a href ="index">Home</a> | <a href ="uList">User List</a> | <a href ="logout">Logout</a> 
</c:if>

<c:if test="${sessionScope.userid != null && sessionScope.role == 2}">
<a href ="index">Home</a> | <a href ="cRF">Add Contact</a> | <a href ="cLister">Contact List</a> | <a href ="logout">Logout</a> 
</c:if>



