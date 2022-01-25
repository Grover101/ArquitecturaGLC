package cine;

import java.util.Scanner;

/**
 *
 * @author grover
 */
public class Cine {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Fachada fa = new Fachada();
        Scanner input = new Scanner(System.in);
        int salir = 0;

        while (true) {
            System.out.println("Elija una Opcion entre 1 y 7");
            System.out.println("1: Crear Producto");
            System.out.println("2: Crear Combo");
            System.out.println("3: Consultar Productos");
            System.out.println("4: Consultar Combos");
            System.out.println("5: Vender");
            System.out.println("6: Historial de opciones");
            System.out.println("7 : Salir");
            int op;
            op = input.nextInt();
            switch (op) {
                case 1:
                    System.out.println("Elija el Producto:");
                    System.out.println("1: pipocas pequeña");
                    System.out.println("2: pipocas mediana");
                    System.out.println("3: pipocas grande");
                    System.out.println("4: soda pequeña");
                    System.out.println("5: soda mediana");
                    System.out.println("6: soda grande");
                    int opcion = input.nextInt();
                    System.out.println("Inserte precio:");
                    double precio = input.nextDouble();
                    fa.addIndividual(opcion, precio);
                    break;
                case 2:
                    System.out.println("Nombre del Combo:");
                    String nombre = input.next();
                    System.out.println("Elija la Pipocas para el Combo:");
                    fa.mostrarPipocas();
                     System.out.println("0: ninguno");
                    int opcionPipo = input.nextInt();
                    System.out.println("Inserte Cantidad:");
                    int cantPipo = input.nextInt();
                    System.out.println("Elija la Soda para el Combo:");
                    fa.mostrarSoda();
                    System.out.println("0: ninguno");
                    int opcionSoda = input.nextInt();
                    System.out.println("Inserte Cantidad:");
                    int cantSoda = input.nextInt();
                    System.out.println("Inserte Descuento:");
                    double decuento = input.nextDouble();
                    fa.addCombo(nombre, opcionPipo, cantPipo, opcionSoda, cantSoda, decuento);
                    break;
                case 3:
                    fa.consultarIndividual();
                    break;
                case 4:
                    fa.consultarCombo();
                    break;
                case 5:
                    fa.vender();
                    break;
                case 7:
                    salir = 1;
                    break;
            }
            if (salir == 1) {
                break;
            }
        }
    }

}
