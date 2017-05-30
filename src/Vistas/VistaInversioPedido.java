/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

/**
 *
 * @author Jhoan
 */
public class VistaInversioPedido {
    
    private String proveedores;
    private double inversion;

    public VistaInversioPedido() {
    }

    public VistaInversioPedido(String proveedores, double inversion) {
        this.proveedores = proveedores;
        this.inversion = inversion;
    }

    public String getProveedores() {
        return proveedores;
    }

    public void setProveedores(String proveedores) {
        this.proveedores = proveedores;
    }

    public double getInversion() {
        return inversion;
    }

    public void setInversion(double inversion) {
        this.inversion = inversion;
    }
    
    
    
    
}
