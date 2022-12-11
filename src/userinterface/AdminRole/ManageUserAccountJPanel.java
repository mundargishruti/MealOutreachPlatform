/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.AdminRole;

import code.Employee.Employee;
import code.Enterprise.Enterprise;
import code.Org.Organization;
import code.Org.OrgBenificiary;
import code.Role.RoleVolunteer;
import code.Role.Role;
import code.Role.Role.RoleType;
import code.SystemUserAccount.SystemUsers;
import java.awt.CardLayout;
import java.awt.Color;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author jomraj
 */
public class ManageUserAccountJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageUserAccountJPanel
     */
    private JPanel jPanel;
    private Enterprise entrpz;

    public ManageUserAccountJPanel(JPanel container, Enterprise enterprise) {
        initComponents();
        this.entrpz = enterprise;
        this.jPanel = container;

        popOrgCmbx();
        popData();

    }

    public void popOrgCmbx() {
        organizationJComboBox.removeAllItems();


        for (Organization organization : entrpz.getOrgDir().getOrganizations()) {

            if (!(organization instanceof OrgBenificiary)) {
                organizationJComboBox.addItem(organization);
            }
        }
    }

    public void pplEmpCmbx(Organization organization) {
        employeeJComboBox.removeAllItems();

        for (Employee employee : organization.getEmpDir().getEmpList()) {
            employeeJComboBox.addItem(employee);
        }
    }

    private void popRoleCmbx(Organization organization) {
        roleJComboBox.removeAllItems();
        for (Role role : organization.getSupportRole()) {
            roleJComboBox.addItem(role);
        }
        doctorType();
    }

    public void popData() {

        DefaultTableModel model = (DefaultTableModel) userJTable.getModel();

        model.setRowCount(0);


        for (Organization organization : entrpz.getOrgDir().getOrganizations()) {
            for (SystemUsers ua : organization.getUsrAccDir().getUsrAccList()) {

                Object row[] = new Object[2];
                row[0] = ua;
                row[1] = ua.getEmpRole();
                ((DefaultTableModel) userJTable.getModel()).addRow(row);
            }
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        createUserJButton = new javax.swing.JButton();
        nameJTextField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        userJTable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        employeeJComboBox = new javax.swing.JComboBox();
        backjButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        organizationJComboBox = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        roleJComboBox = new javax.swing.JComboBox();
        passwordJTextField = new javax.swing.JPasswordField();
        jLabel6 = new javax.swing.JLabel();
        rePasswordJTextField = new javax.swing.JPasswordField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        doctorTypeJComboBox1 = new javax.swing.JComboBox();

        setBackground(new java.awt.Color(253, 249, 232));
        setForeground(new java.awt.Color(204, 130, 43));

        createUserJButton.setBackground(new java.awt.Color(204, 130, 43));
        createUserJButton.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 14)); // NOI18N
        createUserJButton.setText("Create");
        createUserJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createUserJButtonActionPerformed(evt);
            }
        });

        nameJTextField.setBackground(new java.awt.Color(204, 204, 204));
        nameJTextField.setFont(new java.awt.Font("YuGothic", 1, 14)); // NOI18N
        nameJTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameJTextFieldActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("YuGothic", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 130, 43));
        jLabel1.setText("User Name");

        userJTable.setBackground(new java.awt.Color(204, 204, 204));
        userJTable.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        userJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "User Name", "Role"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(userJTable);
        if (userJTable.getColumnModel().getColumnCount() > 0) {
            userJTable.getColumnModel().getColumn(0).setResizable(false);
            userJTable.getColumnModel().getColumn(1).setResizable(false);
        }

        jLabel2.setFont(new java.awt.Font("YuGothic", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 130, 43));
        jLabel2.setText("Password");

        jLabel3.setFont(new java.awt.Font("YuGothic", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 130, 43));
        jLabel3.setText("Employee");

        employeeJComboBox.setBackground(new java.awt.Color(204, 204, 204));
        employeeJComboBox.setFont(new java.awt.Font("YuGothic", 1, 14)); // NOI18N
        employeeJComboBox.setForeground(new java.awt.Color(204, 130, 43));
        employeeJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        employeeJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                employeeJComboBoxActionPerformed(evt);
            }
        });

        backjButton1.setBackground(new java.awt.Color(204, 130, 43));
        backjButton1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        backjButton1.setText(" Back");
        backjButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backjButton1ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("YuGothic", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 130, 43));
        jLabel5.setText("Organization");

        organizationJComboBox.setBackground(new java.awt.Color(204, 204, 204));
        organizationJComboBox.setFont(new java.awt.Font("YuGothic", 1, 14)); // NOI18N
        organizationJComboBox.setForeground(new java.awt.Color(204, 130, 43));
        organizationJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        organizationJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                organizationJComboBoxActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("YuGothic", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 130, 43));
        jLabel4.setText("Role");

        roleJComboBox.setBackground(new java.awt.Color(204, 204, 204));
        roleJComboBox.setFont(new java.awt.Font("YuGothic", 1, 14)); // NOI18N
        roleJComboBox.setForeground(new java.awt.Color(204, 130, 43));
        roleJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        roleJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roleJComboBoxActionPerformed(evt);
            }
        });

        passwordJTextField.setBackground(new java.awt.Color(204, 204, 204));
        passwordJTextField.setFont(new java.awt.Font("YuGothic", 1, 14)); // NOI18N

        jLabel6.setFont(new java.awt.Font("YuGothic", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 130, 43));
        jLabel6.setText("re-enter Password");

        rePasswordJTextField.setBackground(new java.awt.Color(204, 204, 204));
        rePasswordJTextField.setFont(new java.awt.Font("YuGothic", 1, 14)); // NOI18N

        jLabel7.setFont(new java.awt.Font("YuGothic", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 130, 43));
        jLabel7.setText("Manage User Account");

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/employee.png"))); // NOI18N

        jLabel9.setFont(new java.awt.Font("YuGothic", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(204, 130, 43));
        jLabel9.setText("Volunteer Type");

        doctorTypeJComboBox1.setFont(new java.awt.Font("YuGothic", 1, 14)); // NOI18N
        doctorTypeJComboBox1.setForeground(new java.awt.Color(204, 130, 43));
        doctorTypeJComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Delivery Volunteer", "Take Home Assistant" }));
        doctorTypeJComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doctorTypeJComboBox1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 516, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(roleJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel1)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel6)
                                            .addComponent(jLabel9))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(27, 27, 27)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(organizationJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(employeeJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(29, 29, 29)
                                                .addComponent(nameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addGap(29, 29, 29)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(passwordJTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(rePasswordJTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(doctorTypeJComboBox1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                                .addGap(290, 290, 290)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(backjButton1)
                        .addGap(195, 195, 195)
                        .addComponent(jLabel7))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(171, 171, 171)
                        .addComponent(createUserJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(284, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel7))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(backjButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jLabel5))
                    .addComponent(organizationJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(employeeJComboBox)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(roleJComboBox)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nameJTextField)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(passwordJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rePasswordJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(doctorTypeJComboBox1)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(26, 26, 26)
                .addComponent(createUserJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(767, 767, 767))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void employeeJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_employeeJComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_employeeJComboBoxActionPerformed

    private void createUserJButtonActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_createUserJButtonActionPerformed
        String userName = nameJTextField.getText();
        String password = String.valueOf(passwordJTextField.getPassword());
        String rePassword = String.valueOf(rePasswordJTextField.getPassword());
        Organization organization = (Organization) organizationJComboBox.getSelectedItem();
        Employee employee = (Employee) employeeJComboBox.getSelectedItem();
        Role role = (Role) roleJComboBox.getSelectedItem();
        String doctorType = "";
        if (role instanceof RoleVolunteer) {
            doctorType = (String) doctorTypeJComboBox1.getSelectedItem();

        }
        if (userName == null || userName.equals("")) {
            nameJTextField.setBorder(BorderFactory.createLineBorder(Color.RED));
            JOptionPane.showMessageDialog(null, "Username cannot be empty");
            return;
        }

        if (password == null || password.equals("")) {
            nameJTextField.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            passwordJTextField.setBorder(BorderFactory.createLineBorder(Color.RED));
            JOptionPane.showMessageDialog(null, "Password cannot be empty");
            return;
        }

        if (!passwordPatternCorrect()) {
            JOptionPane.showMessageDialog(null, "Password should be at least 6 Characters "
                    + "digits and a combination of number , uppercase letter, "
                    + "lowercase letter and Special characters are not allowed other than $, +, _");
            passwordJTextField.setBorder(BorderFactory.createLineBorder(Color.RED));
            return;
        }

        if (!password.equals(rePassword)) {
            JOptionPane.showMessageDialog(null, "Passwords don't match");
            passwordJTextField.setBorder(BorderFactory.createLineBorder(Color.RED));
            rePasswordJTextField.setBorder(BorderFactory.createLineBorder(Color.RED));
            return;
        } else {

            List<SystemUsers> userAccountList = organization.getUsrAccDir().getUsrAccList();
            for (SystemUsers userAccount : userAccountList) {
                if (userAccount.getUsrName().equals(userName)) {
                    JOptionPane.showMessageDialog(null, "username already taken!!");
                    nameJTextField.setBorder(BorderFactory.createLineBorder(Color.RED));
                    return;
                }
            }
            if (role instanceof RoleVolunteer) {

                organization.getUsrAccDir().createUserAccount(userName, password, employee, role,
                        doctorType);
            } else {
                organization.getUsrAccDir().createUserAccount(userName, password, employee, role);
            }
            popData();
            nameJTextField.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            passwordJTextField.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            rePasswordJTextField.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            passwordJTextField.setText("");
            rePasswordJTextField.setText("");
            nameJTextField.setText("");
        }
    }// GEN-LAST:event_createUserJButtonActionPerformed

    private boolean passwordPatternCorrect() {
        Pattern p = Pattern.compile("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[$+_])(?=\\S+$).{6,}$");
        Matcher m = p.matcher(String.valueOf(passwordJTextField.getPassword()));
        boolean b = m.matches();
        return b;
    }

    private void backjButton1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_backjButton1ActionPerformed
        // TODO add your handling code here:
        jPanel.remove(this);
        CardLayout layout = (CardLayout) jPanel.getLayout();
        layout.previous(jPanel);
    }// GEN-LAST:event_backjButton1ActionPerformed

    private void organizationJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_organizationJComboBoxActionPerformed
        Organization organization = (Organization) organizationJComboBox.getSelectedItem();
        if (organization != null) {
            pplEmpCmbx(organization);
            popRoleCmbx(organization);
        }
    }// GEN-LAST:event_organizationJComboBoxActionPerformed

    private void nameJTextFieldActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_nameJTextFieldActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_nameJTextFieldActionPerformed

    private void roleJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_roleJComboBoxActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_roleJComboBoxActionPerformed

    private void doctorTypeJComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_doctorTypeJComboBox1ActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_doctorTypeJComboBox1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backjButton1;
    private javax.swing.JButton createUserJButton;
    private javax.swing.JComboBox doctorTypeJComboBox1;
    private javax.swing.JComboBox employeeJComboBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nameJTextField;
    private javax.swing.JComboBox organizationJComboBox;
    private javax.swing.JPasswordField passwordJTextField;
    private javax.swing.JPasswordField rePasswordJTextField;
    private javax.swing.JComboBox roleJComboBox;
    private javax.swing.JTable userJTable;
    // End of variables declaration//GEN-END:variables

    private void doctorType() {
        Role role = (Role) roleJComboBox.getSelectedItem();
        if (role instanceof RoleVolunteer) {
            doctorTypeJComboBox1.setEnabled(true);
            doctorTypeJComboBox1.setVisible(true);
            jLabel9.setVisible(true);
        } else {
            doctorTypeJComboBox1.setEnabled(false);
            doctorTypeJComboBox1.setVisible(false);
            jLabel9.setVisible(false);
        }

    }
}
