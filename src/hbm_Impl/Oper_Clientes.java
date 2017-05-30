package hbm_Impl;

import static java.awt.Frame.NORMAL;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import modelo_hbm.Clientes;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Expression;
import org.hibernate.sql.ordering.antlr.Factory;

/**
 *
 * @author breiner
 */

public class Oper_Clientes extends OperacionesGeneral{
    
    public Clientes buscarCliente(long dni) throws Exception {
        
        Clientes clt = null;
        SessionFactory sesion = null;
        Session sess = null;
        Transaction tx = null;
        
        try{
            sesion = NewHibernateUtil.getSessionFactory();
            sess = sesion.openSession();
            tx = sess.beginTransaction();
            clt = (Clientes) sess.get(Clientes.class,dni);
            tx.commit();  
        
        }catch(Exception ex){
            if (tx != null) {
                tx.rollback();
            }
            JOptionPane.showMessageDialog(null, "No se pudo ejecutar la busqueda","Busqueda Fallida",NORMAL);
            System.err.println(ex);
        }finally{
            if(sess != null){
                sess.close();
            }
        } 
        
        return clt;
    }
    
    public void actualizarCliente(Clientes cl, String dato) throws Exception {
        
        SessionFactory sesion = null;
        Session sess = null;
        Transaction tx = null;
        
        try{
            sesion = NewHibernateUtil.getSessionFactory();
            sess = sesion.openSession();
            tx = sess.beginTransaction();
            
            cl.setNombre(dato);
            sess.saveOrUpdate(cl);
            tx.commit();
        
        }catch(Exception ex){
            if (tx != null) {
                tx.rollback();
            }
            JOptionPane.showMessageDialog(null, "No se pudo actualizar","Actualización Fallida",NORMAL);
            System.err.println(ex);
        }finally{
            if(sess != null){
                sess.close();
            }
        } 
        
    }
    
    public List<Clientes> listarClientes(){
        
        List<Clientes> clients = null;
        Clientes clt = new Clientes();
        
        SessionFactory sesion = NewHibernateUtil.getSessionFactory();
        Session sess;
        sess = sesion.openSession();
        Transaction tx = sess.beginTransaction();
        
        clients = sess.createQuery("FROM CLIENTES").list();
        
        tx.commit();
        sess.close();
        
        return clients;
    }
}
