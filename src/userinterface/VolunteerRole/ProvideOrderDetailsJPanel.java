/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.VolunteerRole;

import code.Enterprise.Enterprise;
import code.SystemUserAccount.SystemUsers;
import code.ProcessQueue.OrderPlaceRequest;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author jomraj
 */
public class ProvideOrderDetailsJPanel extends javax.swing.JPanel {

    private JPanel jPanel;
    private SystemUsers usrAcnt;
    private Enterprise entrpz;
    private OrderPlaceRequest req;

    /**
     * Creates new form ProvidePrescriptionJPanel
     */
    public ProvideOrderDetailsJPanel(JPanel userProcessContainer, SystemUsers userAccount, Enterprise enterprise, OrderPlaceRequest workRequest) {
        initComponents();
        this.jPanel = userProcessContainer;
        this.usrAcnt = userAccount;
        this.entrpz = enterprise;
        this.req = workRequest;
        pplTbl();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        provideStatusLabel = new javax.swing.JLabel();
        beneficiaryInformationLabel = new javax.swing.JLabel();
        firstNameText = new javax.swing.JTextField();
        FirstNameLabel = new javax.swing.JLabel();
        lastNameLabel = new javax.swing.JLabel();
        lastNameText = new javax.swing.JTextField();
        assignVolunteerInfoLabel = new javax.swing.JLabel();
        ageText = new javax.swing.JTextField();
        ageLabel = new javax.swing.JLabel();
        orderStatusLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtPrscrptn = new javax.swing.JTextArea();
        orderStatusCondition = new javax.swing.JLabel();
        orderDetailsText = new javax.swing.JTextField();
        assignVolunteerInfoText = new javax.swing.JTextField();
        submitButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
        provideOrderImage = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 204, 204));
        setEnabled(false);
        setLayout(null);

        provideStatusLabel.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        provideStatusLabel.setText("Provide Order Status");
        add(provideStatusLabel);
        provideStatusLabel.setBounds(283, 30, 240, 29);

        beneficiaryInformationLabel.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        beneficiaryInformationLabel.setText("BENEFICIARY INFORMATION");
        add(beneficiaryInformationLabel);
        beneficiaryInformationLabel.setBounds(337, 98, 210, 30);

        firstNameText.setEditable(false);
        add(firstNameText);
        firstNameText.setBounds(340, 190, 131, 23);

        FirstNameLabel.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        FirstNameLabel.setText("First Name :");
        add(FirstNameLabel);
        FirstNameLabel.setBounds(260, 190, 77, 17);

        lastNameLabel.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lastNameLabel.setText("Last Name :");
        add(lastNameLabel);
        lastNameLabel.setBounds(260, 300, 80, 17);

        lastNameText.setEditable(false);
        add(lastNameText);
        lastNameText.setBounds(340, 300, 131, 23);

        assignVolunteerInfoLabel.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        assignVolunteerInfoLabel.setText("Assigned Volunteer Information :");
        add(assignVolunteerInfoLabel);
        assignVolunteerInfoLabel.setBounds(130, 260, 204, 17);

        ageText.setEditable(false);
        ageText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ageTextActionPerformed(evt);
            }
        });
        add(ageText);
        ageText.setBounds(340, 340, 131, 23);

        ageLabel.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        ageLabel.setText("Age :");
        add(ageLabel);
        ageLabel.setBounds(300, 340, 40, 17);

        orderStatusLabel.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        orderStatusLabel.setText("ORDER ITEMS");
        add(orderStatusLabel);
        orderStatusLabel.setBounds(350, 380, 120, 17);

        txtPrscrptn.setColumns(20);
        txtPrscrptn.setRows(5);
        jScrollPane1.setViewportView(txtPrscrptn);

        add(jScrollPane1);
        jScrollPane1.setBounds(220, 410, 400, 86);

        orderStatusCondition.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        orderStatusCondition.setText("Preferred Cuisine :");
        add(orderStatusCondition);
        orderStatusCondition.setBounds(220, 220, 168, 17);

        orderDetailsText.setEditable(false);
        orderDetailsText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orderDetailsTextActionPerformed(evt);
            }
        });
        add(orderDetailsText);
        orderDetailsText.setBounds(340, 220, 130, 23);

        assignVolunteerInfoText.setEditable(false);
        add(assignVolunteerInfoText);
        assignVolunteerInfoText.setBounds(340, 260, 131, 23);

        submitButton.setBackground(new java.awt.Color(0, 102, 102));
        submitButton.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        submitButton.setForeground(new java.awt.Color(255, 255, 255));
        submitButton.setText("Submit");
        submitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButtonActionPerformed(evt);
            }
        });
        add(submitButton);
        submitButton.setBounds(360, 520, 130, 29);

        backButton.setBackground(new java.awt.Color(0, 102, 102));
        backButton.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        backButton.setForeground(new java.awt.Color(255, 255, 255));
        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });
        add(backButton);
        backButton.setBounds(29, 11, 90, 29);

        provideOrderImage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        provideOrderImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/doctor prescription.gif"))); // NOI18N
        add(provideOrderImage);
        provideOrderImage.setBounds(50, 90, 680, 490);
    }// </editor-fold>//GEN-END:initComponents

    private void ageTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ageTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ageTextActionPerformed

    private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitButtonActionPerformed
        String prescription = txtPrscrptn.getText();
        if (prescription.equals("")) {
            JOptionPane.showMessageDialog(null, "Prescription is mandatory");
            return;
        } else {
            int dialogResult = JOptionPane.showConfirmDialog(null, "Do you want to proceed?");
            if (dialogResult == JOptionPane.YES_OPTION) {
                req.setVolunteerNote(prescription);
                req.setReqStatus("Prescription Provided");
                JOptionPane.showMessageDialog(null, "Prescription submitted successfully");
                submitButton.setEnabled(false);
            }
        }        
    }//GEN-LAST:event_submitButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed

        jPanel.remove(this);
        Component[] componentArray = jPanel.getComponents();
        Component component = componentArray[componentArray.length - 1];
        VolunteerWorkAreaJPanel dwjp = (VolunteerWorkAreaJPanel) component;
        dwjp.pplReqTbl();
        CardLayout layout = (CardLayout) jPanel.getLayout();
        layout.previous(jPanel);
    }//GEN-LAST:event_backButtonActionPerformed

    private void orderDetailsTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orderDetailsTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_orderDetailsTextActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel FirstNameLabel;
    private javax.swing.JLabel ageLabel;
    private javax.swing.JTextField ageText;
    private javax.swing.JLabel assignVolunteerInfoLabel;
    private javax.swing.JTextField assignVolunteerInfoText;
    private javax.swing.JButton backButton;
    private javax.swing.JLabel beneficiaryInformationLabel;
    private javax.swing.JTextField firstNameText;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lastNameLabel;
    private javax.swing.JTextField lastNameText;
    private javax.swing.JTextField orderDetailsText;
    private javax.swing.JLabel orderStatusCondition;
    private javax.swing.JLabel orderStatusLabel;
    private javax.swing.JLabel provideOrderImage;
    private javax.swing.JLabel provideStatusLabel;
    private javax.swing.JButton submitButton;
    private javax.swing.JTextArea txtPrscrptn;
    // End of variables declaration//GEN-END:variables


    private void pplTbl() {
        firstNameText.setText(req.getBeneficiary().getBenFirstName());
        lastNameText.setText(req.getBeneficiary().getBenLastName());
       // txtBirthDate1.setText(String.valueOf(request.getPatient().getDateOfBirth()));
        ageText.setText(String.valueOf(req.getBeneficiary().getBenAge()));
        orderDetailsText.setText(req.getVisitReason());
        assignVolunteerInfoText.setText(req.getVolunteerAssigned().getEmploye().getEmpName());


    }
}
