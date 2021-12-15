package gestionarviaje;

import java.sql.*;
import java.util.Scanner;

/**
 *
 * @author grover
 */
public class GestionarViaje {

    public static void main(String[] args) {
        
        Fachada fa = new Fachada();
        Scanner input = new Scanner(System.in);
        int salir = 0;

        while (true) {
            System.out.println("Elija una Opcion entre 1 y 5");
            System.out.println("1: Añadir Pasajero");
            System.out.println("2: Eliminar Pasajero");
            System.out.println("3: Mostrar Pasajeros");
            System.out.println("4: Mostar lista de acciones realizadas");
            System.out.println("5 : Salir");
            int op;
            op = input.nextInt();
            switch (op) {
                case 1:
                    System.out.println("Inserte Nombre:");
                    String nombre = input.next();
                    System.out.println("Inserte CI:");
                    String ci = input.next();
                    System.out.println("Inserte Sexo [F/M]:");
                    String sexo = input.next();
                    fa.agregar(nombre, ci, sexo);
                    break;
                case 2:
                    System.out.println("CI del Pasajero:");
                    String cie = input.next();
                    fa.eliminar(cie);
                    break;
                case 3:
                    fa.listar();
                    break;
                case 4:
                    fa.mostrarHistorial();
                break;
                case 5:
                    salir = 1;
                    break;
            }
            if (salir == 1) {
                break;
            }
        }

    }

}
