
package beans;

public class Usuarios {
    private String username;
    private String contraseña;
    private String nombre;
    private String apellido;
    private String email;
    private String tipousario;
    private String telefono;
    private String ciudad;
    private String direccion;

    public Usuarios(String username, String contraseña, String nombre, String apellido, String email, String tipousario, String telefono, String ciudad, String direccion) {
        this.username = username;
        this.contraseña = contraseña;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.tipousario = tipousario;
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

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
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
        return tipousario;
    }

    public void setTipousario(String tipousario) {
        this.tipousario = tipousario;
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
        return "Usuarios{" + "username=" + username + ", contrase\u00f1a=" + contraseña + ", nombre=" + nombre + ", apellido=" + apellido + ", email=" + email + ", tipousario=" + tipousario + ", telefono=" + telefono + ", ciudad=" + ciudad + ", direccion=" + direccion + '}';
    }
    
    
    
    
}
