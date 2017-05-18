package modelo_hbm;
// Generated 18-may-2017 15:31:17 by Hibernate Tools 4.3.1



/**
 * DetallePedidosId generated by hbm2java
 */
public class DetallePedidosId  implements java.io.Serializable {


     private int idDetallePedido;
     private int numPedido;

    public DetallePedidosId() {
    }

    public DetallePedidosId(int idDetallePedido, int numPedido) {
       this.idDetallePedido = idDetallePedido;
       this.numPedido = numPedido;
    }
   
    public int getIdDetallePedido() {
        return this.idDetallePedido;
    }
    
    public void setIdDetallePedido(int idDetallePedido) {
        this.idDetallePedido = idDetallePedido;
    }
    public int getNumPedido() {
        return this.numPedido;
    }
    
    public void setNumPedido(int numPedido) {
        this.numPedido = numPedido;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof DetallePedidosId) ) return false;
		 DetallePedidosId castOther = ( DetallePedidosId ) other; 
         
		 return (this.getIdDetallePedido()==castOther.getIdDetallePedido())
 && (this.getNumPedido()==castOther.getNumPedido());
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + this.getIdDetallePedido();
         result = 37 * result + this.getNumPedido();
         return result;
   }   


}

