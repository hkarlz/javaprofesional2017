package servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.Libro;
import modelo.GestionLibros;


@WebServlet("/LibrosAction")
public class LibrosAction extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id = Integer.parseInt( request.getParameter("tema"));
		GestionLibros  gl = new GestionLibros();
		List<Libro> lb = gl.verLibros(id);
		request.setAttribute("libros", lb);
		request.getRequestDispatcher("libros.jsp").forward(request, response);
	}

}
