package interfaces_dao;

import java.util.List;
import modelo_dao.Categoria_Producto;
import mysql_conexion.Acceso;

/**
 *
 * @author Jhoan
 * @author Breiner
 */

public interface DAOCategoria_Producto {
    
    public void RegistrarCategoriaP(Categoria_Producto cp, Acceso asc) throws Exception;
    public void ModificarCategoriaP(Categoria_Producto cp, Acceso asc) throws Exception;
    public void EliminarCategoriaP(Categoria_Producto cp, Acceso asc) throws Exception;
    public List<Categoria_Producto> ListarCategoriaP(Categoria_Producto cp, Acceso asc) throws Exception;
}
