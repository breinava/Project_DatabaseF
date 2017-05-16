
package modelo;

/**
 *
 * @author Jhoan
 */
public class User {
    private int idUser;
    private String usuario;
    private String correo;
    private String pass;
    private String tipo;

    public User() {
    }

    public User(int idUser, String usuario, String correo, String pass, String tipo) {
        this.idUser = idUser;
        this.usuario = usuario;
        this.correo = correo;
        this.pass = pass;
        this.tipo = tipo;
    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    
    
    
}
