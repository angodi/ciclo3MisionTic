
package beans;
import java.sql.Date;


public class Compras {
    private int idcompra;
    private String username;
    private int idproducto;
    private Date fechadecompra;
    private int cantidad;
    private float valorcompra;
    private String direccionenvio;

    public Compras(int idcompra, String username, int idproducto, Date fechadecompra, int cantidad, float valorcompra, String direccionenvio) {
        this.idcompra = idcompra;
        this.username = username;
        this.idproducto = idproducto;
        this.fechadecompra = fechadecompra;
        this.cantidad = cantidad;
        this.valorcompra = valorcompra;
        this.direccionenvio = direccionenvio;
    }

    public int getIdcompra() {
        return idcompra;
    }

    public void setIdcompra(int idcompra) {
        this.idcompra = idcompra;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getIdproducto() {
        return idproducto;
    }

    public void setIdproducto(int idproducto) {
        this.idproducto = idproducto;
    }

    public Date getFechadecompra() {
        return fechadecompra;
    }

    public void setFechadecompra(Date fechadecompra) {
        this.fechadecompra = fechadecompra;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public float getValorcompra() {
        return valorcompra;
    }

    public void setValorcompra(float valorcompra) {
        this.valorcompra = valorcompra;
    }

    public String getDireccionenvio() {
        return direccionenvio;
    }

    public void setDireccionenvio(String direccionenvio) {
        this.direccionenvio = direccionenvio;
    }

    @Override
    public String toString() {
        return "Compras{" + "idcompra=" + idcompra + ", username=" + username + ", idproducto=" + idproducto + ", fechadecompra=" + fechadecompra + ", cantidad=" + cantidad + ", valorcompra=" + valorcompra + ", direccionenvio=" + direccionenvio + '}';
    }
    
    
    
    
}
