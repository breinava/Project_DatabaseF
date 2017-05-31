package hbm_Impl;

import static java.awt.Frame.NORMAL;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo_hbm.Clientes;
import org.hibernate.Criteria;
import org.hibernate.Hibernate;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Expression;
import org.hibernate.sql.ordering.antlr.Factory;
import static ventanas.VCliente.Box_BuscarC;
import static ventanas.VCliente.TablaCliente;

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
        
        SessionFactory sesion = NewHibernateUtil.getSessionFactory();
        Session sess = sesion.openSession();
        sess.beginTransaction();
        
        clients = sess.createQuery("from Clientes").list();
         
        sess.close();
        
        return clients;
    }

    public List<Clientes> listarClientes(String campo, String dato){
        
        List<Clientes> clients = null;
        
        SessionFactory sesion = NewHibernateUtil.getSessionFactory();
        Session sess = sesion.openSession();
        sess.beginTransaction();
        
        Criteria criteria = sess.createCriteria(Clientes.class);
        criteria.add(Expression.eq(campo, dato));
        criteria.setMaxResults(20);
        clients = criteria.list();
         
        sess.close();
        
        return clients;
    }
    
    public List<Clientes> listarClientes(String campo, long dato){
        
        List<Clientes> clients = null;
        
        SessionFactory sesion = NewHibernateUtil.getSessionFactory();
        Session sess = sesion.openSession();
        sess.beginTransaction();
        
        Criteria criteria = sess.createCriteria(Clientes.class);
        criteria.add(Expression.eq(campo, dato));
        criteria.setMaxResults(20);
        clients = criteria.list();
         
        sess.close();
        
        return clients;
    }
    
    public void cargaListClientes(List<Clientes> clts){
        
        DefaultTableModel modelo = new DefaultTableModel();
        
        String[] ColumName = {"DNI","NOMBRE","APELLIDOS","TELEFONO","EMAIL"};
        modelo.setColumnIdentifiers(ColumName);
        
        Object[] fila = new Object[modelo.getColumnCount()];
        
        for (int i = 0; i< clts.size(); i++){
            fila[0] = clts.get(i).getDni();
            fila[1] = clts.get(i).getNombre();
            fila[2] = clts.get(i).getApellidos();
            fila[3] = clts.get(i).getTelefono();
            fila[4] = clts.get(i).getEmail();
        
            modelo.addRow(fila);
        }
        
        TablaCliente.setModel(modelo);
    }
    
    public void cargaBoxClientes(){
        
        Box_BuscarC.removeAllItems();
        
        Box_BuscarC.addItem("dni");
        Box_BuscarC.addItem("nombre");
        Box_BuscarC.addItem("apellidos");
        Box_BuscarC.addItem("telefono");
        Box_BuscarC.addItem("email");
        
    }
}
