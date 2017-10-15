package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.GestionTemas;

@WebServlet("/TemasAction")
public class TemasAction extends HttpServlet {
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		GestionTemas gt = new GestionTemas();
		request.setAttribute("temas", gt.verTemas());
		request.getRequestDispatcher("temas.jsp").forward(request, response);	
	}

}
