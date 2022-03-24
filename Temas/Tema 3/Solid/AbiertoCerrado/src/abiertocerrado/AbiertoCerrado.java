package abiertocerrado;

public class AbiertoCerrado {

    public static void main(String[] args) {
        // TODO code application logic here
        VehiculoIncorrecto[] arregloVehiculosIncorrecto = {
            new VehiculoIncorrecto(Color.Rojo, "111-CFC", "Toyota", TipoVehiculo.Auto),
            new VehiculoIncorrecto(Color.Azul, "134-CFC", "Nisan", TipoVehiculo.Auto),
            new VehiculoIncorrecto(Color.Azul, "134-CFC", "Renault", TipoVehiculo.Auto)
        };
        imprimirpreciomedioincorrecto(arregloVehiculosIncorrecto);
        Vehiculo[] arregloVehiculos = {
            new Toyota(Color.Rojo, "111-CFC", TipoVehiculo.Auto),
            new Nisan(Color.Azul, "134-CFC", TipoVehiculo.Auto),
            new Renault(Color.Azul, "134-CFC", TipoVehiculo.Auto)
        };
        imprimirpreciomedio(arregloVehiculos);
    }

    public static void imprimirpreciomedioincorrecto(VehiculoIncorrecto[] arregloVehiculos) {
        for (VehiculoIncorrecto vehiculo : arregloVehiculos) {
            if (vehiculo.getMarca().equals("Toyota")) {
                System.out.println(45654);
            }
            if (vehiculo.getMarca().equals("Nisan")) {
                System.out.println(20025);
            }
            if (vehiculo.getMarca().equals("Renault")) {
                System.out.println(30000);
            }
        }
    }

    public static void imprimirpreciomedio(Vehiculo[] arregloVehiculos) {
        for (Vehiculo vehiculo : arregloVehiculos) {
            System.out.println(vehiculo.precioMedio());
        }
    }
}
