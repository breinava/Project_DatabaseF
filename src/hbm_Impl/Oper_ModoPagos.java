package hbm_Impl;

import static java.awt.Frame.NORMAL;
import java.util.List;
import javax.swing.JOptionPane;
import modelo_hbm.ModoPago;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Expression;

/**
 *
 * @author breiner
 */

public class Oper_ModoPagos extends Oper_Generales {
    
    public ModoPago buscarModoPago(Integer idModoPago) throws Exception {
        
        ModoPago mp = null;
        SessionFactory sesion = null;
        Session sess = null;
        Transaction tx = null;
        
        try{
            sesion = NewHibernateUtil.getSessionFactory();
            sess = sesion.openSession();
            tx = sess.beginTransaction();
            mp = (ModoPago) sess.get(ModoPago.class,idModoPago);
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
        
        return mp;
    }
    
    public void actualizarModoPago(ModoPago mp, String dato) throws Exception {
        
        SessionFactory sesion = null;
        Session sess = null;
        Transaction tx = null;
        
        try{
            sesion = NewHibernateUtil.getSessionFactory();
            sess = sesion.openSession();
            tx = sess.beginTransaction();
            
            mp.setNombre(dato);
            sess.saveOrUpdate(mp);
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
    
    public List<ModoPago> listarModoPagos(){
        
        List<ModoPago> modosP = null;
        
        SessionFactory sesion = NewHibernateUtil.getSessionFactory();
        Session sess = sesion.openSession();
        sess.beginTransaction();
        
        modosP = sess.createQuery("from ModoPago").list();
         
        sess.close();
        
        return modosP;
    }
    
    public List<ModoPago> listarModoPagos(String campo, String dato){
        
        List<ModoPago> modosP = null;
        
        SessionFactory sesion = NewHibernateUtil.getSessionFactory();
        Session sess = sesion.openSession();
        sess.beginTransaction();
        
        Criteria criteria = sess.createCriteria(ModoPago.class);
        criteria.add(Expression.eq(campo, dato));
        criteria.setMaxResults(20);
        modosP = criteria.list();
         
        sess.close();
        
        return modosP;
    }
    
        public List<ModoPago> listarModoPagos(String campo, long dato){
        
        List<ModoPago> modosP = null;
        
        SessionFactory sesion = NewHibernateUtil.getSessionFactory();
        Session sess = sesion.openSession();
        sess.beginTransaction();
        
        Criteria criteria = sess.createCriteria(ModoPago.class);
        criteria.add(Expression.eq(campo, dato));
        criteria.setMaxResults(20);
        modosP = criteria.list();
         
        sess.close();
        
        return modosP;
    }
}
