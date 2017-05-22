package interfaces_dao;

import java.util.List;
import modelo_dao.Usuario;
import mysql_conexion.Acceso;

/**
 *
 * @author Jhoan
 * @author Breiner
 */

public interface DAOUsuario {
        
    public void RegistrarUsuario(Usuario u, Acceso asc) throws Exception;
    public void ModificarUsuario(Usuario u, Acceso asc) throws Exception;
    public void EliminarUsuario(Usuario u, Acceso asc) throws Exception;
    public Usuario BuscarUsuario(String usr, Acceso asc) throws Exception;
    public String Desencriptar(Usuario u, Acceso asc) throws Exception;
    public List<Usuario> ListarUsuarios(Usuario u, Acceso asc) throws Exception;
    

}
