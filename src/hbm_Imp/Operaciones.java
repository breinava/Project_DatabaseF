/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hbm_Imp;

import javax.swing.JOptionPane;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author breiner
 */
public class Operaciones {

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
    /*
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
    }*/    
}
