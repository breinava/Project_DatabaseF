package interfaces_dao;

import java.util.List;
import modelo_dao.Proveedor;
import mysql_conexion.Rol;

/**
 *
 * @author Jhoan
 * @author Breiner
 */

public interface DAOProveedor {
    
    public void RegistrarProveedor(Proveedor pr, Rol asc) throws Exception;
    public void ModificarProveedor(Proveedor pr, Rol asc) throws Exception;
    public void EliminarProveedor(Proveedor pr, Rol asc) throws Exception;
    public List<Proveedor> ListarProveedores(Proveedor pr, Rol asc) throws Exception;
    
}
