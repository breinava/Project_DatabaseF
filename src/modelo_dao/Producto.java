package modelo_dao;


public class Producto {
    
    private int id;
    private String nombre;
    private double precio1;
    private double precio2;
    private int idCategoria;
    private int idMarca;
    private String name_categoria;
    private String name_marca;
    
    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio1() {
        return precio1;
    }

    public double getPrecio2() {
        return precio2;
    }

    public int getIdCategoria() {
        return idCategoria;
    }

    public String getName_categoria() {
        return name_categoria;
    }
    
    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio1(double precio1) {
        this.precio1 = precio1;
    }

    public void setPrecio2(double precio2) {
        this.precio2 = precio2;
    }

    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }

    public void setName_categoria(String name_categoria) {
        this.name_categoria = name_categoria;
    }

    public int getIdMarca() {
        return idMarca;
    }

    public void setIdMarca(int idMarca) {
        this.idMarca = idMarca;
    }

    public String getName_marca() {
        return name_marca;
    }

    public void setName_marca(String name_marca) {
        this.name_marca = name_marca;
    }
    
    
    
}
