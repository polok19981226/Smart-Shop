
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MD JAHID HASAH
 */
public class LogInForm extends javax.swing.JFrame {

    /**
     * Creates new form LogInForm
     */
    public LogInForm() {
        initComponents();
        this.setIconImage(new ImageIcon(getClass().getResource("iShop.png")).getImage());
        this.setLocationRelativeTo(null);
        //////////For center the log in form
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
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txt_id = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jComboBox = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        txt_pass = new javax.swing.JPasswordField();
        btnLogin = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabelclose = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabelMin = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                formMouseDragged(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(0, 51, 51));
        jPanel3.setLayout(null);

        jLabel4.setBackground(new java.awt.Color(204, 204, 204));
        jLabel4.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 51, 51));
        jLabel4.setText("User Id:");
        jPanel3.add(jLabel4);
        jLabel4.setBounds(602, 468, 68, 22);

        txt_id.setBackground(new java.awt.Color(0, 102, 102));
        txt_id.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txt_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_idActionPerformed(evt);
            }
        });
        jPanel3.add(txt_id);
        txt_id.setBounds(703, 458, 160, 40);

        jLabel5.setBackground(new java.awt.Color(204, 204, 204));
        jLabel5.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 51, 51));
        jLabel5.setText("Password: ");
        jPanel3.add(jLabel5);
        jLabel5.setBounds(602, 526, 96, 22);

        jComboBox.setBackground(new java.awt.Color(0, 102, 102));
        jComboBox.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jComboBox.setForeground(new java.awt.Color(204, 204, 204));
        jComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Owner", "Shopkeeper" }));
        jComboBox.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxActionPerformed(evt);
            }
        });
        jPanel3.add(jComboBox);
        jComboBox.setBounds(703, 400, 160, 40);

        jLabel6.setBackground(new java.awt.Color(204, 204, 204));
        jLabel6.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 51, 51));
        jLabel6.setText("Select: ");
        jPanel3.add(jLabel6);
        jLabel6.setBounds(602, 410, 63, 22);

        jButton1.setBackground(new java.awt.Color(0, 153, 51));
        jButton1.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Cancel");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1);
        jButton1.setBounds(602, 574, 120, 45);

        txt_pass.setBackground(new java.awt.Color(0, 102, 102));
        txt_pass.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jPanel3.add(txt_pass);
        txt_pass.setBounds(703, 516, 160, 40);

        btnLogin.setBackground(new java.awt.Color(255, 153, 51));
        btnLogin.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        btnLogin.setText("Log In");
        btnLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        jPanel3.add(btnLogin);
        btnLogin.setBounds(743, 574, 120, 45);

        jLabel3.setFont(new java.awt.Font("Stencil", 1, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(47, 175, 175));
        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\MD JAHID HASAH\\Documents\\NetBeansProjects\\Smart Shop\\Photo\\iShop.png")); // NOI18N
        jPanel3.add(jLabel3);
        jLabel3.setBounds(630, 220, 210, 180);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rsz_1etamain.jpg"))); // NOI18N
        jPanel3.add(jLabel1);
        jLabel1.setBounds(0, 0, 890, 700);

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 39, 890, 700));

        jPanel2.setBackground(new java.awt.Color(153, 0, 0));

        jLabelclose.setFont(new java.awt.Font("Ravie", 1, 24)); // NOI18N
        jLabelclose.setForeground(new java.awt.Color(255, 255, 255));
        jLabelclose.setText("X");
        jLabelclose.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelclose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelcloseMouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Login Form");

        jLabelMin.setFont(new java.awt.Font("Ravie", 1, 24)); // NOI18N
        jLabelMin.setForeground(new java.awt.Color(255, 255, 255));
        jLabelMin.setText("-");
        jLabelMin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelMin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelMinMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 669, Short.MAX_VALUE)
                .addComponent(jLabelMin)
                .addGap(18, 18, 18)
                .addComponent(jLabelclose)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelMin, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelclose, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 890, 50));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_idActionPerformed

    private void jLabelcloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelcloseMouseClicked
        // TODO add your handling code here:
        System.exit(0);
        
    }//GEN-LAST:event_jLabelcloseMouseClicked

    private void jLabelMinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMinMouseClicked

        // TODO add your handling code here:
        this.setState(JFrame.ICONIFIED);
        
    }//GEN-LAST:event_jLabelMinMouseClicked

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        // TODO add your handling code here:
        if(owner.equals("Owner") && txt_pass.getText().equals("12345") && txt_id.getText().equals("jahid")){
            
            Owner_Window ownerwindow = new Owner_Window();
            ownerwindow.setVisible(true);
            ownerwindow.pack();
            ownerwindow.setLocationRelativeTo(null);
            ownerwindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.dispose();
        }
        else if(keeper.equals("Shopkeeper") && txt_pass.getText().equals("12345") && txt_id.getText().equals("teem")){
            
            Shopkeeper_Window keeperwindow = new Shopkeeper_Window();
            keeperwindow.setVisible(true);
            keeperwindow.pack();
            keeperwindow.setLocationRelativeTo(null);
            keeperwindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            
        }
        else
        {
            JOptionPane.showMessageDialog(this, "Invalid Id or Password");
        }
        
        
    }//GEN-LAST:event_btnLoginActionPerformed

    
            String owner = new String();
            String keeper = new String();
            
    private void jComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxActionPerformed
        // TODO add your handling code here:
        if(jComboBox.getSelectedItem().equals("Owner"))
        {
            owner = "Owner";
        }
        else
        {
          keeper = "Shopkeeper";
        }
    }//GEN-LAST:event_jComboBoxActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        txt_id.setText(null);
        txt_pass.setText(null);
        jComboBox.setSelectedItem("Select");
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        // TODO add your handling code here:
        
        
        int Xcor = evt.getXOnScreen();
        int Ycor = evt.getYOnScreen();
        
        this.setLocation(Xcor, Ycor);
    }//GEN-LAST:event_formMouseDragged

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
            java.util.logging.Logger.getLogger(LogInForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LogInForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LogInForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LogInForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LogInForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabelMin;
    private javax.swing.JLabel jLabelclose;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField txt_id;
    private javax.swing.JPasswordField txt_pass;
    // End of variables declaration//GEN-END:variables
}
