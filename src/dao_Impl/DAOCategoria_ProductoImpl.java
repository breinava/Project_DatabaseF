package dao_Impl;

import interfaces_dao.DAOCategoria_Producto;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import modelo_dao.Categoria_Producto;
import mysql_conexion.Rol;
import mysql_conexion.MySQL;

/**
 *
 * @author Jhoan
 * @author Breiner
 */

public class DAOCategoria_ProductoImpl extends MySQL implements DAOCategoria_Producto{

    @Override
    public void RegistrarCategoriaP(Categoria_Producto cp, Rol asc) throws Exception {
        try{
            this.MySQLCnx(asc);
            PreparedStatement st = this.Conexion.prepareStatement("INSERT INTO CATEGORIAS(NOMBRE,DESCRIPCION) VALUES(?,?)");
            st.setString(1, cp.getNombre());
            st.setString(2, cp.getDescripcion());
            st.executeUpdate();
            
        }catch(Exception e){
            throw e;
        
        }finally{
            this.CloseCnx();
        }
    }

    @Override
    public void ModificarCategoriaP(Categoria_Producto cp, Rol asc) throws Exception {
        try{
            this.MySQLCnx(asc);
            PreparedStatement st = this.Conexion.prepareStatement("UPDATE CATEGORIAS SET NOMBRE = ? WHERE idCATEGORIAS = ?");
            st.setString(1, cp.getNombre());
            st.setInt(2, cp.getId());
            st.executeUpdate();
            
        }catch(Exception e){
            throw e;
        
        }finally{
            this.CloseCnx();
        }
    }

    @Override
    public void EliminarCategoriaP(Categoria_Producto cp, Rol asc) throws Exception {
        try{
            this.MySQLCnx(asc);
            PreparedStatement st = this.Conexion.prepareStatement("DELETE FROM CATEGORIAS WHERE idCATEGORIAS = ?");
            st.setInt(1, cp.getId());
            st.executeUpdate();
            
        }catch(Exception e){
            throw e;
        
        }finally{
            this.CloseCnx();
        }
    }

    @Override
    public List<Categoria_Producto> ListarCategoriaP(Rol asc) throws Exception {
        List<Categoria_Producto> categorias_P = null;
        Categoria_Producto cp= new Categoria_Producto();
        
        try{
            this.MySQLCnx(asc);
            PreparedStatement st = this.Conexion.prepareStatement("SELECT * FROM CATEGORIAS");
            
            categorias_P = new ArrayList();
            ResultSet rs = st.executeQuery();
            
            while(rs.next()){
                cp.setId(rs.getInt("idCATEGORIAS"));
                System.out.println(rs.getInt("idCATEGORIAS"));
                cp.setNombre(rs.getString("NOMBRE"));
                cp.setDescripcion(rs.getString("DESCRIPCION"));
                categorias_P.add(cp);
            }
            
            
            rs.close();
            st.close();
            
        }catch(Exception e){
            throw e;
        
        }finally{
            this.CloseCnx();
        }
        
        return categorias_P;
    }
    
}
