
package interfaces_dao;

import java.util.List;
import modelo_dao.Usuario;

/**
 *
 * @author Jhoan
 * @author Breiner
 */
public interface DAOUsuario {
    
    public void registrarUsuario(Usuario u);
    public void editarUsuario(Usuario u);
    public void eliminarUsuario(Usuario u);
    public Usuario buscarUsuario(String usr);
    public String desencriptar(Usuario u);
    public List<Usuario>getUsuarios();
    
}
