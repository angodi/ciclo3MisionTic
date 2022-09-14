
package test;
import beans.Productos;
import connection.DBConnection;
import java.sql.ResultSet;
import java.sql.Statement;

public class OperacionesBD {
    public static void main(String[] args) {
      
        listarProductos();
        
    }
    
    public static void actualizarProductos(int idproducto,String descripcion, float precio, int unidades){
    DBConnection con = new DBConnection();  

    String sql = "UPDATE productos SET descripcion = '" +descripcion+ "', precio = '" +precio+ "', unidades = '" +unidades+ "' WHERE idproducto = " + idproducto;
        try{
            Statement st = con.getConnection().createStatement();
            st.executeUpdate(sql);
            
        }catch (Exception ex){
            System.out.println(ex.getMessage());
            
        }
        finally{
            con.desconectar();
       
        }
    } 
    
    
    public static void listarProductos(){
    DBConnection con = new DBConnection();  
    String sql = "SELECT * FROM productos";
        try{
            Statement st = con.getConnection().createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                int idproducto = rs.getInt("idproducto");
                String material = rs.getString("material");
                String descripcion = rs.getString("descripcion");
                float precio = rs.getFloat("precio");
                int unidades = rs.getInt("unidades");
                String categoria = rs.getString("categoria");
                String tiempoentrega = rs.getString("tiempoentrega");
                
                Productos productos = new Productos(idproducto,material,descripcion,precio,unidades,categoria,tiempoentrega);
                System.out.println(productos.toString());
    
                
            }
            
        }catch (Exception ex){
            System.out.println(ex.getMessage());
            
        }
        finally{
            con.desconectar();
       
        }
    }
}

  
