package modelo_hbm;
// Generated 18-may-2017 15:31:17 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Categorias generated by hbm2java
 */
public class Categorias  implements java.io.Serializable {


     private Integer idCategorias;
     private String nombre;
     private String descripcion;
     private Set productoses = new HashSet(0);

    public Categorias() {
    }

	
    public Categorias(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }
    public Categorias(String nombre, String descripcion, Set productoses) {
       this.nombre = nombre;
       this.descripcion = descripcion;
       this.productoses = productoses;
    }
   
    public Integer getIdCategorias() {
        return this.idCategorias;
    }
    
    public void setIdCategorias(Integer idCategorias) {
        this.idCategorias = idCategorias;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getDescripcion() {
        return this.descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public Set getProductoses() {
        return this.productoses;
    }
    
    public void setProductoses(Set productoses) {
        this.productoses = productoses;
    }




}


