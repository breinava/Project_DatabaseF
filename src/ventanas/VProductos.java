package ventanas;

import dao_Impl.DAOProductoImpl;
import interfaces_dao.DAOProducto;
import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo_dao.Producto;
import modelo_dao.Usuario;
import mysql_conexion.Rol;

/**
 *
 * @author breiner
 */
public class VProductos extends javax.swing.JFrame {
    
    Usuario user = new Usuario();
    Rol rol = new Rol();
    
    DAOProducto pdimp = new DAOProductoImpl();
    Producto pd = new Producto();
    List<Producto> listpd = new ArrayList();
    
    public VProductos() throws Exception {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        
    }

    public void setAccesoP(Usuario user, Rol rol){
        this.user = user;
        this.rol = rol;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnl_RegistroCliente = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        txt_NombreP = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        txt_PrecioCompra = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        txt_PrecioVenta = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        btn_RegistrarP = new javax.swing.JButton();
        Box_MarcaP = new javax.swing.JComboBox<>();
        Box_CategoriaP = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        btn_Minimizar = new javax.swing.JButton();
        btn_Cerrar = new javax.swing.JButton();
        btn_Home = new javax.swing.JButton();
        pnl_MostrarCliente = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TablaProducto = new javax.swing.JTable();
        btn_ActualizarP = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        Box_BuscarP = new javax.swing.JComboBox<>();
        jSeparator6 = new javax.swing.JSeparator();
        txt_BuscarP = new javax.swing.JTextField();
        jbtn_BuscarP = new javax.swing.JLabel();
        btn_ElimP = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnl_RegistroCliente.setBackground(new java.awt.Color(32, 33, 35));
        pnl_RegistroCliente.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setForeground(new java.awt.Color(57, 113, 177));
        jLabel2.setText("Nombre");
        pnl_RegistroCliente.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, -1, -1));

        jLabel3.setForeground(new java.awt.Color(52, 52, 54));
        jLabel3.setText("Precio Compra");
        pnl_RegistroCliente.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, -1, -1));

        jLabel4.setForeground(new java.awt.Color(52, 52, 54));
        jLabel4.setText("Precio Venta");
        pnl_RegistroCliente.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, -1, -1));

        jLabel5.setForeground(new java.awt.Color(52, 52, 54));
        jLabel5.setText("Marca");
        pnl_RegistroCliente.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, -1, -1));

        jLabel6.setForeground(new java.awt.Color(52, 52, 54));
        jLabel6.setText("Categoria");
        pnl_RegistroCliente.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, -1, -1));
        pnl_RegistroCliente.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 90, 210, 10));

        txt_NombreP.setBackground(new java.awt.Color(32, 33, 35));
        txt_NombreP.setForeground(new java.awt.Color(255, 255, 255));
        txt_NombreP.setBorder(null);
        txt_NombreP.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_NombrePFocusGained(evt);
            }
        });
        pnl_RegistroCliente.add(txt_NombreP, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, 210, 30));
        pnl_RegistroCliente.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 150, 180, 10));

        txt_PrecioCompra.setBackground(new java.awt.Color(32, 33, 35));
        txt_PrecioCompra.setForeground(new java.awt.Color(255, 255, 255));
        txt_PrecioCompra.setBorder(null);
        txt_PrecioCompra.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_PrecioCompraFocusGained(evt);
            }
        });
        pnl_RegistroCliente.add(txt_PrecioCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 120, 180, 30));
        pnl_RegistroCliente.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 210, 180, 10));

        txt_PrecioVenta.setBackground(new java.awt.Color(32, 33, 35));
        txt_PrecioVenta.setForeground(new java.awt.Color(255, 255, 255));
        txt_PrecioVenta.setBorder(null);
        txt_PrecioVenta.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_PrecioVentaFocusGained(evt);
            }
        });
        txt_PrecioVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_PrecioVentaActionPerformed(evt);
            }
        });
        pnl_RegistroCliente.add(txt_PrecioVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 180, 180, 30));
        pnl_RegistroCliente.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 270, 210, 10));
        pnl_RegistroCliente.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 330, 210, 10));

        btn_RegistrarP.setBackground(new java.awt.Color(126, 87, 194));
        btn_RegistrarP.setFont(new java.awt.Font("NanumMyeongjo", 1, 12)); // NOI18N
        btn_RegistrarP.setForeground(new java.awt.Color(255, 255, 255));
        btn_RegistrarP.setText("Registrar");
        btn_RegistrarP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_RegistrarPActionPerformed(evt);
            }
        });
        pnl_RegistroCliente.add(btn_RegistrarP, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 400, 290, 40));

        Box_MarcaP.setBackground(new java.awt.Color(32, 33, 35));
        Box_MarcaP.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        Box_MarcaP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Box_MarcaPActionPerformed(evt);
            }
        });
        pnl_RegistroCliente.add(Box_MarcaP, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 240, 210, 30));

        Box_CategoriaP.setBackground(new java.awt.Color(32, 33, 35));
        Box_CategoriaP.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        Box_CategoriaP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Box_CategoriaPActionPerformed(evt);
            }
        });
        pnl_RegistroCliente.add(Box_CategoriaP, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 300, 210, 30));

        getContentPane().add(pnl_RegistroCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 390, 500));

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setForeground(new java.awt.Color(102, 102, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setBackground(new java.awt.Color(204, 204, 204));
        jLabel7.setFont(new java.awt.Font("DejaVu Sans", 0, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(57, 113, 157));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Producto");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 760, -1));

        btn_Minimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/minimizar1.png"))); // NOI18N
        btn_Minimizar.setBorder(null);
        btn_Minimizar.setBorderPainted(false);
        btn_Minimizar.setContentAreaFilled(false);
        btn_Minimizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_Minimizar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_Minimizar.setIconTextGap(-3);
        btn_Minimizar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/minimizar2.png"))); // NOI18N
        btn_Minimizar.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/minimizar3.png"))); // NOI18N
        btn_Minimizar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_Minimizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_MinimizarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_Minimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 0, -1, 30));

        btn_Cerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cerrar1.png"))); // NOI18N
        btn_Cerrar.setBorder(null);
        btn_Cerrar.setBorderPainted(false);
        btn_Cerrar.setContentAreaFilled(false);
        btn_Cerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_Cerrar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_Cerrar.setIconTextGap(-3);
        btn_Cerrar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cerrar2.png"))); // NOI18N
        btn_Cerrar.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cerrar3.png"))); // NOI18N
        btn_Cerrar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_Cerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CerrarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_Cerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 0, -1, 30));

        btn_Home.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/home1.png"))); // NOI18N
        btn_Home.setBorder(null);
        btn_Home.setBorderPainted(false);
        btn_Home.setContentAreaFilled(false);
        btn_Home.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_Home.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_Home.setIconTextGap(-3);
        btn_Home.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_Home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_HomeActionPerformed(evt);
            }
        });
        jPanel1.add(btn_Home, new org.netbeans.lib.awtextra.AbsoluteConstraints(-4, 0, 30, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 860, 60));

        pnl_MostrarCliente.setBackground(new java.awt.Color(0, 0, 0));
        pnl_MostrarCliente.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane2.setBackground(new java.awt.Color(32, 33, 35));

        TablaProducto.setForeground(new java.awt.Color(0, 0, 0));
        TablaProducto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "DNI sdfas", "NOMBRE  sdf", "APELLIDOS", "TELEFONO", "EMAIL"
            }
        ));
        TablaProducto.setSelectionBackground(new java.awt.Color(32, 33, 35));
        TablaProducto.setSelectionForeground(new java.awt.Color(57, 113, 177));
        jScrollPane2.setViewportView(TablaProducto);

        pnl_MostrarCliente.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, 310));

        btn_ActualizarP.setBackground(new java.awt.Color(126, 87, 194));
        btn_ActualizarP.setFont(new java.awt.Font("NanumMyeongjo", 1, 12)); // NOI18N
        btn_ActualizarP.setForeground(new java.awt.Color(255, 255, 255));
        btn_ActualizarP.setText("Mostrar Todo");
        btn_ActualizarP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ActualizarPActionPerformed(evt);
            }
        });
        pnl_MostrarCliente.add(btn_ActualizarP, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 440, -1, 40));

        jLabel8.setForeground(new java.awt.Color(57, 113, 177));
        jLabel8.setText("Buscar");
        pnl_MostrarCliente.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, 30));

        Box_BuscarP.setBackground(new java.awt.Color(32, 33, 35));
        Box_BuscarP.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        Box_BuscarP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Box_BuscarPActionPerformed(evt);
            }
        });
        pnl_MostrarCliente.add(Box_BuscarP, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70, 100, 30));
        pnl_MostrarCliente.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 100, 280, 10));

        txt_BuscarP.setBackground(new java.awt.Color(0, 0, 0));
        txt_BuscarP.setForeground(new java.awt.Color(204, 204, 204));
        txt_BuscarP.setBorder(null);
        pnl_MostrarCliente.add(txt_BuscarP, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 80, 240, 20));

        jbtn_BuscarP.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jbtn_BuscarP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/search.png"))); // NOI18N
        jbtn_BuscarP.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtn_BuscarP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbtn_BuscarPMouseClicked(evt);
            }
        });
        pnl_MostrarCliente.add(jbtn_BuscarP, new org.netbeans.lib.awtextra.AbsoluteConstraints(424, 70, 30, 30));

        btn_ElimP.setBackground(new java.awt.Color(126, 87, 194));
        btn_ElimP.setFont(new java.awt.Font("NanumMyeongjo", 1, 12)); // NOI18N
        btn_ElimP.setForeground(new java.awt.Color(255, 255, 255));
        btn_ElimP.setText("Eliminar");
        btn_ElimP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ElimPActionPerformed(evt);
            }
        });
        pnl_MostrarCliente.add(btn_ElimP, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 440, -1, 40));

        getContentPane().add(pnl_MostrarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 60, 470, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_NombrePFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_NombrePFocusGained
        jLabel2.setForeground(new Color(57,113,177)); // Color titulo al seleccionar
        jLabel3.setForeground(new Color(51,52,54));
        jLabel4.setForeground(new Color(51,52,54));
        jLabel5.setForeground(new Color(51,52,54));
        jLabel6.setForeground(new Color(51,52,54));
    }//GEN-LAST:event_txt_NombrePFocusGained

    private void txt_PrecioCompraFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_PrecioCompraFocusGained
        jLabel3.setForeground(new Color(57,113,177)); // Color titulo al seleccionar
        jLabel2.setForeground(new Color(51,52,54));
        jLabel4.setForeground(new Color(51,52,54));
        jLabel5.setForeground(new Color(51,52,54));
        jLabel6.setForeground(new Color(51,52,54));
    }//GEN-LAST:event_txt_PrecioCompraFocusGained

    private void txt_PrecioVentaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_PrecioVentaFocusGained
        jLabel4.setForeground(new Color(57,113,177)); // Color titulo al seleccionar
        jLabel2.setForeground(new Color(51,52,54));
        jLabel3.setForeground(new Color(51,52,54));
        jLabel5.setForeground(new Color(51,52,54));
        jLabel6.setForeground(new Color(51,52,54));
    }//GEN-LAST:event_txt_PrecioVentaFocusGained

    private void txt_PrecioVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_PrecioVentaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_PrecioVentaActionPerformed

    private void btn_RegistrarPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_RegistrarPActionPerformed

        /*long dni = Integer.parseInt(txt_DNIC.getText());
        String nombre = txt_NombreC.getText();
        String apellidos = txt_ApellidosC.getText();
        long telefono = Integer.parseInt(txt_TelefonoC.getText());
        String email = txt_Email.getText();

        cl.setDni(dni);
        cl.setNombre(nombre);
        cl.setApellidos(apellidos);
        cl.setTelefono(telefono);
        cl.setEmail(email);

        try {
            operC.insertar(cl);
        } catch (Exception ex) {
            Logger.getLogger(VCliente.class.getName()).log(Level.SEVERE, null, ex);
        }*/
    }//GEN-LAST:event_btn_RegistrarPActionPerformed

    private void btn_MinimizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_MinimizarActionPerformed
        this.setExtendedState(1);
    }//GEN-LAST:event_btn_MinimizarActionPerformed

    private void btn_CerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CerrarActionPerformed
        dispose();
    }//GEN-LAST:event_btn_CerrarActionPerformed

    private void btn_HomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_HomeActionPerformed
        Home home = new Home();
        home.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_HomeActionPerformed

    private void btn_ActualizarPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ActualizarPActionPerformed
        try {
            listpd = pdimp.ListarProductos(rol);
        } catch (Exception ex) {
            Logger.getLogger(VProductos.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            pdimp.CargaListProductos(listpd);
            /*clts = operC.listarClientes();
            operC.cargaListClientes(clts);*/
        } catch (Exception ex) {
            Logger.getLogger(VProductos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_ActualizarPActionPerformed

    private void Box_BuscarPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Box_BuscarPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Box_BuscarPActionPerformed

    private void jbtn_BuscarPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtn_BuscarPMouseClicked

        /*String dato1 = "";
        long dato2 = 0;

        String buscarPor = (String)Box_BuscarC.getSelectedItem();

        if(buscarPor.equals("nombre") || buscarPor.equals("apellidos") || buscarPor.equals("email")){

            dato1 = txt_BuscarC.getText();
            clts = operC.listarClientes(buscarPor,dato1);
            operC.cargaListClientes(clts);

        }else{

            dato2 = Integer.parseInt(txt_BuscarC.getText());
            clts = operC.listarClientes(buscarPor,dato2);
            operC.cargaListClientes(clts);

        }*/
    }//GEN-LAST:event_jbtn_BuscarPMouseClicked

    private void btn_ElimPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ElimPActionPerformed

        /*long dni = (long) TablaCliente.getValueAt(TablaCliente.getSelectedRow(),0);

        //System.out.println(dni);
        try {
            cl = operC.buscarCliente(dni);
            operC.eliminar(cl);
        } catch (Exception ex) {
            Logger.getLogger(VCliente.class.getName()).log(Level.SEVERE, null, ex);
        }*/
    }//GEN-LAST:event_btn_ElimPActionPerformed

    private void Box_MarcaPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Box_MarcaPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Box_MarcaPActionPerformed

    private void Box_CategoriaPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Box_CategoriaPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Box_CategoriaPActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new VProductos().setVisible(true);
                } catch (Exception ex) {
                    Logger.getLogger(VProductos.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JComboBox<String> Box_BuscarP;
    public static javax.swing.JComboBox<String> Box_CategoriaP;
    public static javax.swing.JComboBox<String> Box_MarcaP;
    public static javax.swing.JTable TablaProducto;
    private javax.swing.JButton btn_ActualizarP;
    private javax.swing.JButton btn_Cerrar;
    private javax.swing.JButton btn_ElimP;
    private javax.swing.JButton btn_Home;
    private javax.swing.JButton btn_Minimizar;
    private javax.swing.JButton btn_RegistrarP;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JLabel jbtn_BuscarP;
    private javax.swing.JPanel pnl_MostrarCliente;
    private javax.swing.JPanel pnl_RegistroCliente;
    private javax.swing.JTextField txt_BuscarP;
    private javax.swing.JTextField txt_NombreP;
    private javax.swing.JTextField txt_PrecioCompra;
    private javax.swing.JTextField txt_PrecioVenta;
    // End of variables declaration//GEN-END:variables
}
