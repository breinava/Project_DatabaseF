package validaciones;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import modelo_dao.Usuario;
import mysql_conexion.MySQL;
import mysql_conexion.Rol;

/**
 *
 * @author breiner
 */

public class RegistroUser extends MySQL{
    
    public int validaUsuario(Usuario u, Rol r){
        int sw1=0;
        
        try {
            this.MySQLCnx(r);
            PreparedStatement st = this.Conexion.prepareStatement("SELECT * FROM usuarios WHERE USUARIO =?;");
            st.setString(1, u.getUsuario());
            
            ResultSet rs = st.executeQuery();
            
            if(rs.next()){
                sw1 = 1;
            }
            
            this.CloseCnx();
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e, "Error de conexion", JOptionPane.ERROR_MESSAGE);
        }        
        
        return sw1;
    }
    
    public int validaEmail(Usuario u, Rol r){
        int sw2 =0;

        try {
            this.MySQLCnx(r);
            PreparedStatement st = this.Conexion.prepareStatement("SELECT * FROM usuarios WHERE EMAIL =?;");
            st.setString(1, u.getEmail());
            
            ResultSet rs = st.executeQuery();
            
            if(rs.next()){
                sw2 = 1;
            }
            
            this.CloseCnx();
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e, "Error de conexion", JOptionPane.ERROR_MESSAGE);
        }        
        
        return sw2;
    }
}
