/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.Timestamp;

/**
 *
 * @author Jhoan
 */
public class Pedido {
    
    private int numPedido;
    private int idProve;
    private int idModoPag;
    private int idALmacen;

    public Pedido() {
    }

    public Pedido(int numPedido, int idProve, int idModoPag, int idALmacen) {
        this.numPedido = numPedido;
        this.idProve = idProve;
        this.idModoPag = idModoPag;
        this.idALmacen = idALmacen;
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

    public int getIdModoPag() {
        return idModoPag;
    }

    public void setIdModoPag(int idModoPag) {
        this.idModoPag = idModoPag;
    }

    public int getIdALmacen() {
        return idALmacen;
    }

    public void setIdALmacen(int idALmacen) {
        this.idALmacen = idALmacen;
    }
    
    
    
}
