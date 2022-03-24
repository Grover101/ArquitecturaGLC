package inversiondependencia;

public class InversionDependencia {
    
    public static void main(String[] args) {
        
        ConexionMySQL conmysql=new  ConexionMySQL("bd_parqueo", "root", "");
        ConexionPostgreSQL conposgre=new ConexionPostgreSQL("bd_parqueo", "root", "");
        Vehiculo vehiculo = new Vehiculo(Color.Blanco, "1138-CTC", "Nisan", TipoVehiculo.Camion);
        VehiculoDB vehiculoDB = new VehiculoDB(vehiculo,conposgre);
        vehiculoDB.guardarDB();

    }

}
