package ventanas;

import hbm_Impl.Oper_Clientes;
import static java.awt.Frame.NORMAL;
import javax.swing.JOptionPane;
import modelo_hbm.Clientes;

/**
 *
 * @author breiner
 */

public class Menu_Prueba_hbm {
    
    public static void main(String... Prueba_hbm) throws Exception{
        Oper_Clientes opc = new Oper_Clientes();
        //Clientes cl = new Clientes(1234567893,"Algo","Prueba Prueba",123123,"pruebaAlgo@nose.com");
        Clientes cl = new Clientes();
        //cl = opc.buscarCliente(4);
        //opc.eliminar(cl);
        //opc.insertar(cl); 
        //opc.actualizarCliente(cl, "Mami");
        //opc.buscarCliente(12313123); 
        //opc.eliminar(cl);
    }
}
