package ventanas;

import hbm_Impl.Oper_Clientes;
import modelo_hbm.Clientes;

/**
 *
 * @author breiner
 */

public class Menu_Prueba_hbm {
    
    public static void main(String... Prueba_hbm){
        Oper_Clientes opc = new Oper_Clientes();
        Clientes cl = new Clientes();
        
        opc.insertar(cl);
        opc.actualizarCliente(cl, "Mami");
        opc.buscarCliente(12313123); 
        opc.eliminar(cl);
    }
}
