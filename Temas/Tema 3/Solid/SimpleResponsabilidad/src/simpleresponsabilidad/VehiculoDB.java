package simpleresponsabilidad;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class VehiculoDB {
    
    Vehiculo vehiculo;

    public VehiculoDB(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }
    
    public void guardarDB()
    {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Vehiculo.class.getName()).log(Level.SEVERE, null, ex);
        }
        Connection con;
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost/bd_parqueo","root","");
            String sql = "INSERT INTO vehiculos(color, placa, marca, tipovehiculo) VALUES('"+ vehiculo.getColor().toString() + "','" + vehiculo.getPlaca() + "','" + vehiculo.getMarca() + "','" + vehiculo.getTipovehiculo().toString() + "'";
            PreparedStatement consulta = con.prepareStatement(sql);
            consulta.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(Vehiculo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void eliminarDB()
    {
        //
    }
}
