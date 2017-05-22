package dao_Impl;

import interfaces_dao.DAOFactura;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo_dao.Empleado;
import modelo_dao.Factura;
import mysql_conexion.Acceso;
import mysql_conexion.MySQL;

/**
 *
 * @author Jhoan
 * @author Breiner
 */

public class DAOFacturaImpl extends MySQL implements DAOFactura{

    @Override
    public void RegistrarFactura(Factura fac, Acceso asc) throws Exception {
        try {
            this.MySQLCnx(asc);
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
    public void ModificarFactura(Factura fac, Acceso asc) throws Exception {
        try {
            this.MySQLCnx(asc);
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
    public void EliminarFactura(Factura fac, Acceso asc) throws Exception {
        try {
            this.MySQLCnx(asc);
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
    public List<Factura> ListarFacturas(Factura fac, Acceso asc) throws Exception {
        List<Factura> facturas = null;
        
        try {
            this.MySQLCnx(asc);
            PreparedStatement st= this.Conexion.prepareStatement("SELECT * FROM FACTURAS");
            
            facturas = new ArrayList();
            ResultSet rs = st.executeQuery();
            
            while(rs.next()){                
                fac.setNUM_FACTURA(rs.getInt("NUM_FACTURA"));
                fac.setFecha(rs.getString("FECHA"));
                fac.setClienteDni(rs.getInt("CLIENTES_DNI"));
                fac.setIdModoPago(rs.getInt("idMODO_PAGO"));
                fac.setIdEmpleado(rs.getInt("idEMPLEADOS"));
                facturas.add(fac);
            }
            rs.close();
            st.close();
        } catch (SQLException ex) {
            Logger.getLogger(DAOEmpleadoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            this.CloseCnx();
        }
        
        return facturas;
    }
    
}
