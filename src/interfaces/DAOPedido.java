/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import java.util.List;
import modelo.Pedido;

/**
 *
 * @author Jhoan
 */
public interface DAOPedido {
    
    public void registrarPedido(Pedido pe);
    public void modificarPedido(Pedido pe);
    public void eliminarPedido(Pedido pe);
    public List<Pedido> getPedidos();
    
}
