package modelo_hbm;
// Generated 18-may-2017 15:31:17 by Hibernate Tools 4.3.1



/**
 * UsuariosRoles generated by hbm2java
 */
public class UsuariosRoles  implements java.io.Serializable {


     private UsuariosRolesId id;
     private Roles roles;
     private Usuarios usuarios;

    public UsuariosRoles() {
    }

    public UsuariosRoles(UsuariosRolesId id, Roles roles, Usuarios usuarios) {
       this.id = id;
       this.roles = roles;
       this.usuarios = usuarios;
    }
   
    public UsuariosRolesId getId() {
        return this.id;
    }
    
    public void setId(UsuariosRolesId id) {
        this.id = id;
    }
    public Roles getRoles() {
        return this.roles;
    }
    
    public void setRoles(Roles roles) {
        this.roles = roles;
    }
    public Usuarios getUsuarios() {
        return this.usuarios;
    }
    
    public void setUsuarios(Usuarios usuarios) {
        this.usuarios = usuarios;
    }




}

