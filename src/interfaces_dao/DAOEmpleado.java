package interfaces_dao;

import java.util.List;
import modelo_dao.Empleado;
import mysql_conexion.Rol;

/**
 *
 * @author Jhoan
 * @author Breiner
 */

public interface DAOEmpleado {
    
    public void RegistraEmpleado(Empleado e, Rol asc) throws Exception;
    public void ModificarEmpleado (Empleado e, Rol asc) throws Exception;
    public void EliminarEmpleado(Empleado e, Rol asc) throws Exception;
    public List<Empleado> ListarEmpleados(Empleado e, Rol asc) throws Exception;
}
