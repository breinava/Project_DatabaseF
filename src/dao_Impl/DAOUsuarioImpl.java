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
import mysql_conexion.Rol;
import mysql_conexion.MySQL;

/**
 *
 * @author Jhoan
 * @author Breiner
 */

public class DAOUsuarioImpl extends MySQL implements DAOUsuario {
    
    @Override
    public void RegistrarUsuario(Usuario u, Rol asc) throws Exception {
        Rol rl = new Rol("admin","Soy Admin NV.2");
        try {
            this.MySQLCnx(rl);
            PreparedStatement st = this.Conexion.prepareStatement("CALL Registra_Usuarios(?,?,?);");
            st.setString(1,u.getUsuario() );
            st.setString(2, u.getEmail());
            st.setString(3, u.getPass());
            st.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DAOUsuarioImpl.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            this.CloseCnx();
        }
    }

    @Override
    public void ModificarUsuario(Usuario u, Rol asc) throws Exception {
        Rol rl = new Rol("admin","Soy Admin NV.2");
        try {
            this.MySQLCnx(rl);
            PreparedStatement st = this.Conexion.prepareStatement("UPDATE usuarios SET USUARIO =?, EMAIL =?, PASS=? WHERE idUSERS=?;");
            st.setString(1,u.getUsuario() );
            st.setString(2, u.getEmail());
            st.setString(3, u.getPass());
            st.setInt(1, u.getIdUsu());
            st.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DAOUsuarioImpl.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            this.CloseCnx();
        }
    }

    @Override
    public void EliminarUsuario(Usuario u, Rol asc) throws Exception {
        try {
            this.MySQLCnx(asc);
            PreparedStatement st = this.Conexion.prepareStatement("DELETE FROM usuarios WHERE idUSERS=?;");
            st.setInt(1, u.getIdUsu());
            st.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DAOUsuarioImpl.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            this.CloseCnx();
        }
    }

    @Override
    public List<Usuario> ListarUsuarios(Rol asc) throws Exception {
        List<Usuario> usuarios = null;
        Usuario u = new Usuario();
        
        try {
            this.MySQLCnx(asc);
            PreparedStatement st = this.Conexion.prepareStatement("SELECT * FROM usuarios");
            
            usuarios = new ArrayList();
            ResultSet rs=st.executeQuery();
            
            while(rs.next()){
                u.setIdUsu(rs.getInt(1));
                u.setUsuario(rs.getString(2));
                u.setEmail(rs.getString(3));
                u.setPass(rs.getString(4));
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
    public String Desencriptar(Usuario u, Rol asc) throws Exception {
        
        String clave = "";
        
        try {
            this.MySQLCnx(asc);
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
    public Usuario BuscarUsuario(String usr, Rol asc) throws Exception {
        Usuario u = new  Usuario();
        
        try {
            this.MySQLCnx(asc);
            PreparedStatement st = this.Conexion.prepareStatement("SELECT * FROM usuarios WHERE USUARIO = ?;");
            st.setString(1, usr);
            ResultSet rs=st.executeQuery();
            
            rs.next();
            
            u.setIdUsu(rs.getInt(1));
            u.setUsuario(rs.getString(2));
            u.setEmail(rs.getString(3));
            u.setPass(rs.getString(4));
            
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
