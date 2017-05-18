
package interfaces_dao;

import java.util.List;
import modelo_dao.Cargo;

/**
 *
 * @author Jhoan
 */
public interface DAOCargo {
    public void registrarCargo(Cargo ca);
    public void modificarCargo(Cargo ca);
    public void borrarCargo(Cargo ca);
    public List<Cargo> getCargos();
}
