package interfaces_dao;

import java.util.List;
import modelo_dao.Almacen;


public interface DAOAlmacen {
    
    public void RegistrarAlmacen(Almacen alm)throws Exception;
    public void ModificarAlmacen(Almacen alm)throws Exception;
    public void EliminarAlmacen(Almacen alm)throws Exception;
    public List<Almacen> ListarAlmacen(Almacen alm)throws Exception;
}
