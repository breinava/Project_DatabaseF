
package modelo;

/**
 *
 * @author Jhoan
 */
public class Empleado {
    private int idEmpleado;
    private String nombre;
    private String apellido;
    private int idCargo;
    private int idUser;
    private long idAlmacen;

    public Empleado() {
    }

    public Empleado(int idEmpleado, String nombre, String apellido, int idCargo, int idUser, long idAlmacen) {
        this.idEmpleado = idEmpleado;
        this.nombre = nombre;
        this.apellido = apellido;
        this.idCargo = idCargo;
        this.idUser = idUser;
        this.idAlmacen = idAlmacen;
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
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

    public int getIdCargo() {
        return idCargo;
    }

    public void setIdCargo(int idCargo) {
        this.idCargo = idCargo;
    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public long getIdAlmacen() {
        return idAlmacen;
    }

    public void setIdAlmacen(long idAlmacen) {
        this.idAlmacen = idAlmacen;
    }
    
    
    
}
