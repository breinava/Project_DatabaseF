package hbm_Impl;

import javax.swing.JOptionPane;
import modelo_hbm.Clientes;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author breiner
 */

public class Oper_Clientes extends OperacionesGeneral{
    
    public Clientes buscarCliente(Integer dni){
        
        Clientes clt;
        SessionFactory sesion = NewHibernateUtil.getSessionFactory();
        Session sess;
        sess = sesion.openSession();
        Transaction tx = sess.beginTransaction();
        clt = (Clientes) sess.get(Clientes.class,dni);
        tx.commit();
        sess.close();
        
        return clt;
    }
    
    public void actualizarCliente(Clientes cl, String dato){
        
        SessionFactory sesion = NewHibernateUtil.getSessionFactory();
        Session sess;
        sess = sesion.openSession();
        Transaction tx = sess.beginTransaction();
        cl.setNombre(dato);
        sess.update(cl);
        tx.commit();
        sess.close();
        JOptionPane.showMessageDialog(null, "Actualizado correctamente..");
    }
}
