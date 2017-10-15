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
<form action="Controlador?o=doRegistro" method="post">
	<table>
		<tr> <td>Usuario:   </td> <td> <input type = "text" name = "usuario" /></td> </tr>
		<tr> <td>Contraseña:</td> <td> <input type = "password" name = "password"/> <br/>
		<tr> <td>Email   :  </td> <td> <input type = "text" name = "email"/><br/>
		<tr> <td>Telefono:  </td> <td> <input type = "text" name = "telefono"/><br/>
	</table>
	<input type="submit" value="Grabar"/>
</form>
<form action="Controlador?o=toInicio" method = "post">
	<input type = "submit" value = "Cancelar"/>
</form>
</center>
</body>
</html>