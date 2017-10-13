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
		int idTema=Integer.parseInt(request.getParameter("tema"));
		GestionLibros glibros=new GestionLibros();
		List<Libro> libros;
		if(idTema==0){
			libros=glibros.recuperarLibros();
		}
		else{
			libros=glibros.recuperarLibros(idTema);
		}
		request.setAttribute("libros", libros);
		request.getRequestDispatcher("libros.jsp").forward(request, response);
	}

}
