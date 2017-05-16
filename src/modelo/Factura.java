/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.Date;

/**
 *
 * @author Jhoan
 */
public class Factura {
    private int NUM_FACTURA;
    private Date fecha;
    private int clienteDni;
    private int idModoPago;
    private int idEmpleado;

    public Factura() {
    }

    public Factura(int NUM_FACTURA, Date fecha, int clienteDni, int idModoPago, int idEmpleado) {
        this.NUM_FACTURA = NUM_FACTURA;
        this.fecha = fecha;
        this.clienteDni = clienteDni;
        this.idModoPago = idModoPago;
        this.idEmpleado = idEmpleado;
    }

    public int getNUM_FACTURA() {
        return NUM_FACTURA;
    }

    public void setNUM_FACTURA(int NUM_FACTURA) {
        this.NUM_FACTURA = NUM_FACTURA;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getClienteDni() {
        return clienteDni;
    }

    public void setClienteDni(int clienteDni) {
        this.clienteDni = clienteDni;
    }

    public int getIdModoPago() {
        return idModoPago;
    }

    public void setIdModoPago(int idModoPago) {
        this.idModoPago = idModoPago;
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }
    
}
