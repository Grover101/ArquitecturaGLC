/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inversiondependencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Carlos
 */
public class ConexionMySQL implements IConexion {

    String bd;
    String usuario;
    String password;

    public ConexionMySQL(String bd, String usuario, String password) {
        this.bd = bd;
        this.usuario = usuario;
        this.password = password;
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Vehiculo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public Connection conectar() {
        try {
            return DriverManager.getConnection("jdbc:mysql://localhost/" + bd, usuario, password);
        } catch (SQLException ex) {
            Logger.getLogger(Vehiculo.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @Override
    public boolean ejecutarSQL(String sql) {
        try {
            Connection con = conectar();
            PreparedStatement consulta = con.prepareStatement(sql);
            consulta.executeUpdate();
            return true;
   
        } catch (SQLException ex) {
            Logger.getLogger(ConexionMySQL.class.getName()).log(Level.SEVERE, null, ex);
        
          return false;
        }
       
        
    }

}
