package fabricaanimales;

public class FabricaAnimales {

    public static IFabricaAbstracta getFactory(String tipoFabrica) {

        if (tipoFabrica.equalsIgnoreCase("Mamifero")) {
            return new CrearMamiferoFabrica();
        } else if (tipoFabrica.equalsIgnoreCase("Pez")) {
            return new CrearPezFabrica();
        } else if (tipoFabrica.equalsIgnoreCase("Ave")) {
            return new CrearAveFabrica();
        }
        return null;
    }

}
