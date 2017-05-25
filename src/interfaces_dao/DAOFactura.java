package interfaces_dao;

import java.util.List;
import modelo_dao.Factura;
import mysql_conexion.Rol;

/**
 *
 * @author Jhoan
 * @author Breiner
 */

public interface DAOFactura {
    public void RegistrarFactura(Factura fac, Rol asc) throws Exception;
    public void ModificarFactura(Factura fac, Rol asc) throws Exception;
    public void EliminarFactura(Factura fac, Rol asc) throws Exception;
    public List<Factura> ListarFacturas(Factura fac, Rol asc) throws Exception;
            
}
