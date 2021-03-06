package modelo_hbm;
// Generated 01-jun-2017 11:44:50 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Clientes generated by hbm2java
 */
public class Clientes  implements java.io.Serializable {


     private Long dni;
     private String nombre;
     private String apellidos;
     private long telefono;
     private String email;
     private Set facturases = new HashSet(0);

    public Clientes() {
    }

	
    public Clientes(String nombre, String apellidos, long telefono, String email) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.telefono = telefono;
        this.email = email;
    }
    public Clientes(String nombre, String apellidos, long telefono, String email, Set facturases) {
       this.nombre = nombre;
       this.apellidos = apellidos;
       this.telefono = telefono;
       this.email = email;
       this.facturases = facturases;
    }
   
    public Long getDni() {
        return this.dni;
    }
    
    public void setDni(Long dni) {
        this.dni = dni;
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
    public long getTelefono() {
        return this.telefono;
    }
    
    public void setTelefono(long telefono) {
        this.telefono = telefono;
    }
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    public Set getFacturases() {
        return this.facturases;
    }
    
    public void setFacturases(Set facturases) {
        this.facturases = facturases;
    }




}


