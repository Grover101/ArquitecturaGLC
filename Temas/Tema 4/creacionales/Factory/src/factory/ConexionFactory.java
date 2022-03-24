package factory;

public class ConexionFactory {

    public IConexion getConexion(String motor) {
        switch (motor) {
            case "MySQL":
                return new ConexionMySQL();
            case "PostgreSQL":
                return new ConexionPostgreSQL();
            case "Sqlite":
                return new ConexionSQLite();
            case "SQLServer":
                return new ConexionSQLServer();    
            default:
                return new ConexionVacia();
        }

    }
}
