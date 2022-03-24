package liskov;

public class Nisan extends Vehiculo {

    public Nisan(Color color, String placa, TipoVehiculo tipovehiculo) {
        super(color, placa, tipovehiculo);
    }

    public double precioMedio() {
        return 20201;
    }
    
}
