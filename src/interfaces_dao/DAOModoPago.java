package interfaces_dao;

import java.util.List;
import modelo_dao.ModoPago;
import mysql_conexion.Acceso;

/**
 *
 * @author Jhoan
 * @author Breiner
 */

public interface DAOModoPago {
    public void RegistarModoPago(ModoPago pago, Acceso asc) throws Exception;
    public void ModificarModoPago(ModoPago pago, Acceso asc) throws Exception;
    public void EliminarModoPago(ModoPago pago, Acceso asc) throws Exception;
    public List<ModoPago> ListarModoPagos(ModoPago pago, Acceso asc) throws Exception;
}
