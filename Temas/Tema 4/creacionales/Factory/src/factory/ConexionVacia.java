package factory;

public class ConexionVacia implements IConexion{

	@Override
	public void conectar() {
		System.out.println("No se especifico Proveedor o Provedor incorrecto");		
	}

	@Override
	public void desconectar() {
		System.out.println("No se especifico Proveedor o Provedor incorrecto");		
	}

}
