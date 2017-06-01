package dao_Impl;

import Vistas.DetalleFactura;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import modelo_hbm.Productos;
import mysql_conexion.MySQL;
import mysql_conexion.Rol;
import static ventanas.VProductos.TablaProducto;
import static ventanas.VVenta.TablaFactura;

/**
 *
 * @author breiner
 */

public class DetalleFacturaImpl extends MySQL {
    
    public List<DetalleFactura> ListarFacturaD() throws Exception {
        List<DetalleFactura> listaDetalles = null;
        Rol asc = new Rol("root","Soy Root NV.1");
        DetalleFactura dfact = new DetalleFactura();
        
        //Almacen alm = new Almacen();
        
        try{
            this.MySQLCnx(asc);
            PreparedStatement st = this.Conexion.prepareStatement("SELECT * FROM detallefactura");
            
            listaDetalles = new ArrayList();
            ResultSet rs = st.executeQuery();
            
            while(rs.next()){
                
                dfact.setNumFactura(rs.getInt("Facutra"));
                dfact.setNombre(rs.getString("Nombre"));
                dfact.setNombre(rs.getString("Apellido"));
                dfact.setProducto(rs.getString("Productos"));
                dfact.setPrecio(rs.getDouble("precio"));
                dfact.setCantidad(rs.getInt("Cantidad"));
                
                listaDetalles.add(dfact);
            }
            rs.close();
            st.close();
            
        }catch(Exception e){
            throw e;
        
        }finally{
            this.CloseCnx();
        }
        
        return listaDetalles;
    }
    
    public void cargaListFacturaD(List<DetalleFactura> facturas){
        
        DefaultTableModel modelo = new DefaultTableModel();
        
        String[] ColumName = {"No. FACTURA","NOMBRE","APELLIDO","PRODUCTO","PRECIO","CANTIDAD"};
        modelo.setColumnIdentifiers(ColumName);
        
        Object[] fila = new Object[modelo.getColumnCount()];
        
        for (int i = 0; i< facturas.size(); i++){
            
            fila[0] = facturas.get(i).getNumFactura();
            fila[1] = facturas.get(i).getNombre();
            fila[2] = facturas.get(i).getApellido();
            fila[3] = facturas.get(i).getProducto();
            fila[4] = facturas.get(i).getPrecio();
            fila[5] = facturas.get(i).getCantidad();
            modelo.addRow(fila);
        }
        
        TablaFactura.setModel(modelo);
    }
}
