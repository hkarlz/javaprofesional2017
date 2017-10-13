package modelo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import bean.Libro;

public class GestionLibros {
	DataSource ds;
    
	public GestionLibros(){
	    	try {
				Context ctx = new InitialContext();
				ds = (DataSource)ctx.lookup("java:comp/env/reflibros");
			} catch (NamingException e) {			
				e.printStackTrace();
			}
	        
	}
 
	 public List<Libro> recuperarLibros(){
	    String sql = "select * from libros" ;
	    return verLibros(sql);
	 }
	 
	 public List<Libro> recuperarLibros(int idTema){
	    String sql = "select * from libros where idTema=" + idTema ; 
	    return verLibros(sql);
	 }
	 private List<Libro> verLibros(String sql){
	    List<Libro> lista = new ArrayList<> ();
	     try(Connection cn = ds.getConnection();) {                       
	          Statement st = cn.createStatement();
	         ResultSet rs = st.executeQuery(sql);            
	         while(rs.next()){
	             lista.add( new Libro( rs.getInt("isbn"),
	                     			  rs.getString("titulo"),
				                       rs.getString("autor"),
				                       rs.getDouble("precio"),
				                       rs.getInt("paginas"),
				                       rs.getInt("idTema"))
	            		   );
	         }
	     }  catch (SQLException ex) {
	         ex.printStackTrace();
	     }   
	     return lista; 
	 }
}
