package dao;

import interfaces.DAOAlmacen;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import modelo.Almacen;
import mysql_conexion.MySQL;


public class DAOAlmacenImpl extends MySQL implements DAOAlmacen{

    @Override
    public void RegistrarAlmacen(Almacen alm) throws Exception {
        try{
            this.MySQLCnx();
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
    public void ModificarAlmacen(Almacen alm) throws Exception {
        try{
            this.MySQLCnx();
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
    public void EliminarAlmacen(Almacen alm) throws Exception {
        try{
            this.MySQLCnx();
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
    public List<Almacen> ListarAlmacen(Almacen alm) throws Exception {
        List<Almacen> lista;
        
        try{
            this.MySQLCnx();
            PreparedStatement st = this.Conexion.prepareStatement("SELECT * FROM ALMACEN");
            
            lista = new ArrayList();
            ResultSet rs = st.executeQuery();
            
            while(rs.next()){
                Almacen al = new Almacen();
                al.setNit(rs.getString("NIT"));
                al.setNombre(rs.getString("NOMBRE"));
                lista.add(al);
            }
            rs.close();
            st.close();
            
        }catch(Exception e){
            throw e;
        
        }finally{
            this.CloseCnx();
        }
        
        return lista;
    }
    
}
