package interfaces_dao;

import modelo_dao.Usuario;
import modelo_dao.Usuario_Rol;
import mysql_conexion.Rol;

/**
 *
 * @author breiner
 */

public interface DAOUsuario_Rol {
    
    public void RegistrarUsuarioR(Usuario u, Rol r) throws Exception;
}
