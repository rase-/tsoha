<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Admin: Beerstyles</title>
    </head>
    <body>
        <h1>Beerstyles</h1>
        <c:forEach var="beerstyle" items="${beerstyles}">
            <a href="${pageContext.request.contextPath}/admin/${beerstyle.id}">${beerstyle.name}</a><br />
        </c:forEach>
         
        
        <form:form commandName="beerstyleform" action="${pageContext.request.contextPath}/admin/beerstyles" method="POST">
            Name: <form:input path="name" /><form:errors path="name" /> <br />
            Description: <form:input path="description" /><form:errors path="description" /> <br />
            Origin: <form:input path="origin" /><form:errors path="origin" /> <br />
            <input type="submit"/>
        </form:form>
        <p><a href="<c:url value="/j_spring_security_logout" />" > Logout</a></p>
    </body>
</html>
