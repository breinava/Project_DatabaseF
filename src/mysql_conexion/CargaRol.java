package mysql_conexion;

/**
 *
 * @author breiner
 */

public class CargaRol {
    
    public Rol cargaR(String nombreR){
        Rol rol = new Rol();
        
        if(nombreR == "root"){
            rol.setIdRol(1);
            rol.setNombre("root");
            rol.setClave("Soy Root NV.1");
            
        }else if(nombreR == "admin"){
            rol.setIdRol(2);
            rol.setNombre("admin");
            rol.setClave("Soy Admin NV.2");
            
        }else if(nombreR == "cajero"){
            rol.setIdRol(3);
            rol.setNombre("cajero");
            rol.setClave("Soy Cajero NV.3");
        }
        
        return rol;
    }
}
