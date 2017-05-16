package mysql_conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MySQL {
    
    public static Connection Conexion = null;
    
    
//Conectar a DB    
    public void MySQLCnx () throws SQLException{
        try{
            Class.forName("com.mysql.jdbc.Driver");
            
            String servidor = "jdbc:mysql://localhost:3306/proyecto_f";
            String user = "root";
            String pass = "olivo-320"; 
            
            Conexion = DriverManager.getConnection(servidor, user, pass);
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
