/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractfactory;

/**
 *
 * @author Carlos
 */
public class AbstractFactory {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        IFabricaAbstracta fabricaBD = FabricaProductor.getFactory("BD");
        IConexionBD cxBD1 = fabricaBD.getBD("ORACLE");

        cxBD1.conectar();

        IFabricaAbstracta fabricaREST = FabricaProductor.getFactory("REST");
        IConexionREST cxRS1 = fabricaREST.getREST("COMPRAS");

        cxRS1.leerURL("https://www.youtube.com");
    }
    
}
