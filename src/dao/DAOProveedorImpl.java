
package dao;

import interfaces.DAOProveedor;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Proveedor;
import mysql_conexion.MySQL;

/**
 *
 * @author Jhoan
 */
public class DAOProveedorImpl extends MySQL implements DAOProveedor{

    @Override
    public void registrarProveedor(Proveedor pr) {
        try {
            this.MySQLCnx();
            PreparedStatement st =this.Conexion.prepareStatement("INSERT INTO PROVEEDORES VALUES(?,?);");
            st.setInt(1, pr.getIdPROVEEDORES());
            st.setString(2, pr.getNombre());
            st.executeLargeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DAOProveedorImpl.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            this.CloseCnx();
        }
    }

    @Override
    public void modificarProveedor(Proveedor pr) {
        
        try {
            this.MySQLCnx();
            PreparedStatement st = this.Conexion.prepareStatement("UPDATE PROVEEDORES SET NOMBRE = ? WHERE idPROVEEDORES = ?;");
            st.setString(1, pr.getNombre());
            st.setInt(2, pr.getIdPROVEEDORES());
            st.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DAOProveedorImpl.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            this.CloseCnx();
        }
        
    }

    @Override
    public void borrarProveedor(Proveedor pr) {
        try {
            this.MySQLCnx();
            PreparedStatement st = this.Conexion.prepareStatement("DELETE FROM PROVEEDORES WHERE idPROVEEDORES = ?");
            st.setInt(1, pr.getIdPROVEEDORES());
            st.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DAOProveedorImpl.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            this.CloseCnx();
        }
    }

    @Override
    public List<Proveedor> listaProveedores() {
        List<Proveedor> proveedores = null;
        try {
            proveedores=new ArrayList<>();
            this.MySQLCnx();
            PreparedStatement st = this.Conexion.prepareStatement("SELECT * FROM PROVEEDORES");
            ResultSet rs = st.executeQuery();
            while(rs.next()){
                Proveedor pro = new Proveedor();
                pro.setIdPROVEEDORES(rs.getInt(1));
                pro.setNombre(rs.getString(2));
                proveedores.add(pro); 
            }
              rs.close();
              st.close();
        } catch (SQLException ex) {
            Logger.getLogger(DAOProveedorImpl.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            this.CloseCnx();
        }        return proveedores;
    }
    
}
