package interfaces_dao;

import java.util.List;
import modelo_dao.Pedido;
import mysql_conexion.Rol;

/**
 *
 * @author Jhoan
 * @author Breiner
 */

public interface DAOPedido {
    public void RegistrarPedido(Pedido pe, Rol asc) throws Exception;
    public void ModificarPedido(Pedido pe, Rol asc) throws Exception;
    public void EliminarPedido(Pedido pe, Rol asc) throws Exception;
    public List<Pedido> ListarPedidos(Pedido pe, Rol asc) throws Exception;
}
