package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Controlador")
public class Controlador extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String op = request.getParameter("o");
		String url = "inicio.jsp";
        switch(op){
            case "doAcceso"   : url = "AccesoAction"; break;
            case "doRegistro" : url = "RegistroAction"; break; 
            case "doLibros"   : url = "LibrosAction"; break;
            case "toRegistrar": url = "registro.jsp"; break; 
            case "toInicio"   : url = "inicio.jsp";  break; 
        }
		request.getRequestDispatcher(url).forward(request, response);
	}

}
