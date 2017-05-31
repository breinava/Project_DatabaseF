package dao_Impl;

import interfaces_dao.DAOUsuario_Rol;
import static java.awt.Frame.NORMAL;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import modelo_dao.Usuario;
import modelo_dao.Usuario_Rol;
import mysql_conexion.MySQL;
import mysql_conexion.Rol;
import static org.hibernate.criterion.Order.asc;

/**
 *
 * @author breiner
 */

public class DAOUsuario_RolImpl extends MySQL implements DAOUsuario_Rol{

    @Override
    public void RegistrarUsuarioR(Usuario u, Rol r) throws Exception {
        int UsuarioID = 0;
        
        try{
            this.MySQLCnx(r);
            PreparedStatement st = this.Conexion.prepareStatement("SELECT * FROM USUARIOS WHERE USUARIO = ?;");
            st.setString(1, u.getUsuario());
            
            ResultSet rs = st.executeQuery();
            rs.next();
            UsuarioID =rs.getInt("idUSERS");
            
        }catch(Exception e){
            throw e;
        
        }finally{
            this.CloseCnx();
        }
        
        try{
            this.MySQLCnx(r);
            PreparedStatement st = this.Conexion.prepareStatement("INSERT INTO USUARIOS_ROLES VALUES(idUSUARIOS_ROLES,?,?);");
            st.setInt(1, r.getIdRol());
            st.setInt(2, UsuarioID);
            st.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Usuario Registrado Correctamente");
        }catch(Exception e){
            throw e;
        
        }finally{
            this.CloseCnx();
        }
    }
    
}
