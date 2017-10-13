package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Controlador")
public class Controlador extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String op = request.getParameter("op");
		String url="login.jsp";
                switch(op){
                    case "doLogin":
                        url="LoginAction"; 
                        break;
                    case "doRegistro":
                        url="RegistroAction";
                        break; 
                    case "doLibros":
                        url="LibrosAction";
                        break;
                    case "toRegistro":
                        url="registro.jsp";
                        break; 
                    case "toLogin":
                        url="login.jsp";
                        break; 
                }
		request.getRequestDispatcher(url).forward(request, response);
	}
}
