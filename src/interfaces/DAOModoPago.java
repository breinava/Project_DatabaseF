/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import java.util.List;
import modelo.ModoPago;

/**
 *
 * @author Jhoan
 */
public interface DAOModoPago {
    public void registarModoPago(ModoPago pago);
    public void modificarModoPago(ModoPago pago);
    public void borrarModoPago(ModoPago pago);
    public List<ModoPago> getModoPagos();
}
