package dao_Impl;

import interfaces_dao.DAOAlmacen;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import modelo_dao.Almacen;
import mysql_conexion.Rol;
import mysql_conexion.MySQL;

/**
 *
 * @author Jhoan
 * @author Breiner
 */

public class DAOAlmacenImpl extends MySQL implements DAOAlmacen{ 
    
    @Override
    public void RegistrarAlmacen(Almacen alm, Rol asc) throws Exception {
        try{
            this.MySQLCnx(asc);
            PreparedStatement st = this.Conexion.prepareStatement("INSERT INTO ALMACEN VALUES(?,?)");
            st.setString(1, alm.getNit());
            st.setString(2, alm.getNombre());
            st.executeUpdate();
            
        }catch(Exception e){
            throw e;
        
        }finally{
            this.CloseCnx();
        }
    }

    @Override
    public void ModificarAlmacen(Almacen alm, Rol asc) throws Exception {
        try{
            this.MySQLCnx(asc);
            PreparedStatement st = this.Conexion.prepareStatement("UPDATE ALMACEN SET NOMBRE = ? WHERE NIT = ?");
            st.setString(1, alm.getNombre());
            st.setString(2, alm.getNit());
            st.executeUpdate();
            
        }catch(Exception e){
            throw e;
        
        }finally{
            this.CloseCnx();
        } 
    }

    @Override
    public void EliminarAlmacen(Almacen alm, Rol asc) throws Exception {
        try{
            this.MySQLCnx(asc);
            PreparedStatement st = this.Conexion.prepareStatement("DELETE FROM ALMACEN WHERE NIT = ?");
            st.setString(1, alm.getNit());
            st.executeUpdate();
            
        }catch(Exception e){
            throw e;
        
        }finally{
            this.CloseCnx();
        }
    }

    @Override
    public List<Almacen> ListarAlmacenes(Rol asc) throws Exception {
        List<Almacen> almacenes = null;
        Almacen alm = new Almacen();
        
        try{
            this.MySQLCnx(asc);
            PreparedStatement st = this.Conexion.prepareStatement("SELECT * FROM ALMACEN");
            
            almacenes = new ArrayList();
            ResultSet rs = st.executeQuery();
            
            while(rs.next()){
                
                alm.setNit(rs.getString("NIT"));
                alm.setNombre(rs.getString("NOMBRE"));
                almacenes.add(alm);
            }
            rs.close();
            st.close();
            
        }catch(Exception e){
            throw e;
        
        }finally{
            this.CloseCnx();
        }
        
        return almacenes;
    }
    
}
