/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface;
import java.awt.Color;
import code.EcoSystem;
import Business.DB4OUtil.DB4OUtil;
import Business.Enterprise.Enterprise;
import Business.Networks.Networks;
import Business.Org.Organization;
import Business.SystemUserAccount.SystemUsers;
import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Parth
 */
public class MainJFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainJFrame
     */
    private EcoSystem ecosystem;
    private DB4OUtil dB4OUtil = DB4OUtil.getInstance();

    public MainJFrame() {
        System.out.println("Hello ");
        initComponents();
        ecosystem = dB4OUtil.retrieveSystem();
        this.setSize(1680, 1050);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        loginPanel = new javax.swing.JPanel();
        loginButton = new javax.swing.JButton();
        userNameText = new javax.swing.JTextField();
        passwordText = new javax.swing.JPasswordField();
        userNameLabel = new javax.swing.JLabel();
        passwordLabel = new javax.swing.JLabel();
        loginJLabel = new javax.swing.JLabel();
        logoutButton = new javax.swing.JButton();
        accountLoginUserLabel = new javax.swing.JLabel();
        loginImage = new javax.swing.JLabel();
        container = new javax.swing.JPanel();
        imageLbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jSplitPane1.setBackground(new java.awt.Color(255, 255, 255));

        loginPanel.setBackground(new java.awt.Color(253, 249, 232));
        loginPanel.setForeground(new java.awt.Color(158, 106, 154));
        loginPanel.setFocusable(false);
        loginPanel.setRequestFocusEnabled(false);

        loginButton.setBackground(new java.awt.Color(255, 255, 255));
        loginButton.setFont(new java.awt.Font("YuGothic", 1, 12)); // NOI18N
        loginButton.setForeground(new java.awt.Color(204, 130, 43));
        loginButton.setText("Login");
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });

        userNameText.setFont(new java.awt.Font("YuGothic", 1, 12)); // NOI18N
        userNameText.setForeground(new java.awt.Color(204, 130, 43));

        passwordText.setFont(new java.awt.Font("YuGothic", 1, 12)); // NOI18N
        passwordText.setForeground(new java.awt.Color(204, 130, 43));

        userNameLabel.setFont(new java.awt.Font("YuGothic", 1, 12)); // NOI18N
        userNameLabel.setForeground(new java.awt.Color(204, 130, 43));
        userNameLabel.setText("User Name");

        passwordLabel.setFont(new java.awt.Font("YuGothic", 1, 12)); // NOI18N
        passwordLabel.setForeground(new java.awt.Color(204, 130, 43));
        passwordLabel.setText("Password");

        logoutButton.setBackground(new java.awt.Color(255, 255, 255));
        logoutButton.setFont(new java.awt.Font("YuGothic", 1, 12)); // NOI18N
        logoutButton.setForeground(new java.awt.Color(204, 130, 43));
        logoutButton.setText("Logout");
        logoutButton.setEnabled(false);
        logoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutButtonActionPerformed(evt);
            }
        });

        accountLoginUserLabel.setFont(new java.awt.Font("YuGothic", 1, 18)); // NOI18N
        accountLoginUserLabel.setForeground(new java.awt.Color(204, 130, 43));
        accountLoginUserLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        accountLoginUserLabel.setText("SIGN IN");

        loginImage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        loginImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/photos/Gallery-FoodBank-4.gif"))); // NOI18N

        javax.swing.GroupLayout loginPanelLayout = new javax.swing.GroupLayout(loginPanel);
        loginPanel.setLayout(loginPanelLayout);
        loginPanelLayout.setHorizontalGroup(
            loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginPanelLayout.createSequentialGroup()
                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginPanelLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(loginJLabel))
                    .addGroup(loginPanelLayout.createSequentialGroup()
                        .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(loginPanelLayout.createSequentialGroup()
                                .addGap(104, 104, 104)
                                .addComponent(logoutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(loginPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(loginImage, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(loginPanelLayout.createSequentialGroup()
                                .addGap(44, 44, 44)
                                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(userNameLabel)
                                    .addComponent(passwordLabel))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(passwordText, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(userNameText, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(loginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(accountLoginUserLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        loginPanelLayout.setVerticalGroup(
            loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginPanelLayout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addComponent(accountLoginUserLabel)
                .addGap(18, 18, 18)
                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(userNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(userNameText, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passwordLabel)
                    .addComponent(passwordText, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addComponent(loginButton)
                .addGap(18, 18, 18)
                .addComponent(loginJLabel)
                .addGap(56, 56, 56)
                .addComponent(loginImage, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(89, 89, 89)
                .addComponent(logoutButton)
                .addContainerGap(603, Short.MAX_VALUE))
        );

        jSplitPane1.setLeftComponent(loginPanel);

        container.setBackground(new java.awt.Color(255, 255, 255));
        container.setLayout(new java.awt.CardLayout());

        imageLbl.setBackground(new java.awt.Color(255, 255, 255));
        imageLbl.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        imageLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imageLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/healthcare.gif"))); // NOI18N
        imageLbl.setToolTipText("");
        imageLbl.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        imageLbl.setMaximumSize(new java.awt.Dimension(500, 500));
        imageLbl.setPreferredSize(new java.awt.Dimension(500, 500));
        imageLbl.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        container.add(imageLbl, "card2");

        jSplitPane1.setRightComponent(container);

        getContentPane().add(jSplitPane1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void logoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutButtonActionPerformed

        logoutButton.setEnabled(false);
        userNameText.setEnabled(true);
        passwordText.setEnabled(true);
        loginButton.setEnabled(true);
        userNameText.setBorder(BorderFactory.createLineBorder(Color.GRAY));
        //passwordJLabel.setForeground(Color.BLACK);
        passwordText.setBorder(BorderFactory.createLineBorder(Color.GRAY));
        //usernameJLabel.setForeground(Color.BLACK);
        userNameText.setText("");
        passwordText.setText("");

        container.removeAll();
        JPanel blankJP = new JPanel();
        container.add("blank", blankJP);
        CardLayout crdLyt = (CardLayout) container.getLayout();
        crdLyt.next(container);
        dB4OUtil.storeSystem(ecosystem);
    }//GEN-LAST:event_logoutButtonActionPerformed

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed
        // Get user name
        String userName = userNameText.getText();
        // Get Password
        char[] passwordCharArray = passwordText.getPassword();
        String password = String.valueOf(passwordCharArray);

        //Step1: Check in the system admin user account directory if you have the user
        SystemUsers userAccount=ecosystem.getUsrAccDir().validateUser(userName, password);
        GradientPanel gradientPanel = new GradientPanel(Color.white, Color.BLUE, 2);
        loginPanel.add(gradientPanel);

        Enterprise inEnterprise=null;
        Organization inOrganization=null;

        if(userAccount==null){
            //Step 2: Go inside each network and check each enterprise
            for(Networks network:ecosystem.getNetworks()){
                //Step 2.a: check against each enterprise
                for(Enterprise enterprise:network.getEntDir().getEnterpriseList()){
                    userAccount=enterprise.getUsrAccDir().validateUser(userName, password);
                    if(userAccount==null){
                        //Step 3:check against each organization for each enterprise
                        for(Organization organization:enterprise.getOrgDir().getOrganizations()){
                            userAccount=organization.getUsrAccDir().validateUser(userName, password);
                            if(userAccount!=null){
                                inEnterprise=enterprise;
                                inOrganization=organization;
                                break;
                            }
                        }

                    }
                    else{
                        inEnterprise=enterprise;
                        break;
                    }
                    if(inOrganization!=null){
                        break;
                    }
                }
                if(inEnterprise!=null){
                    break;
                }
            }
        }

        if(userAccount==null){
            userNameText.setBorder(BorderFactory.createLineBorder(Color.RED));
            // passwordJLabel.setForeground(Color.RED);
            passwordText.setBorder(BorderFactory.createLineBorder(Color.RED));
            //usernameJLabel.setForeground(Color.RED);
            JOptionPane.showMessageDialog(null, "Invalid credentials");

            return;
        }
        else{
            userNameText.setBorder(BorderFactory.createLineBorder(Color.GRAY));
            // passwordJLabel.setForeground(Color.GRAY);
            passwordText.setBorder(BorderFactory.createLineBorder(Color.GRAY));
            // usernameJLabel.setForeground(Color.GRAY);
            CardLayout layout=(CardLayout)container.getLayout();
            container.add("workArea",userAccount.getEmpRole().createWorkArea(container, userAccount, inOrganization, inEnterprise, ecosystem));
            layout.next(container);
        }

        loginButton.setEnabled(false);
        logoutButton.setEnabled(true);
        userNameText.setEnabled(false);
        passwordText.setEnabled(false);
    }//GEN-LAST:event_loginButtonActionPerformed

    
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
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJFrame().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel accountLoginUserLabel;
    private javax.swing.JPanel container;
    private javax.swing.JLabel imageLbl;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JButton loginButton;
    private javax.swing.JLabel loginImage;
    private javax.swing.JLabel loginJLabel;
    private javax.swing.JPanel loginPanel;
    private javax.swing.JButton logoutButton;
    public javax.swing.JLabel passwordLabel;
    private javax.swing.JPasswordField passwordText;
    public javax.swing.JLabel userNameLabel;
    private javax.swing.JTextField userNameText;
    // End of variables declaration//GEN-END:variables
}
