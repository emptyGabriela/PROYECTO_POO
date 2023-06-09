
import java.sql.*;


public class ConexionConBDD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Connection conexion = null;
        Statement sentencia = null;
        try{
    
        //paso 1: Cargar el driver
        Class.forName("co,.microsoft.sqlserver.jdbc.SQLServerDriver");
        
        //paso 2: Realizar la conexion con la BDD
        String url = "jdbc:sqlserver://localhost:14433;databaseName=proyectdatabase";
        conexion = DriverManager.getConnection(url,"sa","12345678");
        
        
        }
    }
    
}
