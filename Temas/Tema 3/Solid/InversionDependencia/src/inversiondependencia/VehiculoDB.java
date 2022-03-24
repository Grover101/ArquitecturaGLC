package inversiondependencia;

public class VehiculoDB {
    Vehiculo vehiculo;
    IConexion coneccion;

    public VehiculoDB(Vehiculo vehiculo, IConexion coneccion) {
        this.vehiculo = vehiculo;
        this.coneccion = coneccion;
    }
  
    
    public void guardarDB()
    {
      if ( coneccion.ejecutarSQL("INSERT INTO vehiculos (color,placa,marca,tipovehiculo) VALUES('"+vehiculo.getColor().toString()+"','"+vehiculo.getPlaca()+"','"+vehiculo.getMarca()+"','"+vehiculo.getTipovehiculo().toString()+"')"))
            System.out.println("Se inserto con éxito");
      else
          System.out.println("Ocurrio un Error");
    }
    
    public void eliminarDB()
    {
        //
    }
}
