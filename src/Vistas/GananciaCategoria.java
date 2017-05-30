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
public class GananciaCategoria {
    private String categoria;
    private double ganacia;

    public GananciaCategoria() {
    }

    public GananciaCategoria(String categoria, double ganacia) {
        this.categoria = categoria;
        this.ganacia = ganacia;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public double getGanacia() {
        return ganacia;
    }

    public void setGanacia(double ganacia) {
        this.ganacia = ganacia;
    }
    
    
    
    
}
