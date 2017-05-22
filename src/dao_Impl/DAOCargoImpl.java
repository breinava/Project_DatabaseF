package dao_Impl;

import interfaces_dao.DAOCargo;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo_dao.Cargo;
import mysql_conexion.Acceso;
import mysql_conexion.MySQL;

/**
 *
 * @author Jhoan
 * @author Breiner
 */

public class DAOCargoImpl extends MySQL implements DAOCargo {

    @Override
    public void RegistrarCargo(Cargo ca, Acceso asc) throws Exception {
        try {
            this.MySQLCnx(asc);
            PreparedStatement st = this.Conexion.prepareStatement("INSET INTO CARGOS VALUES(?,?);");
            st.setInt(1, ca.getIdCargo());
            st.setString(2, ca.getNombre());
            st.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DAOCargoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            this.CloseCnx();
        }
    }

    @Override
    public void ModificarCargo(Cargo ca, Acceso asc) throws Exception {
        try {
            this.MySQLCnx(asc);
            PreparedStatement st = this.Conexion.prepareStatement("UPDATE CARGOS SET NOMBRE=? WHERE idCARGO=?;");
            st.setString(1, ca.getNombre());
            st.setInt(2, ca.getIdCargo());
            st.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DAOCargoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            this.CloseCnx();
        }
    }

    @Override
    public void EliminarCargo(Cargo ca, Acceso asc) throws Exception {
        try {
            this.MySQLCnx(asc);
            PreparedStatement st = this.Conexion.prepareStatement("DELETE FROM CARGOS WHERE idCARGO=?;");
            st.setInt(1, ca.getIdCargo());
            st.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DAOCargoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            this.CloseCnx();
        }
    }

    @Override
    public List<Cargo> ListarCargos(Cargo ca, Acceso asc) throws Exception {
        List<Cargo> cargos = null;
      
        try {
            this.MySQLCnx(asc);
            PreparedStatement st = this.Conexion.prepareStatement("SELECT * FROM CARGOS;");
            
            cargos = new ArrayList();
            ResultSet rs = st.executeQuery();
        
            while(rs.next()){
                ca.setIdCargo(rs.getInt(1));
                ca.setNombre(rs.getString(2));
                cargos.add(ca);
            }
            
            rs.close();
            st.close();
        } catch (SQLException ex) {
            Logger.getLogger(DAOCargoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            this.CloseCnx();
        }
      
        return cargos;
    }
    
}
