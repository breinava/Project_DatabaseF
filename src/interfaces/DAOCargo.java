
package interfaces;

import java.util.List;
import modelo.Cargo;

/**
 *
 * @author Jhoan
 */
public interface DAOCargo {
    
    public void registrarCargo(Cargo car);
    public void editarCargo(Cargo car);
    public void eliminarCargo(Cargo car);
    public List<Cargo> getCargos();
    
}
