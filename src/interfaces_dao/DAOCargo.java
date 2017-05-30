package interfaces_dao;

import java.util.List;
import modelo_dao.Cargo;
import mysql_conexion.Rol;

/**
 *
 * @author Jhoan
 * @author Breiner
 */

public interface DAOCargo {
    public void RegistrarCargo(Cargo ca, Rol asc) throws Exception;
    public void ModificarCargo(Cargo ca, Rol asc) throws Exception;
    public void EliminarCargo(Cargo ca, Rol asc) throws Exception;
    public List<Cargo> ListarCargos(Rol asc) throws Exception;
}
