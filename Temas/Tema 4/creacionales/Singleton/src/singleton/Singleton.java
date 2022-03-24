/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singleton;

/**
 *
 * @author Carlos
 */
public class Singleton {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        SingleObject single=SingleObject.getInstance();
        single.setMensaje("Hola Mundo");
        System.out.println(single.getMensaje());
        
        SingleObject dos=SingleObject.getInstance();
        dos.setMensaje("Hola a todos");
        System.out.println(single.getMensaje());
        
    }
    
}
