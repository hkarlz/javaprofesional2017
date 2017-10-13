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

<form action="Controlador?op=doRegistro" method="post">
	
	Usuario:<input type="text" name="usuario" /> <br/>
	Password:<input type="password" name="password"/> <br/>
	Email:<input type="text" name="email"/><br/>
	Telefono:<input type="text" name="telefono"/><br/>
	
	<input type="submit" value="Grabar"/>
	
</form>
<form action="Controlador?op=toLogin" method="post">
	<input type="submit" value="Cancelar"/>
</form>

</center>
</body>
</html>