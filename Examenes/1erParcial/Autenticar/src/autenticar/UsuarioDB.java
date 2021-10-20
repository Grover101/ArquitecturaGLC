package autenticar;

/**
 *
 * @author grover
 */
public class UsuarioDB {
 Usuario usuario;    
 IConexion conexion;

    public UsuarioDB(Usuario usuario, IConexion conexion) {
        this.usuario = usuario;
        this.conexion = conexion;
    }
    
     public void inicioSesion()
    {
      if ( conexion.ejecutarSQL("SELECT nombre, password FROM usuarios WHERE nombre='" + usuario.getUsuario() + "' && password='"+ usuario.getContrasenia()+"'"))
            System.out.println("Autenticado");
      else
          System.out.println("Error usuario o contraseña incorrecta");
    }
}
