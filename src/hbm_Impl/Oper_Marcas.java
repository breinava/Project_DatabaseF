package hbm_Impl;

import dao_Impl.DAOUsuarioImpl;
import static java.awt.Frame.NORMAL;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modelo_hbm.Categorias;
import modelo_hbm.Marcas;
import mysql_conexion.MySQL;
import mysql_conexion.Rol;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Expression;

/**
 *
 * @author breiner
 */

public class Oper_Marcas extends MySQL {
    
        public Marcas buscarMarcas(Integer idMarcas) throws Exception {
        
        Marcas m = null;
        SessionFactory sesion = null;
        Session sess = null;
        Transaction tx = null;
        
        try{
            sesion = NewHibernateUtil.getSessionFactory();
            sess = sesion.openSession();
            tx = sess.beginTransaction();
            m = (Marcas) sess.get(Marcas.class,idMarcas);
            tx.commit();  
        
        }catch(Exception ex){
            if (tx != null) {
                tx.rollback();
            }
            System.err.println(ex);
            JOptionPane.showMessageDialog(null, "No se pudo ejecutar la busqueda","Busqueda Fallida",NORMAL);
        }finally{
            if(sess != null){
                sess.close();
            }
        } 
        
        return m;
    }
    
    public Marcas buscarMarca(String nombre) throws Exception {
        Marcas mc = new  Marcas();
        Rol rol = new Rol("root","Soy Root NV.1");
        
        try {
            this.MySQLCnx(rol);
            PreparedStatement st = this.Conexion.prepareStatement("SELECT * FROM marcas WHERE NOMBRE = ?;");
            st.setString(1, nombre);
            ResultSet rs=st.executeQuery();
            
            rs.next();
            
            mc.setIdMarcas(rs.getInt(1));
            mc.setNombre(rs.getString(2));
            
            rs.close();
            st.close();
        } catch (SQLException ex) {
            Logger.getLogger(DAOUsuarioImpl.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            this.CloseCnx();
        }
        
        return mc;
    }    
        
    public void actualizarMarca(Marcas m, String dato) throws Exception {
        
        SessionFactory sesion = null;
        Session sess = null;
        Transaction tx = null;
        
        try{
            sesion = NewHibernateUtil.getSessionFactory();
            sess = sesion.openSession();
            tx = sess.beginTransaction();
            
            m.setNombre(dato);
            sess.saveOrUpdate(m);
            tx.commit();
        
        }catch(Exception ex){
            if (tx != null) {
                tx.rollback();
            }
            System.err.println(ex);
            JOptionPane.showMessageDialog(null, "No se pudo actualizar","Actualización Fallida",NORMAL);
        }finally{
            if(sess != null){
                sess.close();
            }
        } 
        
    }
    
    public List<Marcas> listarMarcas(){
        
        List<Marcas> marcas = null;
        
        SessionFactory sesion = NewHibernateUtil.getSessionFactory();
        Session sess = sesion.openSession();
        sess.beginTransaction();
        
        marcas = sess.createQuery("from Marcas").list();
         
        sess.close();
        
        return marcas;
    }
    
    public List<Marcas> listarMarcas(String campo, String dato){
        
        List<Marcas> marcas = null;
        
        SessionFactory sesion = NewHibernateUtil.getSessionFactory();
        Session sess = sesion.openSession();
        sess.beginTransaction();
        
        Criteria criteria = sess.createCriteria(Marcas.class);
        criteria.add(Expression.eq(campo, dato));
        criteria.setMaxResults(20);
        marcas = criteria.list();
         
        sess.close();
        
        return marcas;
    }
    
    public List<Marcas> listarMarcas(String campo, long dato){
        
        List<Marcas> marcas = null;
        
        SessionFactory sesion = NewHibernateUtil.getSessionFactory();
        Session sess = sesion.openSession();
        sess.beginTransaction();
        
        Criteria criteria = sess.createCriteria(Marcas.class);
        criteria.add(Expression.eq(campo, dato));
        criteria.setMaxResults(20);
        marcas = criteria.list();
         
        sess.close();
        
        return marcas;
    }
}
