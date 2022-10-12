

package connection;
import java.sql.Connection;
import java.sql.DriverManager;
public class DBConnection {
    Connection connection;
    static String bd = "railway";
    static String port = "7993";
    static String loging = "root";
    static String password = "dHOmZAZoROiubwxCxNnR";
    static String ip = "containers-us-west-90.railway.app";    
    
    public DBConnection() {
        try {
            Class.forName("com.mysql.jdbc.Driver");            
            String url = "jdbc:mysql://"+ DBConnection.ip +":" + DBConnection.port + "/" + DBConnection.bd;
       
            connection=DriverManager.getConnection(url, DBConnection.loging, this.password);
            
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

    
    

