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
 * @author jhoan
 */
public class ObtenerGananciaXCategoria extends MySQL {
    
    public List<GananciaCategoria> obtenerGanancia(Rol asc){
        List<GananciaCategoria>ganancia=new ArrayList<>();
        Statement stm= null;
        ResultSet rs=null;
        String sql ="select * from gananciaxcategoria;";
        
        try {
            this.MySQLCnx(asc);
            stm=this.Conexion.createStatement();
            rs=stm.executeQuery(sql);
            while(rs.next()){
                GananciaCategoria gana= new GananciaCategoria();
                gana.setCategoria(rs.getString(1));
                gana.setGanacia(rs.getInt(2));
                ganancia.add(gana);
            }
            rs.close();
            stm.close();
        } catch (SQLException ex) {
            Logger.getLogger(ObtenerGananciaXCategoria.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            this.CloseCnx();
        }
        
        return ganancia;
    }
}
