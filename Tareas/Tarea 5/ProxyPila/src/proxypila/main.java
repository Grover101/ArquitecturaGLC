package proxypila;

import java.util.Scanner;

/**
 *
 * @author grover
 */
public class main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Pila pila = new Pila();
        IPila pilaProxy = new PilaProxy(new PilaA());
        boolean salir = false;
        while (!salir) {
            System.out.println("1. Insertar\n2. Eliminar\n3. Mostrar\n4. Salir");
            int opcion = input.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Introduzca un numero a la pila:");
                    int num = input.nextInt();
                    pilaProxy.insertar(pila, num);
                    break;
                case 2:
                    pilaProxy.eliminar(pila);
                    break;
                case 3:
                    pilaProxy.mostrar(pila);
                    break;
                default:
                    salir = true;
                    break;
            }
        }
    }
}
