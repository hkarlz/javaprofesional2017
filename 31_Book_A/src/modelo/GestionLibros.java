package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import bean.Libro;

public class GestionLibros {
	DataSource ds;
	
	public GestionLibros() {
		try {
			Context ctx = new InitialContext(); 
			this.ds = (DataSource) ctx.lookup("java:comp/env/reflibros");
		} catch (NamingException e) {
			e.printStackTrace();
		}
	}
	
	public List<Libro> verLibros( int id ){
		String sql = "SELECT * FROM LIBROS " + (id!=0?"WHERE idTema="+id:" ");
		List<Libro> l = new ArrayList<>();
		try( Connection cnx = ds.getConnection() ){
			PreparedStatement ps = cnx.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while( rs.next()) {
				l.add(new Libro(	rs.getInt("isbn"), 
								rs.getString("titulo"),
								rs.getString("autor"),
								rs.getDouble("precio"),
								rs.getInt("paginas"),
								rs.getInt("idTema")
							   )
					 );
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return l;
	}
}
