package hbm_Impl;

import javax.swing.JOptionPane;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author breiner
 */

public class OperacionesGeneral {

    public void insertar(Object obj){
        
        SessionFactory sesion = NewHibernateUtil.getSessionFactory();
        Session sess;
        sess = sesion.openSession();
        Transaction tx = sess.beginTransaction();
        sess.save(obj);
        tx.commit();
        sess.close();
        JOptionPane.showMessageDialog(null, "Insertado correctamente..");
                
    }
    
    public void eliminar(Object obj){
        
        SessionFactory sesion = NewHibernateUtil.getSessionFactory();
        Session sess;
        sess = sesion.openSession();
        Transaction tx = sess.beginTransaction();
        sess.delete(obj);
        tx.commit();
        sess.close();
        JOptionPane.showMessageDialog(null, "Eliminado correctamente..");
    }
   
}
