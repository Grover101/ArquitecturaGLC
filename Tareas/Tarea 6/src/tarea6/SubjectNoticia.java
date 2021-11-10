package tarea6;

public class SubjectNoticia extends Subject {

    private String noticia;

    public String getNoticia() {
        return noticia;
    }

    public void setNoticia(String noticia) {
        this.noticia = noticia;
        notificarTodosObservadores();
    }
}
