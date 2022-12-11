/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.VolunteerRole;


import code.Enterprise.Enterprise;
import code.Org.OrgVolunteer;
import code.SystemUserAccount.SystemUsers;
import code.ProcessQueue.RestaurantRequest;
import code.ProcessQueue.OrderPlaceRequest;
import code.ProcessQueue.ProcessRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;


/**
 *
 * @author Parth
 */
public class VolunteerWorkAreaJPanel extends javax.swing.JPanel {

    private JPanel jPanel;
    private OrgVolunteer docOrg;
    private Enterprise entrpz;
    private SystemUsers usrAcnt;
    //private Map<PatientTreatmentWorkRequest, LabTestWorkRequest> patientToLab = new HashMap<>();

    /**
     * Creates new form DoctorWorkAreaJPanel
     */
    public VolunteerWorkAreaJPanel(JPanel userProcessContainer, SystemUsers account, OrgVolunteer organization, Enterprise enterprise) {
        initComponents();

        this.jPanel = userProcessContainer;
        this.docOrg = organization;
        this.entrpz = enterprise;
        this.usrAcnt = account;
        valueLabel.setText(enterprise.getName());
        pplReqTbl();
    }

    public void pplReqTbl() {

        DefaultTableModel model = (DefaultTableModel) tblDrWrkArea.getModel();

        model.setRowCount(0);


        for (ProcessRequest req : docOrg.getProcessQueue().getProcessRequests()) {
            Object[] row = new Object[8];
            
            if(((OrderPlaceRequest) req).getBeneficiary().getVolType().equals(usrAcnt.getUserType())){
            
            row[0] = ((OrderPlaceRequest) req).getOrderDate();
            row[1] = String.valueOf(((OrderPlaceRequest) req).getBeneficiary().getBenId());
            row[2] = ((OrderPlaceRequest) req).getBeneficiary().getBenFirstName() + " " + ((OrderPlaceRequest) req).getBeneficiary().getBenLastName();
            row[3] = ((OrderPlaceRequest) req);
            row[4] = ((OrderPlaceRequest) req).getVolunteerAssigned();
            row[5] = ((OrderPlaceRequest) req).getOrderPlacedVolunteer();
            row[6] = ((OrderPlaceRequest) req).getOrderResult();
            row[7] = req.getReqStatus();


            model.addRow(row);
            }
        }
        
        TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<>(model);
        tblDrWrkArea.setRowSorter(sorter);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblDrWrkArea = new javax.swing.JTable();
        orderProcessButton = new javax.swing.JButton();
        enterpriceLabel = new javax.swing.JLabel();
        valueLabel = new javax.swing.JLabel();
        orderWorkQueueLabel = new javax.swing.JLabel();
        assignToMeButton = new javax.swing.JButton();
        enterStatusButton = new javax.swing.JButton();
        completeOrderButton = new javax.swing.JButton();
        viewBeneficiaryButton = new javax.swing.JButton();
        volunteerWorkAreaLabel = new javax.swing.JLabel();
        restaurantRequestLabel = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 204, 204));

        tblDrWrkArea.setBackground(new java.awt.Color(204, 204, 204));
        tblDrWrkArea.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Beneficiary Registration Date", "Beneficiary Id", "Beneficiary Name", "Preferred Cuisine ", "Assigned Volunteer", "Restaurant", "Restaurant Message", "Order Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblDrWrkArea);

        orderProcessButton.setBackground(new java.awt.Color(0, 102, 102));
        orderProcessButton.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        orderProcessButton.setForeground(new java.awt.Color(255, 255, 255));
        orderProcessButton.setText("Order Process");
        orderProcessButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orderProcessButtonActionPerformed(evt);
            }
        });

        enterpriceLabel.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        enterpriceLabel.setText("Enterprise :");

        valueLabel.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        valueLabel.setText("<value>");

        orderWorkQueueLabel.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        orderWorkQueueLabel.setText("Food Order Work Queue");

        assignToMeButton.setBackground(new java.awt.Color(0, 102, 102));
        assignToMeButton.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        assignToMeButton.setForeground(new java.awt.Color(255, 255, 255));
        assignToMeButton.setText("Assign To Me");
        assignToMeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assignToMeButtonActionPerformed(evt);
            }
        });

        enterStatusButton.setBackground(new java.awt.Color(0, 102, 102));
        enterStatusButton.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        enterStatusButton.setForeground(new java.awt.Color(255, 255, 255));
        enterStatusButton.setText("List Order Items");
        enterStatusButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterStatusButtonActionPerformed(evt);
            }
        });

        completeOrderButton.setBackground(new java.awt.Color(0, 102, 102));
        completeOrderButton.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        completeOrderButton.setForeground(new java.awt.Color(255, 255, 255));
        completeOrderButton.setText("Complete Order");
        completeOrderButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                completeOrderButtonActionPerformed(evt);
            }
        });

        viewBeneficiaryButton.setBackground(new java.awt.Color(0, 102, 102));
        viewBeneficiaryButton.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        viewBeneficiaryButton.setForeground(new java.awt.Color(255, 255, 255));
        viewBeneficiaryButton.setText("View Beneficiary");
        viewBeneficiaryButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewBeneficiaryButtonActionPerformed(evt);
            }
        });

        volunteerWorkAreaLabel.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        volunteerWorkAreaLabel.setText("Volunteer Work Area");

        restaurantRequestLabel.setBackground(new java.awt.Color(0, 102, 102));
        restaurantRequestLabel.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        restaurantRequestLabel.setForeground(new java.awt.Color(255, 255, 255));
        restaurantRequestLabel.setText("Request Restaurant");
        restaurantRequestLabel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                restaurantRequestLabelActionPerformed(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/happy-happy-doctor.gif"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(enterpriceLabel)
                                .addGap(18, 18, 18)
                                .addComponent(valueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(327, 327, 327)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(volunteerWorkAreaLabel)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(19, 19, 19)
                                        .addComponent(orderWorkQueueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(viewBeneficiaryButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(assignToMeButton)
                        .addGap(31, 31, 31)
                        .addComponent(orderProcessButton)
                        .addGap(30, 30, 30)
                        .addComponent(enterStatusButton)
                        .addGap(18, 18, 18)
                        .addComponent(completeOrderButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(325, 325, 325)
                        .addComponent(restaurantRequestLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 830, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(39, 39, 39)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 397, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(53, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(volunteerWorkAreaLabel)
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(enterpriceLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(valueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(14, 14, 14)
                        .addComponent(orderWorkQueueLabel)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(assignToMeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(enterStatusButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(orderProcessButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(viewBeneficiaryButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(completeOrderButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(restaurantRequestLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(161, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void orderProcessButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orderProcessButtonActionPerformed

        int selectedRow = tblDrWrkArea.getSelectedRow();
        OrderPlaceRequest wrkReq;

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row");
            return;
        } else {

            wrkReq = (OrderPlaceRequest) tblDrWrkArea.getValueAt(selectedRow, 3);
            if (wrkReq.getVolunteerAssigned() != null) {
                if (usrAcnt.equals(wrkReq.getVolunteerAssigned())) {
                    if (wrkReq.getReqStatus().equalsIgnoreCase("Under Consultation")) {

                        CardLayout layout = (CardLayout) jPanel.getLayout();
                        jPanel.add("RequestLabTestJPanel", new RequestHotelFoodJPanel(jPanel, usrAcnt, entrpz, wrkReq));
                        layout.next(jPanel);

                    } else {
                        JOptionPane.showMessageDialog(null, "Can not create the Lab request as the current status is " + wrkReq.getReqStatus());
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Not Authorised");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Please assign the request first");
            }
        }


    }//GEN-LAST:event_orderProcessButtonActionPerformed

    private void assignToMeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assignToMeButtonActionPerformed

        int selectedRow = tblDrWrkArea.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row");
            return;
        } else {


            ProcessRequest pntTrtmWrkReq = (OrderPlaceRequest) tblDrWrkArea.getValueAt(selectedRow, 3);
            if (((OrderPlaceRequest) pntTrtmWrkReq).getVolunteerAssigned() == null) {


                if (pntTrtmWrkReq.getReqStatus().equalsIgnoreCase("Waiting for Doctor")) {
                    //patientTreatmentWorkRequest.setReceiver(userAccount);

                    ((OrderPlaceRequest) pntTrtmWrkReq).setVolunteerAssigned(usrAcnt);
                    pntTrtmWrkReq.setReqStatus("Under Consultation");
                    pplReqTbl();

                    JOptionPane.showMessageDialog(null, "Success !! Request is assigned to you ");
                } else {
                    JOptionPane.showMessageDialog(null, "Cannot assign this patient as its current state is: " + pntTrtmWrkReq.getReqStatus());
                }

            } else {

                if(usrAcnt.equals(((OrderPlaceRequest) pntTrtmWrkReq).getVolunteerAssigned())) {

                 JOptionPane.showMessageDialog(null, "Request is already assigned to you");
                } else {
                    JOptionPane.showMessageDialog(null, "Not Authorized");
                }
            }
        }
    }//GEN-LAST:event_assignToMeButtonActionPerformed

    private void viewBeneficiaryButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewBeneficiaryButtonActionPerformed
        int selectedRow = tblDrWrkArea.getSelectedRow();
        OrderPlaceRequest patientWorkRequest;

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row");
            return;
        } else {
            patientWorkRequest = (OrderPlaceRequest) tblDrWrkArea.getValueAt(selectedRow, 3);
            CardLayout layout = (CardLayout) jPanel.getLayout();
            jPanel.add("ViewPatientJPanel", new ViewBeneficiaryJPanel(jPanel, usrAcnt, entrpz, patientWorkRequest));
            layout.next(jPanel);
        }
    }//GEN-LAST:event_viewBeneficiaryButtonActionPerformed

    private void enterStatusButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enterStatusButtonActionPerformed
        int selectedRow = tblDrWrkArea.getSelectedRow();
        OrderPlaceRequest wrkReq;

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row");
            return;
        } else {
            wrkReq = (OrderPlaceRequest) tblDrWrkArea.getValueAt(selectedRow, 3);
            if(wrkReq.getVolunteerAssigned() != null)
            {
            if (usrAcnt.equals(wrkReq.getVolunteerAssigned())) {
                if (wrkReq.getReqStatus().equalsIgnoreCase("Lab Test Completed") || wrkReq.getReqStatus().equalsIgnoreCase("Under Consultation")||wrkReq.getReqStatus().equalsIgnoreCase("Blood Bank Request Completed")) {


                    CardLayout layout = (CardLayout) jPanel.getLayout();
                    jPanel.add("ProvidePrescriptionJPanel", new ProvideOrderDetailsJPanel(jPanel, usrAcnt, entrpz, wrkReq));
                    layout.next(jPanel);
                } else {
                    JOptionPane.showMessageDialog(null, "Cannot prescribe the Patient as the status is: " + wrkReq.getReqStatus());
                }
            } else {

                JOptionPane.showMessageDialog(null, "Not Authorised");
            }
        }
            else {
                JOptionPane.showMessageDialog(null, "Please assign the request first");
            }
        }
    }//GEN-LAST:event_enterStatusButtonActionPerformed

    private void completeOrderButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_completeOrderButtonActionPerformed
        int selectedRow = tblDrWrkArea.getSelectedRow();
        OrderPlaceRequest wrkReq;

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row");
            return;
        } else {

            wrkReq = (OrderPlaceRequest) tblDrWrkArea.getValueAt(selectedRow, 3);
            if(wrkReq.getVolunteerAssigned() != null)
            {
            if (usrAcnt.equals(wrkReq.getVolunteerAssigned())) {
                if (wrkReq.getReqStatus().equalsIgnoreCase("Prescription Provided")) {

                    CardLayout layout = (CardLayout) jPanel.getLayout();
                    jPanel.add("RequestBillingJPanel", new RequestBillingJPanel(jPanel, usrAcnt, entrpz, wrkReq));
                    wrkReq.getBeneficiary().setIsOrderDelivered(true);
                    layout.next(jPanel);

                } else {
                    if(wrkReq.getReqStatus().equalsIgnoreCase("Consultation Completed"))
                    {
                        JOptionPane.showMessageDialog(null, "Treatment is already complete!");
                    }
                    else
                    {
                    JOptionPane.showMessageDialog(null, "Cannot complete the treatment. Please provide Prescription first!");
                }
                }
            } else {

                JOptionPane.showMessageDialog(null, "Not Authorised");
            }
        }
            else {
                JOptionPane.showMessageDialog(null, "Please assign the request first");
            }
        }
    }//GEN-LAST:event_completeOrderButtonActionPerformed

    private void restaurantRequestLabelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_restaurantRequestLabelActionPerformed
        // TODO add your handling code here:
        
        int selectedRow = tblDrWrkArea.getSelectedRow();
        OrderPlaceRequest wrkReq;
        

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row");
            return;
        } else {
            wrkReq = (OrderPlaceRequest) tblDrWrkArea.getValueAt(selectedRow, 3);
           //request =(BloodBankWorkRequest) workRequestJTable.getValueAt(selectedRow, 3);

            if (wrkReq.getVolunteerAssigned() != null) {
                if (usrAcnt.equals(wrkReq.getVolunteerAssigned())) {
                    if (wrkReq.getReqStatus().equalsIgnoreCase("Under Consultation")) {


                        CardLayout layout = (CardLayout) jPanel.getLayout();
                        jPanel.add("RequestLabTestJPanel", new HotelFoodRequestJPanel(jPanel, usrAcnt, entrpz, wrkReq));
                        layout.next(jPanel);
                    } else {
                        JOptionPane.showMessageDialog(null, "Can not create the Lab request as the current status is " + wrkReq.getReqStatus());
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Not Authorised");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Please assign the request first");
            }
        }



    }//GEN-LAST:event_restaurantRequestLabelActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton assignToMeButton;
    private javax.swing.JButton completeOrderButton;
    private javax.swing.JButton enterStatusButton;
    private javax.swing.JLabel enterpriceLabel;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton orderProcessButton;
    private javax.swing.JLabel orderWorkQueueLabel;
    private javax.swing.JButton restaurantRequestLabel;
    private javax.swing.JTable tblDrWrkArea;
    private javax.swing.JLabel valueLabel;
    private javax.swing.JButton viewBeneficiaryButton;
    private javax.swing.JLabel volunteerWorkAreaLabel;
    // End of variables declaration//GEN-END:variables
}
