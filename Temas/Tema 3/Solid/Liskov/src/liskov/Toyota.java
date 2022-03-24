package liskov;

public class Toyota extends Vehiculo {

    public Toyota(Color color, String placa, TipoVehiculo tipovehiculo) {
        super(color, placa, tipovehiculo);
    }

    // viola el principio de Liskov
    public double precioimportacion() {
        return 1500;
    }

    public double precioMedio() {
        return 18325;
    }

}
