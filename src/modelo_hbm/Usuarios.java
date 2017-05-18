package modelo_hbm;
// Generated 18-may-2017 15:31:17 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Usuarios generated by hbm2java
 */
public class Usuarios  implements java.io.Serializable {


     private Integer idUsers;
     private String usuario;
     private String email;
     private String pass;
     private boolean estado;
     private Set empleadoses = new HashSet(0);
     private Set usuariosRoleses = new HashSet(0);

    public Usuarios() {
    }

	
    public Usuarios(String usuario, String email, String pass, boolean estado) {
        this.usuario = usuario;
        this.email = email;
        this.pass = pass;
        this.estado = estado;
    }
    public Usuarios(String usuario, String email, String pass, boolean estado, Set empleadoses, Set usuariosRoleses) {
       this.usuario = usuario;
       this.email = email;
       this.pass = pass;
       this.estado = estado;
       this.empleadoses = empleadoses;
       this.usuariosRoleses = usuariosRoleses;
    }
   
    public Integer getIdUsers() {
        return this.idUsers;
    }
    
    public void setIdUsers(Integer idUsers) {
        this.idUsers = idUsers;
    }
    public String getUsuario() {
        return this.usuario;
    }
    
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPass() {
        return this.pass;
    }
    
    public void setPass(String pass) {
        this.pass = pass;
    }
    public boolean isEstado() {
        return this.estado;
    }
    
    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    public Set getEmpleadoses() {
        return this.empleadoses;
    }
    
    public void setEmpleadoses(Set empleadoses) {
        this.empleadoses = empleadoses;
    }
    public Set getUsuariosRoleses() {
        return this.usuariosRoleses;
    }
    
    public void setUsuariosRoleses(Set usuariosRoleses) {
        this.usuariosRoleses = usuariosRoleses;
    }




}


