package interfaces_dao;

import java.util.List;
import modelo_dao.ModoPago;
import mysql_conexion.Rol;

/**
 *
 * @author Jhoan
 * @author Breiner
 */

public interface DAOModoPago {
    public void RegistarModoPago(ModoPago pago, Rol asc) throws Exception;
    public void ModificarModoPago(ModoPago pago, Rol asc) throws Exception;
    public void EliminarModoPago(ModoPago pago, Rol asc) throws Exception;
    public List<ModoPago> ListarModoPagos(ModoPago pago, Rol asc) throws Exception;
}
