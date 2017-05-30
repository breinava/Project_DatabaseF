package interfaces_dao;

import java.util.List;
import modelo_dao.Producto;
import mysql_conexion.Rol;

/**
 *
 * @author Jhoan
 * @author Breiner
 */

public interface DAOProducto {
    
    public void RegistrarProducto(Producto pd, Rol asc) throws Exception;
    public void ModificarProducto(Producto pd, Rol asc) throws Exception;
    public void EliminarProducto(Producto pd, Rol asc) throws Exception;
    public List<Producto> ListarProductos(Rol asc) throws Exception;
    
}
