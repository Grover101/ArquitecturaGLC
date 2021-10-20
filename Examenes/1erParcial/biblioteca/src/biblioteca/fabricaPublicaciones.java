package biblioteca;

/**
 *
 * @author grover
 */
public class fabricaPublicaciones {
    
    public IPublicacion getPublicacion(String libro, String titulo, int mes, int anio, String editorial, String fecha){
        switch (libro){
            case "revista":
                return new Revista(titulo, mes, anio);
            case "libro":
                return new Libro(titulo, editorial, anio);
            case "periodico":
                return new Periodico(titulo, fecha);
        }
        return null;
    }
    
}
