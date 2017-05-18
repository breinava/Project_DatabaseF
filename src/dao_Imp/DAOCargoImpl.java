
package dao_Imp;

import interfaces_dao.DAOCargo;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo_dao.Cargo;
import mysql_conexion.MySQL;

/**
 *
 * @author Jhoan
 */
public class DAOCargoImpl extends MySQL implements DAOCargo {

    @Override
    public void registrarCargo(Cargo ca) {
        try {
            this.MySQLCnx();
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
    public void modificarCargo(Cargo ca) {
        try {
            this.MySQLCnx();
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
    public void borrarCargo(Cargo ca) {
        try {
            this.MySQLCnx();
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
    public List<Cargo> getCargos() {
        List<Cargo> cargos = new ArrayList<>();
      try {
            this.MySQLCnx();
            PreparedStatement st = this.Conexion.prepareStatement("SELECT * FROM CARGOS;");
            ResultSet rs = st.executeQuery();
            while(rs.next()){
                Cargo ca = new Cargo();
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
