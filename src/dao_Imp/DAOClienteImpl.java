package dao_Imp;

import interfaces_dao.DAOCliente;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import modelo_dao.Cliente;
import mysql_conexion.MySQL;


public class DAOClienteImpl extends MySQL implements DAOCliente{

    @Override
    public void RegistrarCliente(Cliente cl) throws Exception {
        try{
            
            this.MySQLCnx();
            PreparedStatement st = this.Conexion.prepareStatement("INSERT INTO CLIENTES VALUES(?,?,?,?,?)");
            st.setString(1, cl.getDni());
            st.setString(2, cl.getNombre());
            st.setString(3, cl.getApellidos());
            st.setString(4, cl.getTelefono());
            st.setString(5, cl.getEmail());
            st.executeUpdate();
            
        }catch(Exception e){
            throw e;
        
        }finally{
            this.CloseCnx();
        }
    }

    @Override
    public void ModificarCliente(Cliente cl) throws Exception {
        try{
            
            this.MySQLCnx();
            PreparedStatement st = this.Conexion.prepareStatement("UPDATE CLIENTES SET NOMBRE = ? WHERE DNI = ?");
            st.setString(2, cl.getNombre());
            st.setString(1, cl.getDni());
            
        }catch(Exception e){
            throw e;
        
        }finally{
            this.CloseCnx();
        }
    }

    @Override
    public void EliminarCliente(Cliente cl) throws Exception {
        try{
            
            this.MySQLCnx();
            PreparedStatement st = this.Conexion.prepareStatement("DELETE FROM CLIENTES WHERE DNI = ?");
            st.setString(2, cl.getNombre());
            st.setString(1, cl.getDni());
            
        }catch(Exception e){
            throw e;
        
        }finally{
            this.CloseCnx();
        }
    }

    @Override
    public List<Cliente> ListarClientes(Cliente cl) throws Exception {
        List<Cliente> lista;
        
        try{
            this.MySQLCnx();
            PreparedStatement st = this.Conexion.prepareStatement("SELECT * FROM ALMACEN");
            
            lista = new ArrayList();
            ResultSet rs = st.executeQuery();
            
            while(rs.next()){
                Cliente c = new Cliente();
                c.setDni(rs.getString("DNI"));
                c.setNombre(rs.getString("NOMBRE"));
                c.setApellidos(rs.getString("APELLIDOS"));
                c.setTelefono(rs.getString("TELEFONO"));
                c.setEmail(rs.getString("EMAIL"));
                lista.add(c);
            }
            rs.close();
            st.close();
            
        }catch(Exception e){
            throw e;
        
        }finally{
            this.CloseCnx();
        }
        
        return lista;
    }
    
}
