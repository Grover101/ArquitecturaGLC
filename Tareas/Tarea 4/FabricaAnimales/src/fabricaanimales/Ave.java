/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fabricaanimales;

/**
 *
 * @author grover
 */
public abstract class Ave {
    private String nombre;
    private double peso;
    private double tamanioAlas;

    public Ave(String nombre, double peso, double tamanioAlas) {
        this.nombre = nombre;
        this.peso = peso;
        this.tamanioAlas = tamanioAlas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getTamanioAlas() {
        return tamanioAlas;
    }

    public void setTamanioAlas(double tamanioAlas) {
        this.tamanioAlas = tamanioAlas;
    }

    @Override
    public String toString() {
        return "Aves{" + "nombre=" + nombre + ", peso=" + peso + ", tamanioAlas=" + tamanioAlas + '}';
    }
    
    public abstract void volar();
}
