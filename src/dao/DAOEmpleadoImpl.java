
package dao;

import interfaces.DAOEmpleado;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Empleado;
import mysql_conexion.MySQL;

/**
 *
 * @author Jhoan
 */
public class DAOEmpleadoImpl extends MySQL implements DAOEmpleado {

    @Override
    public void registraEmpleado(Empleado e) {
        try {
            this.MySQLCnx();
            PreparedStatement st = this.Conexion.prepareStatement("INSERT INTO EMPLEADOS VALUES(?,?,?,?,?,?);");
            st.setInt(1, e.getIdEmpleado());
            st.setString(2, e.getNombre());
            st.setString(3, e.getApellido());
            st.setInt(4, e.getIdCargo());
            st.setInt(5, e.getIdUser());
            st.setLong(6, e.getIdAlmacen());
            st.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DAOEmpleadoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            this.CloseCnx();
        }
    }

    @Override
    public void modificarEmpleado(Empleado e) {
        try {
            this.MySQLCnx();
            PreparedStatement st = this.Conexion.prepareStatement("UPDATE EMPLEADOS SET NOMBRE=?, APELLIDOS =?, "
                    + "idCARGO=?, idUSERS=?, ALMACEN_NIT=?");
            st.setString(1, e.getNombre());
            st.setString(2, e.getApellido());
            st.setInt(3, e.getIdCargo());
            st.setInt(4, e.getIdUser());
            st.setLong(5, e.getIdAlmacen());
            st.setInt(6, e.getIdEmpleado());
            st.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DAOEmpleadoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            this.CloseCnx();
        }
    }

    @Override
    public void eliminarEmpleado(Empleado e) {
        try {
            this.MySQLCnx();
            PreparedStatement st = this.Conexion.prepareStatement("DELETE FROM EMPLEADOS WHERE idEMPELADOS=?");
            st.setInt(1, e.getIdEmpleado());
            st.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DAOEmpleadoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            this.CloseCnx();
        }
    }

    @Override
    public List<Empleado> getEmpleados() {
        List<Empleado>empleados= null;
        try {
            this.MySQLCnx();
            empleados= new ArrayList<>();
            PreparedStatement st= this.Conexion.prepareStatement("SELECT * FROM EMPLEADOS");
            ResultSet rs = st.executeQuery();
            while(rs.next()){
                Empleado e = new Empleado();
                e.setIdEmpleado(rs.getInt("idEMPLEADOS"));
                e.setNombre(rs.getString("NOMBRE"));
                e.setApellido(rs.getString("APELLIDOS"));
                e.setIdCargo(rs.getInt("idCARGO"));
                e.setIdUser(rs.getInt("idUSERS"));
                e.setIdAlmacen(rs.getLong("ALMACEN_NIT"));
                empleados.add(e);
            }
            rs.close();
            st.close();
        } catch (SQLException ex) {
            Logger.getLogger(DAOEmpleadoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            this.CloseCnx();
        }
        return empleados;
    }
    
}
