package modelo_hbm;
// Generated 18-may-2017 15:31:17 by Hibernate Tools 4.3.1



/**
 * DetalleFacturas generated by hbm2java
 */
public class DetalleFacturas  implements java.io.Serializable {


     private DetalleFacturasId id;
     private Facturas facturas;
     private Productos productos;
     private int cantidad;
     private double precioTotal;

    public DetalleFacturas() {
    }

    public DetalleFacturas(DetalleFacturasId id, Facturas facturas, Productos productos, int cantidad, double precioTotal) {
       this.id = id;
       this.facturas = facturas;
       this.productos = productos;
       this.cantidad = cantidad;
       this.precioTotal = precioTotal;
    }
   
    public DetalleFacturasId getId() {
        return this.id;
    }
    
    public void setId(DetalleFacturasId id) {
        this.id = id;
    }
    public Facturas getFacturas() {
        return this.facturas;
    }
    
    public void setFacturas(Facturas facturas) {
        this.facturas = facturas;
    }
    public Productos getProductos() {
        return this.productos;
    }
    
    public void setProductos(Productos productos) {
        this.productos = productos;
    }
    public int getCantidad() {
        return this.cantidad;
    }
    
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    public double getPrecioTotal() {
        return this.precioTotal;
    }
    
    public void setPrecioTotal(double precioTotal) {
        this.precioTotal = precioTotal;
    }




}


