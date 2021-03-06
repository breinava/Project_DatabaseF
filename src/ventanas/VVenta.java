package ventanas;

import Vistas.DetalleFactura;
import dao_Impl.DetalleFacturaImpl;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author breiner
 */

public class VVenta extends javax.swing.JFrame {

    DetalleFacturaImpl dtfimp = new DetalleFacturaImpl();
    DetalleFactura dtf = new DetalleFactura();
    
    List<DetalleFactura> listfact = new ArrayList();
    
    public VVenta() throws Exception {
        initComponents();
        
        listfact = dtfimp.ListarFacturaD();
        dtfimp.cargaListFacturaD(listfact);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        btn_Minimizar = new javax.swing.JButton();
        btn_Cerrar = new javax.swing.JButton();
        btn_Home = new javax.swing.JButton();
        pnl_RegistroCliente1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();
        txt_PrecioCompra1 = new javax.swing.JTextField();
        jSeparator9 = new javax.swing.JSeparator();
        txt_PrecioVenta1 = new javax.swing.JTextField();
        btn_RegistrarP1 = new javax.swing.JButton();
        Box_MarcaP1 = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        txt_Stock1 = new javax.swing.JTextField();
        jSeparator12 = new javax.swing.JSeparator();
        jLabel12 = new javax.swing.JLabel();
        Box_MarcaP2 = new javax.swing.JComboBox<>();
        jSeparator10 = new javax.swing.JSeparator();
        Box_CategoriaP1 = new javax.swing.JComboBox<>();
        jSeparator11 = new javax.swing.JSeparator();
        jLabel13 = new javax.swing.JLabel();
        pnl_MostrarCliente = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TablaFactura = new javax.swing.JTable();
        btn_ActualizarP = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        Box_BuscarP = new javax.swing.JComboBox<>();
        jSeparator7 = new javax.swing.JSeparator();
        txt_BuscarP = new javax.swing.JTextField();
        jbtn_BuscarP = new javax.swing.JLabel();
        btn_ElimP = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setForeground(new java.awt.Color(102, 102, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setBackground(new java.awt.Color(204, 204, 204));
        jLabel7.setFont(new java.awt.Font("DejaVu Sans", 0, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(57, 113, 157));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Venta");
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

        pnl_RegistroCliente1.setBackground(new java.awt.Color(32, 33, 35));
        pnl_RegistroCliente1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setForeground(new java.awt.Color(57, 113, 177));
        jLabel8.setText("Producto");
        pnl_RegistroCliente1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));

        jLabel10.setForeground(new java.awt.Color(52, 52, 54));
        jLabel10.setText("Precio");
        pnl_RegistroCliente1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, -1));

