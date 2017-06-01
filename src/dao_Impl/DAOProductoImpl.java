package dao_Impl;

import interfaces_dao.DAOProducto;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import modelo_dao.Producto;
import mysql_conexion.Rol;
import mysql_conexion.MySQL;
import static ventanas.VCliente.TablaCliente;
import static ventanas.VProductos.TablaProducto;

/**
 *
 * @author Jhoan
 * @author Breiner
 */

public class DAOProductoImpl extends MySQL implements DAOProducto{

    @Override
    public void RegistrarProducto(Producto pd, Rol asc) throws Exception {
        
        int CategoriaID = 0;
        int MarcaID = 0;
        
        try{
            this.MySQLCnx(asc);
            PreparedStatement st = this.Conexion.prepareStatement("SELECT * FROM CATEGORIAS WHERE NOMBRE = ?");
            st.setString(1, pd.getName_categoria());
           
            ResultSet rs = st.executeQuery();
            rs.next();
            CategoriaID =rs.getInt("idCATEGORIAS");
            
        }catch(Exception e){
            throw e;
        
        }finally{
            this.CloseCnx();
        }
        
        try{
            this.MySQLCnx(asc);
            PreparedStatement st = this.Conexion.prepareStatement("SELECT * FROM MARCAS WHERE NOMBRE = ?");
            st.setString(1, pd.getName_categoria());
           
            ResultSet rs = st.executeQuery();
            rs.next();
            MarcaID =rs.getInt("idMARCAS");
            
        }catch(Exception e){
            throw e;
        
        }finally{
            this.CloseCnx();
        }
        
        try{
            this.MySQLCnx(asc);
            PreparedStatement st = this.Conexion.prepareStatement("INSERT INTO PRODUCTOS(NOMBRE,PRECIO_COMPRA,PRECIO_VENTA,idCATEGORIAS,idMARCAS) VALUES(?,?,?,?,?)");
            st.setString(1, pd.getNombre());
            st.setDouble(2, pd.getPrecio1());
            st.setDouble(3, pd.getPrecio2());
            st.setInt(4, CategoriaID);
            st.setInt(5, MarcaID);
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
    public List<Producto> ListarProductos(Rol asc) throws Exception {
        List<Producto> productos = null;
        Producto pd = new Producto();
        
        try{
            this.MySQLCnx(asc);
            PreparedStatement st = this.Conexion.prepareStatement("SELECT * FROM PRODUCTOS");
            
            productos = new ArrayList();
            ResultSet rs = st.executeQuery();
            
            while(rs.next()){
                pd.setId(rs.getInt("idCATEGORIAS"));
                pd.setNombre(rs.getString("NOMBRE"));
                pd.setPrecio1(rs.getDouble("PRECIO_COMPRA"));
                pd.setPrecio2(rs.getDouble("PRECIO_VENTA"));
                pd.setIdCategoria(rs.getInt("idCATEGORIAS"));
                pd.setIdMarca(rs.getInt("idMARCAS"));
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
    
    @Override
    public void CargaListProductos(List<Producto> pd) throws Exception {
        
        DefaultTableModel modelo = new DefaultTableModel();
        
        String[] ColumName = {"NOMBRE","PRECIO COMPRA","PRECIO VENTA","CATEGORIA","MARCA"};
        modelo.setColumnIdentifiers(ColumName);
        
        Object[] fila = new Object[modelo.getColumnCount()];
        
        for (int i = 0; i< pd.size(); i++){
            fila[0] = pd.get(i).getNombre();
            fila[1] = pd.get(i).getPrecio1();
            fila[2] = pd.get(i).getPrecio2();
            fila[3] = pd.get(i).getIdCategoria();
            fila[4] = pd.get(i).getIdMarca();
            modelo.addRow(fila);
        }
        
        TablaProducto.setModel(modelo);
    }
    
}
