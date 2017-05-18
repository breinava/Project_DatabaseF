package dao_Imp;

import interfaces_dao.DAOProducto;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import modelo_dao.Producto;
import mysql_conexion.MySQL;


public class DAOProductoImpl extends MySQL implements DAOProducto{

    @Override
    public void RegistrarProducto(Producto pd) throws Exception {
        
        int CategoriaID;
        
        try{
            this.MySQLCnx();
            PreparedStatement st = this.Conexion.prepareStatement("SELECT * FROM CATEGORIAS WHERE NOMBRE = ?");
            st.setString(1, pd.getName_categoria());
           
            ResultSet rs = st.executeQuery();
            rs.next();
            CategoriaID =rs.getInt("idCategorias");
            
        }catch(Exception e){
            throw e;
        
        }finally{
            this.CloseCnx();
        }
        
        try{
            this.MySQLCnx();
            PreparedStatement st = this.Conexion.prepareStatement("INSERT INTO PRODUCTOS(NOMBRE,PRECIO_COMPRA,PRECIO_VENTA,idCATEGORIAS) VALUES(?,?,?,?)");
            st.setString(1, pd.getNombre());
            st.setDouble(2, pd.getPrecio1());
            st.setDouble(3, pd.getPrecio2());
            st.setInt(4, CategoriaID);
            st.executeUpdate();
            
        }catch(Exception e){
            throw e;
        
        }finally{
            this.CloseCnx();
        }
    }

    @Override
    public void ModificarProducto(Producto pd) throws Exception {
        try{
            this.MySQLCnx();
            PreparedStatement st = this.Conexion.prepareStatement("UPDATE PRODUCTOS SET NOMBRE = ? WHERE idPRODUCTOS = ?");
            st.setString(1, pd.getNombre());
            st.setInt(2, pd.getId());
            st.executeUpdate();
            
        }catch(Exception e){
            throw e;
        
        }finally{
            this.CloseCnx();
        }
    }

    @Override
    public void EliminarProducto(Producto pd) throws Exception {
        try{
            this.MySQLCnx();
            PreparedStatement st = this.Conexion.prepareStatement("DELETE FROM PRODUCTOS WHERE idPRODUCTOS = ?");
            st.setInt(1, pd.getId());
            st.executeUpdate();
            
        }catch(Exception e){
            throw e;
        
        }finally{
            this.CloseCnx();
        }
    }

    @Override
    public List<Producto> ListarProducto(Producto pd) throws Exception {
        List<Producto> lista;
        
        try{
            this.MySQLCnx();
            PreparedStatement st = this.Conexion.prepareStatement("SELECT * FROM CATEGORIAS");
            
            lista = new ArrayList();
            ResultSet rs = st.executeQuery();
            
            while(rs.next()){
                Producto p = new Producto();
                p.setId(rs.getInt("idCATEGORIAS"));
                p.setNombre(rs.getString("NOMBRE"));
                p.setPrecio1(rs.getDouble("PRECIO_COMPRA"));
                p.setPrecio2(rs.getDouble("PRECIO_VENTA"));
                p.setIdCategoria(rs.getInt("idCATEGORIAS"));
                lista.add(p);
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
