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

import bean.Tema;

public class GestionTemas {
	DataSource ds;
	
	public GestionTemas() {
		try {
			Context ctx = new InitialContext();
			this.ds = (DataSource) ctx.lookup("java:comp/env/reflibros");
		} catch (NamingException e) {
			e.printStackTrace();
		}
	}
	
	public List<Tema> verTemas(){
		List<Tema> t = new ArrayList<>();
		try( Connection cnx = ds.getConnection()){
			String sql = "SELECT * FROM TEMAS";
			PreparedStatement ps = cnx.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				t.add( new Tema( rs.getInt("idTema"), rs.getString("tema")));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return t;
	}

}
