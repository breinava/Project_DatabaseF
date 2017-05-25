package interfaces_dao;

import java.util.List;
import modelo_dao.Cliente;
import mysql_conexion.Rol;

/**
 *
 * @author Jhoan
 * @author Breiner
 */

public interface DAOCliente {
    
    public void RegistrarCliente(Cliente cl, Rol asc) throws Exception;
    public void ModificarCliente(Cliente cl, Rol asc) throws Exception;
    public void EliminarCliente(Cliente cl, Rol asc) throws Exception;
    public List<Cliente> ListarClientes(Cliente cl, Rol asc) throws Exception;
}
