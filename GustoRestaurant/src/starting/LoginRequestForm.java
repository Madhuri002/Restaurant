/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package starting;

/**
 *
 * @author PC
 */
public class LoginRequestForm extends javax.swing.JFrame
{

    String type;

    /**
     * Creates new form LoginRequest
     */
    public LoginRequestForm()
    {
        initComponents();
        lblManagerLogin.setText("<html><body>Find everything you need<br> to manage your restaurant.</body></html>");
        lblCustomerLogin.setText("<html><body>Find out the latest offers,<br> most selling food, review order<br> history,and more.</body></html>");
        this.setLocationRelativeTo(null); //center form in screen
    }

    public void openLoginForm()
    {
        LoginForm login = new LoginForm(type);
        login.setVisible(true);
        this.dispose();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        jPanel1 = new javax.swing.JPanel();
        btnManagerLoginReq = new javax.swing.JButton();
        lblManagerLogin = new javax.swing.JLabel();
        btnCustomerLoginReq = new javax.swing.JButton();
        lblCustomerLogin = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        lbLogo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login Request");
        setBackground(new java.awt.Color(255, 213, 0));
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        btnManagerLoginReq.setFont(new java.awt.Font("Rockwell Condensed", 1, 28)); // NOI18N
        btnManagerLoginReq.setBorderPainted(false);
        btnManagerLoginReq.setContentAreaFilled(false);
        btnManagerLoginReq.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnManagerLoginReq.setLabel("Manager Login");
        btnManagerLoginReq.setName(""); // NOI18N
        btnManagerLoginReq.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnManagerLoginReqActionPerformed(evt);
            }
        });

        lblManagerLogin.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        lblManagerLogin.setText("Find everything you need");

        btnCustomerLoginReq.setBackground(new java.awt.Color(255, 213, 0));
        btnCustomerLoginReq.setFont(new java.awt.Font("Rockwell Condensed", 1, 28)); // NOI18N
        btnCustomerLoginReq.setText("Customer Login");
        btnCustomerLoginReq.setBorderPainted(false);
        btnCustomerLoginReq.setContentAreaFilled(false);
        btnCustomerLoginReq.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCustomerLoginReq.setName(""); // NOI18N
        btnCustomerLoginReq.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnCustomerLoginReqActionPerformed(evt);
            }
        });

        lblCustomerLogin.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        lblCustomerLogin.setText("Find everything you need");

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));

        jPanel2.setBackground(new java.awt.Color(255, 213, 0));
        jPanel2.setPreferredSize(new java.awt.Dimension(396, 70));

        lbLogo.setBackground(new java.awt.Color(255, 255, 255));
        lbLogo.setFont(new java.awt.Font("Rockwell Condensed", 0, 55)); // NOI18N
        lbLogo.setForeground(new java.awt.Color(127, 72, 101));
        lbLogo.setText("GUSTO");
        lbLogo.setToolTipText("");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(264, 264, 264)
                .addComponent(lbLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(lbLogo)
                .addGap(0, 5, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnManagerLoginReq, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblManagerLogin, javax.swing.GroupLayout.DEFAULT_SIZE, 232, Short.MAX_VALUE)
                            .addComponent(jSeparator2))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 92, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnCustomerLoginReq, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(lblCustomerLogin, javax.swing.GroupLayout.DEFAULT_SIZE, 245, Short.MAX_VALUE)))
                .addGap(61, 61, 61))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 665, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnManagerLoginReq, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCustomerLoginReq, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblCustomerLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblManagerLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnManagerLoginReq.getAccessibleContext().setAccessibleName("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCustomerLoginReqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCustomerLoginReqActionPerformed
        // TODO add your handling code here:
        type = "Customer";
        openLoginForm();
    }//GEN-LAST:event_btnCustomerLoginReqActionPerformed

    private void btnManagerLoginReqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManagerLoginReqActionPerformed
        // TODO add your handling code here:
        type = "Manager";
        openLoginForm();
    }//GEN-LAST:event_btnManagerLoginReqActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[])
    {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
            {
                if ("Nimbus".equals(info.getName()))
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex)
        {
            java.util.logging.Logger.getLogger(LoginRequestForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(LoginRequestForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(LoginRequestForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(LoginRequestForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new LoginRequestForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCustomerLoginReq;
    private javax.swing.JButton btnManagerLoginReq;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lbLogo;
    private javax.swing.JLabel lblCustomerLogin;
    private javax.swing.JLabel lblManagerLogin;
    // End of variables declaration//GEN-END:variables
}
