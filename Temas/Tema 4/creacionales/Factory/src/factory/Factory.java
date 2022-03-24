/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factory;

/**
 *
 * @author Carlos
 */
public class Factory {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ConexionFactory fabrica=new ConexionFactory(); 
        IConexion con1=fabrica.getConexion("MySQL");
        con1.conectar();
        IConexion con2=fabrica.getConexion("PostgreSQL");
        con2.conectar();
    }
    
}
