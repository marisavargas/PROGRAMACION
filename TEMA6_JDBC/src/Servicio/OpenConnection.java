package Servicio;
import java.sql.Connection;
import java.sql.DriverManager;
 
public class OpenConnection {
    public Connection abrirConexion() {
        String urlConexion = "jdbc:oracle:thin:@//localhost:1521/xe";
        String driver = "oracle.jdbc.driver.OracleDriver";
        String usuario = "programacion";
        String password = "Marialuisa0";
 
        try {
            Class.forName(driver);
            return DriverManager.getConnection(urlConexion, usuario, password);
        } catch (Exception e) {
            System.out.println("No he podido abrir la conexión");
            e.printStackTrace();
        }
        return null;
    }
 
    public void testConexion() {
        Connection conn = abrirConexion();
        System.out.println("Esta es mi conexión " + conn);
        if (conn != null) {
            System.out.println("TODO OK");
        } else {
            System.out.println("Esto no funciona");
        }
    }
     
	}

 