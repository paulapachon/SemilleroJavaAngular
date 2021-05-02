package com.Heinsohn.Semillero.ConexionBD;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    private String url;
    private Connection miConexion;
    private static final String user= "root";
    private static final String password= "todobien.com2298";
    


    public Connection getMiConexion() {
        return miConexion;
    }

    public Conexion(String url) {
		super();
		this.url = url;
	}

	public void setMiConexion(Connection miConexion) {
        this.miConexion = miConexion;
    }
     
    public void Conectar() throws ClassNotFoundException, SQLException{
        Class.forName("com.mysql.cj.jdbc.Driver");
        miConexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/"+url,user,password);
    }
    
    public void CerrarConexion() throws SQLException{
        miConexion.close();
    }
 
    
    
}
