
package dao;

import interfaces.DAOUser;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.User;
import mysql_conexion.MySQL;

/**
 *
 * @author Jhoan
 */
public class DAOUserImpl extends MySQL implements DAOUser {

    @Override
    public void registrarUsuario(User u) {
        try {
            this.MySQLCnx();
            PreparedStatement st = this.Conexion.prepareStatement("INSERT INTO USUARIOS VALUES(?,?,?,?,?);");
            st.setInt(1, u.getIdUser());
            st.setString(2, u.getUsuario());
            st.setString(3, u.getCorreo());
            st.setString(4, u.getPass());
            st.setString(5, u.getTipo());
            st.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DAOUserImpl.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            this.CloseCnx();
        }
        
    }

    @Override
    public void editarUsuario(User u) {
        try {
            this.MySQLCnx();
            PreparedStatement st = this.Conexion.prepareStatement("UPDATE USUARIOS SET USUARIO = ?,"
                    + "EMAIL=?, PASS=?, TIPO = ? WHERE idUSERS =?;");
            st.setString(1, u.getUsuario());
            st.setString(2, u.getCorreo());
            st.setString(3, u.getPass());
            st.setString(4, u.getTipo());
            st.setInt(5, u.getIdUser());
            st.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DAOUserImpl.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            this.CloseCnx();
        }
    }

    @Override
    public void borrarUsuario(User u) {
        try {
           this.MySQLCnx();
            PreparedStatement st =this.Conexion.prepareStatement("DELETE FROM USUARIOS WHERE idUSERS = ?");
            st.setInt(1, u.getIdUser());
            st.executeUpdate();
        }catch (SQLException ex) {
           Logger.getLogger(DAOUserImpl.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
           this.CloseCnx();
        }
    }

    @Override
    public List<User> getUsuarios() {
        List<User> usuarios = new ArrayList<>();
        try {
            this.MySQLCnx();
            PreparedStatement st = this.Conexion.prepareStatement("SELECT * FROM USUARIOS");
            ResultSet rs = st.executeQuery();
            while(rs.next()){
                User u = new User();
                u.setIdUser(rs.getInt(1));
                u.setUsuario(rs.getString(2));
                u.setCorreo(rs.getString(3));
                u.setPass(rs.getString(4));
                u.setTipo(rs.getString(5));
                usuarios.add(u);
            }
           rs.close();
           st.close();
        } catch (SQLException ex) {
            Logger.getLogger(DAOUserImpl.class.getName()).log(Level.SEVERE, null, ex);
        } finally{
            this.CloseCnx();
        }
        
        return usuarios;
    }
    
}
