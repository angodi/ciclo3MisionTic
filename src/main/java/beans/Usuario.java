
package beans;

public class Usuario {
    private String username;
    private String contrasena;
    private String nombre;
    private String apellido;
    private String email;
    private String tipousuario;
    private String telefono;
    private String ciudad;
    private String direccion;

    public Usuario(String username, String contrasena, String nombre, String apellido, String email, String tipousuario, String telefono, String ciudad, String direccion) {
        this.username = username;
        this.contrasena = contrasena;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.tipousuario = tipousuario;
        this.telefono = telefono;
        this.ciudad = ciudad;
        this.direccion = direccion;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContraseña(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTipousario() {
        return tipousuario;
    }

    public void setTipousario(String tipousario) {
        this.tipousuario = tipousario;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Usuario{" + "username=" + username + ", contrasena=" + contrasena + ", nombre=" + nombre + ", apellido=" + apellido + ", email=" + email + ", tipousario=" + tipousuario + ", telefono=" + telefono + ", ciudad=" + ciudad + ", direccion=" + direccion + '}';
    }
    
    
    
    
}
