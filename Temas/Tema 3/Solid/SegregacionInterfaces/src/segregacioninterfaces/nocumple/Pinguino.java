/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package segregacioninterfaces.nocumple;

/**
 *
 * @author Carlos
 */
public class Pinguino implements IAve  {
    private int estatura;

    public Pinguino(int estatura) {
        this.estatura = estatura;
    }

    public int getEstatura() {
        return estatura;
    }

    public void setEstatura(int estatura) {
        this.estatura = estatura;
    }
    
    @Override
    public void comer() {
               System.out.println("Esta comiendo");

    }

    @Override
    public void volar() {
        //
    }

    @Override
    public void nadar() {
              System.out.println("Esta nadando");

    }
}
