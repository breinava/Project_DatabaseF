package ventanas;

import java.awt.Color;
import javax.swing.JOptionPane;
import modelo_dao.Usuario;
import mysql_conexion.Rol;

/**
 *
 * @author breiner
 */
public class Home extends javax.swing.JFrame {

    Usuario user = new Usuario();
    Rol rol = new Rol();
    
    public Home() {
        initComponents();
        jPanel3.setBackground(new Color(102,102,102,195));
        setResizable(false);
        setLocationRelativeTo(null);
    }
    
    public void setAcceso(Usuario user, Rol rol){
        this.user = user;
        this.rol = rol;
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        plus_mas = new javax.swing.JPopupMenu();
        menu_Cliente = new javax.swing.JMenuItem();
        menu_Producto = new javax.swing.JMenuItem();
        menu_CategoriaPD = new javax.swing.JMenuItem();
        menu_Empleado = new javax.swing.JMenuItem();
        menu_CargoEMP = new javax.swing.JMenuItem();
        user_menu = new javax.swing.JPopupMenu();
        configuracion = new javax.swing.JMenuItem();
        Cerrar_Sesion = new javax.swing.JMenuItem();
        jPanel2 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        NameUser = new javax.swing.JLabel();
        btn_Cerrar = new javax.swing.JButton();
        btn_Minimizar = new javax.swing.JButton();
        btn_User = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        btn_Registrar = new javax.swing.JButton();
        btn_Venta = new javax.swing.JButton();
        btn_Compra = new javax.swing.JButton();
        btn_Reporte = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();

        menu_Cliente.setText("Cliente");
        menu_Cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_ClienteActionPerformed(evt);
            }
        });
        plus_mas.add(menu_Cliente);

        menu_Producto.setText("Producto");
        menu_Producto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_ProductoActionPerformed(evt);
            }
        });
        plus_mas.add(menu_Producto);

        menu_CategoriaPD.setText("Categoria");
        menu_CategoriaPD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_CategoriaPDActionPerformed(evt);
            }
        });
        plus_mas.add(menu_CategoriaPD);

        menu_Empleado.setText("Empleado");
        menu_Empleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_EmpleadoActionPerformed(evt);
            }
        });
        plus_mas.add(menu_Empleado);

        menu_CargoEMP.setText("Cargo");
        menu_CargoEMP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_CargoEMPActionPerformed(evt);
            }
        });
        plus_mas.add(menu_CargoEMP);

        configuracion.setText("Configuración de cuenta");
        user_menu.add(configuracion);

        Cerrar_Sesion.setText("Cerrar Sesión");
        Cerrar_Sesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cerrar_SesionActionPerformed(evt);
            }
        });
        user_menu.add(Cerrar_Sesion);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(32, 33, 35));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBackground(new java.awt.Color(51, 51, 51));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("AquaBase", 1, 17)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(126, 87, 194));
        jLabel3.setText("Algunos de Nuestros Productos");
        jPanel5.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jPanel2.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 780, 40));

        jPanel8.setBackground(new java.awt.Color(51, 51, 51));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/rating.png"))); // NOI18N
        jPanel8.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 240, 30));

        jLabel16.setFont(new java.awt.Font("Liberation Sans", 0, 17)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(204, 204, 204));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("Ropa");
        jPanel8.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 240, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ropa4.png"))); // NOI18N
        jPanel8.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, 160, 130));

        jPanel2.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 80, 240, 210));

        jPanel10.setBackground(new java.awt.Color(51, 51, 51));
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/rating.png"))); // NOI18N
        jPanel10.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 240, 30));

        jLabel10.setFont(new java.awt.Font("Liberation Sans", 0, 17)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(204, 204, 204));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Calzado");
        jPanel10.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 240, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/calzado1.png"))); // NOI18N
        jPanel10.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 180, 130));

        jPanel2.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 240, 210));

        jPanel11.setBackground(new java.awt.Color(51, 51, 51));
        jPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/rating.png"))); // NOI18N
        jPanel11.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 240, 30));

        jLabel14.setFont(new java.awt.Font("Liberation Sans", 0, 17)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(204, 204, 204));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Accesorios");
        jPanel11.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 240, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/accesorios.png"))); // NOI18N
        jPanel11.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 190, 130));

        jPanel2.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 80, 240, 210));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 250, 840, 310));

        jPanel3.setBackground(new java.awt.Color(102, 102, 102));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(204, 204, 204));
        jLabel2.setFont(new java.awt.Font("DejaVu Sans Light", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 51, 153));
        jLabel2.setText("SoftWareHouse v2.0");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, -1, -1));

        jLabel5.setBackground(new java.awt.Color(204, 204, 204));
        jLabel5.setFont(new java.awt.Font("DejaVu Sans Light", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 51, 153));
        jLabel5.setText(" Stay Update on latest UI");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, -1, -1));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, 840, 200));

        jPanel4.setBackground(new java.awt.Color(204, 204, 204));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        NameUser.setBackground(new java.awt.Color(204, 204, 204));
        NameUser.setFont(new java.awt.Font("DejaVu Sans Light", 1, 12)); // NOI18N
        NameUser.setForeground(new java.awt.Color(57, 113, 177));
        jPanel4.add(NameUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 20, 80, 20));

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
        jPanel4.add(btn_Cerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 0, -1, 30));

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
        jPanel4.add(btn_Minimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 0, -1, 30));

        btn_User.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/user1_1.png"))); // NOI18N
        btn_User.setBorder(null);
        btn_User.setBorderPainted(false);
        btn_User.setContentAreaFilled(false);
        btn_User.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_User.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_User.setIconTextGap(-3);
        btn_User.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/user2.png"))); // NOI18N
        btn_User.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/user3.png"))); // NOI18N
        btn_User.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_User.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_UserActionPerformed(evt);
            }
        });
        jPanel4.add(btn_User, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 10, -1, 30));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, 840, 50));

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_Registrar.setFont(new java.awt.Font("Liberation Sans", 0, 12)); // NOI18N
        btn_Registrar.setForeground(new java.awt.Color(204, 204, 255));
        btn_Registrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/anadir1.png"))); // NOI18N
        btn_Registrar.setText("Registrar");
        btn_Registrar.setBorder(null);
        btn_Registrar.setBorderPainted(false);
        btn_Registrar.setContentAreaFilled(false);
        btn_Registrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_Registrar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_Registrar.setIconTextGap(1);
        btn_Registrar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/anadir2.png"))); // NOI18N
        btn_Registrar.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/anadir3.png"))); // NOI18N
        btn_Registrar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_Registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_RegistrarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_Registrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 70, 50));

        btn_Venta.setFont(new java.awt.Font("Liberation Sans", 0, 12)); // NOI18N
        btn_Venta.setForeground(new java.awt.Color(204, 204, 255));
        btn_Venta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/venta1.png"))); // NOI18N
        btn_Venta.setText("Venta");
        btn_Venta.setBorder(null);
        btn_Venta.setBorderPainted(false);
        btn_Venta.setContentAreaFilled(false);
        btn_Venta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_Venta.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_Venta.setIconTextGap(1);
        btn_Venta.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/venta2.png"))); // NOI18N
        btn_Venta.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/venta3.png"))); // NOI18N
        btn_Venta.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_Venta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_VentaActionPerformed(evt);
            }
        });
        jPanel1.add(btn_Venta, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 70, 50));

        btn_Compra.setFont(new java.awt.Font("Liberation Sans", 0, 12)); // NOI18N
        btn_Compra.setForeground(new java.awt.Color(204, 204, 255));
        btn_Compra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/compra1.png"))); // NOI18N
        btn_Compra.setText("Compra");
        btn_Compra.setBorder(null);
        btn_Compra.setBorderPainted(false);
        btn_Compra.setContentAreaFilled(false);
        btn_Compra.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_Compra.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_Compra.setIconTextGap(1);
        btn_Compra.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/compra2.png"))); // NOI18N
        btn_Compra.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/compra3.png"))); // NOI18N
        btn_Compra.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_Compra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CompraActionPerformed(evt);
            }
        });
        jPanel1.add(btn_Compra, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 70, 50));

        btn_Reporte.setFont(new java.awt.Font("Liberation Sans", 0, 12)); // NOI18N
        btn_Reporte.setForeground(new java.awt.Color(204, 204, 255));
        btn_Reporte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/report1.png"))); // NOI18N
        btn_Reporte.setText("Reporte");
        btn_Reporte.setBorder(null);
        btn_Reporte.setBorderPainted(false);
        btn_Reporte.setContentAreaFilled(false);
        btn_Reporte.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_Reporte.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_Reporte.setIconTextGap(1);
        btn_Reporte.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/report2.png"))); // NOI18N
        btn_Reporte.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/report3.2.png"))); // NOI18N
        btn_Reporte.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_Reporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ReporteActionPerformed(evt);
            }
        });
        jPanel1.add(btn_Reporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 70, 50));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 70, 560));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondohome1.jpg"))); // NOI18N
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, -1, 200));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menu_ClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_ClienteActionPerformed
        /*VCliente vc = null;
        try {
            vc = new VCliente();
        } catch (SQLException ex) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
        }
        vc.setVisible(true);
        this.dispose();*/
    }//GEN-LAST:event_menu_ClienteActionPerformed

    private void menu_ProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_ProductoActionPerformed
        /*VProducto vp = null;
        try {
            vp = new VProducto();
        } catch (SQLException ex) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
        }
        vp.setVisible(true);
        this.dispose();*/
    }//GEN-LAST:event_menu_ProductoActionPerformed

    private void menu_CategoriaPDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_CategoriaPDActionPerformed
        /*VCategoriaProducto vcp = null;
        try {
            vcp = new  VCategoriaProducto();
        } catch (SQLException ex) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
        }
        vcp.setVisible(true);
        this.dispose();*/
    }//GEN-LAST:event_menu_CategoriaPDActionPerformed

    private void menu_EmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_EmpleadoActionPerformed
        /*VEmpleado ve = null;
        try {
            ve = new VEmpleado();
        } catch (SQLException ex) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
        }
        ve.setVisible(true);
        this.dispose();*/
    }//GEN-LAST:event_menu_EmpleadoActionPerformed

    private void menu_CargoEMPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_CargoEMPActionPerformed
        /*VCargoEmpleado vce = null;
        try {
            vce = new VCargoEmpleado();
        } catch (SQLException ex) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
        }
        vce.setVisible(true);
        this.dispose();*/
    }//GEN-LAST:event_menu_CargoEMPActionPerformed

    private void btn_CerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CerrarActionPerformed
        dispose();
    }//GEN-LAST:event_btn_CerrarActionPerformed

    private void btn_MinimizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_MinimizarActionPerformed
        this.setExtendedState(1);
    }//GEN-LAST:event_btn_MinimizarActionPerformed

    private void btn_RegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_RegistrarActionPerformed
        if(rol.getNombre() != "cajero"){
            plus_mas.show(btn_Registrar,WIDTH, WIDTH);
            
        }else{
            JOptionPane.showMessageDialog(null, "Usted No tiene Permisos", " Registro Denegado",NORMAL);
        }
    }//GEN-LAST:event_btn_RegistrarActionPerformed

    private void btn_VentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_VentaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_VentaActionPerformed

    private void btn_CompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CompraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_CompraActionPerformed

    private void btn_ReporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ReporteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_ReporteActionPerformed

    private void btn_UserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_UserActionPerformed
        user_menu.show(btn_User,WIDTH, WIDTH);
    }//GEN-LAST:event_btn_UserActionPerformed

    private void Cerrar_SesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cerrar_SesionActionPerformed
        VLogin lg = new VLogin();

        lg.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_Cerrar_SesionActionPerformed

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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Cerrar_Sesion;
    public static javax.swing.JLabel NameUser;
    private javax.swing.JButton btn_Cerrar;
    private javax.swing.JButton btn_Compra;
    private javax.swing.JButton btn_Minimizar;
    private javax.swing.JButton btn_Registrar;
    private javax.swing.JButton btn_Reporte;
    private javax.swing.JButton btn_User;
    private javax.swing.JButton btn_Venta;
    private javax.swing.JMenuItem configuracion;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JMenuItem menu_CargoEMP;
    private javax.swing.JMenuItem menu_CategoriaPD;
    private javax.swing.JMenuItem menu_Cliente;
    private javax.swing.JMenuItem menu_Empleado;
    private javax.swing.JMenuItem menu_Producto;
    private javax.swing.JPopupMenu plus_mas;
    private javax.swing.JPopupMenu user_menu;
    // End of variables declaration//GEN-END:variables
}
