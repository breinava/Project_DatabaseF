package ventanas;

import Correo.ControladorCorreo;
import Correo.Correo;
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
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import modelo_dao.Almacen;
import modelo_dao.Categoria_Producto;
import modelo_dao.Cliente;
import modelo_dao.Factura;
import modelo_dao.ModoPago;
import modelo_dao.Producto;
import modelo_dao.Usuario;
import mysql_conexion.Acceso;


public class Main_Prueba_dao {
    public static  Acceso a = new Acceso();
    public static Scanner es = new Scanner(System.in); 
    public static Correo c = new Correo();
    
    public static void main(String... breiner) throws Exception{
        a.setUser("root");
        a.setPass(""); 
     /*Usuario usr = new Usuario();
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
        System.out.println("Nombre: "+usr.getUsuario()+"  Contraseña: "+cl);*/
     int op=0;
       
        do{
            System.out.println("-Menu Caja-");
            System.out.println("1 Menu de Usuarios");
            System.out.println("2 Menu de Clientes ");
            System.out.println("3 Menu de Empleados");
            System.out.println("4 Menu de Almacenes");
            System.out.println("5 Menu de proveedores");
            System.out.println("6 Menu de Pedidos");
            System.out.println("7 Menu de Productos");
            System.out.println("8 Menu de Categorias");
            System.out.println("9 Salir");
            op=es.nextInt();
            switch(op){
                case 1:
                    menuUsuario();
                    break;
                case 2:
                    menuCliente();
                    break;
                case 3:
                    menuEmpleado();
                    break;
                case 4:
                    menuALmacen();
                    break;
                case 5:
                    menuProveedor();
                    break;
                case 6:
                    menuPedido();
                    break;
                case 7:
                    menuProducto();
                    break;
                case 8:
                    menuCategoria();
                    break;
                case 9:
                    op=20;
                    break;
                default:
                    System.out.println("opc no disponible");
                    break;
            }
        }while(op!=20);
        es.close();
    }
    
    public static void menuCategoria() throws Exception{
        Scanner s = new Scanner(System.in);
        int opc=0;
        do{
            System.out.println("---Menu Categoria---");
            System.out.println("1 Registrar una categoria de productos");
            System.out.println("2 Modificar una categoria");
            System.out.println("3 Eliminar una categoria");
            System.out.println("4 listar Categoria");
            System.out.println("5 salir del menu");
            opc=s.nextInt();
            switch(opc){
                case 1:
                    if(registrarCat()){
                        System.out.println("Se registro correctamente");
                    }else{
                        System.out.println("no se pudo registrar");
                    }
                    break;
                case 2:
                    if(modCat()){
                        System.out.println("Se registro correctamente");
                    }else{
                        System.out.println("no se pudo registrar");
                    }                  
                    break;
                case 3:
                    if(elimiCat()){
                        System.out.println("Se registro correctamente");
                    }else{
                        System.out.println("no se pudo registrar");
                    }
                    break;
                case 4:
                    listCat();
                    break;
                case 5:
                    opc=5;
                    break;
                default:
                    System.out.println("Opcion no disponible");
                    break;  
            }
        }while(opc!=5);
        
    }
    
    
    public static boolean registrarCat() throws Exception{
        boolean registrado=false;
        Scanner s= new Scanner(System.in);
        Categoria_Producto cat = null;
        DAOCategoria_ProductoImpl caimp = new DAOCategoria_ProductoImpl();
        int id=0;
        String nombre;
        String descripcion;
        System.out.println("Escriba el nombre de la nueva categoria");
        nombre=s.next();
        System.out.println("Escriba una descripcion");
        descripcion=s.next();
        cat=new Categoria_Producto(id, nombre, descripcion);
        if(cat!=null){
            caimp.RegistrarCategoriaP(cat, a);
            registrado=true;
        }else{
            registrado=false;
        }
        
        return registrado;
    }
    
    public static boolean modCat(){
        boolean mod=false;
        
        return mod;
    }
    
    public static boolean elimiCat(){
        boolean eli=false;
        
        return eli;
    }
    
