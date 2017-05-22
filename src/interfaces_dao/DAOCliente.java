package interfaces_dao;

import java.util.List;
import modelo_dao.Cliente;
import mysql_conexion.Acceso;

/**
 *
 * @author Jhoan
 * @author Breiner
 */

public interface DAOCliente {
    
    public void RegistrarCliente(Cliente cl, Acceso asc) throws Exception;
    public void ModificarCliente(Cliente cl, Acceso asc) throws Exception;
    public void EliminarCliente(Cliente cl, Acceso asc) throws Exception;
    public List<Cliente> ListarClientes(Cliente cl, Acceso asc) throws Exception;
}
