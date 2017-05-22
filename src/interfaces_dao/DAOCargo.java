package interfaces_dao;

import java.util.List;
import modelo_dao.Cargo;
import mysql_conexion.Acceso;

/**
 *
 * @author Jhoan
 * @author Breiner
 */

public interface DAOCargo {
    public void RegistrarCargo(Cargo ca, Acceso asc) throws Exception;
    public void ModificarCargo(Cargo ca, Acceso asc) throws Exception;
    public void EliminarCargo(Cargo ca, Acceso asc) throws Exception;
    public List<Cargo> ListarCargos(Cargo ca, Acceso asc) throws Exception;
}
