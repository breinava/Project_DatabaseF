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
import modelo_dao.Usuario;
import modelo_hbm.Categorias;
import mysql_conexion.MySQL;
import mysql_conexion.Rol;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Expression;

/**
 *
 * @author breiner
 */

public class Oper_CategoriasP extends MySQL {
    
    public Categorias buscarCategoriasP(Integer idCategorias) throws Exception {
        
        Categorias ctp = null;
        SessionFactory sesion = null;
        Session sess = null;
        Transaction tx = null;
        
        try{
            sesion = NewHibernateUtil.getSessionFactory();
            sess = sesion.openSession();
            tx = sess.beginTransaction();
            ctp = (Categorias) sess.get(Categorias.class,idCategorias);
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
        
        return ctp;
    }
    
    public Categorias buscarCategoriasP(String nombre) throws Exception {
        Categorias ct = new  Categorias();
        Rol rol = new Rol("root","Soy Root NV.1");
        
        try {
            this.MySQLCnx(rol);
            PreparedStatement st = this.Conexion.prepareStatement("SELECT * FROM categorias WHERE NOMBRE = ?;");
            st.setString(1, nombre);
            ResultSet rs=st.executeQuery();
            
            rs.next();
            
            ct.setIdCategorias(rs.getInt(1));
            ct.setNombre(rs.getString(2));
            ct.setDescripcion(rs.getString(3));
            
            rs.close();
            st.close();
        } catch (SQLException ex) {
            Logger.getLogger(DAOUsuarioImpl.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            this.CloseCnx();
        }
        
        return ct;
    }
    
    public void actualizarCategoriasP(Categorias ctp, String dato) throws Exception {
        
        SessionFactory sesion = null;
        Session sess = null;
        Transaction tx = null;
        
        try{
            sesion = NewHibernateUtil.getSessionFactory();
            sess = sesion.openSession();
            tx = sess.beginTransaction();
            
            ctp.setNombre(dato);
            sess.saveOrUpdate(ctp);
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
    
    public List<Categorias> listarCategoriasP(){
        
        List<Categorias> categP = null;
        
        SessionFactory sesion = NewHibernateUtil.getSessionFactory();
        Session sess = sesion.openSession();
        sess.beginTransaction();
        
        categP = sess.createQuery("from Categorias").list();
         
        sess.close();
        
        return categP;
    }
    
    public List<Categorias> listarCategoriasP(String campo, String dato){
        
        List<Categorias> categP = null;
        
        SessionFactory sesion = NewHibernateUtil.getSessionFactory();
        Session sess = sesion.openSession();
        sess.beginTransaction();
        
        Criteria criteria = sess.createCriteria(Categorias.class);
        criteria.add(Expression.eq(campo, dato));
        criteria.setMaxResults(20);
        categP = criteria.list();
         
        sess.close();
        
        return categP;
    }
    
    public List<Categorias> listarCategoriasP(String campo, long dato){
        
        List<Categorias> categP = null;
        
        SessionFactory sesion = NewHibernateUtil.getSessionFactory();
        Session sess = sesion.openSession();
        sess.beginTransaction();
        
        Criteria criteria = sess.createCriteria(Categorias.class);
        criteria.add(Expression.eq(campo, dato));
        criteria.setMaxResults(20);
        categP = criteria.list();
         
        sess.close();
        
        return categP;
    }
}
