package modelo_hbm;
// Generated 01-jun-2017 11:44:50 by Hibernate Tools 4.3.1



/**
 * DetallePedidos generated by hbm2java
 */
public class DetallePedidos  implements java.io.Serializable {


     private DetallePedidosId id;
     private Pedidos pedidos;
     private Productos productos;
     private int cantidad;
     private double precioTotal;

    public DetallePedidos() {
    }

    public DetallePedidos(DetallePedidosId id, Pedidos pedidos, Productos productos, int cantidad, double precioTotal) {
       this.id = id;
       this.pedidos = pedidos;
       this.productos = productos;
       this.cantidad = cantidad;
       this.precioTotal = precioTotal;
    }
   
    public DetallePedidosId getId() {
        return this.id;
    }
    
    public void setId(DetallePedidosId id) {
        this.id = id;
    }
    public Pedidos getPedidos() {
        return this.pedidos;
    }
    
    public void setPedidos(Pedidos pedidos) {
        this.pedidos = pedidos;
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


