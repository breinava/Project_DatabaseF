package interfaces_dao;

import java.util.List;
import modelo_dao.Proveedor;
import mysql_conexion.Acceso;

/**
 *
 * @author Jhoan
 * @author Breiner
 */

public interface DAOProveedor {
    
    public void RegistrarProveedor(Proveedor pr, Acceso asc) throws Exception;
    public void ModificarProveedor(Proveedor pr, Acceso asc) throws Exception;
    public void EliminarProveedor(Proveedor pr, Acceso asc) throws Exception;
    public List<Proveedor> ListarProveedores(Proveedor pr, Acceso asc) throws Exception;
    
}
