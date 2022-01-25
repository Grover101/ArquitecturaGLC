package cine;

/**
 *
 * @author grover
 */
public class ProductoIndividual extends ProductoAbstracto {

    public ProductoIndividual(String nombre, double precio) {
        super(nombre, precio);
    }
    
    public String getNombre(){
        return this.nombre;
    }
    @Override
    public double getPrecio() {
        return this.precio;
    }
}
