<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body> 
	<center>
		<form action="Controlador?o=doAcceso" method="POST">
		 <%  String user = "";
			 Cookie[] todas=request.getCookies();
			 if(todas != null){
				 for(Cookie c: todas){
					 if(c.getName().equals("user")){
						 user = c.getValue();
					 }
				 }
			 }
		  %>
			<h1>Usuario: <input type ="text" name ="user" value="<%=user %>"/></h1>
			<h1>Clave  : <input type ="password" name ="pwd"/></h1>
			<h3>Recordar:<input type ="checkbox" name ="recordar" value="Si"/></h3>
			<input type="submit" value ="Enviar"/><br/>
		</form>
		<br/>
		<a href="Controlador?o=toRegistrar">Registrarse</a>
	</center>
</body>
</html>