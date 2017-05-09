package modelo;

public class Almacen {
    
    private long nit;
    private String nombre;

    public Almacen(long nit, String nombre) {
        this.nit = nit;
        this.nombre = nombre;
    }

    public long getNit() {
        return nit;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNit(long nit) {
        this.nit = nit;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
}
