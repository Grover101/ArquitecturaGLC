package fabricaanimales;

import java.util.ArrayList;

/**
 *
 * @author grover
 */
public class Zoologico {
    String nombre;
    ArrayList<Jaula> jaulas;
    String direccion;
    String telefono;

    public Zoologico(String nombre, ArrayList<Jaula> jaulas, String direccion, String telefono) {
        this.nombre = nombre;
        this.jaulas = jaulas;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Jaula> getJaulas() {
        return jaulas;
    }

    public void setJaulas(ArrayList<Jaula> jaulas) {
        this.jaulas = jaulas;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    
}
