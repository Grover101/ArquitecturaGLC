package autenticar;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author grover
 */
public class sesionMySQL implements IConexion {
 String bd;
    String usuario;
    String password;

    public sesionMySQL(String bd, String usuario, String password) {
        this.bd = bd;
        this.usuario = usuario;
        this.password = password;
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Usuario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @Override
    public Connection conectar() {
        try {
            return DriverManager.getConnection("jdbc:mysql://localhost/" + bd, usuario, password);
        } catch (SQLException ex) {
            Logger.getLogger(Usuario.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(sesionMySQL.class.getName()).log(Level.SEVERE, null, ex);
        
          return false;
        }
       
        
    }
    
}
