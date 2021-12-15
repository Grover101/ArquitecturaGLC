package gestionarviaje;

/**
 *
 * @author grover
 */
public class ViajePeru implements IViaje {

    @Override
    public Viaje addPasajero(Viaje viaje, Alumno alumno) {
        viaje.addPasajero(alumno);
        System.err.println("Pasajero agregado");
        return viaje;
    }

    @Override
    public Viaje removePasajero(Viaje viaje, String ci) {
       viaje.removePasajero(ci);
        System.err.println("Pasajero Eliminado");
       return viaje;
    }

    @Override
    public void listarPasajero(Viaje viaje) {
        System.err.println("Listar Pasajeros");
       viaje.listarPasajeros();
    }

}
