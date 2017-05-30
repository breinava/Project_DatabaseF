/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

/**
 *
 * @author Jhoan
 */
public class ProveedorProductosEntregados {
    private String proveedor;
    private int num_productos_entregados;

    public ProveedorProductosEntregados() {
    }

    public ProveedorProductosEntregados(String proveedor, int num_productos_entregados) {
        this.proveedor = proveedor;
        this.num_productos_entregados = num_productos_entregados;
    }

    public String getProveedor() {
        return proveedor;
    }

    public void setProveedor(String proveedor) {
        this.proveedor = proveedor;
    }

    public int getNum_productos_entregados() {
        return num_productos_entregados;
    }

    public void setNum_productos_entregados(int num_productos_entregados) {
        this.num_productos_entregados = num_productos_entregados;
    }
      
  
}
