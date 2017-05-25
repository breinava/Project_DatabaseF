package interfaces_dao;

import java.util.List;
import modelo_dao.Almacen;
import mysql_conexion.Rol;

/**
 *
 * @author Jhoan
 * @author Breiner
 */

public interface DAOAlmacen {
    
    public void RegistrarAlmacen(Almacen alm, Rol asc)throws Exception;
    public void ModificarAlmacen(Almacen alm, Rol asc)throws Exception;
    public void EliminarAlmacen(Almacen alm, Rol asc)throws Exception;
    public List<Almacen> ListarAlmacenes(Almacen alm, Rol asc)throws Exception;
}
