package interfaces_dao;

import java.util.List;
import modelo_dao.Pedido;
import mysql_conexion.Acceso;

/**
 *
 * @author Jhoan
 * @author Breiner
 */

public interface DAOPedido {
    public void RegistrarPedido(Pedido pe, Acceso asc) throws Exception;
    public void ModificarPedido(Pedido pe, Acceso asc) throws Exception;
    public void EliminarPedido(Pedido pe, Acceso asc) throws Exception;
    public List<Pedido> ListarPedidos(Pedido pe, Acceso asc) throws Exception;
}
