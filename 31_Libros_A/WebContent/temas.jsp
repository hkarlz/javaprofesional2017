<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.*,bean.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<center>
            <h1>Seleccione Tema</h1>
            <br/><br/>
		<form  action="Controlador?op=doLibros" method="post">
			<select name="tema">
				<option value="0">Todos</option>
				
				<%List<Tema> temas=(List<Tema>)request.getAttribute("temas");
				for(Tema t:temas){%>
				
					<option value="<%=t.getIdTema()%>"><%=t.getTema()%></option>
				<%}%>
			</select>
			<br/>
			<input type="submit" value="Ver libros"/>
			
		</form>

	
	</center>
</body>
</html>