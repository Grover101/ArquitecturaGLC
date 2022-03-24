package simpleresponsabilidad;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class VehiculoIncorrecto {
    private Color color;
    private String placa;
    private String marca;
    private TipoVehiculo tipovehiculo;

    public VehiculoIncorrecto(Color color, String placa, String marca, TipoVehiculo tipovehiculo) {
        this.color = color;
        this.placa = placa;
        this.marca = marca;
        this.tipovehiculo = tipovehiculo;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public TipoVehiculo getTipovehiculo() {
        return tipovehiculo;
    }

    public void setTipovehiculo(TipoVehiculo tipovehiculo) {
        this.tipovehiculo = tipovehiculo;
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
            String sql = "INSERT INTO vehiculos(color, placa, marca, tipovehiculo) VALUES('"+ this.getColor().toString() + "','" + this.getPlaca() + "','" + this.getMarca() + "','" + this.getTipovehiculo().toString() + "'";
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

