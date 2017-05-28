package ventanas;

import hbm_Impl.Oper_Clientes;
import java.awt.Color;
import modelo_hbm.Clientes;

/**
 *
 * @author breiner
 */

public class VCliente extends javax.swing.JFrame {
    
    Oper_Clientes operC;
    
    public VCliente() {
        initComponents();
        setResizable(false);
        setLocationRelativeTo(null);
        
        operC = new Oper_Clientes();
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
        txt_NombreC = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        txt_ApellidosC = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        txt_DNIC = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        txt_TelefonoC = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        txt_Email = new javax.swing.JTextField();
        btn_RegistrarC = new javax.swing.JButton();
        pnl_MostrarCliente = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TablaCliente = new javax.swing.JTable();
        btn_ActualizarC = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        Box_BuscarC = new javax.swing.JComboBox<>();
        jSeparator6 = new javax.swing.JSeparator();
        txt_BuscarC = new javax.swing.JTextField();
        jbtn_BuscarC = new javax.swing.JLabel();
        btn_ElimC = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        btn_Minimizar = new javax.swing.JButton();
        btn_Cerrar = new javax.swing.JButton();
        btn_Home = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnl_RegistroCliente.setBackground(new java.awt.Color(32, 33, 35));
        pnl_RegistroCliente.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setForeground(new java.awt.Color(57, 113, 177));
        jLabel2.setText("Nombre");
        pnl_RegistroCliente.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, -1, -1));

        jLabel3.setForeground(new java.awt.Color(52, 52, 54));
        jLabel3.setText("Apellidos");
        pnl_RegistroCliente.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, -1, -1));

        jLabel4.setForeground(new java.awt.Color(52, 52, 54));
        jLabel4.setText("Cedula");
        pnl_RegistroCliente.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, -1, -1));

        jLabel5.setForeground(new java.awt.Color(52, 52, 54));
        jLabel5.setText("Telefono");
        pnl_RegistroCliente.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, -1, -1));

        jLabel6.setForeground(new java.awt.Color(52, 52, 54));
        jLabel6.setText("Email");
        pnl_RegistroCliente.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, -1, -1));
        pnl_RegistroCliente.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 90, 210, 10));

        txt_NombreC.setBackground(new java.awt.Color(32, 33, 35));
        txt_NombreC.setForeground(new java.awt.Color(255, 255, 255));
        txt_NombreC.setBorder(null);
        txt_NombreC.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_NombreCFocusGained(evt);
            }
        });
        pnl_RegistroCliente.add(txt_NombreC, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, 210, 30));
        pnl_RegistroCliente.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 150, 210, 10));

        txt_ApellidosC.setBackground(new java.awt.Color(32, 33, 35));
        txt_ApellidosC.setForeground(new java.awt.Color(255, 255, 255));
        txt_ApellidosC.setBorder(null);
        txt_ApellidosC.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_ApellidosCFocusGained(evt);
            }
        });
        pnl_RegistroCliente.add(txt_ApellidosC, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, 210, 30));
        pnl_RegistroCliente.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 210, 210, 10));

        txt_DNIC.setBackground(new java.awt.Color(32, 33, 35));
        txt_DNIC.setForeground(new java.awt.Color(255, 255, 255));
        txt_DNIC.setBorder(null);
        txt_DNIC.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_DNICFocusGained(evt);
            }
        });
        txt_DNIC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_DNICActionPerformed(evt);
            }
        });
        pnl_RegistroCliente.add(txt_DNIC, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 180, 210, 30));
        pnl_RegistroCliente.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 270, 210, 10));

        txt_TelefonoC.setBackground(new java.awt.Color(32, 33, 35));
        txt_TelefonoC.setForeground(new java.awt.Color(255, 255, 255));
        txt_TelefonoC.setBorder(null);
        txt_TelefonoC.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_TelefonoCFocusGained(evt);
            }
        });
        pnl_RegistroCliente.add(txt_TelefonoC, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 240, 210, 30));
        pnl_RegistroCliente.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 330, 210, 10));

        txt_Email.setBackground(new java.awt.Color(32, 33, 35));
        txt_Email.setForeground(new java.awt.Color(255, 255, 255));
        txt_Email.setBorder(null);
        txt_Email.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_EmailFocusGained(evt);
            }
        });
        pnl_RegistroCliente.add(txt_Email, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 300, 210, 30));

        btn_RegistrarC.setBackground(new java.awt.Color(126, 87, 194));
        btn_RegistrarC.setFont(new java.awt.Font("NanumMyeongjo", 1, 12)); // NOI18N
        btn_RegistrarC.setForeground(new java.awt.Color(255, 255, 255));
        btn_RegistrarC.setText("Registrar");
        btn_RegistrarC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_RegistrarCActionPerformed(evt);
            }
        });
        pnl_RegistroCliente.add(btn_RegistrarC, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 400, 290, 40));

        getContentPane().add(pnl_RegistroCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 390, 500));

        pnl_MostrarCliente.setBackground(new java.awt.Color(0, 0, 0));
        pnl_MostrarCliente.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane2.setBackground(new java.awt.Color(32, 33, 35));

        TablaCliente.setForeground(new java.awt.Color(0, 0, 0));
        TablaCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "DNI sdfas", "NOMBRE  sdf", "APELLIDOS", "TELEFONO", "EMAIL"
            }
        ));
        TablaCliente.setSelectionBackground(new java.awt.Color(32, 33, 35));
        TablaCliente.setSelectionForeground(new java.awt.Color(57, 113, 177));
        jScrollPane2.setViewportView(TablaCliente);

        pnl_MostrarCliente.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, 310));

        btn_ActualizarC.setBackground(new java.awt.Color(126, 87, 194));
        btn_ActualizarC.setFont(new java.awt.Font("NanumMyeongjo", 1, 12)); // NOI18N
        btn_ActualizarC.setForeground(new java.awt.Color(255, 255, 255));
        btn_ActualizarC.setText("Mostrar Todo");
        btn_ActualizarC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ActualizarCActionPerformed(evt);
            }
        });
        pnl_MostrarCliente.add(btn_ActualizarC, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 440, -1, 40));

        jLabel8.setForeground(new java.awt.Color(57, 113, 177));
        jLabel8.setText("Buscar");
        pnl_MostrarCliente.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, 30));

        Box_BuscarC.setBackground(new java.awt.Color(32, 33, 35));
        Box_BuscarC.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        Box_BuscarC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Box_BuscarCActionPerformed(evt);
            }
        });
        pnl_MostrarCliente.add(Box_BuscarC, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70, 100, 30));
        pnl_MostrarCliente.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 100, 280, 10));

        txt_BuscarC.setBackground(new java.awt.Color(0, 0, 0));
        txt_BuscarC.setForeground(new java.awt.Color(204, 204, 204));
        txt_BuscarC.setBorder(null);
        pnl_MostrarCliente.add(txt_BuscarC, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 80, 240, 20));

        jbtn_BuscarC.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jbtn_BuscarC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbtn_BuscarCMouseClicked(evt);
            }
        });
        pnl_MostrarCliente.add(jbtn_BuscarC, new org.netbeans.lib.awtextra.AbsoluteConstraints(424, 70, 30, 30));

        btn_ElimC.setBackground(new java.awt.Color(126, 87, 194));
        btn_ElimC.setFont(new java.awt.Font("NanumMyeongjo", 1, 12)); // NOI18N
        btn_ElimC.setForeground(new java.awt.Color(255, 255, 255));
        btn_ElimC.setText("Eliminar");
        btn_ElimC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ElimCActionPerformed(evt);
            }
        });
        pnl_MostrarCliente.add(btn_ElimC, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 440, -1, 40));

        getContentPane().add(pnl_MostrarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 60, 470, 500));

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setForeground(new java.awt.Color(102, 102, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setBackground(new java.awt.Color(204, 204, 204));
        jLabel7.setFont(new java.awt.Font("DejaVu Sans", 0, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(57, 113, 157));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Cliente");
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

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_NombreCFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_NombreCFocusGained
        jLabel2.setForeground(new Color(57,113,177)); // Color titulo al seleccionar
        jLabel3.setForeground(new Color(51,52,54));
        jLabel4.setForeground(new Color(51,52,54));
        jLabel5.setForeground(new Color(51,52,54));
        jLabel6.setForeground(new Color(51,52,54));
    }//GEN-LAST:event_txt_NombreCFocusGained

    private void txt_ApellidosCFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_ApellidosCFocusGained
        jLabel3.setForeground(new Color(57,113,177)); // Color titulo al seleccionar
        jLabel2.setForeground(new Color(51,52,54));
        jLabel4.setForeground(new Color(51,52,54));
        jLabel5.setForeground(new Color(51,52,54));
        jLabel6.setForeground(new Color(51,52,54));
    }//GEN-LAST:event_txt_ApellidosCFocusGained

    private void txt_DNICFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_DNICFocusGained
        jLabel4.setForeground(new Color(57,113,177)); // Color titulo al seleccionar
        jLabel2.setForeground(new Color(51,52,54));
        jLabel3.setForeground(new Color(51,52,54));
        jLabel5.setForeground(new Color(51,52,54));
        jLabel6.setForeground(new Color(51,52,54));
    }//GEN-LAST:event_txt_DNICFocusGained

    private void txt_TelefonoCFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_TelefonoCFocusGained
        jLabel5.setForeground(new Color(57,113,177)); // Color titulo al seleccionar
        jLabel2.setForeground(new Color(51,52,54));
        jLabel4.setForeground(new Color(51,52,54));
        jLabel3.setForeground(new Color(51,52,54));
        jLabel6.setForeground(new Color(51,52,54));
    }//GEN-LAST:event_txt_TelefonoCFocusGained

    private void txt_EmailFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_EmailFocusGained
        jLabel6.setForeground(new Color(57,113,177)); // Color titulo al seleccionar
        jLabel2.setForeground(new Color(51,52,54));
        jLabel4.setForeground(new Color(51,52,54));
        jLabel5.setForeground(new Color(51,52,54));
        jLabel3.setForeground(new Color(51,52,54));
    }//GEN-LAST:event_txt_EmailFocusGained

    private void btn_RegistrarCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_RegistrarCActionPerformed
        
        long dni = Integer.parseInt(txt_DNIC.getText());
        String nombre = txt_NombreC.getText();
        String apellidos = txt_ApellidosC.getText();
        long telefono = Integer.parseInt(txt_TelefonoC.getText());
        String email = txt_Email.getText();
        
        Clientes cl = new Clientes(dni,nombre,apellidos,telefono,email);
        operC.insertar(cl);

    }//GEN-LAST:event_btn_RegistrarCActionPerformed

    private void btn_ActualizarCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ActualizarCActionPerformed
        
        /*try {
            cl.ShowDataCliente();
        } catch (SQLException ex) {
            Logger.getLogger(VCliente.class.getName()).log(Level.SEVERE, null, ex);
        }*/

    }//GEN-LAST:event_btn_ActualizarCActionPerformed

    private void Box_BuscarCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Box_BuscarCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Box_BuscarCActionPerformed

    private void jbtn_BuscarCMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtn_BuscarCMouseClicked
        /*String buscarPor = (String)Box_BuscarC.getSelectedItem();
        String dato = txt_BuscarC.getText();
        String datL = "'"+dato+"'";

        System.out.println(datL);

        if(buscarPor.equals("NOMBRE") || buscarPor.equals("APELLIDOS") || buscarPor.equals("EMAIL")){
            try {
                cl.SearchDataCliente(buscarPor,datL);
                cl.ShowDataCliente(buscarPor,datL);
            } catch (SQLException ex) {
                Logger.getLogger(VCliente.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else{
            try {
                cl.SearchDataCliente(buscarPor,dato);
                cl.ShowDataCliente(buscarPor,dato);
            } catch (SQLException ex) {
                Logger.getLogger(VCliente.class.getName()).log(Level.SEVERE, null, ex);
            }
        }*/
    }//GEN-LAST:event_jbtn_BuscarCMouseClicked

    private void btn_ElimCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ElimCActionPerformed
        /*String dni = String.valueOf((String)TablaCliente.getValueAt(TablaCliente.getSelectedRow(), 0)); //Obtener dato del jTable

        try {
            cl.DeleteDataCliente(dni);
        } catch (SQLException ex) {
            Logger.getLogger(VCliente.class.getName()).log(Level.SEVERE, null, ex);
        }*/

    }//GEN-LAST:event_btn_ElimCActionPerformed

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

    private void txt_DNICActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_DNICActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_DNICActionPerformed

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
            java.util.logging.Logger.getLogger(VCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JComboBox<String> Box_BuscarC;
    public static javax.swing.JTable TablaCliente;
    private javax.swing.JButton btn_ActualizarC;
    private javax.swing.JButton btn_Cerrar;
    private javax.swing.JButton btn_ElimC;
    private javax.swing.JButton btn_Home;
    private javax.swing.JButton btn_Minimizar;
    private javax.swing.JButton btn_RegistrarC;
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
    private javax.swing.JLabel jbtn_BuscarC;
    private javax.swing.JPanel pnl_MostrarCliente;
    private javax.swing.JPanel pnl_RegistroCliente;
    private javax.swing.JTextField txt_ApellidosC;
    private javax.swing.JTextField txt_BuscarC;
    private javax.swing.JTextField txt_DNIC;
    private javax.swing.JTextField txt_Email;
    private javax.swing.JTextField txt_NombreC;
    private javax.swing.JTextField txt_TelefonoC;
    // End of variables declaration//GEN-END:variables
}
