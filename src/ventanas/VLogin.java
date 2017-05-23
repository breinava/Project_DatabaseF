package ventanas;

import java.awt.Color;

/**
 *
 * @author breiner
 */

public class VLogin extends javax.swing.JFrame {


    public VLogin() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnl_Overlay = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        txt_NombreU = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        txt_EmailU = new javax.swing.JTextField();
        txt_PassU = new javax.swing.JPasswordField();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        btn_SignUp = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jbtn_CrearU = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jbtn_Min = new javax.swing.JLabel();
        jbtn_Cerrar = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        Roles_Cbox = new javax.swing.JComboBox<>();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnl_Overlay.setBackground(new java.awt.Color(0, 0, 0));
        pnl_Overlay.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setForeground(new java.awt.Color(52, 52, 54));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Welcome.png"))); // NOI18N
        pnl_Overlay.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 220, 260, 80));

        jLabel9.setForeground(new java.awt.Color(204, 204, 204));
        jLabel9.setText("Design, Create Awesome Swing UI");
        pnl_Overlay.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 320, -1, -1));

        getContentPane().add(pnl_Overlay, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 410, 560));

        jPanel2.setBackground(new java.awt.Color(32, 33, 35));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt_NombreU.setBackground(new java.awt.Color(32, 33, 35));
        txt_NombreU.setForeground(new java.awt.Color(204, 204, 204));
        txt_NombreU.setBorder(null);
        txt_NombreU.setCaretColor(new java.awt.Color(255, 255, 255));
        txt_NombreU.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_NombreUFocusGained(evt);
            }
        });
        txt_NombreU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_NombreUActionPerformed(evt);
            }
        });
        jPanel2.add(txt_NombreU, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 160, 280, 20));

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 180, 280, 10));

        jSeparator2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 300, 280, 10));

        txt_EmailU.setBackground(new java.awt.Color(32, 33, 35));
        txt_EmailU.setForeground(new java.awt.Color(204, 204, 204));
        txt_EmailU.setBorder(null);
        txt_EmailU.setCaretColor(new java.awt.Color(255, 255, 255));
        txt_EmailU.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_EmailUFocusGained(evt);
            }
        });
        txt_EmailU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_EmailUActionPerformed(evt);
            }
        });
        jPanel2.add(txt_EmailU, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 220, 280, 20));

        txt_PassU.setBackground(new java.awt.Color(32, 33, 35));
        txt_PassU.setForeground(new java.awt.Color(204, 204, 204));
        txt_PassU.setBorder(null);
        txt_PassU.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_PassUFocusGained(evt);
            }
        });
        jPanel2.add(txt_PassU, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 280, 280, -1));

        jSeparator3.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 240, 280, 10));

        jLabel3.setForeground(new java.awt.Color(52, 52, 54));
        jLabel3.setText("Email");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 200, -1, -1));

        btn_SignUp.setBackground(new java.awt.Color(126, 87, 194));
        btn_SignUp.setFont(new java.awt.Font("NanumMyeongjo", 1, 12)); // NOI18N
        btn_SignUp.setForeground(new java.awt.Color(255, 255, 255));
        btn_SignUp.setText("Sign up");
        btn_SignUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SignUpActionPerformed(evt);
            }
        });
        jPanel2.add(btn_SignUp, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 340, 280, 40));

        jLabel4.setForeground(new java.awt.Color(52, 52, 54));
        jLabel4.setText("Password");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 260, -1, -1));

        jLabel5.setForeground(new java.awt.Color(52, 52, 54));
        jLabel5.setText("Fast sign up with social media");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 410, -1, -1));

        jLabel6.setForeground(new java.awt.Color(52, 52, 54));
        jLabel6.setText("If you are already a nember please");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 500, -1, -1));

        jbtn_CrearU.setForeground(new java.awt.Color(57, 113, 177));
        jbtn_CrearU.setText("Signin");
        jbtn_CrearU.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jbtn_CrearUFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jbtn_CrearUFocusLost(evt);
            }
        });
        jPanel2.add(jbtn_CrearU, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 500, -1, -1));

        jLabel10.setForeground(new java.awt.Color(57, 113, 177));
        jLabel10.setText("User");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, -1, -1));

        jbtn_Min.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jbtn_Min.setForeground(new java.awt.Color(57, 113, 177));
        jbtn_Min.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jbtn_Min.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/minizar2.png"))); // NOI18N
        jbtn_Min.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbtn_MinMouseClicked(evt);
            }
        });
        jPanel2.add(jbtn_Min, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 0, 20, 30));

        jbtn_Cerrar.setForeground(new java.awt.Color(57, 113, 177));
        jbtn_Cerrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jbtn_Cerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/close2.png"))); // NOI18N
        jbtn_Cerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbtn_CerrarMouseClicked(evt);
            }
        });
        jPanel2.add(jbtn_Cerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 0, 20, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/twitter1.png"))); // NOI18N
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 450, -1, -1));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/google-plus.png"))); // NOI18N
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 450, -1, -1));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/facebook.png"))); // NOI18N
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 450, -1, -1));

        jLabel13.setForeground(new java.awt.Color(52, 52, 54));
        jLabel13.setText("Name");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 140, -1, -1));

        Roles_Cbox.setBackground(new java.awt.Color(32, 33, 35));
        Roles_Cbox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "admin", "operador" }));
        Roles_Cbox.setBorder(null);
        Roles_Cbox.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                Roles_CboxFocusGained(evt);
            }
        });
        jPanel2.add(Roles_Cbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 80, -1, -1));

        jSeparator4.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 120, 280, 10));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 0, 450, 560));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo.jpg"))); // NOI18N
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 410, 560));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_NombreUFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_NombreUFocusGained

        jSeparator1.setBackground(new Color(57,113,177)); // Color de las casillas al precionar
        jLabel13.setForeground(new Color(57,113,177)); // Color de los titulos al precionar
        jLabel3.setForeground(new Color(51,52,54));
        jLabel4.setForeground(new Color(51,52,54));
        jLabel10.setForeground(new Color(51,52,54));
    }//GEN-LAST:event_txt_NombreUFocusGained

    private void txt_NombreUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_NombreUActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_NombreUActionPerformed

    private void txt_EmailUFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_EmailUFocusGained

        jSeparator3.setBackground(new Color(57,113,177)); // Color de las casillas al precionar
        jLabel3.setForeground(new Color(57,113,177)); // Color de los titulos al precionar
        jLabel10.setForeground(new Color(51,52,54));
        jLabel4.setForeground(new Color(51,52,54));
        jLabel13.setForeground(new Color(51,52,54));
    }//GEN-LAST:event_txt_EmailUFocusGained

    private void txt_EmailUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_EmailUActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_EmailUActionPerformed

    private void txt_PassUFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_PassUFocusGained

        jSeparator2.setBackground(new Color(57,113,177)); // Color de las casillas al precionar
        jLabel4.setForeground(new Color(57,113,177)); // Color de los titulos al precionar
        jLabel3.setForeground(new Color(51,52,54));
        jLabel10.setForeground(new Color(51,52,54));
        jLabel13.setForeground(new Color(51,52,54));
        //dispose();
    }//GEN-LAST:event_txt_PassUFocusGained

    private void btn_SignUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SignUpActionPerformed

        /*try {
            if(lg.Validar_Login()==1){

                System.out.println("Inicio de secion aprobado...");

                Home ho = new Home();
                ho.setVisible(true);
                this.dispose();

            }else{
                JOptionPane.showMessageDialog(null, "Acceso denegado","Mensaje de Acceso",JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (SQLException ex) {
            Logger.getLogger(VLogin.class.getName()).log(Level.SEVERE, null, ex);
        }*/

    }//GEN-LAST:event_btn_SignUpActionPerformed

    private void jbtn_CrearUFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jbtn_CrearUFocusGained

    }//GEN-LAST:event_jbtn_CrearUFocusGained

    private void jbtn_CrearUFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jbtn_CrearUFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtn_CrearUFocusLost

    private void jbtn_MinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtn_MinMouseClicked
        this.setExtendedState(1); // Minimizar
    }//GEN-LAST:event_jbtn_MinMouseClicked

    private void jbtn_CerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtn_CerrarMouseClicked
        dispose(); // Cerrar
    }//GEN-LAST:event_jbtn_CerrarMouseClicked

    private void Roles_CboxFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Roles_CboxFocusGained
        jSeparator4.setBackground(new Color(57,113,177)); // Color de las casillas al precionar
        jLabel10.setForeground(new Color(57,113,177)); // Color de los titulos al precionar
        jLabel3.setForeground(new Color(51,52,54));
        jLabel4.setForeground(new Color(51,52,54));
        jLabel13.setForeground(new Color(51,52,54));

    }//GEN-LAST:event_Roles_CboxFocusGained

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
            java.util.logging.Logger.getLogger(VLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Roles_Cbox;
    private javax.swing.JButton btn_SignUp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JLabel jbtn_Cerrar;
    private javax.swing.JLabel jbtn_CrearU;
    private javax.swing.JLabel jbtn_Min;
    private javax.swing.JPanel pnl_Overlay;
    public static javax.swing.JTextField txt_EmailU;
    public static javax.swing.JTextField txt_NombreU;
    public static javax.swing.JPasswordField txt_PassU;
    // End of variables declaration//GEN-END:variables
}
