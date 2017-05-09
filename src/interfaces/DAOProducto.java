package interfaces;

import java.util.List;
import modelo.Producto;


public interface DAOProducto {
    
    public void RegistrarProducto(Producto pd)throws Exception;
    public void ModificarProducto(Producto pd)throws Exception;
    public void EliminarProducto(Producto pd)throws Exception;
    public List<Producto> ListarProducto(Producto pd)throws Exception;
    
}
