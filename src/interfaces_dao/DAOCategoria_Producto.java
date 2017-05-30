package interfaces_dao;

import java.util.List;
import modelo_dao.Categoria_Producto;
import mysql_conexion.Rol;

/**
 *
 * @author Jhoan
 * @author Breiner
 */

public interface DAOCategoria_Producto {
    
    public void RegistrarCategoriaP(Categoria_Producto cp, Rol asc) throws Exception;
    public void ModificarCategoriaP(Categoria_Producto cp, Rol asc) throws Exception;
    public void EliminarCategoriaP(Categoria_Producto cp, Rol asc) throws Exception;
    public List<Categoria_Producto> ListarCategoriaP(Rol asc) throws Exception;
}
