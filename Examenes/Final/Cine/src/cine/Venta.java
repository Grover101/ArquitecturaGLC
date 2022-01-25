package cine;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/**
 *
 * @author grover
 */
public class Venta {

    private long idventa;
    private String cliente;
    private Calendar fechahora;
    private ArrayList<ProductoAbstracto> productos = new ArrayList<ProductoAbstracto>();

    public Venta(long idventa, String cliente) {
        super();
        this.idventa = idventa;
        this.cliente = cliente;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public Calendar getFechahora() {
        return fechahora;
    }

    public void setFechahora(Calendar fechahora) {
        this.fechahora = fechahora;
    }

   

    public double getPrecio() {
        double precio = 0d;
        for (ProductoAbstracto hijo : productos) {
            //AbstractProduct p=(AbstractProduct)child;
            precio +=hijo.getPrecio();
        }
        return precio;
    }

    public void addProducto(ProductoAbstracto producto) {
        productos.add(producto);
    }

    public void removeProducto(ProductoAbstracto producto) {
        productos.remove(producto);
    }

    public void imprimirVenta() {

        NumberFormat formater = new DecimalFormat("###,##0.00");
        System.out.println("============================================= ");
        System.out.println("        Orden "+ idventa                       );
        System.out.println("Cliente:" +cliente);
        System.out.println("============================================= ");
        System.out.println("Productos:");
        
        for (Object prod : productos) {
             ProductoAbstracto p=(ProductoAbstracto)prod;
            System.out.println(p.getNombre()+ " " + formater.format(p.getPrecio()));

        }
        System.out.println("Total: " + formater.format(getPrecio()) );
        System.out.println("============================================= ");
        
    }
}
