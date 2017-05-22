package interfaces_dao;

import java.util.List;
import modelo_dao.Almacen;
import mysql_conexion.Acceso;

/**
 *
 * @author Jhoan
 * @author Breiner
 */

public interface DAOAlmacen {
    
    public void RegistrarAlmacen(Almacen alm, Acceso asc)throws Exception;
    public void ModificarAlmacen(Almacen alm, Acceso asc)throws Exception;
    public void EliminarAlmacen(Almacen alm, Acceso asc)throws Exception;
    public List<Almacen> ListarAlmacenes(Almacen alm, Acceso asc)throws Exception;
}
