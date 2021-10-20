package biblioteca;

/**
 *
 * @author grover
 */
public class Periodico implements IPublicacion{
    private String titulo;
    private String fecha;

    public Periodico() {
    }

    public Periodico(String titulo, String fecha) {
        this.titulo = titulo;
        this.fecha = fecha;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
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
