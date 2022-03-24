package abiertocerrado;

public class Toyota extends Vehiculo {

    public Toyota(Color color, String placa, TipoVehiculo tipovehiculo) {
        super(color, placa, tipovehiculo);
    }

    @Override
    public double precioMedio() {
        return 18325;
    }
    
}
