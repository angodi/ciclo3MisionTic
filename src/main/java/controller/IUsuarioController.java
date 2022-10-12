package controller;

import java.util.Map;

public interface IUsuarioController {
    
    public String login(String username, String contrasena);
    
    public String register(String username, String contrasena,
            String nombre, String apellido, String email, String tipousuario, 
            String telefono, String ciudad, String direccion);
    
    public String pedir(String username);

    
    
}
