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
public class Pedido {
     private int numPedido;
     private int idProve;
     private int idModoP;
     private int idAlma;

    public Pedido() {
    }

    public Pedido(int numPedido, int idProve, int idModoP, int idAlma) {
        this.numPedido = numPedido;
        this.idProve = idProve;
        this.idModoP = idModoP;
        this.idAlma = idAlma;
    }

    public int getNumPedido() {
        return numPedido;
    }

    public void setNumPedido(int numPedido) {
        this.numPedido = numPedido;
    }

    public int getIdProve() {
        return idProve;
    }

    public void setIdProve(int idProve) {
        this.idProve = idProve;
    }

    public int getIdModoP() {
        return idModoP;
    }

    public void setIdModoP(int idModoP) {
        this.idModoP = idModoP;
    }

    public int getIdAlma() {
        return idAlma;
    }

    public void setIdAlma(int idAlma) {
        this.idAlma = idAlma;
    }
    
}
