
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ConexionConBDD {

    /**
     * @param args the command line arguments
     * @throws java.lang.ClassNotFoundException
     */
    public static void main(String[] args) throws ClassNotFoundException {
        Connection conexion = null;
        Statement sentencia = null;
        try{
    
        //paso 1: Cargar el driver
        Class.forName("co,.microsoft.sqlserver.jdbc.SQLServerDriver");
        
        //paso 2: Realizar la conexion con la BDD
        String url = "jdbc:sqlserver://localhost:14433;databaseName=proyectdatabase";
        conexion = DriverManager.getConnection(url,"sa","12345678");
        
        
        } catch (SQLException ex) {
            Logger.getLogger(ConexionConBDD.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
