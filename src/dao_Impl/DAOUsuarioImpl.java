
package dao_Impl;

import interfaces_dao.DAOUsuario;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo_dao.Usuario;
import mysql_conexion.MySQL;

/**
 *
 * @author Jhoan
 */
public class DAOUsuarioImpl extends MySQL implements DAOUsuario {

    @Override
    public void registrarUsuario(Usuario u) {
        try {
            this.MySQLCnx();
            PreparedStatement st = this.Conexion.prepareStatement("CALL Registra_Usuarios(?,?,?,?);");
            st.setString(1,u.getUsuario() );
            st.setString(2, u.getEmail());
            st.setString(3, u.getPass());
            st.setBoolean(4, u.getEstado());
            st.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DAOUsuarioImpl.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            this.CloseCnx();
        }
    }

    @Override
    public void editarUsuario(Usuario u) {
        try {
            this.MySQLCnx();
            PreparedStatement st = this.Conexion.prepareStatement("UPDATE USUARIOS SET USUARIO =?, EMAIL =?, PASS=?, TIPO=? WHERE idUSERS=?;");
            st.setString(1,u.getUsuario() );
            st.setString(2, u.getEmail());
            st.setString(3, u.getPass());
            st.setBoolean(4, u.getEstado());
            st.setInt(1, u.getIdUsu());
            st.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DAOUsuarioImpl.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            this.CloseCnx();
        }
    }

    @Override
    public void eliminarUsuario(Usuario u) {
        try {
            this.MySQLCnx();
            PreparedStatement st = this.Conexion.prepareStatement("DELETE FROM USUARIOS WHERE idUSERS=?;");
            st.setInt(1, u.getIdUsu());
            st.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DAOUsuarioImpl.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            this.CloseCnx();
        }
    }

    @Override
    public List<Usuario> getUsuarios() {
        List<Usuario>usuarios=new ArrayList<>();
        try {
            this.MySQLCnx();
            PreparedStatement st = this.Conexion.prepareStatement("SELECT * FROM USUARIOS");
            ResultSet rs=st.executeQuery();
            while(rs.next()){
                Usuario u = new Usuario();
                u.setIdUsu(rs.getInt(1));
                u.setUsuario(rs.getString(2));
                u.setEmail(rs.getString(3));
                u.setPass(rs.getString(4));
                u.setEstado(rs.getBoolean(5));
                usuarios.add(u);
            }
            rs.close();
            st.close();
        } catch (SQLException ex) {
            Logger.getLogger(DAOUsuarioImpl.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            this.CloseCnx();
        }
        return usuarios;
    }

    @Override
    public String desencriptar(Usuario u) {
        
        String clave = "";
        
        try {
            this.MySQLCnx();
            PreparedStatement st = this.Conexion.prepareStatement("SELECT Desencriptar_Clave(?) AS CLAVE;");
            st.setString(1, u.getUsuario());
            
            ResultSet rs=st.executeQuery();
            rs.next();
            
            clave = rs.getString("CLAVE");
            
            rs.close();
            st.close();
        } catch (SQLException ex) {
            Logger.getLogger(DAOUsuarioImpl.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            this.CloseCnx();
        }        
        return clave;
    }

    @Override
    public Usuario buscarUsuario(String usr) {
        Usuario u = new  Usuario();
        
        try {
            this.MySQLCnx();
            PreparedStatement st = this.Conexion.prepareStatement("SELECT * FROM USUARIOS WHERE USUARIO = ?;");
            st.setString(1, usr);
            ResultSet rs=st.executeQuery();
            rs.next();
            
            u.setIdUsu(rs.getInt(1));
            u.setUsuario(rs.getString(2));
            u.setEmail(rs.getString(3));
            u.setPass(rs.getString(4));
            u.setEstado(rs.getBoolean(5));
            
            rs.close();
            st.close();
        } catch (SQLException ex) {
            Logger.getLogger(DAOUsuarioImpl.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            this.CloseCnx();
        }
        
        
        return u;
    }
    
}
