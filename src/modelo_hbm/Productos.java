package modelo_hbm;
// Generated 01-jun-2017 11:44:50 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Productos generated by hbm2java
 */
public class Productos  implements java.io.Serializable {


     private Integer idProductos;
     private Categorias categorias;
     private Marcas marcas;
     private String nombre;
     private double precioCompra;
     private double precioVenta;
     private Integer cantidadStock;
     private Set detalleFacturases = new HashSet(0);
     private Set detallePedidoses = new HashSet(0);

    public Productos() {
    }

	
    public Productos(Categorias categorias, Marcas marcas, String nombre, double precioCompra, double precioVenta) {
        this.categorias = categorias;
        this.marcas = marcas;
        this.nombre = nombre;
        this.precioCompra = precioCompra;
        this.precioVenta = precioVenta;
    }
    public Productos(Categorias categorias, Marcas marcas, String nombre, double precioCompra, double precioVenta, Integer cantidadStock) {
       this.categorias = categorias;
       this.marcas = marcas;
       this.nombre = nombre;
       this.precioCompra = precioCompra;
       this.precioVenta = precioVenta;
       this.cantidadStock = cantidadStock;
    }
   
    public Integer getIdProductos() {
        return this.idProductos;
    }
    
    public void setIdProductos(Integer idProductos) {
        this.idProductos = idProductos;
    }
    public Categorias getCategorias() {
        return this.categorias;
    }
    
    public void setCategorias(Categorias categorias) {
        this.categorias = categorias;
    }
    public Marcas getMarcas() {
        return this.marcas;
    }
    
    public void setMarcas(Marcas marcas) {
        this.marcas = marcas;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public double getPrecioCompra() {
        return this.precioCompra;
    }
    
    public void setPrecioCompra(double precioCompra) {
        this.precioCompra = precioCompra;
    }
    public double getPrecioVenta() {
        return this.precioVenta;
    }
    
    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
    }
    public Integer getCantidadStock() {
        return this.cantidadStock;
    }
    
    public void setCantidadStock(Integer cantidadStock) {
        this.cantidadStock = cantidadStock;
    }
    public Set getDetalleFacturases() {
        return this.detalleFacturases;
    }
    
    public void setDetalleFacturases(Set detalleFacturases) {
        this.detalleFacturases = detalleFacturases;
    }
    public Set getDetallePedidoses() {
        return this.detallePedidoses;
    }
    
    public void setDetallePedidoses(Set detallePedidoses) {
        this.detallePedidoses = detallePedidoses;
    }




}


