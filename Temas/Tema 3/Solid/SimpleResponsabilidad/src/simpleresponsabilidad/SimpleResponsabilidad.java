package simpleresponsabilidad;

public class SimpleResponsabilidad {

    public static void main(String[] args) {
        // Incorrecto
        VehiculoIncorrecto vehiculoIn = new VehiculoIncorrecto(Color.Rojo, "111-ASD", "Toyota", TipoVehiculo.Auto);
        vehiculoIn.guardarDB(); 
        
        // Correcto
        Vehiculo vehiculo = new Vehiculo(Color.Azul, "123-DFG", "Nissan", TipoVehiculo.Camioneta);
        VehiculoDB vehiculoDB = new VehiculoDB(vehiculo);
        vehiculoDB.guardarDB();
    }
}
