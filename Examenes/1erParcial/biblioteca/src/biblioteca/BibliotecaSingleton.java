package biblioteca;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author grover
 */
public class BibliotecaSingleton {
    private static BibliotecaSingleton instance;
    private String nombre;
    private String direccion;
    private String telefono;
    private List<IPublicacion> listaPublicaciones;

    public BibliotecaSingleton() {
        this.nombre = "Biblioteca Tecnología";
        this.direccion = "Regimiento Campos 6 de Infanteria, Sucre";
        this.telefono = "46456515";
        this.listaPublicaciones = new ArrayList<IPublicacion>();
    }
    
    public static BibliotecaSingleton getInstance(){
        if (instance == null)
            instance = new BibliotecaSingleton();
        return instance;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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

    public List<IPublicacion> getListaPublicaciones() {
        return listaPublicaciones;
    }

    public void setListaPublicaciones(List<IPublicacion> listaPublicaciones) {
        this.listaPublicaciones = listaPublicaciones;
    }
    
    public void insetarListaPublicacione(IPublicacion publicacion){
        this.listaPublicaciones.add(publicacion);
    }
    
    
}
