package dao_Impl;

import interfaces_dao.DAOModoPago;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo_dao.ModoPago;
import mysql_conexion.Acceso;
import mysql_conexion.MySQL;

/**
 *
 * @author Jhoan
 * @author Breiner
 */

public class DAOModoPagoImpl extends MySQL implements DAOModoPago {

    @Override
    public void RegistarModoPago(ModoPago pago, Acceso asc) throws Exception {
        try {
            this.MySQLCnx(asc);
            PreparedStatement st = this.Conexion.prepareStatement("INSERT INTO MODO_PAGO VALUES(?,?);");
            st.setInt(1,pago.getIdModoPago());
            st.setString(2,pago.getNombre());
            st.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DAOModoPagoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            this.CloseCnx();
        }
    }

    @Override
    public void ModificarModoPago(ModoPago pago, Acceso asc) throws Exception {
        try {
            this.MySQLCnx(asc);
            PreparedStatement st =this.Conexion.prepareStatement("UPDATE MODO_PAGO SET NOMBRE =? WHERE idMODO_PAGO=?");
            st.setString(1, pago.getNombre());
            st.setInt(2,pago.getIdModoPago());
            st.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DAOModoPagoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            this.CloseCnx();
        }
    }

    @Override
    public void EliminarModoPago(ModoPago pago, Acceso asc) throws Exception {
        try {
            this.MySQLCnx(asc);
            PreparedStatement st = this.Conexion.prepareStatement("delete from MODO_PAGO WHERE idMODO_PAGO = ?;");
            //st.setInt(1, pago.getIdModoPago());
            st.setInt(1, pago.getIdModoPago());
             st.executeLargeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DAOModoPagoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            this.CloseCnx();
        }
    }

    @Override
    public List<ModoPago> ListarModoPagos(ModoPago pago, Acceso asc) throws Exception {
        List<ModoPago> modosPagos=null;
           
        try {
            this.MySQLCnx(asc);
            PreparedStatement st = this.Conexion.prepareStatement("SELECT * FROM MODO_PAGO");
            
            modosPagos= new ArrayList();
            ResultSet rs =st.executeQuery();
            
            while(rs.next()){
                pago.setIdModoPago(rs.getInt("idMODO_PAGO"));
                pago.setNombre(rs.getString("NOMBRE"));
                modosPagos.add(pago);                            
            }
            rs.close();
            st.close();
        } catch (SQLException ex) {
            Logger.getLogger(DAOModoPagoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            this.CloseCnx();
        }
        return modosPagos;
    }
    
}
