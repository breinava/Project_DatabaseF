/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import java.util.List;
import modelo.Factura;

/**
 *
 * @author Jhoan
 */
public interface DAOFactura {
    public void crearFactura(Factura fac);
    public void modificarFactura(Factura fac);
    public void eliminarFactura(Factura fac);
    public List<Factura> getFacturas();
            
}
