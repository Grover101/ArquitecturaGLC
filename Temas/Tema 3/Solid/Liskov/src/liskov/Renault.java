package liskov;

public class Renault extends Vehiculo{

    public Renault(Color color, String placa, TipoVehiculo tipovehiculo) {
        super(color, placa, tipovehiculo);
    }

    public double precioMedio() {
        return 1275;
    }
    
}
