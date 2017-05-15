/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import interfaces.DAOModoPago;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.ModoPago;
import mysql_conexion.MySQL;

/**
 *
 * @author Jhoan
 */
public class DAOModoPagoImpl extends MySQL implements DAOModoPago {

    @Override
    public void registarModoPago(ModoPago pago) {
        try {
            this.MySQLCnx();
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
    public void modificarModoPago(ModoPago pago) {
        try {
            this.MySQLCnx();
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
    public void borrarModoPago(ModoPago pago) {
        try {
            this.MySQLCnx();
            PreparedStatement st = this.Conexion.prepareStatement("delete from MODO_PAGO WHERE idMODO_PAGO = ?;");
            //st.setInt(1, pago.getIdModoPago());
            st.setInt(1, pago.getIdModoPago());
        } catch (SQLException ex) {
            Logger.getLogger(DAOModoPagoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            this.CloseCnx();
        }
    }

    @Override
    public List<ModoPago> getModoPagos() {
        List<ModoPago> modosPagos=null;
           
        try {
            this.MySQLCnx();
            PreparedStatement st = this.Conexion.prepareStatement("SELECT * FROM MODO_PAGO");
            modosPagos= new ArrayList();
            ResultSet rs =st.executeQuery();
            while(rs.next()){
                ModoPago pago = new ModoPago();
                pago.setIdModoPago(rs.getInt("idMODO_PAGO"));
                pago.setNombre(rs.getString("NOMBRE"));
                modosPagos.add(pago);                            
            }
        } catch (SQLException ex) {
            Logger.getLogger(DAOModoPagoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            this.CloseCnx();
        }
        return modosPagos;
    }
    
}
