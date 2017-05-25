package mysql_conexion;

/**
 *
 * @author breiner
 */

public class Rol {
    
    private int idRol;
    private String nombre;
    private String clave;

    public Rol(){
    }
    
    public Rol(String nombre, String clave){
        this.idRol = idRol;
        this.nombre = nombre;
        this.clave = clave;
    }
    
    public Rol(int idRol, String nombre, String clave){
        this.idRol = idRol;
        this.nombre = nombre;
        this.clave = clave;
    }

    public int getIdRol() {
        return idRol;
    }

    public void setIdRol(int idRol) {
        this.idRol = idRol;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }
    
}