        jLabel11.setForeground(new java.awt.Color(52, 52, 54));
        jLabel11.setText("Cantidad");
        pnl_RegistroCliente1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, -1, -1));
        pnl_RegistroCliente1.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, 210, 10));
        pnl_RegistroCliente1.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 150, 180, 10));

        txt_PrecioCompra1.setBackground(new java.awt.Color(32, 33, 35));
        txt_PrecioCompra1.setForeground(new java.awt.Color(255, 255, 255));
        txt_PrecioCompra1.setBorder(null);
        txt_PrecioCompra1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_PrecioCompra1FocusGained(evt);
            }
        });
        pnl_RegistroCliente1.add(txt_PrecioCompra1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, 180, 30));
        pnl_RegistroCliente1.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 210, 180, 10));

        txt_PrecioVenta1.setBackground(new java.awt.Color(32, 33, 35));
        txt_PrecioVenta1.setForeground(new java.awt.Color(255, 255, 255));
        txt_PrecioVenta1.setBorder(null);
        txt_PrecioVenta1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_PrecioVenta1FocusGained(evt);
            }
        });
        txt_PrecioVenta1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_PrecioVenta1ActionPerformed(evt);
            }
        });
        pnl_RegistroCliente1.add(txt_PrecioVenta1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 180, 180, 30));

        btn_RegistrarP1.setBackground(new java.awt.Color(126, 87, 194));
        btn_RegistrarP1.setFont(new java.awt.Font("NanumMyeongjo", 1, 12)); // NOI18N
        btn_RegistrarP1.setForeground(new java.awt.Color(255, 255, 255));
        btn_RegistrarP1.setText("Vender");
        btn_RegistrarP1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_RegistrarP1ActionPerformed(evt);
            }
        });
        pnl_RegistroCliente1.add(btn_RegistrarP1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 440, 290, 40));

        Box_MarcaP1.setBackground(new java.awt.Color(32, 33, 35));
        Box_MarcaP1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        Box_MarcaP1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Box_MarcaP1ActionPerformed(evt);
            }
        });
        pnl_RegistroCliente1.add(Box_MarcaP1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 60, 210, 30));

        jLabel14.setForeground(new java.awt.Color(52, 52, 54));
        jLabel14.setText("Total a Pagar");
        pnl_RegistroCliente1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, -1, -1));

        txt_Stock1.setBackground(new java.awt.Color(32, 33, 35));
        txt_Stock1.setForeground(new java.awt.Color(255, 255, 255));
        txt_Stock1.setBorder(null);
        txt_Stock1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_Stock1FocusGained(evt);
            }
        });
        txt_Stock1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_Stock1ActionPerformed(evt);
            }
        });
        pnl_RegistroCliente1.add(txt_Stock1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 370, 180, 30));
        pnl_RegistroCliente1.add(jSeparator12, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 400, 180, 10));

        jLabel12.setForeground(new java.awt.Color(52, 52, 54));
        jLabel12.setText("Cliente");
        pnl_RegistroCliente1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, -1, -1));

        Box_MarcaP2.setBackground(new java.awt.Color(32, 33, 35));
        Box_MarcaP2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        Box_MarcaP2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Box_MarcaP2ActionPerformed(evt);
            }
        });
        pnl_RegistroCliente1.add(Box_MarcaP2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 250, 210, 30));
        pnl_RegistroCliente1.add(jSeparator10, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 280, 210, 10));

        Box_CategoriaP1.setBackground(new java.awt.Color(32, 33, 35));
        Box_CategoriaP1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        Box_CategoriaP1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Box_CategoriaP1ActionPerformed(evt);
            }
        });
        pnl_RegistroCliente1.add(Box_CategoriaP1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 310, 210, 30));
        pnl_RegistroCliente1.add(jSeparator11, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 340, 210, 10));

        jLabel13.setForeground(new java.awt.Color(52, 52, 54));
        jLabel13.setText("Categoria");
        pnl_RegistroCliente1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, -1, -1));

        getContentPane().add(pnl_RegistroCliente1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 320, 500));

        pnl_MostrarCliente.setBackground(new java.awt.Color(0, 0, 0));
        pnl_MostrarCliente.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane2.setBackground(new java.awt.Color(32, 33, 35));

        TablaFactura.setForeground(new java.awt.Color(0, 0, 0));
        TablaFactura.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "DNI sdfas", "NOMBRE  sdf", "APELLIDOS", "TELEFONO", "EMAIL"
            }
        ));
        TablaFactura.setSelectionBackground(new java.awt.Color(32, 33, 35));
        TablaFactura.setSelectionForeground(new java.awt.Color(57, 113, 177));
        jScrollPane2.setViewportView(TablaFactura);

        pnl_MostrarCliente.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 510, 310));

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

        jLabel9.setForeground(new java.awt.Color(57, 113, 177));
        jLabel9.setText("Buscar");
        pnl_MostrarCliente.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, 30));

        Box_BuscarP.setBackground(new java.awt.Color(32, 33, 35));
        Box_BuscarP.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        Box_BuscarP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Box_BuscarPActionPerformed(evt);
            }
        });
        pnl_MostrarCliente.add(Box_BuscarP, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70, 100, 30));
        pnl_MostrarCliente.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 100, 280, 10));

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
        pnl_MostrarCliente.add(jbtn_BuscarP, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 70, 30, 30));

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

        getContentPane().add(pnl_MostrarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 60, 540, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

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

    private void txt_PrecioCompra1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_PrecioCompra1FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_PrecioCompra1FocusGained

    private void txt_PrecioVenta1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_PrecioVenta1FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_PrecioVenta1FocusGained

    private void txt_PrecioVenta1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_PrecioVenta1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_PrecioVenta1ActionPerformed

    private void btn_RegistrarP1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_RegistrarP1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_RegistrarP1ActionPerformed

    private void Box_MarcaP1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Box_MarcaP1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Box_MarcaP1ActionPerformed

    private void Box_CategoriaP1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Box_CategoriaP1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Box_CategoriaP1ActionPerformed

    private void txt_Stock1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_Stock1FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_Stock1FocusGained

    private void txt_Stock1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_Stock1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_Stock1ActionPerformed

    private void Box_MarcaP2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Box_MarcaP2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Box_MarcaP2ActionPerformed

    private void btn_ActualizarPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ActualizarPActionPerformed
        /*prodts = opd.listarProductos(); //Carga Lista de productos
        opd.cargaListProductos(prodts);

        opd.cargaBoxBuscarP(); // Carga Bosx Buscar Productos*/
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

    }//GEN-LAST:event_btn_ElimPActionPerformed

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
            java.util.logging.Logger.getLogger(VVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new VVenta().setVisible(true);
                } catch (Exception ex) {
                    Logger.getLogger(VVenta.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JComboBox<String> Box_BuscarP;
    public static javax.swing.JComboBox<String> Box_CategoriaP1;
    public static javax.swing.JComboBox<String> Box_MarcaP1;
    public static javax.swing.JComboBox<String> Box_MarcaP2;
    public static javax.swing.JTable TablaFactura;
    private javax.swing.JButton btn_ActualizarP;
    private javax.swing.JButton btn_Cerrar;
    private javax.swing.JButton btn_ElimP;
    private javax.swing.JButton btn_Home;
    private javax.swing.JButton btn_Minimizar;
    private javax.swing.JButton btn_RegistrarP1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JLabel jbtn_BuscarP;
    private javax.swing.JPanel pnl_MostrarCliente;
    private javax.swing.JPanel pnl_RegistroCliente1;
    private javax.swing.JTextField txt_BuscarP;
    private javax.swing.JTextField txt_PrecioCompra1;
    private javax.swing.JTextField txt_PrecioVenta1;
    private javax.swing.JTextField txt_Stock1;
    // End of variables declaration//GEN-END:variables
}
