package ventanas;

import dao.DAOAlmacenImpl;
import dao.DAOCategoria_ProductoImpl;
import dao.DAOClienteImpl;
import dao.DAOModoPagoImpl;
import dao.DAOProductoImpl;
import interfaces.DAOAlmacen;
import interfaces.DAOCategoria_Producto;
import interfaces.DAOCliente;
import interfaces.DAOProducto;
import modelo.Almacen;
import modelo.Categoria_Producto;
import modelo.Cliente;
import modelo.ModoPago;
import modelo.Producto;


public class Main_Prueba {
    
    public static void main(String... breiner){
        
        Producto pd = new Producto();
        
        pd.setNombre("Prueba");
        pd.setPrecio1(22.823);
        pd.setPrecio2(37.999);
        pd.setName_categoria("Zapatos");
        
        ModoPago pa = new ModoPago();
        pa.setIdModoPago(12233);
        pa.setNombre("Decontado");
        try{
            DAOProducto dao = new DAOProductoImpl();
            DAOModoPagoImpl pag = new DAOModoPagoImpl();
            //dao.RegistrarProducto(pd);
            //pag.registarModoPago(pa);
            pa.setNombre("Credito");
      //      pag.modificarModoPago(pa);
            
            
        }catch(Exception e){
            System.err.println(e.getMessage());
        }
        
        /*
        Almacen alm = new Almacen();
        //alm.setNit(876585776);
        //alm.setNombre("Bucaramanga");
        
        try{
            DAOAlmacen dao = new DAOAlmacenImpl(); 
            //dao.RegistrarAlmacen(alm);
            for(Almacen a: dao.ListarAlmacen(alm)){
                System.out.println(a.getNit()+" "+a.getNombre());
            }
        }catch(Exception e){
            System.err.println(e.getMessage());
        }
        
        
        Cliente cl = new Cliente();
        
        cl.setDni("8761948216394");
        cl.setNombre("carlos");
        cl.setApellidos("gutierrez vergara");
        cl.setTelefono("1234567890387");
        cl.setEmail("carnava@live.com");
        
        try{
            DAOCliente dao = new DAOClienteImpl();
            dao.RegistrarCliente(cl);
            
        }catch(Exception e){
            System.err.println(e.getMessage());
        }
        
        Categoria_Producto cp = new Categoria_Producto();
        
        cp.setNombre("Zapatos");
        cp.setDescripcion("De marca y AAA");
        
        try{
            DAOCategoria_Producto dao = new DAOCategoria_ProductoImpl();
            dao.RegistrarCategoriaP(cp);
            
        }catch(Exception e){
            System.err.println(e.getMessage());
        }*/
    }
}
