package dao_Imp;

import interfaces_dao.DAOCategoria_Producto;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import modelo_dao.Categoria_Producto;
import mysql_conexion.MySQL;


public class DAOCategoria_ProductoImpl extends MySQL implements DAOCategoria_Producto{

    @Override
    public void RegistrarCategoriaP(Categoria_Producto cp) throws Exception {
        try{
            this.MySQLCnx();
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
    public void ModificarCategoriaP(Categoria_Producto cp) throws Exception {
        try{
            this.MySQLCnx();
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
    public void EliminarCategoriaP(Categoria_Producto cp) throws Exception {
        try{
            this.MySQLCnx();
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
    public List<Categoria_Producto> ListarCategoriaP(Categoria_Producto cp) throws Exception {
        List<Categoria_Producto> lista;
        
        try{
            this.MySQLCnx();
            PreparedStatement st = this.Conexion.prepareStatement("SELECT * FROM CATEGORIAS");
            
            lista = new ArrayList();
            ResultSet rs = st.executeQuery();
            
            while(rs.next()){
                Categoria_Producto cpd = new Categoria_Producto();
                cpd.setId(rs.getInt("idCATEGORIAS"));
                cpd.setNombre(rs.getString("NOMBRE"));
                cpd.setDescripcion(rs.getString("DESCRIPCION"));
                lista.add(cpd);
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
