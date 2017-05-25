package dao_Impl;

import interfaces_dao.DAOProducto;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import modelo_dao.Producto;
import mysql_conexion.Rol;
import mysql_conexion.MySQL;

/**
 *
 * @author Jhoan
 * @author Breiner
 */

public class DAOProductoImpl extends MySQL implements DAOProducto{

    @Override
    public void RegistrarProducto(Producto pd, Rol asc) throws Exception {
        
        int CategoriaID;
        
        try{
            this.MySQLCnx(asc);
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
            this.MySQLCnx(asc);
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
    public void ModificarProducto(Producto pd, Rol asc) throws Exception {
        try{
            this.MySQLCnx(asc);
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
    public void EliminarProducto(Producto pd, Rol asc) throws Exception {
        try{
            this.MySQLCnx(asc);
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
    public List<Producto> ListarProductos(Producto pd, Rol asc) throws Exception {
        List<Producto> productos = null;
        
        try{
            this.MySQLCnx(asc);
            PreparedStatement st = this.Conexion.prepareStatement("SELECT * FROM CATEGORIAS");
            
            productos = new ArrayList();
            ResultSet rs = st.executeQuery();
            
            while(rs.next()){
                pd.setId(rs.getInt("idCATEGORIAS"));
                pd.setNombre(rs.getString("NOMBRE"));
                pd.setPrecio1(rs.getDouble("PRECIO_COMPRA"));
                pd.setPrecio2(rs.getDouble("PRECIO_VENTA"));
                pd.setIdCategoria(rs.getInt("idCATEGORIAS"));
                productos.add(pd);
            }
            rs.close();
            st.close();
            
        }catch(Exception e){
            throw e;
        
        }finally{
            this.CloseCnx();
        }
        
        return productos;
    }
    
}
