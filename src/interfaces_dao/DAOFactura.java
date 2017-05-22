package interfaces_dao;

import java.util.List;
import modelo_dao.Factura;
import mysql_conexion.Acceso;

/**
 *
 * @author Jhoan
 * @author Breiner
 */

public interface DAOFactura {
    public void RegistrarFactura(Factura fac, Acceso asc) throws Exception;
    public void ModificarFactura(Factura fac, Acceso asc) throws Exception;
    public void EliminarFactura(Factura fac, Acceso asc) throws Exception;
    public List<Factura> ListarFacturas(Factura fac, Acceso asc) throws Exception;
            
}
