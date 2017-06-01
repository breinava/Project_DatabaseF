package ventanas;

import hbm_Impl.Oper_CategoriasP;
import hbm_Impl.Oper_Generales;
import hbm_Impl.Oper_Marcas;
import hbm_Impl.Oper_ModoPagos;
import hbm_Impl.Oper_Productos;
import static java.awt.Frame.NORMAL;
import java.util.List;
import javax.swing.JOptionPane;
import modelo_hbm.Categorias;
import modelo_hbm.Marcas;
import modelo_hbm.ModoPago;
import modelo_hbm.Productos;
/**
 *
 * @author breiner
 */

public class Menu_Prueba_hbm {
    
    public static void main(String... Prueba_hbm) throws Exception{
        
        Oper_CategoriasP cp = new Oper_CategoriasP();
        Categorias c = new Categorias();
        
        //m = om.buscarMarcas(1);
        c = cp.buscarCategoriasP("Ropa deportiva");
        
       
        System.out.println("Nombre: "+c.getNombre()+"; Descripcion: "+c.getDescripcion());

// Productos pd = new Productos();
        
       
       
        //pd = opd.buscarProducto(26);
        //opd.actualizarProducto(pd, 33);
        //opd.Insertar(pd);
        
        








//ModoPago mp = new ModoPago();

        
        
        //cp.Insertar(c);
        
        //mp = omp.buscarModoPago(3);
        
        //System.out.println(mp.getNombre());
        //opr.Insertar(mp);
        //opr.eliminar(mp);



        //Oper_Clientes opc = new Oper_Clientes();
        //Clientes cl = new Clientes(1234567893,"Algo","Prueba Prueba",123123,"pruebaAlgo@nose.com");
        //Clientes cl = new Clientes();
        /*
        List<ModoPago> mps = omp.listarModoPagos("nombre","Efectivo");
        
        for(int i=0; i < mps.size();i++){
            ModoPago mp = (ModoPago)mps.get(i);
            
            System.out.println("ID: "+mp.getIdModoPago()+", NOMBRE: "+mp.getNombre());
        }
        */
        
        
        
        
        //cl = opc.buscarCliente(4);
        //opc.eliminar(cl);
        //opc.insertar(cl); 
        //opc.actualizarCliente(cl, "Mami");
        //opc.buscarCliente(12313123); 
        //opc.eliminar(cl);
    }
}
