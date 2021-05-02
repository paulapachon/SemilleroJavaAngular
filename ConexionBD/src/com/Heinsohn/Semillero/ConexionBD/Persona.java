package com.Heinsohn.Semillero.ConexionBD;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;


public class Persona {
	 	private long id;
	   private String nombre, apellido, sexo, fecha_nac;
	   private int salario;
	  

	    public Persona(long id, String nombre, String apellido, String sexo, String fecha_nac ,int salario) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.sexo = sexo;
		this.salario = salario;
		this.fecha_nac= fecha_nac;
	}
	    
	    public Persona(String nombre, String apellido, String sexo, String fecha_nac ,int salario) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.sexo = sexo;
		this.salario = salario;
		this.fecha_nac= fecha_nac;
	}
	    
	    
	    


	    public String getFecha_nac() {
			return fecha_nac;
		}

		public void setFecha_nac(String fecha_nac) {
			this.fecha_nac = fecha_nac;
		}

		public long getId() {
			return id;
		}





		public void setId(long id) {
			this.id = id;
		}





		public String getNombre() {
			return nombre;
		}





		public void setNombre(String nombre) {
			this.nombre = nombre;
		}





		public String getApellido() {
			return apellido;
		}





		public void setApellido(String apellido) {
			this.apellido = apellido;
		}





		public String getSexo() {
			return sexo;
		}





		public void setSexo(String sexo) {
			this.sexo = sexo;
		}





		public int getSalario() {
			return salario;
		}





		public void setSalario(int salario) {
			this.salario = salario;
		}





		public void Crear() throws ClassNotFoundException, SQLException{
	        Conexion miConexion = new Conexion("persona");
	        miConexion.Conectar();
	        Statement stmt;
	        stmt = miConexion.getMiConexion().createStatement();
	        stmt.execute("INSERT INTO persona(NOMBRE,APELLIDO,SEXO,FECHA_NAC,SALARIO)"
	                + "VALUES('"+this.nombre+"','"+this.apellido+"','"+this.sexo+"','"
	                + this.fecha_nac+"','"+this.salario+"');");
	        stmt.close();
	        miConexion.CerrarConexion();
	       
	    }
	    public static ArrayList<Persona> Leer() throws ClassNotFoundException, SQLException{
	        
	       ArrayList<Persona> listaPer = new ArrayList();
	       Conexion miConexion = new Conexion("persona");
	       miConexion.Conectar();
	       Statement stmt;
	       stmt = miConexion.getMiConexion().createStatement();
	       ResultSet rs = stmt.executeQuery("Select * from persona");
	       while(rs.next()){
	            long id = rs.getInt("ID_PERSONA");
	            String nombre = rs.getString("NOMBRE");
	            String apellido = rs.getString("APELLIDO");
	            String sexo = rs.getString("SEXO");
	            String fecha_nac = rs.getString("FECHA_NAC");
	            int salario = rs.getInt("SALARIO");
	    
	            listaPer.add(new Persona(id,nombre,apellido,sexo,fecha_nac,salario));
	            
	       }
	       rs.close();
	       stmt.close();
	       miConexion.CerrarConexion();
	       
	       return listaPer;
	        
	        
	    }
	    
	    public void Actualizar() throws ClassNotFoundException, SQLException{
	        Conexion miConexion = new Conexion("persona");
	        miConexion.Conectar();
	        Statement stmt;
	        stmt = miConexion.getMiConexion().createStatement();
	        stmt.execute("UPDATE Empleados SET NOMBRE='"+this.nombre+"',APELLIDO='"+
	                this.apellido+"',SEXO='"+this.sexo+"',FECHA_NAC='"+this.fecha_nac+
	                "',SALARIO='"+
	                this.salario+"' WHERE ID_PERSONA="+this.id);
	        stmt.close();
	        miConexion.CerrarConexion();
	        
	    }
	    
	    public static void Eliminar(long id) throws ClassNotFoundException, SQLException{
	        Conexion miConexion = new Conexion("persona");
	        miConexion.Conectar();
	        Statement stmt;
	        stmt = miConexion.getMiConexion().createStatement();
	        stmt.execute("DELETE FROM Persona WHERE ID_PERSONA="+id);
	        stmt.close();
	        miConexion.CerrarConexion();
	    }
	    
}
