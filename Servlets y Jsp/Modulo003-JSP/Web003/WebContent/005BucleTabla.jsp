<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<%
		String curso1 = "Java";
		String curso2 = "Net";
		String curso3 = "PHP";
		//acceso a estas clases de java 
		List<String> listaCursos = new ArrayList<String>();
		listaCursos.add(curso1);
		listaCursos.add(curso2);
		listaCursos.add(curso3);
	%>

	<table border="1px">

		<%
			for (String curso : listaCursos) {
		%>

		<tr>
			<td><%=curso%></td>
		</tr>
		<%
			}
		%>
	</table>





</body>
</html>