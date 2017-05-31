package modelo_dao;

/**
 *
 * @author breiner
 */

public class Usuario_Rol {
    
    private int idUsuarios_Roles;
    private int idRol;
    private int idUser;

    public Usuario_Rol(int idUsuarios_Roles, int idRol, int idUser) {
        this.idUsuarios_Roles = idUsuarios_Roles;
        this.idRol = idRol;
        this.idUser = idUser;
    }

    public int getIdUsuarios_Roles() {
        return idUsuarios_Roles;
    }

    public void setIdUsuarios_Roles(int idUsuarios_Roles) {
        this.idUsuarios_Roles = idUsuarios_Roles;
    }

    public int getIdRol() {
        return idRol;
    }

    public void setIdRol(int idRol) {
        this.idRol = idRol;
    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }
    
    
}
