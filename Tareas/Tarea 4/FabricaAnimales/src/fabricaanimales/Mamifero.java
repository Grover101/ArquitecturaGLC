package fabricaanimales;

public abstract class Mamifero {
    private String nombre;
    private double temperatura;
    private int nroPatas;
    private String color;

    public Mamifero(String nombre, double temperatura, int nroPatas, String color) {
        this.nombre = nombre;
        this.temperatura = temperatura;
        this.nroPatas = nroPatas;
        this.color = color;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
  
    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }

    public int getNroPatas() {
        return nroPatas;
    }

    public void setNroPatas(int nroPatas) {
        this.nroPatas = nroPatas;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "crearMamiferos{" + "nombre=" + nombre + ", temperatura=" + temperatura + ", nroPatas=" + nroPatas + ", color=" + color + '}';
    }
    
    public abstract double getTemperatura();
}
