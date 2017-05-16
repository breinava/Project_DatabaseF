
package dao;

import interfaces.DAOCargo;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Cargo;
import mysql_conexion.MySQL;

/**
 *
 * @author Jhoan
 */
public class DAOCargoImpl extends MySQL implements DAOCargo {

    @Override
    public void registrarCargo(Cargo car) {
        try {
            this.MySQLCnx();
            PreparedStatement st= this.Conexion.prepareStatement("INSERT INTO CARGOS VALUES(?,?);");
            st.setInt(1, car.getIdCargo());
            st.setString(2, car.getNombre());
            st.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DAOCargoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            this.CloseCnx();
        }
    }

    @Override
    public void editarCargo(Cargo car) {
        try {
            this.MySQLCnx();
            PreparedStatement st=this.Conexion.prepareStatement("UPDATE CARGOS SET NOMBRE = ? WHERE idCARGO = ?;");
            st.setString(1, car.getNombre());
            st.setInt(2, car.getIdCargo());
            st.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DAOCargoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            this.CloseCnx();
        }
    }

    @Override
    public void eliminarCargo(Cargo car) {
        
        try {
            this.MySQLCnx();
            PreparedStatement st = this.Conexion.prepareStatement("DELETE FROM CARGOS WHERE idCARGO = ?;");
            st.setInt(1, car.getIdCargo());
            st.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(DAOCargoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            this.CloseCnx();
        }
   
    }

    @Override
    public List<Cargo> getCargos() {
       List<Cargo>cargos = null;
        try {
            this.MySQLCnx();
            cargos = new ArrayList<>();
            PreparedStatement st= this.Conexion.prepareStatement("SELEC * FROM CARGOS;");
            ResultSet rs= st.executeQuery();
            while(rs.next()){
                Cargo car= new Cargo();
                car.setIdCargo(rs.getInt("idCARGO"));
                car.setNombre(rs.getString("NOMBRE"));
                cargos.add(car);
            }
            st.close();
            rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(DAOCargoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return cargos;
    }
    
    
}
