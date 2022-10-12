package controller;

import java.sql.ResultSet;
import java.sql.Statement;
import com.google.gson.Gson;

import beans.Usuario;
import connection.DBConnection;

public class UsuarioController implements IUsuarioController {

    @Override
    public String login(String username, String contrasena) {

        Gson gson = new Gson();

        DBConnection con = new DBConnection();

        String sql = "Select * from usuario where username = '" + username
                + "' and contrasena = '" + contrasena + "'";
        try {
            Statement st = con.getConnection().createStatement();
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                String nombre = rs.getString("nombre");
                String apellido = rs.getString("apellido");
                String email = rs.getString("email");
                String tipousuario = rs.getString("tipousuario");
                String telefono = rs.getString("telefono");
                String ciudad = rs.getString("ciudad");
                String direccion = rs.getString("direccion");

                Usuario usuario
                        = new Usuario(username, contrasena, nombre, apellido, email, tipousuario, telefono, ciudad, direccion);
                return gson.toJson(usuario);
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } finally {
            con.desconectar();
        }

        return "false";
    }
    
    @Override
    public String register(String username, String contrasena, String nombre, String apellido, String email,
            String tipousuario, String telefono, String ciudad, String direccion) {

        Gson gson = new Gson();

        DBConnection con = new DBConnection();
        String sql = "Insert into usuario values('" + username + "', '" + contrasena + "', '" + nombre
                + "', '" + apellido + "', '" + email + "', '" + tipousuario + "', '" + telefono + "', '" + ciudad +  "', '" + direccion + "')";

        try {
            Statement st = con.getConnection().createStatement();
            st.executeUpdate(sql);

            Usuario usuario = new Usuario(username, contrasena, nombre, apellido, email, tipousuario, telefono, ciudad, direccion );

            st.close();

            return gson.toJson(usuario);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());

        } finally {
            con.desconectar();
        }

        return "false";

    }
    @Override
    public String pedir(String username) {

        Gson gson = new Gson();

        DBConnection con = new DBConnection();
        String sql = "Select * from usuario where username = '" + username + "'";

        try {

            Statement st = con.getConnection().createStatement();
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                String contrasena = rs.getString("contrasena");
                String nombre = rs.getString("nombre");
                String apellido = rs.getString("apellido");
                String email = rs.getString("email");
                String tipousuario = rs.getString("tipousuario");
                String telefono = rs.getString("telefono");
                String ciudad = rs.getString("ciudad");
                String direccion = rs.getString("direccion");

                Usuario usuario
                        = new Usuario(username, contrasena, nombre, apellido, email, tipousuario, telefono, ciudad, direccion);
                return gson.toJson(usuario);
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } finally {
            con.desconectar();
        }

        return "false";
    }

   
}
