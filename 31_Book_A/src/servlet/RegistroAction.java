package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.GestionClientes;

@WebServlet("/RegistroAction")
public class RegistroAction extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		GestionClientes gc = new GestionClientes();
		String u = request.getParameter("usuario");
		String p = request.getParameter("password");
		String e = request.getParameter("email");
		int t = Integer.parseInt( request.getParameter("telefono"));
		gc.registrar(u, p, e, t);
		request.getRequestDispatcher("inicio.jsp").forward(request, response);
	}

}
