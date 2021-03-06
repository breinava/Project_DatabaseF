package hbm_Impl;

import static java.awt.Frame.NORMAL;
import javax.swing.JOptionPane;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author breiner
 */

public class Oper_Generales {
    
    public void Insertar(Object obj) throws Exception{
        
        SessionFactory sesion = null;
        Session sess = null;
        Transaction tx = null;
        
        try{
            sesion = NewHibernateUtil.getSessionFactory();
            sess = sesion.openSession();
            tx = sess.beginTransaction();
            sess.save(obj);
            tx.commit();
            
            JOptionPane.showMessageDialog(null, "Insertado Correctameente");
        
        }catch(Exception ex){
            System.err.println(ex);
            JOptionPane.showMessageDialog(null, "Error Insercion..","Iserción Fallida", NORMAL);
        }finally{
            if(sess != null){
                sess.close();
            }
        }
    }
    
    public void eliminar(Object obj) throws Exception {
        
        SessionFactory sesion = null;
        Session sess = null;
        Transaction tx = null;
        
        try{
            sesion = NewHibernateUtil.getSessionFactory();
            sess = sesion.openSession();
            tx = sess.beginTransaction();
            
            if(obj != null){
                sess.delete(obj);
                tx.commit();
                
                JOptionPane.showMessageDialog(null, "Eliminado Correctamente");
            
            }else{
                JOptionPane.showMessageDialog(null, "No se encontro nada que eliminar","Eliminacion Fallida",NORMAL);
            }

        }catch(Exception ex){
            if (tx != null) {
                tx.rollback();
            }
            System.err.println(ex);
            JOptionPane.showMessageDialog(null, "No se pudo eliminar","Eliminacion Fallida",NORMAL);
        }finally{
            if(sess != null){
                sess.close();
            }
        }        
    }
}
