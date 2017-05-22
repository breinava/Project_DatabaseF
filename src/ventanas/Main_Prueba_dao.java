package ventanas;

import dao_Impl.DAOAlmacenImpl;
import dao_Impl.DAOCategoria_ProductoImpl;
import dao_Impl.DAOClienteImpl;
import dao_Impl.DAOFacturaImpl;
import dao_Impl.DAOModoPagoImpl;
import dao_Impl.DAOProductoImpl;
import dao_Impl.DAOUsuarioImpl;
import interfaces_dao.DAOAlmacen;
import interfaces_dao.DAOCategoria_Producto;
import interfaces_dao.DAOCliente;
import interfaces_dao.DAOProducto;
import interfaces_dao.DAOUsuario;
import java.util.Date;
import modelo_dao.Almacen;
import modelo_dao.Categoria_Producto;
import modelo_dao.Cliente;
import modelo_dao.Factura;
import modelo_dao.ModoPago;
import modelo_dao.Producto;
import modelo_dao.Usuario;
import mysql_conexion.Acceso;


public class Main_Prueba_dao {
    
    public static void main(String... breiner){
        
        Usuario usr = new Usuario();
        String cl = "";
        
        
        try{
            
            DAOUsuarioImpl us = new DAOUsuarioImpl();
            
            Acceso a = new Acceso();
            Acceso b = new Acceso();
            
            b.setUser("root");
            b.setPass("2142");
            
            
            a.setUser("cajero");
            a.setPass("Soy Cajero 1.0");
            
            usr = us.BuscarUsuario("Lucho",b);
            cl = us.Desencriptar(usr,b);
            
        }catch(Exception e){
            System.err.println(e.getMessage());
        }
        
        System.out.println("Nombre: "+usr.getUsuario()+"  Contraseña: "+cl);
        
        
        
        /*
        Producto pd = new Producto();
        
        pd.setNombre("Prueba");
        pd.setPrecio1(22.823);
        pd.setPrecio2(37.999);
        pd.setName_categoria("Zapatos");
        
        ModoPago pa = new ModoPago();
        pa.setIdModoPago(12233);
        pa.setNombre("Decontado");
        Factura f = new Factura(1, 01 , 12233, 1);
                
        try{
            DAOProducto dao = new DAOProductoImpl();
            DAOModoPagoImpl pag = new DAOModoPagoImpl();
            DAOFacturaImpl impl= new DAOFacturaImpl();
            //dao.RegistrarProducto(pd);
            //pag.registarModoPago(pa);
           // impl.crearFactura(f);
           f.setIdEmpleado(2);
           impl.modificarFactura(f);
           
           
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
