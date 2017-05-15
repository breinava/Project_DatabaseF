/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Jhoan
 */
public class Proveedor {
    private int idPROVEEDORES;
    private String nombre;

    public Proveedor() {
    }

    public Proveedor(int idPROVEEDORES, String nombre) {
        this.idPROVEEDORES = idPROVEEDORES;
        this.nombre = nombre;
    }

    public int getIdPROVEEDORES() {
        return idPROVEEDORES;
    }

    public void setIdPROVEEDORES(int idPROVEEDORES) {
        this.idPROVEEDORES = idPROVEEDORES;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
}
