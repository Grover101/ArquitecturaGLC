/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factory;

/**
 *
 * @author Carlos
 */
public class ConexionSQLServer implements IConexion {
private String host;
	private String puerto;
	private String usuario;
	private String contrasena;

    public ConexionSQLServer() {
        this.host = "localhost";
		this.puerto = "5433";
		this.usuario = "postgres";
		this.contrasena = "123";

    }
        
        
        
        
    @Override
    public void conectar() {
        System.out.println("Se conectó a SQLServer");
    }

    @Override
    public void desconectar() {
       System.out.println("Se desconectó de SQLServer");
    }
    
}
