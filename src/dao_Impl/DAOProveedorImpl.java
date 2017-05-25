package dao_Impl;

import interfaces_dao.DAOProveedor;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo_dao.Proveedor;
import mysql_conexion.Rol;
import mysql_conexion.MySQL;

/**
 *
 * @author Jhoan
 * @author Breiner
 */

public class DAOProveedorImpl extends MySQL implements DAOProveedor{

    @Override
    public void RegistrarProveedor(Proveedor pr, Rol asc) throws Exception {
        try {
            this.MySQLCnx(asc);
            PreparedStatement st =this.Conexion.prepareStatement("INSERT INTO PROVEEDORES VALUES(?,?);");
            st.setInt(1, pr.getIdPROVEEDORES());
            st.setString(2, pr.getNombre());
            st.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DAOProveedorImpl.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            this.CloseCnx();
        }
    }

    @Override
    public void ModificarProveedor(Proveedor pr, Rol asc) throws Exception {
        
        try {
            this.MySQLCnx(asc);
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
    public void EliminarProveedor(Proveedor pr, Rol asc) throws Exception {
        try {
            this.MySQLCnx(asc);
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
    public List<Proveedor> ListarProveedores(Proveedor pr, Rol asc) throws Exception {
        List<Proveedor> proveedores = null;
        try {
            this.MySQLCnx(asc);
            PreparedStatement st = this.Conexion.prepareStatement("SELECT * FROM PROVEEDORES");
            
            proveedores=new ArrayList();
            ResultSet rs = st.executeQuery();
            
            while(rs.next()){
                pr.setIdPROVEEDORES(rs.getInt(1));
                pr.setNombre(rs.getString(2));
                proveedores.add(pr); 
            }
              rs.close();
              st.close();
        } catch (SQLException ex) {
            Logger.getLogger(DAOProveedorImpl.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            this.CloseCnx();
        }        
        return proveedores;
    }
    
}
