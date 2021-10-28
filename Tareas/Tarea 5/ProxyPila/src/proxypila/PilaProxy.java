package proxypila;

import java.util.logging.Logger;

/**
 *
 * @author grover
 */

public class PilaProxy implements IPila{
    private IPila pila;
    private final static Logger LOGGER = Logger.getLogger(PilaProxy.class.getName());
    
    public PilaProxy(IPila pila){
        this.pila = pila;
    }
    
    @Override
    public void insertar(Pila pila, int x){
        LOGGER.info("----Pila Proxy - Insertar----");      
        this.pila.insertar(pila, x);
    }
    
    @Override
    public void eliminar(Pila pila){
        LOGGER.info("----Pila Proxy - Eliminar----");
        this.pila.eliminar(pila);
    }

    @Override
    public void mostrar(Pila pila){
        LOGGER.info("----Pila Proxy - Mostrar----");
        this.pila.mostrar(pila);
    }
}