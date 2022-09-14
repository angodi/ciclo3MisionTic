

package connection;
import java.sql.Connection;
import java.sql.DriverManager;
public class DBConnection {
    Connection connection;
    static String bd = "cl.distribuciones";
    static String port = "3306";
    static String loging = "root";
    static String password = "soloyo";
    
    
    
    public DBConnection() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:"+this.port+"/"+this.bd;
       
            connection=DriverManager.getConnection(url, this.loging, this.password);
            //System.out.println("");
            System.out.println("conexion establecida");
           
        } catch (Exception ex) {
            System.out.println("Error en la conexion");
        }
    }
    public Connection getConnection(){
        return connection;
    }
    public void desconectar(){
        connection = null;
    }
}

    
    

