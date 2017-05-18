
package dao_Impl;

import interfaces_dao.DAOFactura;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo_dao.Factura;
import mysql_conexion.MySQL;

/**
 *
 * @author Jhoan
 */
public class DAOFacturaImpl extends MySQL implements DAOFactura{

    @Override
    public void crearFactura(Factura fac) {
        try {
            this.MySQLCnx();
            PreparedStatement st = this.Conexion.prepareStatement("INSERT INTO FACTURAS VALUES(?,now(),?,?,?)");
            st.setInt(1, fac.getNUM_FACTURA());
            st.setInt(2, fac.getClienteDni());
            st.setInt(3, fac.getIdModoPago());
            st.setInt(4, fac.getIdEmpleado());
            st.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DAOFacturaImpl.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            this.CloseCnx();
        }
    }

    @Override
    public void modificarFactura(Factura fac) {
        try {
            this.MySQLCnx();
            PreparedStatement st = this.Conexion.prepareStatement("UPDATE FACTURAS SET FECHA = NOW(), CLIENTES_DNI = ?, "
                    + "idMODO_PAGO=?, ideMPLEADOS=? WHERE NUM_FACTURA = ?");
            st.setInt(1, fac.getClienteDni());
            st.setInt(2, fac.getIdModoPago());
            st.setInt(3, fac.getIdEmpleado());
            st.setInt(4, fac.getNUM_FACTURA());
            st.executeUpdate();
            
        } catch (SQLException ex) {
            Logger.getLogger(DAOFacturaImpl.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            this.CloseCnx();
        }
    }

    @Override
    public void eliminarFactura(Factura fac) {
        try {
            this.MySQLCnx();
            PreparedStatement st=this.Conexion.prepareStatement("DELETE FROM FACTURAS WHERE NUM_FACTURA = ?");
            st.setInt(1, fac.getNUM_FACTURA());
            st.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DAOFacturaImpl.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            this.CloseCnx();
        }
    }

    @Override
    public List<Factura> getFacturas() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
