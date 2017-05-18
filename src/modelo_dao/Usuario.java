
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
    private String tipo;

    public Usuario() {
    }

    public Usuario(int idUsu, String usuario, String email, String pass, String tipo) {
        this.idUsu = idUsu;
        this.usuario = usuario;
        this.email = email;
        this.pass = pass;
        this.tipo = tipo;
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

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
}
