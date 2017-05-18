/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo_dao;

/**
 *
 * @author Jhoan
 */
public class ModoPago {
    private int idModoPago;
    private String nombre;

    public ModoPago() {
    }

    public ModoPago(int idModoPago, String nombre) {
        this.idModoPago = idModoPago;
        this.nombre = nombre;
    }

    public int getIdModoPago() {
        return idModoPago;
    }

    public void setIdModoPago(int idModoPago) {
        this.idModoPago = idModoPago;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
}
