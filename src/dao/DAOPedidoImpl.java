
package dao;

import interfaces.DAOPedido;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Pedido;
import mysql_conexion.MySQL;

/**
 *
 * @author Jhoan
 */
public class DAOPedidoImpl extends MySQL implements DAOPedido {

    @Override
    public void registrarPedido(Pedido pe) {
        try {
            this.MySQLCnx();
            PreparedStatement st = this.Conexion.prepareStatement("INSERT INTO PEDIDOS VALUES(?,now(),?,?,?);");
            st.setInt(1, pe.getNumPedido());
            st.setInt(2,pe.getIdProve());
            st.setInt(3, pe.getIdModoPag());
            st.setInt(4, pe.getIdALmacen());
            st.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DAOPedidoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            this.CloseCnx();
        }
    }

    @Override
    public void modificarPedido(Pedido pe) {
        try {
            this.MySQLCnx();
            PreparedStatement st = this.Conexion.prepareStatement("UPDATE PEDIDOS SET FECHA= NOW(),idPROVEEDORES = ?,"
                    + "idMODO_PAGO=?, idALMACEN = ? WHERE NUM_PEDIDO = ?;");
            st.setInt(1, pe.getIdProve());
            st.setInt(2, pe.getIdModoPag());
            st.setInt(3, pe.getIdALmacen());
            st.setInt(4, pe.getNumPedido());
            st.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DAOPedidoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            this.CloseCnx();
        }
    
    }

    @Override
    public void eliminarPedido(Pedido pe) {
        try {
            this.MySQLCnx();
            PreparedStatement st=this.Conexion.prepareStatement("DELETE FROM PEDIDOS WHERE NUM_PEDIDO = ?;");
            st.setInt(1,pe.getNumPedido());
            st.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DAOPedidoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            this.CloseCnx();
        }
    }

    @Override
    public List<Pedido> getPedidos() {
        List<Pedido> pedidos = new ArrayList<>();
        try {
            this.MySQLCnx();
            PreparedStatement st = this.Conexion.prepareStatement("SELECT FROM PEDIDOS;");
            ResultSet rt =st.executeQuery();
            while(rt.next()){
                Pedido pe = new Pedido();
                pe.setNumPedido(rt.getInt("NUM_PEDIDO"));
                pe.setIdALmacen(rt.getInt("idALMACEN_NIT"));
                pe.setIdModoPag(rt.getInt("idMODO_PAGO"));
                pe.setIdProve(rt.getInt("idPROVEEDORES"));
                pedidos.add(pe);
            }
            rt.close();
            st.close();
        } catch (SQLException ex) {
            Logger.getLogger(DAOPedidoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            this.CloseCnx();
        }
        return pedidos;
    }
    
}
