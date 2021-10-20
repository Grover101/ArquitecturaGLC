package biblioteca;

/**
 *
 * @author grover
 */
public class Libro implements IPublicacion {

    private String titulo;
    private String editorial;
    private int anio;

    public Libro() {
    }

    public Libro(String titulo, String editorial, int anio) {
        this.titulo = titulo;
        this.editorial = editorial;
        this.anio = anio;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    @Override
    public String getTitulo() {
        return this.titulo;
    }

    @Override
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

}
