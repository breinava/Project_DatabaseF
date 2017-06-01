package hbm_Impl;

import static java.awt.Frame.NORMAL;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo_hbm.Categorias;
import modelo_hbm.Marcas;
import modelo_hbm.Productos;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Expression;
import static ventanas.VProductos.Box_BuscarP;
import static ventanas.VProductos.Box_CategoriaP;
import static ventanas.VProductos.Box_MarcaP;
import static ventanas.VProductos.TablaProducto;

/**
 *
 * @author breiner
 */

public class Oper_Productos extends Oper_Generales {
    
    public Productos buscarProducto(Integer idProductos) throws Exception {
        
        Productos pd = null;
        SessionFactory sesion = null;
        Session sess = null;
        Transaction tx = null;
        
        try{
            sesion = NewHibernateUtil.getSessionFactory();
            sess = sesion.openSession();
            tx = sess.beginTransaction();
            pd = (Productos) sess.get(Productos.class,idProductos);
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
        
        return pd;
    }
    
    public void actualizarProducto(Productos pd, Integer dato) throws Exception {
        
        SessionFactory sesion = null;
        Session sess = null;
        Transaction tx = null;
        
        try{
            sesion = NewHibernateUtil.getSessionFactory();
            sess = sesion.openSession();
            tx = sess.beginTransaction();
            
            pd.setCantidadStock(dato);
            sess.saveOrUpdate(pd);
            tx.commit();
            JOptionPane.showMessageDialog(null, "Actualizado Correctameente");
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
    
    public List<Productos> listarProductos(){
        
        List<Productos> products = null;
        
        SessionFactory sesion = NewHibernateUtil.getSessionFactory();
        Session sess = sesion.openSession();
        sess.beginTransaction();
        
        products = sess.createQuery("from Productos").list();
         
        sess.close();
        
        return products;
    }
    
    public List<Productos> listarProductos(String campo, String dato){
        
        List<Productos> products = null;
        
        SessionFactory sesion = NewHibernateUtil.getSessionFactory();
        Session sess = sesion.openSession();
        sess.beginTransaction();
        
        Criteria criteria = sess.createCriteria(Productos.class);
        criteria.add(Expression.eq(campo, dato));
        criteria.setMaxResults(20);
        products = criteria.list();
         
        sess.close();
        
        return products;
    }
    
    public List<Productos> listarProductos(String campo, long dato){
        
        List<Productos> products = null;
        
        SessionFactory sesion = NewHibernateUtil.getSessionFactory();
        Session sess = sesion.openSession();
        sess.beginTransaction();
        
        Criteria criteria = sess.createCriteria(Productos.class);
        criteria.add(Expression.eq(campo, dato));
        criteria.setMaxResults(20);
        products = criteria.list();
         
        sess.close();
        
        return products;
    }
    
    public void cargaListProductos(List<Productos> prodts){
        
        DefaultTableModel modelo = new DefaultTableModel();
        
        String[] ColumName = {"ID","NOMBRE","PRECIO COMPRA","PRECIO VENTA","CATEGORIA","MARCA","STOCK"};
        modelo.setColumnIdentifiers(ColumName);
        
        Object[] fila = new Object[modelo.getColumnCount()];
        
        for (int i = 0; i< prodts.size(); i++){
            fila[0] = prodts.get(i).getIdProductos();
            fila[1] = prodts.get(i).getNombre();
            fila[2] = prodts.get(i).getPrecioCompra();
            fila[3] = prodts.get(i).getPrecioVenta();
            fila[4] = prodts.get(i).getCategorias().getIdCategorias();
            fila[5] = prodts.get(i).getMarcas().getIdMarcas();
            fila[6] = prodts.get(i).getCantidadStock();
            modelo.addRow(fila);
        }
        
        TablaProducto.setModel(modelo);
    }
    
    public void cargaBoxBuscarP(){
        
        Box_BuscarP.removeAllItems();
        
        Box_BuscarP.addItem("idProductos");
        Box_BuscarP.addItem("nombre");
        Box_BuscarP.addItem("precioCompra");
        Box_BuscarP.addItem("precioVenta");
        Box_BuscarP.addItem("cantidadStock");
        
    }
    
    public void cargaBoxMarcas(List<Marcas> marcs){
        
        Box_MarcaP.removeAllItems();
        
        for (int i = 0; i< marcs.size(); i++){
            
            Box_MarcaP.addItem(marcs.get(i).getNombre());
        }
    }
        
    public void cargaBoxCategorias(List<Categorias> categP){
        
        Box_CategoriaP.removeAllItems();
        
        for (int i = 0; i< categP.size(); i++){
            
            Box_CategoriaP.addItem(categP.get(i).getNombre());
        }
    }
    

}
