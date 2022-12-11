/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.VolunteerRole;

import code.EcoSystem;
import code.Enterprise.Enterprise;
import code.Org.OrgAccountant;
import code.Org.Organization;
import code.SystemUserAccount.SystemUsers;
import code.ProcessQueue.AccountBillRqst;
import code.ProcessQueue.OrderPlaceRequest;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author shruti 
 */
public class RequestBillingJPanel extends javax.swing.JPanel {

    private JPanel jPanel;
    private SystemUsers usrAcnt;
    private Enterprise entrpz;
    private OrderPlaceRequest pntTrtmntWrkReq;
    private EcoSystem ecoSystem;
    private double cnsltChrg = 50;

    /**
     * Creates new form RequestBillingJPanel
     */
    RequestBillingJPanel(JPanel userProcessContainer, SystemUsers userAccount, Enterprise enterprise, OrderPlaceRequest workRequest) {
        initComponents();
        this.jPanel = userProcessContainer;
        this.usrAcnt = userAccount;
        this.entrpz = enterprise;
        this.pntTrtmntWrkReq = workRequest;
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

        billingRequestLabel = new javax.swing.JLabel();
        BeneficiaryInfoLabel = new javax.swing.JLabel();
        firstNameText = new javax.swing.JTextField();
        firstNameLabel = new javax.swing.JLabel();
        lastNameLabel = new javax.swing.JLabel();
        lastNameText = new javax.swing.JTextField();
        assignVounteerLabel = new javax.swing.JLabel();
        assignedVolunteerText = new javax.swing.JTextField();
        beneficiaryIdLabel = new javax.swing.JLabel();
        beneficiaryIDText = new javax.swing.JTextField();
        billingInformationLabel = new javax.swing.JLabel();
        orderActualPriceLabel = new javax.swing.JLabel();
        orderActualPriceText = new javax.swing.JTextField();
        orderDiscountedPriceLabel = new javax.swing.JLabel();
        orderDiscountedPriceText = new javax.swing.JTextField();
        deliveryChargeLabel = new javax.swing.JLabel();
        deliveryChargeText = new javax.swing.JTextField();
        lblMiscChargesUSD = new javax.swing.JLabel();
        txtMiscChargesUSD = new javax.swing.JTextField();
        sendBillRequestButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
        billRequestImage = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 204, 204));
        setLayout(null);

        billingRequestLabel.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        billingRequestLabel.setText("Billing Request");
        add(billingRequestLabel);
        billingRequestLabel.setBounds(310, 60, 157, 29);

        BeneficiaryInfoLabel.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        BeneficiaryInfoLabel.setText("BENEFICIARY INFORMATION");
        add(BeneficiaryInfoLabel);
        BeneficiaryInfoLabel.setBounds(300, 130, 180, 17);

        firstNameText.setEditable(false);
        add(firstNameText);
        firstNameText.setBounds(360, 160, 131, 23);

        firstNameLabel.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        firstNameLabel.setText("First Name :");
        add(firstNameLabel);
        firstNameLabel.setBounds(270, 170, 90, 17);

        lastNameLabel.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lastNameLabel.setText("Last Name :");
        add(lastNameLabel);
        lastNameLabel.setBounds(270, 240, 74, 17);

        lastNameText.setEditable(false);
        add(lastNameText);
        lastNameText.setBounds(360, 240, 131, 23);

        assignVounteerLabel.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        assignVounteerLabel.setText("Assigned Volunteer :");
        add(assignVounteerLabel);
        assignVounteerLabel.setBounds(210, 200, 140, 17);

        assignedVolunteerText.setEditable(false);
        add(assignedVolunteerText);
        assignedVolunteerText.setBounds(360, 200, 130, 23);

        beneficiaryIdLabel.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        beneficiaryIdLabel.setText("Beneficiary Id:");
        add(beneficiaryIdLabel);
        beneficiaryIdLabel.setBounds(250, 280, 110, 17);

        beneficiaryIDText.setEditable(false);
        add(beneficiaryIDText);
        beneficiaryIDText.setBounds(360, 280, 131, 23);

        billingInformationLabel.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        billingInformationLabel.setText("BILLING INFORMATION");
        add(billingInformationLabel);
        billingInformationLabel.setBounds(300, 360, 165, 17);

        orderActualPriceLabel.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        orderActualPriceLabel.setText("Actual Amount");
        add(orderActualPriceLabel);
        orderActualPriceLabel.setBounds(230, 390, 94, 21);

        orderActualPriceText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orderActualPriceTextActionPerformed(evt);
            }
        });
        add(orderActualPriceText);
        orderActualPriceText.setBounds(410, 390, 82, 23);

        orderDiscountedPriceLabel.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        orderDiscountedPriceLabel.setText("Quantity in lbs");
        add(orderDiscountedPriceLabel);
        orderDiscountedPriceLabel.setBounds(230, 460, 92, 21);
        add(orderDiscountedPriceText);
        orderDiscountedPriceText.setBounds(410, 460, 82, 23);

        deliveryChargeLabel.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        deliveryChargeLabel.setText("Discounted Amount");
        add(deliveryChargeLabel);
        deliveryChargeLabel.setBounds(230, 420, 158, 21);

        deliveryChargeText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deliveryChargeTextActionPerformed(evt);
            }
        });
        add(deliveryChargeText);
        deliveryChargeText.setBounds(410, 420, 82, 23);

        lblMiscChargesUSD.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblMiscChargesUSD.setText("Delivery Charges");
        add(lblMiscChargesUSD);
        lblMiscChargesUSD.setBounds(230, 490, 103, 17);
        add(txtMiscChargesUSD);
        txtMiscChargesUSD.setBounds(410, 490, 82, 23);

        sendBillRequestButton.setBackground(new java.awt.Color(0, 102, 102));
        sendBillRequestButton.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        sendBillRequestButton.setForeground(new java.awt.Color(255, 255, 255));
        sendBillRequestButton.setText("Send Billing Request");
        sendBillRequestButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendBillRequestButtonActionPerformed(evt);
            }
        });
        add(sendBillRequestButton);
        sendBillRequestButton.setBounds(300, 540, 151, 32);

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
        backButton.setBounds(80, 40, 75, 29);

        billRequestImage.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        billRequestImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/patient_experience.gif"))); // NOI18N
        billRequestImage.setToolTipText("");
        billRequestImage.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        add(billRequestImage);
        billRequestImage.setBounds(28, 5, 1470, 630);
    }// </editor-fold>//GEN-END:initComponents

    private void deliveryChargeTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deliveryChargeTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_deliveryChargeTextActionPerformed

    private void orderActualPriceTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orderActualPriceTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_orderActualPriceTextActionPerformed

    private void sendBillRequestButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendBillRequestButtonActionPerformed
        String consultationCharge = orderActualPriceText.getText().trim();
        String labChargesStr = deliveryChargeText.getText();
        String miscellaneouschargesStr = txtMiscChargesUSD.getText();
        String medicationChargesStr = orderDiscountedPriceText.getText();
        if (consultationCharge.equals("") || labChargesStr.equals("") || miscellaneouschargesStr.equals("") || medicationChargesStr.equals("")) {
            JOptionPane.showMessageDialog(null, "All fields are mandatory");
        } else {
            
            try {
                Double.parseDouble(consultationCharge);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Please provide a Numeric value for Consultation Charges");
                return;
            }
            
            try {
                Integer.parseInt(labChargesStr);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Please type a Numeric value for Lab Charges");
                return;
            }
            try {
                Integer.parseInt(miscellaneouschargesStr);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Please type a Numeric value for Miscellaneous charges");
                return;
            }
            try {
                Integer.parseInt(medicationChargesStr);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Please type a Numeric value for Medication charges");
                return;
            }
            double labCharges = Double.parseDouble(labChargesStr);
            double miscellaneouscharges = Double.parseDouble(miscellaneouschargesStr);
            double medicationCharges = Double.parseDouble(medicationChargesStr);
            double billingAmount = labCharges + cnsltChrg + medicationCharges + miscellaneouscharges;
            //request.setBillAmount(billingAmount);

            int dialogResult = JOptionPane.showConfirmDialog(null, "Do you want to proceed?");
            if (dialogResult == JOptionPane.YES_OPTION) {
                pntTrtmntWrkReq.setReqStatus("Consultation Completed");

                AccountBillRqst accountantBillingRequest = new AccountBillRqst();
                accountantBillingRequest.setBillTotal(billingAmount);
                //  accountantBillingRequest.setPatientId(Integer.parseInt(txtPatientId.getText()));

                accountantBillingRequest.setSndr(usrAcnt);
                accountantBillingRequest.setReqStatus("Sent");

                accountantBillingRequest.setBeneficiary(pntTrtmntWrkReq.getBeneficiary());

                Organization org = null;
                for (Organization organization : entrpz.getOrgDir().getOrganizations()) {

                    if (organization instanceof OrgAccountant) {
                        org = organization;
                        break;
                    }
                }
                if (org != null) {

                    org.getProcessQueue().getProcessRequests().add(accountantBillingRequest);
                    usrAcnt.getProcessQueue().getProcessRequests().add(accountantBillingRequest);

                }

                JOptionPane.showMessageDialog(null, "Billing Request submitted successfully");
                sendBillRequestButton.setEnabled(false);
            }
        }

    }//GEN-LAST:event_sendBillRequestButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:
        jPanel.remove(this);
        Component[] componentArray = jPanel.getComponents();
        Component component = componentArray[componentArray.length - 1];
        VolunteerWorkAreaJPanel dwjp = (VolunteerWorkAreaJPanel) component;
        dwjp.pplReqTbl();
        CardLayout layout = (CardLayout) jPanel.getLayout();
        layout.previous(jPanel);
    }//GEN-LAST:event_backButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BeneficiaryInfoLabel;
    private javax.swing.JLabel assignVounteerLabel;
    private javax.swing.JTextField assignedVolunteerText;
    private javax.swing.JButton backButton;
    private javax.swing.JTextField beneficiaryIDText;
    private javax.swing.JLabel beneficiaryIdLabel;
    private javax.swing.JLabel billRequestImage;
    private javax.swing.JLabel billingInformationLabel;
    private javax.swing.JLabel billingRequestLabel;
    private javax.swing.JLabel deliveryChargeLabel;
    private javax.swing.JTextField deliveryChargeText;
    private javax.swing.JLabel firstNameLabel;
    private javax.swing.JTextField firstNameText;
    private javax.swing.JLabel lastNameLabel;
    private javax.swing.JTextField lastNameText;
    private javax.swing.JLabel lblMiscChargesUSD;
    private javax.swing.JLabel orderActualPriceLabel;
    private javax.swing.JTextField orderActualPriceText;
    private javax.swing.JLabel orderDiscountedPriceLabel;
    private javax.swing.JTextField orderDiscountedPriceText;
    private javax.swing.JButton sendBillRequestButton;
    private javax.swing.JTextField txtMiscChargesUSD;
    // End of variables declaration//GEN-END:variables

    private void pplTbl() {


        firstNameText.setText(pntTrtmntWrkReq.getBeneficiary().getBenFirstName());
        lastNameText.setText(pntTrtmntWrkReq.getBeneficiary().getBenLastName());
        beneficiaryIDText.setText(String.valueOf(pntTrtmntWrkReq.getBeneficiary().getBenId()));
        assignedVolunteerText.setText(pntTrtmntWrkReq.getVolunteerAssigned().getEmploye().getEmpName());
        orderActualPriceText.setText(String.valueOf(cnsltChrg));


    }
}