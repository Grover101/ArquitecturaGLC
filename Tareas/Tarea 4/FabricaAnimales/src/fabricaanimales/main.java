package fabricaanimales;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        // TODO code application logic here
        IFabricaAbstracta fabricaAnimal;
        Mamifero leon = null;
        Ave loro = null;
        Pez sabalo = null;
        boolean salir = false;
        Scanner input = new Scanner(System.in);
        ArrayList<Jaula> jaulas = new ArrayList<Jaula>();
        Zoologico zoologico = new Zoologico("Central Park", jaulas, "Bolivar #23", "1234567890");
        Jaula jaula;
        String nombre="", color="";
        double temperatura,alto,largo,ancho, peso, tamanioalas, longitud;
        int nroPatas;
        while (!salir) {
            System.err.println("Añadir: \n1. Mamifero\n2. Ave\n3. Pez\nMostrar: \n4. Mamifero\n5. Ave\n6. Pez\n7. Zoologico");
            String opcion = input.next();
            switch (opcion) {
                case "1":
                    System.out.println("Indroduzca un nombre del Leon:");
                    nombre = input.next();
                    System.out.println("Indroduzca la tempreratura del Leon:");
                    temperatura = input.nextDouble();
                    System.out.println("Indroduzca un Nro de Patas del Leon:");
                    nroPatas = input.nextInt();
                    System.out.println("Indroduzca el Color del Leon:");
                    color = input.next();
                    System.out.println("Indroduzca el alto de la jaula del Leon:");
                    alto = input.nextDouble();
                    System.out.println("Indroduzca el ancho de la jaula del Leon:");
                    ancho = input.nextDouble();
                    System.out.println("Indroduzca el largo de la jaula del Leon:");
                    largo = input.nextDouble();
                    jaula = new Jaula(nombre, alto, ancho, largo);
                    jaulas.add(jaula);
                    fabricaAnimal = FabricaAnimales.getFactory("Mamifero");
                    leon = fabricaAnimal.getMamifero("Leon", nombre, temperatura, nroPatas, color);
                    zoologico.setJaulas(jaulas);
                    break;
                case "2":
                    System.out.println("Indroduzca un nombre del Loro:");
                    nombre = input.next();
                    System.out.println("Indroduzca el peso del Loro:");
                    peso = input.nextDouble();
                    System.out.println("Indroduzca el tamanio de alas del Loro:");
                    tamanioalas = input.nextDouble();
                    System.out.println("Indroduzca el alto de la jaula del Loro:");
                    alto = input.nextDouble();
                    System.out.println("Indroduzca el ancho de la jaula del Loro:");
                    ancho = input.nextDouble();
                    System.out.println("Indroduzca el largo de la jaula del Loro:");
                    largo = input.nextDouble();
                    jaula = new Jaula(nombre, alto, ancho, largo);
                    jaulas.add(jaula);
                    fabricaAnimal = FabricaAnimales.getFactory("Ave");
                    loro = fabricaAnimal.getAve("Loro", nombre, peso, tamanioalas);
                    zoologico.setJaulas(jaulas);
                    break;
                case "3":
                    System.out.println("Indroduzca un nombre del Sabalo");
                    nombre = input.next();
                    System.out.println("Indroduzca la longitud del Sabalo:");
                    longitud = input.nextDouble();
                    fabricaAnimal = FabricaAnimales.getFactory("Pez");
                    sabalo = fabricaAnimal.getPez("Sabalo", nombre, longitud);
                    break;
                case "4":
                    System.out.println("Nombre del Mamifero Leon es: " + leon.getNombre());
                    break;
                case "5":
                     System.out.println("Nombre del Ave Loro es: " + loro.getNombre());
                    break;
                case "6":
                     System.out.println("Nombre del Pez Sabalo es: " + sabalo.getNombre());
                    break;
                case "7":
                    System.out.println("Nombre del Zoologico: " + zoologico.getNombre() + "\nDireccion: "+zoologico.getDireccion() + "\nTelefono: " + zoologico.getTelefono() + "\nNro de Jaulas: " + zoologico.getJaulas().size());
                    break;
                default:
                    salir = true;
                    break;
            }
        }
    }
    
}
