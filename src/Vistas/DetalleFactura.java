package Vistas;

/**
 *
 * @author breiner
 */

public class DetalleFactura {
    
    private Integer NumFactura;
    private String nombre;
    private String apellido;
    private String producto;
    private double precio;
    private Integer cantidad;
    
    public DetalleFactura(){
    }

    public DetalleFactura(Integer NumFactura, String nombre, String apellido, String producto, double precio, Integer cantidad) {
        this.NumFactura = NumFactura;
        this.nombre = nombre;
        this.apellido = apellido;
        this.producto = producto;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public Integer getNumFactura() {
        return NumFactura;
    }

    public void setNumFactura(Integer NumFactura) {
        this.NumFactura = NumFactura;
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

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }
    
    
}
