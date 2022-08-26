<%@page import="com.arquitecturajava.servicios.ServicioCursos"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page import="java.util.List" %>
<%@page import="java.util.ArrayList" %>
<%@page import="com.arquitecturajava.Curso" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<%
	
	ServicioCursos sc=new ServicioCursos();
	List<Curso> listaCursos=sc.buscarTodos();
	
	
	
	
	for (Curso curso :listaCursos) {%>

	<p><%=curso.getNombre()%>,<%=curso.getNivel()%></p>
	
	
	
	<%}%>


</body>
</html>