<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<c:if test="${param.numero>=5}">
		<c:out value="has aprobado"/>
</c:if>
<c:if test="${param.numero<5}">
		<c:out value="has suspendido"/>
</c:if>
<br/>
<c:choose>
<c:when test="${param.numero>=5}">
	<c:out value="si que has aprobado"/>
</c:when>
<c:otherwise>
<c:out value="si que has suspendido"/>
</c:otherwise>
</c:choose>


</body>
</html>