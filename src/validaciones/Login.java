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


public class Login extends MySQL{

    public int validaLogin(Usuario u, Rol r){
        
        int sw = 0;

        try {
            this.MySQLCnx(r);
            PreparedStatement st = this.Conexion.prepareStatement("SELECT * FROM VIEW_USER_ROL WHERE USUARIO =? AND EMAIL =? AND CLAVE_USER =? AND NOMBRE =? AND CLAVE_ROL =?;");
            st.setString(1, u.getUsuario());
            st.setString(2, u.getEmail());
            st.setString(3, u.getPass());
            st.setString(4, r.getNombre());
            st.setString(5, r.getClave());
            
            ResultSet rs = st.executeQuery();
            
            if(rs.next()){
                sw = 1;
            }
            
            this.CloseCnx();
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e, "Error de conexion", JOptionPane.ERROR_MESSAGE);
        }
        
        return sw;
    }
}
