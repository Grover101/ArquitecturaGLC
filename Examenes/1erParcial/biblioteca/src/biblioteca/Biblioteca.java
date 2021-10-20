package biblioteca;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author grover
 */
public class Biblioteca {

    public static void main(String[] args) {
        BibliotecaSingleton biblioteca = BibliotecaSingleton.getInstance();
        fabricaPublicaciones publicaciones = new fabricaPublicaciones();
        List<IPublicacion> listaPublicaciones;
        Scanner input = new Scanner(System.in);
        
//        IPublicacion revista = publicaciones.getPublicacion("revista", "revista hola", 1, 2010, "", "");
//        biblioteca.insetarListaPublicacione(revista);
//        listaPublicaciones = biblioteca.getListaPublicaciones();
//        
//        System.out.println(listaPublicaciones.get(0).getTitulo());

        int salir = 0;
        while (true) {
            System.out.println("1. Insertar publicación\n2. Mostrar publicaciones\n3. Mostrar datos biblioteca\n4. Salir");
            String menu = input.nextLine();
            String titulo = "", editorial = "", fecha = "";
            int mes, anio;
            switch (menu) {
                case "1":
                    System.out.println("Tipo de Publicacion: \n1. Revista\n2. Libro\n3. Periodico");
                    String opcion = input.nextLine();
                    switch (opcion) {
                        case "1":
                            System.out.println("Inserte Titulo: ");
                            titulo = input.nextLine();
                            System.out.println("Inserte Mes (en numeros): ");
                            mes = Integer.parseInt(input.next());
                            System.out.println("Inserte Anio: ");
                            anio = Integer.parseInt(input.next());
                            IPublicacion revista = publicaciones.getPublicacion("revista", titulo, mes, anio, "", "");
                            biblioteca.insetarListaPublicacione(revista);
                            break;
                        case "2":
                            System.out.println("Inserte Titulo: ");
                            titulo = input.nextLine();
                            System.out.println("Inserte Editorial: ");
                            editorial = input.nextLine();
                            System.out.println("Inserte Anio: ");
                            anio = Integer.parseInt(input.next());
                            IPublicacion libro = publicaciones.getPublicacion("libro", titulo, 0, anio, editorial, "");
                            biblioteca.insetarListaPublicacione(libro);
                            break;
                        case "3":
                            System.out.println("Inserte Titulo: ");
                            titulo = input.nextLine();
                            System.out.println("Inserte Fecha: ");
                            fecha = input.nextLine();
                            IPublicacion periodico = publicaciones.getPublicacion("periodico", titulo, 0, 0, "", fecha);
                            biblioteca.insetarListaPublicacione(periodico);
                            break;
                    }
                    break;
                case "2":
                    listaPublicaciones = biblioteca.getListaPublicaciones();
                    for (int i = 0; i < listaPublicaciones.size(); i++) {
                        System.out.println("titulo: " + listaPublicaciones.get(i).getTitulo());
                    }
                    break;
                case "3":
                    System.out.println("Nombre: " + biblioteca.getNombre() + "\nDireccion: " + biblioteca.getDireccion() + "\nTelefono: " + biblioteca.getTelefono());
                    break;
                case "4":
                    salir = 1;
                    break;
            }
            if (salir == 1) break;
        }
        
    }
}
