package fabricaanimales;

public class CrearPezFabrica implements IFabricaAbstracta {

    @Override
    public Mamifero getMamifero(String mamifero, String nombre, double temperatura, int patas, String color) {
        return null;
    }

    @Override
    public Ave getAve(String ave, String nombre, double peso, double tamanioAlas) {
        return null;
    }

    @Override
    public Pez getPez(String pez, String nombre, double longitud) {
         if (pez == null) {
            return null;
        }
        if (pez.equals("Pacu")) {
            return new Pacu(nombre, longitud);
        } else if (pez.equalsIgnoreCase("Sabalo")) {
            return new Sabalo(nombre, longitud);
        }
        return null;
    }
    
}
