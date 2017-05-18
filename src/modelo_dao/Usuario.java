
package modelo_dao;

/**
 *
 * @author Jhoan
 */
public class Usuario {
    
    private int idUsu;
    private String usuario;
    private String email;
    private String pass;
    private boolean estado;

    public Usuario() {
    }

    public Usuario(int idUsu, String usuario, String email, String pass, boolean estado) {
        this.idUsu = idUsu;
        this.usuario = usuario;
        this.email = email;
        this.pass = pass;
        this.estado = estado;
    }

    public int getIdUsu() {
        return idUsu;
    }

    public void setIdUsu(int idUsu) {
        this.idUsu = idUsu;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public boolean getEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    
}
