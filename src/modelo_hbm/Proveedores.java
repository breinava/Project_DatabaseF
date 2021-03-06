package modelo_hbm;
// Generated 01-jun-2017 11:44:50 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Proveedores generated by hbm2java
 */
public class Proveedores  implements java.io.Serializable {


     private Integer idProveedores;
     private String nombre;
     private Set pedidoses = new HashSet(0);

    public Proveedores() {
    }

	
    public Proveedores(String nombre) {
        this.nombre = nombre;
    }
    public Proveedores(String nombre, Set pedidoses) {
       this.nombre = nombre;
       this.pedidoses = pedidoses;
    }
   
    public Integer getIdProveedores() {
        return this.idProveedores;
    }
    
    public void setIdProveedores(Integer idProveedores) {
        this.idProveedores = idProveedores;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Set getPedidoses() {
        return this.pedidoses;
    }
    
    public void setPedidoses(Set pedidoses) {
        this.pedidoses = pedidoses;
    }




}


