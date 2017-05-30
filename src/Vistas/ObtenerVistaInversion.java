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
public class ObtenerVistaInversion extends MySQL {
    
   public  List<VistaInversioPedido> obtenerVista(Rol asc){
        List<VistaInversioPedido> vista = new ArrayList<>();
        try {
            this.MySQLCnx(asc);
            PreparedStatement st = this.Conexion.prepareStatement("select * from vista_inversion;");
            ResultSet rs = st.executeQuery();
            while(rs.next()){
                VistaInversioPedido v= new VistaInversioPedido();
                v.setProveedores(rs.getString(1));
                v.setInversion(rs.getInt(2));
                vista.add(v);
            }
            rs.close();
            st.close();
        } catch (SQLException ex) {
            Logger.getLogger(ObtenerVistaInversion.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return vista;
    }
}
