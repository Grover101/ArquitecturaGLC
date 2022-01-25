package cine;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author grover
 */
public class Fachada {

//    private Viaje viaje = new Viaje("12-12-12", "12:12", "Peru");
//    private IViaje viajeProxy = new viajeProxy(new ViajePeru());
    private List<ProductoIndividual> productoIndividuals = new ArrayList<ProductoIndividual>();
    private List<ProductoCombo> productoCombos = new ArrayList<ProductoCombo>();
    private Venta venta = null;
    Scanner input = new Scanner(System.in);
    
    public void addIndividual(int opcion, double precio) {
        ProductoIndividual individual = null;
        
        switch (opcion) {
            case 1:
                individual = new ProductoIndividual("Pipocas Pequeñas", precio);
                break;
            case 2:
                individual = new ProductoIndividual("Pipocas Medianas", precio);
                break;
            case 3:
                individual = new ProductoIndividual("Pipocas Grandes", precio);
                break;
            case 4:
                individual = new ProductoIndividual("Soda Pequeña", precio);
                break;
            case 5:
                individual = new ProductoIndividual("Soda Mediana", precio);
                break;
            case 6:
                individual = new ProductoIndividual("Soda Grande", precio);
                break;
        }
        productoIndividuals.add(individual);

//        this.viajeProxy.addPasajero(viaje, alumno);
    }
    
    public void addCombo(String nombre, int pipoca, int cantPipoca, int soda, int cantSoda, double descuento) {
        ProductoCombo combo = new ProductoCombo(nombre, descuento);
        if (pipoca != 0) {
            for (int i = 0; i < cantPipoca; i++) {
                System.out.println(productoIndividuals.get(pipoca - 1).nombre);
                combo.addProducto(productoIndividuals.get(pipoca - 1));
            }
        }
        if (soda != 0) {
            for (int i = 0; i < cantSoda; i++) {
                System.out.println(productoIndividuals.get(soda - 1).nombre);
                combo.addProducto(productoIndividuals.get(soda - 1));
            }
        }
        if (pipoca != 0 || soda != 0) {
            productoCombos.add(combo);
        }
    }
    
    public void consultarIndividual() {
        int i = 1;
        for (ProductoIndividual individual : productoIndividuals) {
            System.out.println(i + " Nombre: " + individual.getNombre() + " precio: " + individual.precio);
            i++;
        }
//        viajeProxy.removePasajero(viaje, ci);
    }
    
    public void mostrarPipocas() {
        int i = 1;
        for (ProductoIndividual individual : productoIndividuals) {
            if (individual.getNombre().equals("Pipocas Pequeñas") || individual.getNombre().equals("Pipocas Medianas") || individual.getNombre().equals("Pipocas Grandes")) {
                System.out.println(i + ": " + individual.getNombre());
            }
            i++;
        }
    }
    
    public void mostrarSoda() {
        int i = 1;
        for (ProductoIndividual individual : productoIndividuals) {
            if (individual.getNombre().equals("Soda Pequeña") || individual.getNombre().equals("Soda Mediana") || individual.getNombre().equals("Soda Grande")) {
                System.out.println(i + ": " + individual.getNombre());
            }
            i++;
        }
    }
    
    public void consultarCombo() {
        System.out.println("Productos de Combo:");
        NumberFormat formater = new DecimalFormat("###,##0.00");
        int i = 1;
        for (Object prod : productoCombos) {
            ProductoAbstracto p = (ProductoAbstracto) prod;
            System.out.println(i + " " + p.getNombre() + " " + formater.format(p.getPrecio()));
            i++;
        }
//        viajeProxy.listarPasajero(viaje);
    }
    
    public void vender() {
        boolean salir = true;
        do {
            int i = 1;
            System.out.println("Productors Simples:");
            consultarIndividual();
            consultarCombo();
            System.out.println("Producto simple a comprar [0: ninguno]:");
            int ind = input.nextInt();
            System.out.println("Producto combo a comprar [0: ninguno]:");
            int com = input.nextInt();
            venta = new Venta(4, "Venta" + String.valueOf(i));
            if(ind != 0){
                venta.addProducto(productoIndividuals.get(ind-1));
            }
            if(com != 0){
                venta.addProducto(productoCombos.get(com-1));
            }
            System.out.println("Quiere seguir comprando: [N/S]");
            char sal = input.next().charAt(0);
            if (sal == 'S') {
                salir = false;
            }
        } while (salir);
        
    }

//    public void mostrarHistorial() {
//        try {
//            con = conectar.getConexion();
//            PreparedStatement ps = con.prepareStatement("SELECT * FROM viajes");
//            ResultSet resultado = ps.executeQuery();
//            while (resultado.next()) {
//                System.out.println("Accion: " + resultado.getString(2) + "\nFecha: " + resultado.getString(3));
//            }
//        } catch (Exception e) {
//            System.out.println("Error: " + e.getMessage());
//        }
//    }
}
