/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces_dao;

import java.util.List;
import modelo_dao.Empleado;

/**
 *
 * @author Jhoan
 */
public interface DAOEmpleado {
    
    public void registraEmpleado(Empleado e);
    public void modificarEmpleado (Empleado e);
    public void eliminarEmpleado(Empleado e);
    public List<Empleado> getEmpleados();
}
