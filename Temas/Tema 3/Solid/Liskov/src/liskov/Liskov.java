package liskov;

public class Liskov {
    
    public static void main(String[] args) {
        
       Vehiculo vehiculo1 =new Vehiculo(Color.Rojo, "tip-1625", TipoVehiculo.Auto);
        System.out.println(vehiculo1.precioimportacion());

        Toyota  vehiculo2 =new Toyota(Color.Azul, "CAR-2255", TipoVehiculo.Camion);
        System.out.println(vehiculo2.precioimportacion());
    }
    
}
