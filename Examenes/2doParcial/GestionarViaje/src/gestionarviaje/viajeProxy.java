package gestionarviaje;

import java.sql.*;

/**
 *
 * @author grover
 */
public class viajeProxy implements IViaje {

    private Conectar conectar = new Conectar();
    private Connection con = null;
    
    private IViaje viajeReal;

    public viajeProxy(IViaje viajeReal) {
        this.viajeReal = viajeReal;
    }

    @Override
    public Viaje addPasajero(Viaje viaje, Alumno alumno) {
        try {
            con = conectar.getConexion();
            PreparedStatement ps = con.prepareStatement("INSERT INTO viajes(accion) value('Añadir')");
            ps.executeUpdate();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        if (viajeReal == null) {
            viajeReal = new ViajePeru();
            return viajeReal.addPasajero(viaje, alumno);
        } else {
            return viajeReal.addPasajero(viaje, alumno);
        }
    }

    @Override
    public Viaje removePasajero(Viaje viaje, String ci) {
        try {
            con = conectar.getConexion();
            PreparedStatement ps = con.prepareStatement("INSERT INTO viajes(accion) value('Remover')");
            ps.executeUpdate();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        if (viajeReal == null) {
            viajeReal = new ViajePeru();
            return viajeReal.removePasajero(viaje, ci);
        } else {
            return viajeReal.removePasajero(viaje, ci);
        }
    }

    @Override
    public void listarPasajero(Viaje viaje) {
        try {
           con = conectar.getConexion();
            PreparedStatement ps = con.prepareStatement("INSERT INTO viajes(accion) value('Listar')");
            ps.executeUpdate();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        if (viajeReal == null) {
            viajeReal = new ViajePeru();
            viajeReal.listarPasajero(viaje);
        } else {
            viajeReal.listarPasajero(viaje);
        }
    }

}
