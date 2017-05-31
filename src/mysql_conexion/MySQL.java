package mysql_conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MySQL {
    
    public static Connection Conexion = null;
    
//Conectar a DB    
    public void MySQLCnx (Rol asc) throws SQLException{
        try{
            Class.forName("com.mysql.jdbc.Driver");
            
            String servidor = "jdbc:mysql://localhost:3306/Project_Database";
            //String user = "cajero";
            //String pass = "Soy Cajero 1.0"; 
            
            Conexion = DriverManager.getConnection(servidor, asc.getNombre(), asc.getClave());
            System.out.println("Conexion establecida...");
            
            
        }catch(ClassNotFoundException ex){
            Logger.getLogger(MySQL.class.getName()).log(Level.SEVERE, null, ex);
        }catch(SQLException ex){
            Logger.getLogger(MySQL.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

//Cerrar la conexion    
    public void CloseCnx(){
        try{
            Conexion.close();
            System.out.println("Conexion finalizada...");
        }catch(SQLException ex){
            Logger.getLogger(MySQL.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
  
}
