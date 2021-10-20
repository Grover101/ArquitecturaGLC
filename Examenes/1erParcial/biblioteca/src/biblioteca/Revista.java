package biblioteca;

/**
 *
 * @author grover
 */
public class Revista implements IPublicacion{
    private String titulo;
    private int mes;
    private int anio;

    public Revista() {
    }

    public Revista(String titulo, int mes, int anio) {
        this.titulo = titulo;
        this.mes = mes;
        this.anio = anio;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
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
