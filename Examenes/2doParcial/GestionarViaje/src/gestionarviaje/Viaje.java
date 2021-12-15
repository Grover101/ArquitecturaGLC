package gestionarviaje;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author grover
 */
public class Viaje {

    private String fecha;
    private String hora;
    private String destino;
    private List<Alumno> pasajeros = new ArrayList<Alumno>();

    public Viaje(String fecha, String hora, String destino) {
        this.fecha = fecha;
        this.hora = hora;
        this.destino = destino;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public List<Alumno> getPasajeros() {
        return pasajeros;
    }

    public void setPasajeros(List<Alumno> pasajeros) {
        this.pasajeros = pasajeros;
    }

    public void addPasajero(Alumno pasajero) {
        this.pasajeros.add(pasajero);
    }

    public boolean removePasajero(String ci) {
        Alumno aux = null;

        for (Alumno pasajero : this.pasajeros) {
            if (pasajero.celularIdentidad == ci) {
                aux = pasajero;
                break;
            }
        }

        return this.pasajeros.remove(aux);
    }

    public void listarPasajeros() {
        for (Alumno pasajero : this.pasajeros) {
            System.out.println("CI: " + pasajero.celularIdentidad);
            System.out.println("Nombre: " + pasajero.nombreCompleto);
            System.out.println("Sexo: " + pasajero.sexo);
        }
    }
}
