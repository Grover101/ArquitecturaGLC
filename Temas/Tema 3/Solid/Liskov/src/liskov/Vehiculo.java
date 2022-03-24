package liskov;

public class Vehiculo {
    private Color color;
    private String placa;
    private TipoVehiculo tipovehiculo;
    public double precioimportacion()
    {
     return 1000;   
    }

    public Vehiculo(Color color, String placa, TipoVehiculo tipovehiculo) {
        this.color = color;
        this.placa = placa;
        this.tipovehiculo = tipovehiculo;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public TipoVehiculo getTipovehiculo() {
        return tipovehiculo;
    }

    public void setTipovehiculo(TipoVehiculo tipovehiculo) {
        this.tipovehiculo = tipovehiculo;
    }
    
}
