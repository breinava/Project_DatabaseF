package ventanas;

/**
 *
 * @author breiner
 */

import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modelo_dao.Usuario;
import mysql_conexion.CargaRol;
import mysql_conexion.Rol;
import validaciones.Login;
import static ventanas.Home.NameUser;

public class VLogin extends javax.swing.JFrame {
    
    public VLogin() {
        initComponents();
        pnl_1.setBackground(new Color(0,0,0,195));
        setResizable(false);
        setLocationRelativeTo(null);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnl_1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        pnl_2 = new javax.swing.JPanel();
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
        jbtn_RegistrarU = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        Roles_Cbox = new javax.swing.JComboBox<>();
        jSeparator4 = new javax.swing.JSeparator();
        btn_Minimizar = new javax.swing.JButton();
        btn_Cerrar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnl_1.setBackground(new java.awt.Color(0, 0, 0));
        pnl_1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setForeground(new java.awt.Color(52, 52, 54));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Welcome.png"))); // NOI18N
        pnl_1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 220, 260, 80));

        jLabel9.setForeground(new java.awt.Color(204, 204, 204));
        jLabel9.setText("Design, Create Awesome Swing UI");
        pnl_1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 320, -1, -1));

        getContentPane().add(pnl_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 410, 560));

        pnl_2.setBackground(new java.awt.Color(32, 33, 35));
        pnl_2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        pnl_2.add(txt_NombreU, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 160, 280, 20));

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        pnl_2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 180, 280, 10));

        jSeparator2.setForeground(new java.awt.Color(255, 255, 255));
        pnl_2.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 300, 280, 10));

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
        pnl_2.add(txt_EmailU, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 220, 280, 20));

        txt_PassU.setBackground(new java.awt.Color(32, 33, 35));
        txt_PassU.setForeground(new java.awt.Color(204, 204, 204));
        txt_PassU.setBorder(null);
        txt_PassU.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_PassUFocusGained(evt);
            }
        });
        pnl_2.add(txt_PassU, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 280, 280, -1));

        jSeparator3.setForeground(new java.awt.Color(255, 255, 255));
        pnl_2.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 240, 280, 10));

        jLabel3.setForeground(new java.awt.Color(52, 52, 54));
        jLabel3.setText("Correo");
        pnl_2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 200, -1, -1));

        btn_SignUp.setBackground(new java.awt.Color(126, 87, 194));
        btn_SignUp.setFont(new java.awt.Font("NanumMyeongjo", 1, 12)); // NOI18N
        btn_SignUp.setForeground(new java.awt.Color(255, 255, 255));
        btn_SignUp.setText("Ingresar");
        btn_SignUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SignUpActionPerformed(evt);
            }
        });
        pnl_2.add(btn_SignUp, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 340, 280, 40));

        jLabel4.setForeground(new java.awt.Color(52, 52, 54));
        jLabel4.setText("Contraseña");
        pnl_2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 260, -1, -1));

        jLabel5.setForeground(new java.awt.Color(52, 52, 54));
        jLabel5.setText("Fast sign up with social media");
        pnl_2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 410, -1, -1));

        jLabel6.setForeground(new java.awt.Color(52, 52, 54));
        jLabel6.setText("If you are already a nember please");
        pnl_2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 500, -1, -1));

        jbtn_RegistrarU.setForeground(new java.awt.Color(57, 113, 177));
        jbtn_RegistrarU.setText("Sign In");
        jbtn_RegistrarU.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtn_RegistrarU.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jbtn_RegistrarUFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jbtn_RegistrarUFocusLost(evt);
            }
        });
        jbtn_RegistrarU.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jbtn_RegistrarUMousePressed(evt);
            }
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbtn_RegistrarUMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jbtn_RegistrarUMouseEntered(evt);
            }
        });
        pnl_2.add(jbtn_RegistrarU, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 500, -1, -1));

        jLabel10.setForeground(new java.awt.Color(57, 113, 177));
        jLabel10.setText("Usuario");
        pnl_2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/twitter1.png"))); // NOI18N
        pnl_2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 450, -1, -1));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/google-plus.png"))); // NOI18N
        pnl_2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 450, -1, -1));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/facebook.png"))); // NOI18N
        pnl_2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 450, -1, -1));

        jLabel13.setForeground(new java.awt.Color(52, 52, 54));
        jLabel13.setText("Nombre");
        pnl_2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 140, -1, -1));

        Roles_Cbox.setBackground(new java.awt.Color(32, 33, 35));
        Roles_Cbox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione..", "root", "admin", "cajero" }));
        Roles_Cbox.setBorder(null);
        Roles_Cbox.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                Roles_CboxFocusGained(evt);
            }
        });
        pnl_2.add(Roles_Cbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 80, -1, -1));

        jSeparator4.setForeground(new java.awt.Color(255, 255, 255));
        pnl_2.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 120, 280, 10));

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
        pnl_2.add(btn_Minimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 0, -1, 30));

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
        pnl_2.add(btn_Cerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 0, -1, 30));

        getContentPane().add(pnl_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 0, 450, 560));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo.jpg"))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 560));

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

        Login lg = new Login();
        Usuario usr = new Usuario();
        CargaRol cr = new CargaRol();
        Rol rl = new Rol();
        
        int sw = 0;

        String rolName = (String)Roles_Cbox.getSelectedItem();
        String nombre = txt_NombreU.getText();
        String email = txt_EmailU.getText();
        String pass = String.valueOf(txt_PassU.getPassword());

        if(rolName != "Seleccione.."){
            rl = cr.cargaR(rolName);
            usr.setUsuario(nombre);
            usr.setEmail(email);
            usr.setPass(pass);

            sw = lg.validaLogin(usr, rl);
            
            if(sw != 0){
                
                Home ho = new Home();
                try {
                    VProductos vpd = new VProductos();
                    vpd.setAccesoP(usr, rl);
                } catch (Exception ex) {
                    Logger.getLogger(VLogin.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                ho.setAccesoH(usr, rl);
                
                
                String algo = usr.getUsuario();
                NameUser.setText(algo);
                
                ho.setVisible(true);
                this.dispose();
        
            }else{
                JOptionPane.showMessageDialog(null, "Que mal usuario incorrecto", " Inicio de sesion Invalido",NORMAL);
            }

        }else{
            JOptionPane.showMessageDialog(null, "Seleccione un tipo de Usuario"," Tipo de Usuario Incorrecto",ICONIFIED);
        }

    }//GEN-LAST:event_btn_SignUpActionPerformed

    private void jbtn_RegistrarUFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jbtn_RegistrarUFocusGained

    }//GEN-LAST:event_jbtn_RegistrarUFocusGained

    private void jbtn_RegistrarUFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jbtn_RegistrarUFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtn_RegistrarUFocusLost

    private void Roles_CboxFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Roles_CboxFocusGained
        jSeparator4.setBackground(new Color(57,113,177)); // Color de las casillas al precionar
        jLabel10.setForeground(new Color(57,113,177)); // Color de los titulos al precionar
        jLabel3.setForeground(new Color(51,52,54));
        jLabel4.setForeground(new Color(51,52,54));
        jLabel13.setForeground(new Color(51,52,54));
    }//GEN-LAST:event_Roles_CboxFocusGained

    private void btn_MinimizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_MinimizarActionPerformed
        this.setExtendedState(1);
    }//GEN-LAST:event_btn_MinimizarActionPerformed

    private void btn_CerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CerrarActionPerformed
        dispose();
    }//GEN-LAST:event_btn_CerrarActionPerformed

    private void jbtn_RegistrarUMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtn_RegistrarUMouseEntered
        String sub = "<html><u>Sign In</u></html>";
        jbtn_RegistrarU.setText(sub);
    }//GEN-LAST:event_jbtn_RegistrarUMouseEntered

    private void jbtn_RegistrarUMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtn_RegistrarUMousePressed
        jbtn_RegistrarU.setText("Sign In");
    }//GEN-LAST:event_jbtn_RegistrarUMousePressed

    private void jbtn_RegistrarUMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtn_RegistrarUMouseClicked
        VUsuario usr = new VUsuario();
        usr.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jbtn_RegistrarUMouseClicked

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
    private javax.swing.JButton btn_Cerrar;
    private javax.swing.JButton btn_Minimizar;
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
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JLabel jbtn_RegistrarU;
    private javax.swing.JPanel pnl_1;
    private javax.swing.JPanel pnl_2;
    public static javax.swing.JTextField txt_EmailU;
    public static javax.swing.JTextField txt_NombreU;
    public static javax.swing.JPasswordField txt_PassU;
    // End of variables declaration//GEN-END:variables
}
