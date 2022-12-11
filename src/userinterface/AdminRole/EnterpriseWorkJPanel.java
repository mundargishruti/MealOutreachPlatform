package userinterface.AdminRole;

import userinterface.NGOAdministratorRole.NGOAdministratorWorkAreaPanel;
import code.EcoSystem;
import code.Enterprise.Enterprise;
import code.Enterprise.FDAEnterprise;
import code.Enterprise.EBTEnterprise;
import code.Enterprise.NGOEnterprise;
import code.SystemUserAccount.SystemUsers;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author Rajvi
 */
public class EnterpriseWorkJPanel extends javax.swing.JPanel {

    JPanel jPanel;
    Enterprise entrpz;
    SystemUsers usrAc;
    EcoSystem ecosystem;

    /**
     * Creates new form AdminWorkAreaJPanel
     */
    public EnterpriseWorkJPanel(JPanel userProcessContainer, Enterprise enterprise, SystemUsers userAccount, EcoSystem ecoSystem) {
        initComponents();
        this.jPanel = userProcessContainer;
        this.entrpz = enterprise;
        this.usrAc = userAccount;
        this.ecosystem = ecoSystem;
        enterpriseValueLabel.setText(enterprise.getName());

        if (enterprise instanceof FDAEnterprise || enterprise instanceof EBTEnterprise
            || enterprise instanceof NGOEnterprise ) {
            FDAReportRequestButton.setVisible(false);
        }
        
        if (enterprise instanceof FDAEnterprise || enterprise instanceof EBTEnterprise
            || enterprise instanceof NGOEnterprise ) {
            NgoFundReqbutton.setVisible(false);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        myWorkAreaLabel = new javax.swing.JLabel();
        manageUserButton = new javax.swing.JButton();
        manageEmployeeButton = new javax.swing.JButton();
        manageOrgButton = new javax.swing.JButton();
        enterpriseLabel = new javax.swing.JLabel();
        enterpriseValueLabel = new javax.swing.JLabel();
        FDAReportRequestButton = new javax.swing.JButton();
        workAreaImageLabel = new javax.swing.JLabel();
        NgoFundReqbutton = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 204, 204));

        myWorkAreaLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        myWorkAreaLabel.setText("ADMINISTRATION PORTAL");

        manageUserButton.setBackground(new java.awt.Color(204, 204, 204));
        manageUserButton.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        manageUserButton.setText("Manage User");
        manageUserButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageUserButtonActionPerformed(evt);
            }
        });

        manageEmployeeButton.setBackground(new java.awt.Color(204, 204, 204));
        manageEmployeeButton.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        manageEmployeeButton.setText("Manage Employee");
        manageEmployeeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageEmployeeButtonActionPerformed(evt);
            }
        });

        manageOrgButton.setBackground(new java.awt.Color(255, 204, 204));
        manageOrgButton.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        manageOrgButton.setText("Manage Organization");
        manageOrgButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageOrgButtonActionPerformed(evt);
            }
        });

        enterpriseLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        enterpriseLabel.setText("Enterprise :");

        enterpriseValueLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        FDAReportRequestButton.setBackground(new java.awt.Color(204, 204, 204));
        FDAReportRequestButton.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        FDAReportRequestButton.setText("FDA Approval Request");
        FDAReportRequestButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FDAReportRequestButtonActionPerformed(evt);
            }
        });

        workAreaImageLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/AdministrativeRole.png"))); // NOI18N

        NgoFundReqbutton.setBackground(new java.awt.Color(204, 204, 204));
        NgoFundReqbutton.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        NgoFundReqbutton.setText("Request Funds from NGO");
        NgoFundReqbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NgoFundReqbuttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(enterpriseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(manageOrgButton)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(enterpriseValueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(manageEmployeeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(manageUserButton, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(FDAReportRequestButton, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(NgoFundReqbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(170, 170, 170)
                        .addComponent(workAreaImageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 493, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(309, 309, 309)
                        .addComponent(myWorkAreaLabel)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(myWorkAreaLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(enterpriseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(enterpriseValueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(manageOrgButton)
                            .addComponent(manageEmployeeButton)
                            .addComponent(manageUserButton)
                            .addComponent(FDAReportRequestButton)
                            .addComponent(NgoFundReqbutton))))
                .addGap(41, 41, 41)
                .addComponent(workAreaImageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void manageUserButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageUserButtonActionPerformed
        // TODO add your handling code here:
        ManageUserAccountJPanel muajp = new ManageUserAccountJPanel(jPanel, entrpz);
        jPanel.add("ManageUserAccountJPanel", muajp);

        CardLayout layout = (CardLayout) jPanel.getLayout();
        layout.next(jPanel);
    }//GEN-LAST:event_manageUserButtonActionPerformed

    private void manageEmployeeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageEmployeeButtonActionPerformed


        ManageEmployeeJPanel manageEmployeeJPanel = new ManageEmployeeJPanel(jPanel, entrpz.getOrgDir());
        jPanel.add("manageEmployeeJPanel", manageEmployeeJPanel);


        CardLayout layout = (CardLayout) jPanel.getLayout();
        layout.next(jPanel);

    }//GEN-LAST:event_manageEmployeeButtonActionPerformed

    private void manageOrgButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageOrgButtonActionPerformed


        ManageOrganizationJPanel manageOrganizationJPanel = new ManageOrganizationJPanel(jPanel, entrpz.getOrgDir(), entrpz);
        jPanel.add("manageOrganizationJPanel", manageOrganizationJPanel);
        CardLayout layout = (CardLayout) jPanel.getLayout();
        layout.next(jPanel);
    }//GEN-LAST:event_manageOrgButtonActionPerformed


    private void FDAReportRequestButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FDAReportRequestButtonActionPerformed
        CardLayout layout = (CardLayout) jPanel.getLayout();
        jPanel.add("RequestReportJPanel", new RequestReportJPanel(jPanel, entrpz, usrAc, ecosystem));
        layout.next(jPanel);
    }//GEN-LAST:event_FDAReportRequestButtonActionPerformed

    private void NgoFundReqbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NgoFundReqbuttonActionPerformed
        // TODO add your handling code here:
       CardLayout layout = (CardLayout) jPanel.getLayout();
        jPanel.add("NGORequestFundsJPanel", new NGOFundRequestJPanel(jPanel, entrpz, usrAc, ecosystem));
        layout.next(jPanel);
    }//GEN-LAST:event_NgoFundReqbuttonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton FDAReportRequestButton;
    private javax.swing.JButton NgoFundReqbutton;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JLabel enterpriseValueLabel;
    private javax.swing.JButton manageEmployeeButton;
    private javax.swing.JButton manageOrgButton;
    private javax.swing.JButton manageUserButton;
    private javax.swing.JLabel myWorkAreaLabel;
    private javax.swing.JLabel workAreaImageLabel;
    // End of variables declaration//GEN-END:variables

}
