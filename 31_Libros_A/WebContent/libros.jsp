<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.*,bean.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<center>
<table border="1">
    <tr><th>Titulo</th><th>Autor</th><th>Precio</th></tr>
            <%List<Libro> libros=(List<Libro>)request.getAttribute("libros");
				for(Libro lib:libros){%> 
              	<td><%=lib.getTitulo()%></td>
				<td><%=lib.getAutor()%></td>
				<td><%=lib.getPrecio()%></td></tr>
            <%} %>
</table>
<br/><br/>
<a href="Controlador?op=toLogin">Inicio</a>
</center>
</body>
</html>