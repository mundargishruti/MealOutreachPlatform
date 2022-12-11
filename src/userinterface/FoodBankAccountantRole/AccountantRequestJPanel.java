/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.FoodBankAccountantRole;

import code.EcoSystem;
import code.Enterprise.Enterprise;
import code.Enterprise.EBTEnterprise;
import code.EBTCard.EBTCard;
import code.EBTMembers.EBTMembers;
import code.Networks.Networks;
import code.Org.OrgAccountant;
import code.Org.OrgEBTAgent;
import code.Org.Organization;
import code.SystemUserAccount.SystemUsers;
import code.ProcessQueue.AccountBillRqst;
import code.ProcessQueue.cardRequest;
import java.awt.CardLayout;
import java.awt.Component;
import java.text.DecimalFormat;
import java.util.List;
import java.util.UUID;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Rajvi
 */
public class AccountantRequestJPanel extends javax.swing.JPanel {

    private JPanel jPanel;
    private SystemUsers usrAcnt;
    private Enterprise entrpz;
    private OrgAccountant acntOrg;
    private AccountBillRqst acntBillingReq;
    private EcoSystem ecosystem;
    private double pyblAmnt;

    /**
     * Creates new form AccountantWorkRequestJPanel
     */
    AccountantRequestJPanel(JPanel userProcessContainer, SystemUsers userAccount, AccountBillRqst request, Enterprise enterprise, EcoSystem ecoSystem) {
        initComponents();
        this.jPanel = userProcessContainer;
        this.usrAcnt = userAccount;
        this.entrpz = enterprise;
        this.acntOrg = acntOrg;
        this.acntBillingReq = request;
        this.ecosystem = ecoSystem;
        populate();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        processBillingAreaLabel = new javax.swing.JLabel();
        ssnLabel = new javax.swing.JLabel();
        firstNameLabel = new javax.swing.JLabel();
        lastNameLabel = new javax.swing.JLabel();
        billAmountLabel = new javax.swing.JLabel();
        ebtCardType = new javax.swing.JLabel();
        payableAmountLabel = new javax.swing.JLabel();
        initiateClainButton = new javax.swing.JButton();
        ssnText = new javax.swing.JTextField();
        ebtCardTyeText = new javax.swing.JTextField();
        amountPayableText = new javax.swing.JTextField();
        firstNameText = new javax.swing.JTextField();
        billAmountText = new javax.swing.JTextField();
        lastNameText = new javax.swing.JTextField();
        ebtCardNumberText = new javax.swing.JTextField();
        ebtCardNumberLabel = new javax.swing.JLabel();
        EBTClaimAmountLabel = new javax.swing.JLabel();
        ebtClaimAmountText = new javax.swing.JTextField();
        backButton = new javax.swing.JButton();
        completeBeneficiaryTransactionButton = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 204, 204));

        processBillingAreaLabel.setBackground(new java.awt.Color(255, 255, 255));
        processBillingAreaLabel.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        processBillingAreaLabel.setText("Process Billing Request Area");

        ssnLabel.setBackground(new java.awt.Color(255, 255, 255));
        ssnLabel.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        ssnLabel.setText("SSN");

        firstNameLabel.setBackground(new java.awt.Color(255, 255, 255));
        firstNameLabel.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        firstNameLabel.setText("FirstName");

        lastNameLabel.setBackground(new java.awt.Color(255, 255, 255));
        lastNameLabel.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lastNameLabel.setText("LastName");

        billAmountLabel.setBackground(new java.awt.Color(255, 255, 255));
        billAmountLabel.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        billAmountLabel.setText("Bill Amount");

        ebtCardType.setBackground(new java.awt.Color(255, 255, 255));
        ebtCardType.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        ebtCardType.setText("Insurance Policy Name");

        payableAmountLabel.setBackground(new java.awt.Color(255, 255, 255));
        payableAmountLabel.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        payableAmountLabel.setText("Payable Amount");

        initiateClainButton.setBackground(new java.awt.Color(0, 102, 102));
        initiateClainButton.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        initiateClainButton.setForeground(new java.awt.Color(255, 255, 255));
        initiateClainButton.setText("Charge Amount / Initiate Claim Request");
        initiateClainButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                initiateClainButtonActionPerformed(evt);
            }
        });

        ssnText.setEditable(false);

        ebtCardTyeText.setEditable(false);

        amountPayableText.setEditable(false);

        firstNameText.setEditable(false);

        billAmountText.setEditable(false);

        lastNameText.setEditable(false);

        ebtCardNumberText.setEditable(false);

        ebtCardNumberLabel.setBackground(new java.awt.Color(255, 255, 255));
        ebtCardNumberLabel.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        ebtCardNumberLabel.setText("EBT Card Number");

        EBTClaimAmountLabel.setBackground(new java.awt.Color(255, 255, 255));
        EBTClaimAmountLabel.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        EBTClaimAmountLabel.setText("Insurance Claim Amount");

        ebtClaimAmountText.setEditable(false);
        ebtClaimAmountText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ebtClaimAmountTextActionPerformed(evt);
            }
        });

        backButton.setBackground(new java.awt.Color(0, 102, 102));
        backButton.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        backButton.setForeground(new java.awt.Color(255, 255, 255));
        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        completeBeneficiaryTransactionButton.setBackground(new java.awt.Color(0, 102, 102));
        completeBeneficiaryTransactionButton.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        completeBeneficiaryTransactionButton.setForeground(new java.awt.Color(255, 255, 255));
        completeBeneficiaryTransactionButton.setText("Complete Patient Transaction");
        completeBeneficiaryTransactionButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                completeBeneficiaryTransactionButtonActionPerformed(evt);
            }
        });

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Accountant.gif"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(backButton)
                        .addGap(104, 104, 104)
                        .addComponent(processBillingAreaLabel))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap(136, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(12, 12, 12)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(ebtCardNumberLabel)
                                        .addComponent(ebtCardType))
                                    .addGap(52, 52, 52)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(ebtCardTyeText, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(ebtCardNumberText, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(payableAmountLabel)
                                        .addGap(52, 52, 52)
                                        .addComponent(amountPayableText, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(EBTClaimAmountLabel)
                                        .addGap(52, 52, 52)
                                        .addComponent(ebtClaimAmountText, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(77, 77, 77)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(ssnLabel)
                                        .addComponent(firstNameLabel)
                                        .addComponent(lastNameLabel)
                                        .addComponent(billAmountLabel))
                                    .addGap(52, 52, 52)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(firstNameText, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lastNameText, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(billAmountText, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(ssnText, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGap(48, 48, 48)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 444, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(86, 86, 86)
                            .addComponent(initiateClainButton)
                            .addGap(32, 32, 32)
                            .addComponent(completeBeneficiaryTransactionButton))))
                .addGap(15, 15, 15))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(processBillingAreaLabel)
                    .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ebtCardNumberText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ebtCardNumberLabel))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ebtCardTyeText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ebtCardType))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ssnLabel)
                            .addComponent(ssnText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(firstNameLabel)
                            .addComponent(firstNameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lastNameLabel)
                            .addComponent(lastNameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(billAmountLabel)
                            .addComponent(billAmountText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(EBTClaimAmountLabel)
                            .addComponent(ebtClaimAmountText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(payableAmountLabel)
                            .addComponent(amountPayableText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(initiateClainButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(completeBeneficiaryTransactionButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(90, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void initiateClainButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_initiateClainButtonActionPerformed
        String policyNumber = acntBillingReq.getBeneficiary().getInsuranceCustomer().getEbtCardNo();
        String ssn = acntBillingReq.getBeneficiary().getSsn();
        String policyName = acntBillingReq.getBeneficiary().getInsuranceCustomer().getEbt().getebtType();
        String insuranceCompany = acntBillingReq.getBeneficiary().getInsuranceCustomer().getEbt().getEBTAgent();
        double claimAmount = Double.parseDouble(ebtClaimAmountText.getText());
        double billAmount = acntBillingReq.getBillTotal();
        if (("Patient Transaction Completed").equals(acntBillingReq.getReqStatus())) {
            JOptionPane.showMessageDialog(null, "Insurance request sent for claim");
            return;
        }
        EBTCard insr = new EBTCard(policyName, insuranceCompany, claimAmount);
        insr.setAllowance(acntBillingReq.getBeneficiary().getInsuranceCustomer().getEbt().getAllowance());
        EBTMembers insrCus = new EBTMembers(insr, policyNumber);
        insrCus.setMemFirstName(firstNameText.getText().trim());
        insrCus.setMemLastName((lastNameText.getText().trim()));

        cardRequest isnrWrkReq = new cardRequest();
        isnrWrkReq.setInsuranceName(insuranceCompany);
        isnrWrkReq.setCardNumber(policyNumber);
        isnrWrkReq.setTypeOfCard(policyName);
        isnrWrkReq.setSocialsecurityNumber(ssn);
        isnrWrkReq.setClmAmt(claimAmount);
        isnrWrkReq.setBillingAmt(billAmount);
        isnrWrkReq.setFoodBank(entrpz.getName());

        isnrWrkReq.setSndr(usrAcnt);
        isnrWrkReq.setReqStatus("Sent");
        isnrWrkReq.setEbtMember(insrCus);

        Organization org = null;
        EBTEnterprise matchedInsuranceCompany = null;

        List<Networks> networks = ecosystem.getNetworks();
        for (Networks network : networks) {
            List<Enterprise> enterprises = network.getEntDir().getEnterpriseList();
            for (Enterprise enterprise : enterprises) {
                if (enterprise.getName().equalsIgnoreCase(acntBillingReq.getBeneficiary().getInsuranceCustomer().getEbt().getEBTAgent())) {
                    matchedInsuranceCompany = (EBTEnterprise) enterprise;
                }
            }
        }

        for (Organization organization : matchedInsuranceCompany.getOrgDir().getOrganizations()) {
            if (organization instanceof OrgEBTAgent) {
                org = organization;
                break;
            }
        }
        if (org != null) {
            org.getProcessQueue().getProcessRequests().add(isnrWrkReq);
            usrAcnt.getProcessQueue().getProcessRequests().add(isnrWrkReq);
            acntBillingReq.setReqStatus("Patient Transaction Completed");
            acntBillingReq.getBeneficiary().setIsOrderDelivered(true);
            JOptionPane.showMessageDialog(null, "Money received from patient: " + String.format("%.2f", String.valueOf(pyblAmnt)) + ". Insurance Claim Request Raised Successfully for amount:" + claimAmount);
            initiateClainButton.setEnabled(false);
        }


    }//GEN-LAST:event_initiateClainButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed

        jPanel.remove(this);
        Component[] componentArray = jPanel.getComponents();
        Component component = componentArray[componentArray.length - 1];
        ReimburseBillingsJPanel pmbjp = (ReimburseBillingsJPanel) component;
        pmbjp.populateTable();
        pmbjp.populateInsuranceClaimTable();
        CardLayout layout = (CardLayout) jPanel.getLayout();
        layout.previous(jPanel);
    }//GEN-LAST:event_backButtonActionPerformed

    private void completeBeneficiaryTransactionButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_completeBeneficiaryTransactionButtonActionPerformed
        CardLayout layout = (CardLayout) jPanel.getLayout();
        jPanel.add("EmailBillingInformationToPatient", new EmailBillingInformationToBeneficiary(jPanel, acntBillingReq));
        layout.next(jPanel);
    }//GEN-LAST:event_completeBeneficiaryTransactionButtonActionPerformed

    private void ebtClaimAmountTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ebtClaimAmountTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ebtClaimAmountTextActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel EBTClaimAmountLabel;
    private javax.swing.JTextField amountPayableText;
    private javax.swing.JButton backButton;
    private javax.swing.JLabel billAmountLabel;
    private javax.swing.JTextField billAmountText;
    private javax.swing.JButton completeBeneficiaryTransactionButton;
    private javax.swing.JLabel ebtCardNumberLabel;
    private javax.swing.JTextField ebtCardNumberText;
    private javax.swing.JTextField ebtCardTyeText;
    private javax.swing.JLabel ebtCardType;
    private javax.swing.JTextField ebtClaimAmountText;
    private javax.swing.JLabel firstNameLabel;
    private javax.swing.JTextField firstNameText;
    private javax.swing.JButton initiateClainButton;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel lastNameLabel;
    private javax.swing.JTextField lastNameText;
    private javax.swing.JLabel payableAmountLabel;
    private javax.swing.JLabel processBillingAreaLabel;
    private javax.swing.JLabel ssnLabel;
    private javax.swing.JTextField ssnText;
    // End of variables declaration//GEN-END:variables

    private void populate() {
        String policyNumber = acntBillingReq.getBeneficiary().getInsuranceCustomer().getEbtCardNo();
        DecimalFormat df2 = new DecimalFormat("#.##");
        double coverage = acntBillingReq.getBeneficiary().getInsuranceCustomer().getEbt().getAllowance();
        double billAmount = acntBillingReq.getBillTotal();
        String ssn = acntBillingReq.getBeneficiary().getSsn();
        String policyName = acntBillingReq.getBeneficiary().getInsuranceCustomer().getEbt().getebtType();
        String insuranceCompany = acntBillingReq.getBeneficiary().getInsuranceCustomer().getEbt().getEBTAgent();
        double claimAmount = (coverage * billAmount) / 100;
        pyblAmnt = billAmount - claimAmount;

        ebtCardNumberText.setText(policyNumber);
        ssnText.setText(ssn);
        firstNameText.setText(acntBillingReq.getBeneficiary().getBenFirstName());
        lastNameText.setText(acntBillingReq.getBeneficiary().getBenLastName());
        billAmountText.setText(String.valueOf(billAmount));
        ebtCardTyeText.setText(policyName);
        ebtClaimAmountText.setText(String.valueOf(claimAmount));
        amountPayableText.setText(String.valueOf(df2.format(pyblAmnt)));

        if (claimAmount > 0) {
            initiateClainButton.setEnabled(true);
            completeBeneficiaryTransactionButton.setEnabled(false);
        } else {
            completeBeneficiaryTransactionButton.setEnabled(true);
            initiateClainButton.setEnabled(false);
        }

    }
}
