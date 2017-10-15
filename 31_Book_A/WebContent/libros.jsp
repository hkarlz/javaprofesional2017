<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="bean.*, java.util.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<center>
<table border="1">
    <tr><td> </td> <td>Titulo</td> <td>Autor</td> <td>Precio</td><td>Paginas</td><td>Id Tema</td></tr>
    <%List<Libro> lb = (List<Libro>) request.getAttribute("libros");
	for(Libro l:lb){%> 
		<tr> <td> <a href="n"><img src="xy.jpg" width="18" height="18"> </td>
        <td><%=l.getTitulo()%> </td>
		<td><%=l.getAutor()%>  </td>
		<td><%=l.getPrecio()%> </td>
		<td><%=l.getPaginas()%></td>
		<td><%=l.getIdTema()%></td>
		</tr>
    <%} %>
</table>
<br/><br/>
<a href="Controlador?o=toLogin">Inicio</a>	
</center>
</body>
</html>