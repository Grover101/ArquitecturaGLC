/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fabricaanimales;

/**
 *
 * @author grover
 */
public class Sabalo extends Pez{

    public Sabalo(String nombre, double longitud) {
        super(nombre, longitud);
    }

    @Override
    public void nadar() {
        System.out.println("El sabalo Nada");
    }
    
}
