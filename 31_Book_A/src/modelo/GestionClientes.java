package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import bean.Cliente;

public class GestionClientes {
	DataSource ds;

	public GestionClientes() {
		try {
			Context ctx = new InitialContext();
			this.ds = (DataSource) ctx.lookup("java:comp/env/reflibros");
		} catch (NamingException e) {
			e.printStackTrace();
		}
	}
	
	public boolean estaRegistrado(String usuario, String pwd){
		try( Connection cnx = ds.getConnection()){
			String sql = "SELECT * FROM CLIENTES WHERE USUARIO = ? AND PASSWORD = ?";
			PreparedStatement ps = cnx.prepareStatement(sql);
			ps.setString(1, usuario);
			ps.setString(2, pwd);
			ResultSet rs = ps.executeQuery();
			return rs.next();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}
	
	public void registrar(String u, String p, String e, int t) {
		registrar (new Cliente (0, u, p, e, t));
	}
	
	public void registrar(Cliente c) {
		try( Connection cnx = ds.getConnection()){
			String sql = "INSERT INTO CLIENTES (USUARIO, PASSWORD, EMAIL, TELEFONO) VALUES (?,?,?,?)";
			PreparedStatement ps = cnx.prepareStatement(sql);
			ps.setString(1, c.getUsuario());
			ps.setString(2, c.getPassword());
			ps.setString(3, c.getEmail());
			ps.setInt(4, c.getTelefono());
			ps.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
