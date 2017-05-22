package dao_Impl;

import interfaces_dao.DAOPedido;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo_dao.Pedido;
import mysql_conexion.Acceso;
import mysql_conexion.MySQL;

/**
 *
 * @author Jhoan
 * @author Breiner
 */

public class DAOPedidoImpl extends MySQL implements DAOPedido{

    @Override
    public void RegistrarPedido(Pedido pe, Acceso asc) throws Exception {
        try {
            this.MySQLCnx(asc);
            PreparedStatement st = this.Conexion.prepareStatement("INSERT INTO PEDIDOS VALUES(?,NOW(),?,?,?);");
            st.setInt(1, pe.getNumPedido());
            st.setInt(2, pe.getIdProve());
            st.setInt(3, pe.getIdModoP());
            st.setInt(4, pe.getIdAlma());
            st.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DAOPedidoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            this.CloseCnx();
        }
    }

    @Override
    public void ModificarPedido(Pedido pe, Acceso asc) throws Exception {
        try {
            this.MySQLCnx(asc);
            PreparedStatement st = this.Conexion.prepareStatement("UPDATE PEDIDOS SET FECHA = NOW(), idPROVEEDORES=?,"
                    + "idMODO_PAGO=?,idALMACEN=? WHERE NUM_PEDIDO=?;");
            st.setInt(1, pe.getIdProve());
            st.setInt(2, pe.getIdModoP());
            st.setInt(3, pe.getIdAlma());
            st.setInt(4, pe.getNumPedido());
            st.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DAOPedidoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            this.CloseCnx();
        }
    }

    @Override
    public void EliminarPedido(Pedido pe, Acceso asc) throws Exception {
        try {
            this.MySQLCnx(asc);
            PreparedStatement st = this.Conexion.prepareStatement("DELETE FROM PEDIDOS WHERE NUM_PEDIDO =?;");
            st.setInt(1, pe.getNumPedido());
            st.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DAOPedidoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            this.CloseCnx();
        }
    }

    @Override
    public List<Pedido> ListarPedidos(Pedido pe, Acceso asc) throws Exception {
        List<Pedido> pedidos = null;
        try {
            this.MySQLCnx(asc);
            PreparedStatement st = this.Conexion.prepareStatement("SELECT * FROM PEDIDOS;");
            
            pedidos = new ArrayList();
            ResultSet rs =st.executeQuery();
            while(rs.next()){
                pe.setNumPedido(rs.getInt(1));
                pe.setIdProve(rs.getInt(3));
                pe.setIdModoP(rs.getInt(4));
                pe.setIdAlma(rs.getInt(5));
                pedidos.add(pe);
            }
            rs.close(); 
            st.close();
        } catch (SQLException ex) {
            Logger.getLogger(DAOPedidoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            this.CloseCnx();
        }
        return pedidos;
    }
    
}
