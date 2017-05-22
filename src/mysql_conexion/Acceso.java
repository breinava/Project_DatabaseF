package mysql_conexion;

/**
 *
 * @author breiner
 */

public class Acceso {
    
    private static String user;
    private static String pass;

    public Acceso(){
    }
    
    public Acceso(String user, String pass) {
        this.user = user;
        this.pass = pass;
    }
    
    
    public static String getUser() {
        return user;
    }

    public static void setUser(String user) {
        Acceso.user = user;
    }

    public static String getPass() {
        return pass;
    }

    public static void setPass(String pass) {
        Acceso.pass = pass;
    }
    
}
