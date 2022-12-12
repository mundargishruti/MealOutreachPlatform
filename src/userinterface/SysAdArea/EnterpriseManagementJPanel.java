/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SysAdArea;
/**
 *
 * @author Rajvi
 */
import code.EcoSystem;
import code.Enterprise.Enterprise;
import code.Networks.Networks;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class EnterpriseManagementJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private EcoSystem ecosystem;

    /**
     * Creates new form ManageEnterpriseJPanel
     */
    public EnterpriseManagementJPanel(JPanel userProcessContainer, EcoSystem system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.ecosystem = system;

        popTbl();
        popComboBox();
    }

    private void popTbl() {
        DefaultTableModel model = (DefaultTableModel) tblMngEnt.getModel();

        model.setRowCount(0);
        for (Networks network : ecosystem.getNetworks()) {
            for (Enterprise enterprise : network.getEntDir().getEnterpriseList()) {
                Object[] row = new Object[3];
                row[0] = enterprise;
                row[1] = network;
                row[2] = enterprise.getEntType().getValue();

                model.addRow(row);
            }
            TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<>(model);
        tblMngEnt.setRowSorter(sorter);
        }
    }

    private void popComboBox() {
        cbNtwrk.removeAllItems();
        cbEntTyp.removeAllItems();

        for (Networks network : ecosystem.getNetworks()) {
            cbNtwrk.addItem(network);
        }

        for (Enterprise.EnterpriseType type : Enterprise.EnterpriseType.values()) {
            cbEntTyp.addItem(type);
        }

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
        tblMngEnt = new javax.swing.JTable();
        cbNtwrk = new javax.swing.JComboBox();
        lblNm = new javax.swing.JLabel();
        txtNm = new javax.swing.JTextField();
        lblEntTyp = new javax.swing.JLabel();
        cbEntTyp = new javax.swing.JComboBox();
        btnSbmtReq = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        btnDelt = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(253, 249, 232));
        setPreferredSize(new java.awt.Dimension(850, 820));

        tblMngEnt.setBackground(new java.awt.Color(204, 204, 204));
        tblMngEnt.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        tblMngEnt.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Enterprise Name", "Network", "Type"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblMngEnt);

        cbNtwrk.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        cbNtwrk.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbNtwrk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbNtwrkActionPerformed(evt);
            }
        });

        lblNm.setBackground(new java.awt.Color(204, 204, 204));
        lblNm.setFont(new java.awt.Font("YuGothic", 1, 14)); // NOI18N
        lblNm.setForeground(new java.awt.Color(204, 130, 43));
        lblNm.setText("Name");

        txtNm.setBackground(new java.awt.Color(204, 204, 204));
        txtNm.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N

        lblEntTyp.setFont(new java.awt.Font("YuGothic", 1, 14)); // NOI18N
        lblEntTyp.setForeground(new java.awt.Color(204, 130, 43));
        lblEntTyp.setText("Enterprise Type");

        cbEntTyp.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        cbEntTyp.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btnSbmtReq.setBackground(new java.awt.Color(204, 130, 43));
        btnSbmtReq.setFont(new java.awt.Font("YuGothic", 1, 11)); // NOI18N
        btnSbmtReq.setForeground(new java.awt.Color(255, 255, 255));
        btnSbmtReq.setText("Submit");
        btnSbmtReq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSbmtReqActionPerformed(evt);
            }
        });

        btnBack.setBackground(new java.awt.Color(204, 130, 43));
        btnBack.setFont(new java.awt.Font("YuGothic", 1, 11)); // NOI18N
        btnBack.setForeground(new java.awt.Color(255, 255, 255));
        btnBack.setText(" Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnDelt.setBackground(new java.awt.Color(204, 130, 43));
        btnDelt.setFont(new java.awt.Font("YuGothic", 1, 11)); // NOI18N
        btnDelt.setForeground(new java.awt.Color(255, 255, 255));
        btnDelt.setText("Delete");
        btnDelt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeltActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/manage enterprise.gif"))); // NOI18N
        jLabel5.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        jLabel5.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        jLabel4.setFont(new java.awt.Font("YuGothic", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 130, 43));
        jLabel4.setText("Network");

        jLabel1.setFont(new java.awt.Font("YuGothic", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 130, 43));
        jLabel1.setText("MANAGE ENTERPRISE");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(lblEntTyp))
                    .addComponent(cbNtwrk, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbEntTyp, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNm, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(lblNm))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(btnSbmtReq)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 703, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(76, 76, 76))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(391, 391, 391)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(btnBack))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(161, 161, 161)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 687, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(434, 434, 434)
                        .addComponent(btnDelt)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(cbNtwrk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblEntTyp)
                        .addGap(18, 18, 18)
                        .addComponent(cbEntTyp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblNm)
                        .addGap(18, 18, 18)
                        .addComponent(txtNm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnSbmtReq, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(66, 66, 66)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(btnDelt, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(120, 120, 120))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSbmtReqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSbmtReqActionPerformed

        Networks network = (Networks) cbNtwrk.getSelectedItem();
        Enterprise.EnterpriseType type = (Enterprise.EnterpriseType) cbEntTyp.getSelectedItem();

        if (network == null || type == null) {
            JOptionPane.showMessageDialog(null, "Invalid Input!");
            return;
        } else {
            String enterpriseName = txtNm.getText();
            List<Enterprise> enterprises = network.getEntDir().getEnterpriseList();
            List<String> names = new ArrayList<>();
            for (Enterprise enterprise : enterprises) {
                names.add(enterprise.getName());
            }
            if (names.contains(enterpriseName)) {
                JOptionPane.showMessageDialog(null, "Enterprise Altready exists!!", "Warning!", JOptionPane.WARNING_MESSAGE);
                return;
            } else {
                if (enterpriseName.equals("") || enterpriseName == null) {
                    JOptionPane.showMessageDialog(null, "Name cannot be empty!");
                    return;
                } else {
                    Enterprise enterprise = network.getEntDir().createAndAddEnterprise(enterpriseName, type);

                    popTbl();
                    JOptionPane.showMessageDialog(null, "Enterprise Added Successfully!!");
                    txtNm.setText("");
                }
            }
        }

    }//GEN-LAST:event_btnSbmtReqActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        SysAdWorkJPanel sysAdminwjp = (SysAdWorkJPanel) component;
        sysAdminwjp.populateTree();

        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void cbNtwrkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbNtwrkActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbNtwrkActionPerformed

    private void btnDeltActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeltActionPerformed
        int selectedRow = tblMngEnt.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row first from the table to view details", "Warning!", JOptionPane.WARNING_MESSAGE);
            return;
        } else {
            Enterprise enterprise = (Enterprise) tblMngEnt.getValueAt(selectedRow, 0);
            int dialogResult = JOptionPane.showConfirmDialog(null, "Do you want to proceed?");
            if (dialogResult == JOptionPane.YES_OPTION) {
                Networks network = (Networks) tblMngEnt.getValueAt(selectedRow, 1);
                network.getEntDir().getEnterpriseList().remove(enterprise);
                popTbl();
                JOptionPane.showMessageDialog(null, "Enterprise is deleted");
            }

        }

    }//GEN-LAST:event_btnDeltActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnDelt;
    private javax.swing.JButton btnSbmtReq;
    private javax.swing.JComboBox cbEntTyp;
    private javax.swing.JComboBox cbNtwrk;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblEntTyp;
    private javax.swing.JLabel lblNm;
    private javax.swing.JTable tblMngEnt;
    private javax.swing.JTextField txtNm;
    // End of variables declaration//GEN-END:variables
}