    public static void listCat() throws Exception{
        DAOCategoria_ProductoImpl caimp = new DAOCategoria_ProductoImpl();
        List<Categoria_Producto>cats= new ArrayList<Categoria_Producto>();
        cats=caimp.ListarCategoriaP(a);
        for(Categoria_Producto c:cats){
            System.out.println("Nombre cat: "+c.getNombre());
            System.out.println("Descripcion: "+c.getDescripcion());
        }
            
    }
    
    
    
    
    public static void menuEmpleado(){
        Scanner s = new Scanner(System.in);
        int opc=0;
        do{
            System.out.println("---Menu Empleados---");
            System.out.println("1 Registrar un empleado");
            System.out.println("2 Editar un empleado");
            System.out.println("3 Eliminar empleado");
            System.out.println("4 Listar empleados");
            System.out.println("5 Salir");
            opc=s.nextInt();
            switch(opc){
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    opc=5;
                    break;
                default:
                    System.out.println("Opcion no disponible");
                    break;  
            }
        }while(opc!=5);
        
    }
    
    public static void menuALmacen(){
        Scanner s = new Scanner(System.in);
        int opc=0;
        do{
            System.out.println("---Menu Almacen----");
            System.out.println("1 Regsitrar un nuevo almacen");
            System.out.println("2 Editar un almacen");
            System.out.println("3 Eliminar un almacen");
            System.out.println("4 Listar los almacenes");
            System.out.println("5 Salir");
            opc=s.nextInt();
            switch(opc){
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    opc=5;
                    break;
                default:
                    System.out.println("Opcion no disponible");
                    break;  
            }
        }while(opc!=5);
        
    }
    
    public static void menuProveedor(){
        Scanner s = new Scanner(System.in);
        int opc=0;
        do{
            System.out.println("---Menu Proveedoor---");
            System.out.println("1 Regsitrar un nuevo proveedor");
            System.out.println("2 Editar un proveedor");
            System.out.println("3 Eliminar un proveedor");
            System.out.println("4 Listar proveedores");
            System.out.println("5 salir");
            opc=s.nextInt();
            switch(opc){
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    opc=5;
                    break;
                default:
                    System.out.println("Opcion no disponible");
                    break;  
            }
        }while(opc!=5);
        
    }
    
    public static void menuUsuario() throws Exception{
        Scanner s = new Scanner(System.in);
        int opc=0;
        boolean salir=false;
        do{
              System.out.println("---Menu Usuarios---");
              System.out.println("1 Registrar un Usuario");
              System.out.println("2 Modificar a un usuario");
              System.out.println("3 Eliminar Usuario ");
              System.out.println("4 Listar todos los usuarios");
              System.out.println("5 salir del menu ");
              opc=s.nextInt();
            switch(opc){
                case 1:
                    if(registrarUsuarios() == true){
                        System.out.println("Registro exitoso");
                    }else{
                        System.out.println("no se pudo completar el registro");
                    }
                    break;
                case 2:
                    break;
                case 3:
                    if(eliminarUsuario()){
                        System.out.println("Se elimino correctamente ");
                    }else{
                        System.out.println("No se pudo eliminar el usuario");
                    }
                    break;
                case 4:
                    listarUsuarios();
                    break;
                case 5:
                    salir=true;
                    break;
                default:
                    System.out.println("Opcion no disponible");
                    break;  
            }
        }while(salir==false);
        
    }
    
    public static void menuProducto(){
        Scanner s = new Scanner(System.in);
        int opc=0;
        do{
            System.out.println("---Menu Producto---");
            System.out.println("1 Agregar Producto");
            System.out.println("2 Editar Producto");
            System.out.println("3 Eliminar Producto");
            System.out.println("4 Listar productos");
            System.out.println("5 Salir");
            opc=s.nextInt();
            switch(opc){
                case 1:
                    if(agregarProducto()){
                        System.out.println("Producto agregado Correctamente");
                    }else{
                        System.out.println("No se pudo agregar el prodcuto");
                    }
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    opc=5;
                    break;
                default:
                    System.out.println("Opcion no disponible");
                    break;  
            }
        }while(opc!=5);
        
    }
    
    public static void menuCliente(){
        Scanner s = new Scanner(System.in);
        int opc=0;
        do{
            System.out.println("---Menu cliente---");
            System.out.println("1 Regsitrar clientes");
            System.out.println("2 Modificar un cliente");
            System.out.println("3 Eliminar Clientes");
            System.out.println("4 Listar Clientes");
            System.out.println("5 Salir");
            opc=s.nextInt();
            switch(opc){
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    opc=5;
                    break;
                default:
                    System.out.println("Opcion no disponible");
                    break;  
            }
        }while(opc!=5);
        
    }
    
