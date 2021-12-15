package gestionarviaje;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author grover
 */
public class Fachada {

    private Conectar conectar = new Conectar();
    private Connection con = null;

    private Viaje viaje = new Viaje("12-12-12", "12:12", "Peru");
    private IViaje viajeProxy = new viajeProxy(new ViajePeru());

    public void agregar(String nombre, String ci, String sexo) {
        Alumno alumno = null;
        if (sexo.equals("F")) {
            alumno = new Alumno(ci, nombre, Sexo.Femenino);
        } else {
            alumno = new Alumno(ci, nombre, Sexo.Masculino);
        }
        this.viajeProxy.addPasajero(viaje, alumno);
    }

    public void eliminar(String ci) {
        viajeProxy.removePasajero(viaje, ci);
    }

    public void listar() {
        viajeProxy.listarPasajero(viaje);
    }

    public void mostrarHistorial() {
        try {
            con = conectar.getConexion();
            PreparedStatement ps = con.prepareStatement("SELECT * FROM viajes");
            ResultSet resultado = ps.executeQuery();
            while (resultado.next()) {
                System.out.println("Accion: " + resultado.getString(2) + "\nFecha: " + resultado.getString(3));
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
