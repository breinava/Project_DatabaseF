package interfaces_dao;

import java.util.List;
import modelo_dao.Producto;
import mysql_conexion.Acceso;

/**
 *
 * @author Jhoan
 * @author Breiner
 */

public interface DAOProducto {
    
    public void RegistrarProducto(Producto pd, Acceso asc) throws Exception;
    public void ModificarProducto(Producto pd, Acceso asc) throws Exception;
    public void EliminarProducto(Producto pd, Acceso asc) throws Exception;
    public List<Producto> ListarProductos(Producto pd, Acceso asc) throws Exception;
    
}
