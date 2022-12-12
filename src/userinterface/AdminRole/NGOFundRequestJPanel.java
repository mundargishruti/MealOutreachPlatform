/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package userinterface.AdminRole;

import code.Networks.Networks;
import code.Org.Organization;
import code.ProcessQueue.NGOFundRequest;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Pratik
 */
import code.EcoSystem;
import code.Enterprise.Enterprise;
import code.Org.OrgNGOAdmin;
import code.SystemUserAccount.SystemUsers;
import code.ProcessQueue.ProcessRequest;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
public class NGOFundRequestJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private Enterprise enterprise;
    private SystemUsers userAccount;
    private EcoSystem ecoSystem;
    
    /**
     * Creates new form NGORequestFunds
     */
    public NGOFundRequestJPanel(JPanel jPanel, Enterprise enterprise, SystemUsers userAccount, EcoSystem ecoSystem) {
        
        initComponents();
        this.userProcessContainer = jPanel;
        this.enterprise = enterprise;
        this.userAccount = userAccount;
        this.ecoSystem = ecoSystem;
        populateNGORequestTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backButton = new javax.swing.JButton();
        requestsFundNGOLabel = new javax.swing.JLabel();
        contributionsRecievedLabel = new javax.swing.JLabel();
        totalNgoFundsRecievedText = new javax.swing.JTextField();
        allContributionsRequestLabel = new javax.swing.JLabel();
        hospitalAddressLabel = new javax.swing.JLabel();
        hospitalAddressText = new javax.swing.JTextField();
        requiredAmountLabel = new javax.swing.JLabel();
        hospitalAmountText = new javax.swing.JTextField();
        hospitalNameText = new javax.swing.JTextField();
        hospitalNameLabel = new javax.swing.JLabel();
        requestFundsFromNgoButton = new javax.swing.JButton();
        allcontibutionsTable = new javax.swing.JScrollPane();
        tblNgoReq = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(253, 249, 232));

        backButton.setBackground(new java.awt.Color(0, 102, 102));
        backButton.setFont(new java.awt.Font("YuGothic", 1, 14)); // NOI18N
        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        requestsFundNGOLabel.setFont(new java.awt.Font("YuGothic", 1, 24)); // NOI18N
        requestsFundNGOLabel.setForeground(new java.awt.Color(204, 130, 43));
        requestsFundNGOLabel.setText("Request Funds from NGO");

        contributionsRecievedLabel.setFont(new java.awt.Font("YuGothic", 1, 14)); // NOI18N
        contributionsRecievedLabel.setForeground(new java.awt.Color(204, 130, 43));
        contributionsRecievedLabel.setText("Total Funds Recieved");

        totalNgoFundsRecievedText.setEditable(false);
        totalNgoFundsRecievedText.setBackground(new java.awt.Color(204, 204, 204));
        totalNgoFundsRecievedText.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N

        allContributionsRequestLabel.setFont(new java.awt.Font("YuGothic", 1, 18)); // NOI18N
        allContributionsRequestLabel.setForeground(new java.awt.Color(204, 130, 43));
        allContributionsRequestLabel.setText("All Funds Requests");

        hospitalAddressLabel.setFont(new java.awt.Font("YuGothic", 1, 14)); // NOI18N
        hospitalAddressLabel.setForeground(new java.awt.Color(204, 130, 43));
        hospitalAddressLabel.setText("Food Bank Address");

        hospitalAddressText.setBackground(new java.awt.Color(204, 204, 204));
        hospitalAddressText.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N

        requiredAmountLabel.setFont(new java.awt.Font("YuGothic", 1, 14)); // NOI18N
        requiredAmountLabel.setForeground(new java.awt.Color(204, 130, 43));
        requiredAmountLabel.setText("Amount Required By Food Bank");

        hospitalAmountText.setBackground(new java.awt.Color(204, 204, 204));
        hospitalAmountText.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N

        hospitalNameText.setBackground(new java.awt.Color(204, 204, 204));
        hospitalNameText.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N

        hospitalNameLabel.setFont(new java.awt.Font("YuGothic", 1, 14)); // NOI18N
        hospitalNameLabel.setForeground(new java.awt.Color(204, 130, 43));
        hospitalNameLabel.setText("Name Of FoodBank");

        requestFundsFromNgoButton.setBackground(new java.awt.Color(204, 130, 43));
        requestFundsFromNgoButton.setFont(new java.awt.Font("YuGothic", 1, 14)); // NOI18N
        requestFundsFromNgoButton.setText("Request Funds from NGO");
        requestFundsFromNgoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                requestFundsFromNgoButtonActionPerformed(evt);
            }
        });

        tblNgoReq.setBackground(new java.awt.Color(204, 204, 204));
        tblNgoReq.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        tblNgoReq.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Food Bank Name", "Food Bank Address", "Food Bank Donation", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        allcontibutionsTable.setViewportView(tblNgoReq);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/NGO.gif"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(backButton)
                        .addGap(186, 186, 186)
                        .addComponent(requestsFundNGOLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(requiredAmountLabel)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(hospitalAddressLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(hospitalNameLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(hospitalAmountText)
                                        .addComponent(hospitalAddressText, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(hospitalNameText, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(85, 85, 85)
                                .addComponent(requestFundsFromNgoButton))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(contributionsRecievedLabel)
                                .addGap(82, 82, 82)
                                .addComponent(totalNgoFundsRecievedText, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addGap(155, 155, 155))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 138, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(allcontibutionsTable, javax.swing.GroupLayout.PREFERRED_SIZE, 698, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(118, 118, 118))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(allContributionsRequestLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(376, 376, 376))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(backButton)
                        .addGap(25, 25, 25))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(requestsFundNGOLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(hospitalNameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(hospitalNameLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(hospitalAddressLabel)
                            .addComponent(hospitalAddressText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(requiredAmountLabel)
                            .addComponent(hospitalAmountText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(requestFundsFromNgoButton)
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(contributionsRecievedLabel)
                            .addComponent(totalNgoFundsRecievedText, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel2)))
                .addGap(26, 26, 26)
                .addComponent(allContributionsRequestLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(allcontibutionsTable, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(254, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backButtonActionPerformed

    private void requestFundsFromNgoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_requestFundsFromNgoButtonActionPerformed
     // TODO add your handling code here:

        String hospname = hospitalNameText.getText();
        String hospaddress = hospitalAddressText.getText();
        String neededamtreq = hospitalAmountText.getText();

        if(hospname.equals("") || hospaddress.equals("")||neededamtreq.equals("")){
            JOptionPane.showMessageDialog(null, "All fields are mandatory");
        }else {
            try {
                Integer.parseInt(neededamtreq);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Please type an Integer value for Funds");
                return;
            }

            NGOFundRequest ngoFundRequest = new NGOFundRequest(hospname,hospaddress, Integer.parseInt(neededamtreq));
            ngoFundRequest.setSndr(userAccount);
            ngoFundRequest.setProcessStatus("Sent");
            Organization org = null;

            List<Networks> networks = ecoSystem.getNetworks();

            for (Networks network : networks) {

                List<Enterprise> enterprises = network.getEntDir().getEnterpriseList();
                for (Enterprise enterprise : enterprises) {
                    List<Organization> organizations = enterprise.getOrgDir().getOrganizations();
                    for (Organization organization : organizations) {
                        if (organization instanceof OrgNGOAdmin) {
                            org = organization;
                            break;
                        }
                    }
                }
            }

            if (org != null) {
                org.getProcessQueue().getProcesReq().add(ngoFundRequest);
                userAccount.getProcessQueue().getProcesReq().add(ngoFundRequest);
            }
            populateNGORequestTable();
        }

    }//GEN-LAST:event_requestFundsFromNgoButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel allContributionsRequestLabel;
    private javax.swing.JScrollPane allcontibutionsTable;
    private javax.swing.JButton backButton;
    private javax.swing.JLabel contributionsRecievedLabel;
    private javax.swing.JLabel hospitalAddressLabel;
    private javax.swing.JTextField hospitalAddressText;
    private javax.swing.JTextField hospitalAmountText;
    private javax.swing.JLabel hospitalNameLabel;
    private javax.swing.JTextField hospitalNameText;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton requestFundsFromNgoButton;
    private javax.swing.JLabel requestsFundNGOLabel;
    private javax.swing.JLabel requiredAmountLabel;
    private javax.swing.JTable tblNgoReq;
    private javax.swing.JTextField totalNgoFundsRecievedText;
    // End of variables declaration//GEN-END:variables

    private void populateNGORequestTable() {
        DefaultTableModel model = (DefaultTableModel) tblNgoReq.getModel();
        int totalreqFunds = 0;
        model.setRowCount(0);
        for (ProcessRequest request : userAccount.getProcessQueue().getProcesReq()) {
            if(request instanceof NGOFundRequest){
            Object[] row = new Object[4];
            row[0] = String.valueOf(((NGOFundRequest) request).getNameOfHospital());
            row[1] = String.valueOf(((NGOFundRequest) request).getAddressOfHospital());
            row[2] = String.valueOf(((NGOFundRequest) request).getAmountRequired());
            row[3] = request.getProcessStatus();
            model.addRow(row);
            if (request.getProcessStatus().equalsIgnoreCase("Accepted")) {
                totalreqFunds += ((NGOFundRequest) request).getAmountRequired();
            }
            }
        }

        totalNgoFundsRecievedText.setText(String.valueOf(totalreqFunds));
        TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<>(model);
        tblNgoReq.setRowSorter(sorter);
    }

}
