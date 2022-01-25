package cine;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author grover
 * */

public class ProductoCombo extends ProductoAbstracto {

    private List< ProductoAbstracto > productos = new ArrayList< ProductoAbstracto>();
    private double descuento;

    
    public ProductoCombo(String nombre, double descuento) {
        super(nombre, 0);
        this.descuento = descuento;
    }

    @Override
    public double getPrecio() {
        double precio = 0d;
        for (ProductoAbstracto hijo : productos) {
            precio += hijo.getPrecio();
        }
        return precio-descuento;
    }

    @Override
    public void setPrecio(double price) {
        double precio = 0d;
        for (ProductoAbstracto hijo : productos) {
            precio += hijo.getPrecio();
        }
        this.precio=precio;
        
    }

    public void addProducto(ProductoAbstracto producto) {
        this.productos.add(producto);
    }

    public boolean removeProduct(ProductoAbstracto producto) {
        return this.productos.remove(producto);
    }
}
