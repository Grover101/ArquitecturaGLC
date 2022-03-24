package inversiondependencia;

import java.sql.Connection;

public interface IConexion {
    Connection conectar(); 
    boolean ejecutarSQL(String sql);
    
}
