package interfaces_dao;

import java.util.List;
import modelo_dao.Cliente;


public interface DAOCliente {
    
    public void RegistrarCliente(Cliente cl)throws Exception;
    public void ModificarCliente(Cliente cl)throws Exception;
    public void EliminarCliente(Cliente cl)throws Exception;
    public List<Cliente> ListarClientes(Cliente cl)throws Exception;
}
