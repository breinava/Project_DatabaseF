
package interfaces;

import java.util.List;
import modelo.Usuario;

/**
 *
 * @author Jhoan
 */
public interface DAOUsuario {
    
    public void registrarUsuario(Usuario u);
    public void editarUsuario(Usuario u);
    public void eliminarUsuario(Usuario u);
    public List<Usuario>getUsuarios();
    
}
