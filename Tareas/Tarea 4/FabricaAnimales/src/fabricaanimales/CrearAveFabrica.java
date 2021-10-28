package fabricaanimales;

public class CrearAveFabrica implements IFabricaAbstracta {

    @Override
    public Mamifero getMamifero(String mamifero, String nombre, double temperatura, int patas, String color) {
       return null;
    }

    @Override
    public Ave getAve(String ave, String nombre, double peso, double tamanioAlas) {
        if (ave == null) {
            return null;
        }
        if (ave.equals("Loro")) {
            return new Loro(nombre, peso, tamanioAlas);
        } else if (ave.equalsIgnoreCase("Aguila")) {
            return new Aguila(nombre, peso, tamanioAlas);
        } else if (ave.equalsIgnoreCase("Condor")) {
            return new Condor(nombre, peso, tamanioAlas);
        }
        return null;
    }

    @Override
    public Pez getPez(String pez, String nombre, double longitud) {
        return null;
    }
    
}
