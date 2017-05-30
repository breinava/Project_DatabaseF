/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import mysql_conexion.MySQL;
import mysql_conexion.Rol;

/**
 *
 * @author Johan
 */
public class ObtenerVistaCategorias extends MySQL {
    
    public List<VistaCategorias> obtenerVista(Rol asc){
        
        Statement stm= null;
        ResultSet rs=null;
        List<VistaCategorias> vistaC = new ArrayList<>();
        String sql ="select * from numproduc_categorias;";
        try {
            this.MySQLCnx(asc);
            PreparedStatement st = this.Conexion.prepareStatement("select * from numproduc_categorias;");
            stm=this.Conexion.createStatement();         
            //rs = st.executeQuery();
            rs=stm.executeQuery(sql);
            while(rs.next()){
                VistaCategorias vi = new VistaCategorias();
                vi.setCategoria(rs.getString(1));
                vi.setCantidad(rs.getInt(2));
                vistaC.add(vi);
            }
            rs.close();
            st.close();
            stm.close();
        } catch (SQLException ex) {
            Logger.getLogger(ObtenerVistaCategorias.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            this.CloseCnx();
        }
        return vistaC;
        
    }
    
}
