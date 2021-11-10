package tarea6;

/**
 *
 * @author grover
 */
public class main {

    public static void main(String[] args) {
        SubjectNoticia subject = new SubjectNoticia();

        new NoticiaObservador(subject, " Los Tiempos");
        new NoticiaObservador(subject, " La Patria");
        new NoticiaObservador(subject, " El Deber");

        System.out.println("Colocar la noticia del paro: ");
        subject.setNoticia("Transporte urbano trabaja con normalidad en Sucre");
    }

}
