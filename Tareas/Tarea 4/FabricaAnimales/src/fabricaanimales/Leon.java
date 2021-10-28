/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fabricaanimales;

/**
 *
 * @author grover
 */
public class Leon extends Mamifero {
    
    private double temperatura;
    
    public Leon(String nombre, double temperatura, int nroPatas, String color) {
        super(nombre, temperatura, nroPatas, color);
        this.temperatura = temperatura;
    }

    @Override
    public double getTemperatura() {
        return this.temperatura;
//        return getTemperatura();
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
