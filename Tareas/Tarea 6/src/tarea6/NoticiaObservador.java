package tarea6;

/**
 *
 * @author grover
 */
public class NoticiaObservador extends Observador {

    private String nombreOB;

    public String getNombreOB() {
        return nombreOB;
    }

    public NoticiaObservador(SubjectNoticia sujeto, String nombreOB) {
        this.sujeto = sujeto;
        this.nombreOB = nombreOB;
        this.sujeto.agregar(this);
    }

    @Override
    public void actualizar() {
        System.out.println("Noticia: " + (sujeto.getNoticia()));
        System.out.println("Nombre:" + getNombreOB());
    }

}
