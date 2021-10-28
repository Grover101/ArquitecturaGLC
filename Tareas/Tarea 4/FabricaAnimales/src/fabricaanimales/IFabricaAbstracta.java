package fabricaanimales;

public interface IFabricaAbstracta {
	Mamifero getMamifero(String mamifero, String nombre, double temperatura, int patas, String color);
        Ave getAve(String ave, String nombre, double peso, double tamanioAlas);
        Pez getPez(String pez, String nombre, double longitud);
}
