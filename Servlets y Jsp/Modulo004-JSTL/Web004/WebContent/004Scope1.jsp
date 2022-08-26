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
<!-- acceso a los parametros que vienen desde un formulario con el objeto param -->
<c:out value="${param.nombre}"></c:out>
<c:set var="nombre" value="${param.nombre}" scope="session"/>
<a href="005Scope2.jsp">ver datos en session</a>
</body>
</html>