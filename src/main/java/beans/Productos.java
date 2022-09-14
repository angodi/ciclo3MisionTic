
package beans;

public class Productos {
    private int idproducto;
    private String material;
    private String descripcion;
    private float precio;
    private int unidades;
    private String categoria;
    private String tiempoentrega;

    public Productos(int idproducto, String material, String descripcion, float precio, int unidades, String categoria, String tiempoentrega) {
        this.idproducto = idproducto;
        this.material = material;
        this.descripcion = descripcion;
        this.precio = precio;
        this.unidades = unidades;
        this.categoria = categoria;
        this.tiempoentrega = tiempoentrega;
    }

    public int getIdproducto() {
        return idproducto;
    }

    public void setIdproducto(int idproducto) {
        this.idproducto = idproducto;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public int getUnidades() {
        return unidades;
    }

    public void setUnidades(int unidades) {
        this.unidades = unidades;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getTiempoentrega() {
        return tiempoentrega;
    }

    public void setTiempoentrega(String tiempoentrega) {
        this.tiempoentrega = tiempoentrega;
    }

    @Override
    public String toString() {
        return "Productos{" + "idproducto=" + idproducto + ", material=" + material + ", descripcion=" + descripcion + ", precio=" + precio + ", unidades=" + unidades + ", categoria=" + categoria + ", tiempoentrega=" + tiempoentrega + '}';
    }
    
    
    
    
    
    
}
