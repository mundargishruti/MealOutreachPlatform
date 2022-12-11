/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.EBTPlannerRole;

import code.Enterprise.Enterprise;
import code.Enterprise.EBTEnterprise;
import code.EBTCard.EBTCard;
import code.Org.OrgEBTPlanner;
import code.SystemUserAccount.SystemUsers;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author shruti
 */
public class EBTPlannerWorkAreaJPanel extends javax.swing.JPanel {

    private JPanel jPanel;
    private SystemUsers usrAcnt;
    private OrgEBTPlanner ebtPlannerOrg;
    private EBTEnterprise insrCmpEnt;

    /**
     * Creates new form InsurancePolicyPlannerJPanel
     */
    public EBTPlannerWorkAreaJPanel(JPanel userProcessContainer, SystemUsers account, OrgEBTPlanner insurancePolicyPlannerOrganization, Enterprise enterprise) {
        initComponents();
        this.jPanel = userProcessContainer;
        this.usrAcnt = usrAcnt;
        this.ebtPlannerOrg = insurancePolicyPlannerOrganization;
        this.insrCmpEnt = (EBTEnterprise) enterprise;

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

        ebtCardTypeLabel = new javax.swing.JLabel();
        cardTypeLabel = new javax.swing.JLabel();
        cardTypeText = new javax.swing.JTextField();
        cardCoverageText = new javax.swing.JTextField();
        cardCoverageLabel = new javax.swing.JLabel();
        cardTermsText = new javax.swing.JTextField();
        cardTermsLabel = new javax.swing.JLabel();
        none = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPlcyPlanner = new javax.swing.JTable();
        createCardButton = new javax.swing.JButton();
        monthlyPremiumLabel = new javax.swing.JLabel();
        monthlyPremiumText = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 204, 204));

        ebtCardTypeLabel.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        ebtCardTypeLabel.setText("Create a New Card");

        cardTypeLabel.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        cardTypeLabel.setText("Card Number");

        cardCoverageLabel.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        cardCoverageLabel.setText("Card Coverage");

        cardTermsLabel.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        cardTermsLabel.setText("Card Terms & Condition");

        none.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        none.setForeground(new java.awt.Color(255, 255, 255));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel6.setText("Card Planner Work Area");

        tblPlcyPlanner.setBackground(new java.awt.Color(204, 204, 204));
        tblPlcyPlanner.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        tblPlcyPlanner.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Policy Name", "Policy Coverage %", "Monthly Premium", "Policy T&C"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblPlcyPlanner);

        createCardButton.setBackground(new java.awt.Color(0, 102, 102));
        createCardButton.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        createCardButton.setText("Create Card Type");
        createCardButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createCardButtonActionPerformed(evt);
            }
        });

        monthlyPremiumLabel.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        monthlyPremiumLabel.setText("Monthly Premium(USD)");

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/InsurancePolicy.jpg"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1061, 1061, 1061)
                        .addComponent(none))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(468, 468, 468)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(148, 148, 148)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 963, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(520, 520, 520)
                        .addComponent(ebtCardTypeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(415, 415, 415)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cardTypeLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cardTypeText, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cardCoverageLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cardCoverageText, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(monthlyPremiumLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(monthlyPremiumText, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cardTermsLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cardTermsText, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(139, 139, 139)
                        .addComponent(jLabel8))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(554, 554, 554)
                        .addComponent(createCardButton)))
                .addContainerGap(762, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ebtCardTypeLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(none))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cardTypeLabel)
                            .addComponent(cardTypeText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cardCoverageLabel)
                            .addComponent(cardCoverageText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(monthlyPremiumLabel)
                            .addComponent(monthlyPremiumText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cardTermsLabel)
                            .addComponent(cardTermsText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(createCardButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 461, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void createCardButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createCardButtonActionPerformed
        String policyName = cardTypeText.getText().trim();
        String poliCoverageTxt = cardCoverageText.getText().trim();
        String monthlyPremiumTxt = monthlyPremiumText.getText().trim();
        String policyTC = cardTermsText.getText().trim();
        if (policyName.equals("")) {
            JOptionPane.showMessageDialog(null, "EBT Card type is mandatory");
            return;
        }

        if (poliCoverageTxt.equals("")) {
            JOptionPane.showMessageDialog(null, "Allowance is mandatory");
            return;
        }

        if (monthlyPremiumTxt.equals("")) {
            JOptionPane.showMessageDialog(null, "Monthly Reimbursement is mandatory");
            return;
        }

        if (policyTC.equals("")) {
            JOptionPane.showMessageDialog(null, "EBT TC is mandatory");
            return;
        }

        double policyCoverage = 0;
        try {
            policyCoverage = Double.parseDouble(poliCoverageTxt);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Please enter numeric values for insurance coverage");

            return;
        }

        double monthlyPremium = 0;
        try {
            monthlyPremium = Double.parseDouble(monthlyPremiumTxt);
        } catch (NumberFormatException ne) {
            JOptionPane.showMessageDialog(null, "Please enter numeric values for monthly premium");
        }

        List<EBTCard> plcys = insrCmpEnt.getEbtCardDir().getEBTCards();
        for (EBTCard insurance : plcys) {
            if (policyName.equalsIgnoreCase(insurance.getebtType())) {
                JOptionPane.showMessageDialog(null, "Policy already exists, please provide some other policy name");
                return;
            }
        }
        EBTCard insr = new EBTCard(policyName, insrCmpEnt.getName(), policyCoverage);
        insr.setRequirement(policyTC);
        insr.setMothlyReimbursement(monthlyPremium);

        // InsuranceCompanyEnterprise insuranceCompanyEnterprise = insuranceCompanyEnterprise;
        insrCmpEnt.getEbtCardDir().getEBTCards().add(insr);
        JOptionPane.showMessageDialog(null, "Policy Added Successfully");
        System.out.println("Policy Added Successfully:" + insrCmpEnt.getEbtCardDir().getEBTCards());
        pplTbl();
        cardTypeText.setText("");
        monthlyPremiumText.setText("");
        cardCoverageText.setText("");
        cardTermsText.setText("");

    }//GEN-LAST:event_createCardButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel cardCoverageLabel;
    private javax.swing.JTextField cardCoverageText;
    private javax.swing.JLabel cardTermsLabel;
    private javax.swing.JTextField cardTermsText;
    private javax.swing.JLabel cardTypeLabel;
    private javax.swing.JTextField cardTypeText;
    private javax.swing.JButton createCardButton;
    private javax.swing.JLabel ebtCardTypeLabel;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel monthlyPremiumLabel;
    private javax.swing.JTextField monthlyPremiumText;
    private javax.swing.JLabel none;
    private javax.swing.JTable tblPlcyPlanner;
    // End of variables declaration//GEN-END:variables

    private void pplTbl() {
//        DefaultTableModel model = (DefaultTableModel) workRequestJTable.getModel();

        DefaultTableModel model = (DefaultTableModel) tblPlcyPlanner.getModel();
        model.setRowCount(0);
        List<EBTCard> plcys = insrCmpEnt.getEbtCardDir().getEBTCards();
        for (EBTCard insurancePolicy : plcys) {
            Object[] row = new Object[4];
            row[0] = insurancePolicy;
            row[1] = insurancePolicy.getAllowance();
            row[2] = insurancePolicy.getMothlyReimbursement();
            row[3] = insurancePolicy.getRequirement();
            model.addRow(row);
        }
        TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<>(model);
        tblPlcyPlanner.setRowSorter(sorter);
    }
}
