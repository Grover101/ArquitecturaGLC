/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package autenticar;

import java.sql.Connection;

/**
 *
 * @author grover
 */
public interface IConexion {
    Connection conectar();
    boolean ejecutarSQL(String sql);
}
