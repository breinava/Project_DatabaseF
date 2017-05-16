
package interfaces;

import java.util.List;
import modelo.User;

/**
 *
 * @author Jhoan
 */
public interface DAOUser {
    public void registrarUsuario(User u);
    public void editarUsuario(User u);
    public void borrarUsuario(User u);
    public List<User> getUsuarios();
    
}
