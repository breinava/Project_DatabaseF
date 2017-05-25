package interfaces_dao;

import java.util.List;
import modelo_dao.Usuario;
import mysql_conexion.Rol;

/**
 *
 * @author Jhoan
 * @author Breiner
 */

public interface DAOUsuario {
        
    public void RegistrarUsuario(Usuario u, Rol asc) throws Exception;
    public void ModificarUsuario(Usuario u, Rol asc) throws Exception;
    public void EliminarUsuario(Usuario u, Rol asc) throws Exception;
    public Usuario BuscarUsuario(String usr, Rol asc) throws Exception;
    public String Desencriptar(Usuario u, Rol asc) throws Exception;
    public List<Usuario> ListarUsuarios( Rol asc) throws Exception;
    

}
