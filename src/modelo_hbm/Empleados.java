package modelo_hbm;
// Generated 01-jun-2017 11:44:50 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Empleados generated by hbm2java
 */
public class Empleados  implements java.io.Serializable {


     private Integer idEmpleados;
     private Almacen almacen;
     private Cargos cargos;
     private Usuarios usuarios;
     private String nombre;
     private String apellidos;
     private Set facturases = new HashSet(0);

    public Empleados() {
    }

	
    public Empleados(Almacen almacen, Cargos cargos, String nombre, String apellidos) {
        this.almacen = almacen;
        this.cargos = cargos;
        this.nombre = nombre;
        this.apellidos = apellidos;
    }
    public Empleados(Almacen almacen, Cargos cargos, Usuarios usuarios, String nombre, String apellidos, Set facturases) {
       this.almacen = almacen;
       this.cargos = cargos;
       this.usuarios = usuarios;
       this.nombre = nombre;
       this.apellidos = apellidos;
       this.facturases = facturases;
    }
   
    public Integer getIdEmpleados() {
        return this.idEmpleados;
    }
    
    public void setIdEmpleados(Integer idEmpleados) {
        this.idEmpleados = idEmpleados;
    }
    public Almacen getAlmacen() {
        return this.almacen;
    }
    
    public void setAlmacen(Almacen almacen) {
        this.almacen = almacen;
    }
    public Cargos getCargos() {
        return this.cargos;
    }
    
    public void setCargos(Cargos cargos) {
        this.cargos = cargos;
    }
    public Usuarios getUsuarios() {
        return this.usuarios;
    }
    
    public void setUsuarios(Usuarios usuarios) {
        this.usuarios = usuarios;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellidos() {
        return this.apellidos;
    }
    
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    public Set getFacturases() {
        return this.facturases;
    }
    
    public void setFacturases(Set facturases) {
        this.facturases = facturases;
    }




}