    public static void menuPedido(){
        Scanner s = new Scanner(System.in);
        int opc=0;
        do{
            System.out.println("---Menu Pedido--");
            System.out.println("1 Hacer un pedido");
            System.out.println("2 Modificar un pedido");
            System.out.println("3 Eliminar un pedido");
            System.out.println("4 Listar pedidos registrados");
            System.out.println("5 salir");
            opc=s.nextInt();
            switch(opc){
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    opc=6;
                    break;
                default:
                    System.out.println("Opcion no disponible");
                    break;  
            }
        }while(opc!=6);
        
        
    }


    public static boolean registrarUsuarios() throws Exception{
        boolean registro=true;
        Scanner p = new Scanner(System.in);
        DAOUsuarioImpl usuImp = new DAOUsuarioImpl();
        Usuario usua = new Usuario();
        List<Usuario> usuarios = new ArrayList<>();
        int idusu=0;
        String usuario;
        String email, pass;
        boolean  tipo=true;
        usuarios = usuImp.ListarUsuarios(a);
        System.out.println("Ingrese usuario");
        usuario= p.next();
        for(Usuario u : usuarios){
            if(u.getUsuario().equals(usuario)){
                System.out.println("No se puede registrar este usuario ya esta en uso");
                registro = false;
            }
         }
        System.out.println("Ingrese el email");
        email=p.next();
        for(Usuario u : usuarios){
            if(u.getEmail().equals(email)){
                System.out.println("No se puede registrar este email ya esta en uso");
                registro = false;
            }
        }
        if(registro ==true){
            System.out.println("Escriba su contraseña");
             pass=p.next();
                    
            //System.out.println("Escriba el tipo");
            //tipo= s.nextBoolean();
            usua= new Usuario(idusu, usuario, email, pass, true);
            usuImp.RegistrarUsuario(usua,a);
            
            c.setContraseña("ybrsyumnqftsodse");
            c.setUsuarioCorreo("noj2304@gmail.com");
            c.setAsunto("Bienvenido a nuestra Empresa");
            c.setDestino(usua.getEmail());
            c.setMensaje("Cordial saludo\nEstamos agradecidos por tenerlo en nuestra empresa.\n"
                    + "Le recordamos sus datos:\n"
                    + "Usuario: " +usua.getUsuario()+"\n"
                            + "Email: "+ usua.getEmail()+"\n"+
                    "Contraseña: "+usua.getPass());
            c.setNombreArchivo("bienvenido.jpg");
            c.setRutaArchivo("bienvenido.jpg");
            
            ControladorCorreo controlador = new ControladorCorreo();
            
            controlador.enviarCorreo(c);
 
        }
     return registro;
    }
    
    public static boolean eliminarUsuario() throws Exception{
        boolean eliminado=false;
        DAOUsuarioImpl imp = new DAOUsuarioImpl();
        String usu;
        Scanner s = new Scanner(System.in);
        Usuario u= new Usuario();
        listarUsuarios();
        System.out.println("Escriba el usuario que quiera eliminar: ");
        usu=s.next();
        u=imp.BuscarUsuario(usu, a);
        if(u!=null){
            imp.EliminarUsuario(u, a);
            eliminado=true;
        }else{
            eliminado=false;
        }   
        return eliminado;
    }
    
    
    public static void listarUsuarios() throws Exception{
        List<Usuario>us= new ArrayList<>();
        DAOUsuarioImpl imp = new DAOUsuarioImpl();
        us=imp.ListarUsuarios(a);
        for(Usuario u:us){
            System.out.println("Id: "+u.getIdUsu());
            System.out.println("Usuario: "+u.getUsuario());
            System.out.println("Correo: "+u.getEmail());
            System.out.println("Contraseña: "+u.getPass());
        }
    }
    
    public static boolean editarUsuario () throws Exception{
        boolean editado=false;
        DAOUsuarioImpl da=new DAOUsuarioImpl();
        Scanner s= new Scanner(System.in);
        String pass, us;
        Usuario u= new Usuario();
        listarUsuarios();
        System.out.println("Escriba el usuario al que le desea cambiar la contraseña");
        us=s.next();
        u=da.BuscarUsuario(us, a);
        if(u!=null){
            System.out.print("Escriba la nueva contraseña: ");
            pass=s.next();
            u.setPass(pass);
            da.ModificarUsuario(u, a);
            editado=true;
        }else{
            editado=false;
        }
        
        return editado;
    }
    
   public static boolean agregarProducto(){
       boolean add=false;
       Producto p= new Producto();
       DAOProductoImpl pd=new DAOProductoImpl();
       return add;
   }
}
