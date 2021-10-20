package autenticar;

import java.util.Scanner;

/**
 *
 * @author grover
 */
public class Autenticar {

    public static void main(String[] args) {
       sesionMySQL sesion = new sesionMySQL("bd_examen", "root", "");
       Scanner input = new Scanner(System.in);
        System.err.println("Introduzca su nombre de Usuario: ");
       String user = input.next();
        System.err.println("Introduzca su Contraseña: ");
       String contra = input.next();
       Usuario usuario = new Usuario(user, contra);
       UsuarioDB usuarioDB = new UsuarioDB(usuario, sesion);
       usuarioDB.inicioSesion();
    }
}
