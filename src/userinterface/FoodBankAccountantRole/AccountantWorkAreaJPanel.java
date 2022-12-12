/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.FoodBankAccountantRole;

import code.EcoSystem;
import code.Enterprise.Enterprise;
import code.Enterprise.FoodBankEnterprise;
import code.Org.OrgAccountant;
import code.Beneficiary.Beneficiary;
import code.SystemUserAccount.SystemUsers;
import java.awt.CardLayout;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PiePlot;
import org.jfree.data.general.DefaultPieDataset;


/**
 *
 * @author Rajvi
 */
public class AccountantWorkAreaJPanel extends javax.swing.JPanel {

    private JPanel JPanel;
    private SystemUsers usrAcnt;
    private OrgAccountant acntOrg;
    private Enterprise entrpz;
    private EcoSystem ecoSystem;

    /**
     * Creates new form AccountantWorkAreaJPanel
     */
    public AccountantWorkAreaJPanel(JPanel userProcessContainer, SystemUsers account, OrgAccountant accountantOrganization, Enterprise enterprise, EcoSystem ecosystem) {
        initComponents();
        this.JPanel = userProcessContainer;
        this.acntOrg = accountantOrganization;
        this.usrAcnt = account;
        this.entrpz = enterprise;
        this.ecoSystem = ecosystem;

        pplAllPtntsTbl();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnCrtApptmt = new javax.swing.JButton();
        btnPrcsMdclBll = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPtn = new javax.swing.JTable();
        btnShwPtntRprt = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(253, 249, 232));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/6.23.20-4-FAQs-About-Donated-Meals-Republish-of-Donated-Meals-Make-an-Impact.png"))); // NOI18N
        jLabel1.setText("Patient Details");

        btnCrtApptmt.setBackground(new java.awt.Color(204, 130, 43));
        btnCrtApptmt.setFont(new java.awt.Font("YuGothic", 1, 14)); // NOI18N
        btnCrtApptmt.setForeground(new java.awt.Color(255, 255, 255));
        btnCrtApptmt.setText("Create Order");
        btnCrtApptmt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrtApptmtActionPerformed(evt);
            }
        });

        btnPrcsMdclBll.setBackground(new java.awt.Color(204, 130, 43));
        btnPrcsMdclBll.setFont(new java.awt.Font("YuGothic", 1, 14)); // NOI18N
        btnPrcsMdclBll.setForeground(new java.awt.Color(255, 255, 255));
        btnPrcsMdclBll.setText("Process Order Billings");
        btnPrcsMdclBll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrcsMdclBllActionPerformed(evt);
            }
        });

        tblPtn.setBackground(new java.awt.Color(204, 204, 204));
        tblPtn.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        tblPtn.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Beneficiary Id", "Beneficiary Name", "Phone Number", "Address", "Order Status", "Appointment Date", "Category"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblPtn);

        btnShwPtntRprt.setBackground(new java.awt.Color(204, 130, 43));
        btnShwPtntRprt.setFont(new java.awt.Font("YuGothic", 1, 14)); // NOI18N
        btnShwPtntRprt.setForeground(new java.awt.Color(255, 255, 255));
        btnShwPtntRprt.setText("Show Beneficiary Report");
        btnShwPtntRprt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShwPtntRprtActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("YuGothic", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 130, 43));
        jLabel3.setText("FOOD BANK RECEPTION WORK AREA");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(323, 323, 323)
                                .addComponent(btnShwPtntRprt))
                            .addComponent(btnCrtApptmt, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnPrcsMdclBll))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 808, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(160, 160, 160)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 457, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(58, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(122, 122, 122)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 701, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCrtApptmt, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnShwPtntRprt, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPrcsMdclBll, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnCrtApptmtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrtApptmtActionPerformed

        String patientId = UUID.randomUUID().toString().substring(0, 7);
        CardLayout layout = (CardLayout) JPanel.getLayout();
        JPanel.add("CreateAppointmentJPanel", new CreateOrderJPanel(JPanel, usrAcnt, entrpz, ecoSystem, patientId));
        layout.next(JPanel);
    }//GEN-LAST:event_btnCrtApptmtActionPerformed

    private void btnPrcsMdclBllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrcsMdclBllActionPerformed
        CardLayout layout = (CardLayout) JPanel.getLayout();
        JPanel.add("ProcessMedicalBillingsJPanel", new ReimburseBillingsJPanel(JPanel, usrAcnt, entrpz, acntOrg, ecoSystem));
        layout.next(JPanel);
    }//GEN-LAST:event_btnPrcsMdclBllActionPerformed

    private void btnShwPtntRprtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShwPtntRprtActionPerformed
        List<Beneficiary> underTreatmentPatients = new ArrayList<>();
        List<Beneficiary> treatedPatients = new ArrayList<>();
        DefaultPieDataset defaultPieDataset = new DefaultPieDataset();
        List<Beneficiary> patients = ((FoodBankEnterprise) entrpz).getBenificiaryDirectory().getBeneficiaries();
        for (Beneficiary patient : patients) {
            if (patient.isIsOrderDelivered()) {
                treatedPatients.add(patient);
            } else {
                underTreatmentPatients.add(patient);
            }
        }
        defaultPieDataset.setValue("Order Pending", underTreatmentPatients.size());
        defaultPieDataset.setValue("Order Completed", treatedPatients.size());
        JFreeChart chart = ChartFactory.createPieChart("Order Status Pie Chart", defaultPieDataset, true, true, true);
        PiePlot piePlot =(PiePlot) chart.getPlot();
        ChartFrame frame = new ChartFrame("Order Status Pie Chart", chart);
        frame.setVisible(true);
        frame.setSize(500,500);
    }//GEN-LAST:event_btnShwPtntRprtActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCrtApptmt;
    private javax.swing.JButton btnPrcsMdclBll;
    private javax.swing.JButton btnShwPtntRprt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblPtn;
    // End of variables declaration//GEN-END:variables

    public void pplAllPtntsTbl() {
        List<Beneficiary> patients = ((FoodBankEnterprise) entrpz).getBenificiaryDirectory().getBeneficiaries();
        DefaultTableModel dtm = (DefaultTableModel) tblPtn.getModel();
        dtm.setRowCount(0);
        for (Beneficiary ptnt : patients) {
            Object[] row = new Object[7];

            row[0] = ptnt;
            row[1] = ptnt.getBenFirstName() + " " + ptnt.getBenLastName();
            row[2] = ptnt.getContactNo();
            row[3] = ptnt.getAddress();
            row[4] = ptnt.isIsOrderDelivered() ? "Order Complete" : "Order In Progress";
            row[5] = ptnt.getOrderDate();
            row[6] = ptnt.getVolType();
            dtm.addRow(row);
        }
        
        TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<>(dtm);
        tblPtn.setRowSorter(sorter);
    }
}
