package fabricaanimales;

public class CrearMamiferoFabrica implements IFabricaAbstracta {

    @Override
    public Mamifero getMamifero(String mamifero, String nombre, double temperatura, int patas, String Color) {
        if (mamifero == null) {
            return null;
        }
        if (mamifero.equals("Leon")) {
            return new Leon(nombre, temperatura, patas, Color);
        } else if (mamifero.equalsIgnoreCase("Oso")) {
            return new Oso(nombre, temperatura, patas, Color);
        } else if (mamifero.equalsIgnoreCase("Mono")) {
            return new Mono(nombre, temperatura, patas, Color);
        }
        return null;
    }

    @Override
    public Ave getAve(String ave, String nombre, double peso, double tamanioAlas) {
        return null;
    }

    @Override
    public Pez getPez(String pez, String nombre, double longitud) {
        return null;
    }
}
