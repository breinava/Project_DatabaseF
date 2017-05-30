/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import mysql_conexion.MySQL;
import mysql_conexion.Rol;

/**
 *
 * @author Jhoan
 */
public class ObtenerVistaProveedor extends MySQL {
    
    
    public List<ProveedorProductosEntregados> obtenerLista(Rol asc){
      List<ProveedorProductosEntregados> lista = new ArrayList<>();

        try {
            this.MySQLCnx( asc);
            PreparedStatement st = this.Conexion.prepareStatement("select * from cantidad_de_producto_por_proveedor;");
            ResultSet rt=st.executeQuery();
            
            while(rt.next()){
                ProveedorProductosEntregados pd = new ProveedorProductosEntregados();
                pd.setProveedor(rt.getString(1));
                pd.setNum_productos_entregados(rt.getInt(2));
                lista.add(pd);
            }
            rt.close();
            st.close();
        } catch (SQLException ex) {
            Logger.getLogger(ObtenerVistaProveedor.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return lista;
    }
}
