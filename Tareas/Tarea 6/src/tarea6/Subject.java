package tarea6;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author grover
 */
public abstract class Subject {

    private List<Observador> observadores = new ArrayList<Observador>();

    public void agregar(Observador observador) {
        observadores.add(observador);
    }

    public void eliminar(Observador observador) {
        observadores.remove(observador);
    }

    public void notificarTodosObservadores() {
        observadores.forEach(x -> x.actualizar());
    }

}
