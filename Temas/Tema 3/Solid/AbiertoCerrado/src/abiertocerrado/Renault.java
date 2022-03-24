package abiertocerrado;

public class Renault extends Vehiculo{

    public Renault(Color color, String placa, TipoVehiculo tipovehiculo) {
        super(color, placa, tipovehiculo);
    }

    @Override
    public double precioMedio() {
        return 1275;
    }
    
}
