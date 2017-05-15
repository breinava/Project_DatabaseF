/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import java.util.List;
import modelo.Proveedor;

/**
 *
 * @author Jhoan
 */
public interface DAOProveedor {
    
    public void registrarProveedor(Proveedor pr);
    public void modificarProveedor(Proveedor pr);
    public void borrarProveedor(Proveedor pr);
    public List<Proveedor> listaProveedores();
    
}
