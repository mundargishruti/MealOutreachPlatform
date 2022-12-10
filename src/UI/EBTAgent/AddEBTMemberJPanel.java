/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.EBTAgent;

import java.awt.CardLayout;
import java.awt.Color;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import code.EBTCard.EBTCard;
import code.EBTMembers.EBTMembers;
import code.Enterprise.EBTEnterprise;
import code.SystemUserAccount.SystemUsers;

/**
 *
 * @author shruti
 */
public class AddEBTMemberJPanel extends javax.swing.JPanel {

    /**
     * Creates new form AddEBTMemberJPanel
     */
    private JPanel userProcessContainer;
    private SystemUsers usrAcnt;
    private EBTEnterprise ebtCardEntr;
    private String ebtCardNo;
    public AddEBTMemberJPanel() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblAddNewCust = new javax.swing.JLabel();
        lblPlcyNo = new javax.swing.JLabel();
        txtPlcyNum = new javax.swing.JTextField();
        lblFrstNm = new javax.swing.JLabel();
        inputFirstName = new javax.swing.JTextField();
        lblLstNm = new javax.swing.JLabel();
        inputLastName = new javax.swing.JTextField();
        lblSsn = new javax.swing.JLabel();
        inputSsn = new javax.swing.JTextField();
        lblDtOfBrth = new javax.swing.JLabel();
        inputAddress = new javax.swing.JTextField();
        lblGndr = new javax.swing.JLabel();
        lblAddr = new javax.swing.JLabel();
        lblInsPlcyNm = new javax.swing.JLabel();
        txtInsPlcyNm = new javax.swing.JComboBox();
        btnAddCstmr = new javax.swing.JButton();
        lblPrsnlInfo = new javax.swing.JLabel();
        lblInsInfo = new javax.swing.JLabel();
        lblPhn = new javax.swing.JLabel();
        inputPhone = new javax.swing.JTextField();
        lblInsCvrgPercent = new javax.swing.JLabel();
        inputMonthlyAllowance = new javax.swing.JTextField();
        inputgender = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblNewCstmr = new javax.swing.JTable();
        lblAlCstmr = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        img = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(249, 244, 236));

        lblAddNewCust.setBackground(new java.awt.Color(206, 180, 180));
        lblAddNewCust.setFont(new java.awt.Font("YuGothic", 1, 24)); // NOI18N
        lblAddNewCust.setForeground(new java.awt.Color(29, 51, 178));
        lblAddNewCust.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAddNewCust.setText("Get a EBT card");

        lblPlcyNo.setFont(new java.awt.Font("YuGothic", 1, 12)); // NOI18N
        lblPlcyNo.setForeground(new java.awt.Color(29, 51, 178));
        lblPlcyNo.setText("EBT Card No");

        txtPlcyNum.setFont(new java.awt.Font("YuKyokasho", 0, 13)); // NOI18N
        txtPlcyNum.setForeground(new java.awt.Color(29, 51, 178));

        lblFrstNm.setFont(new java.awt.Font("YuGothic", 1, 12)); // NOI18N
        lblFrstNm.setForeground(new java.awt.Color(29, 51, 178));
        lblFrstNm.setText("First Name");

        inputFirstName.setFont(new java.awt.Font("YuKyokasho", 0, 13)); // NOI18N
        inputFirstName.setForeground(new java.awt.Color(29, 51, 178));

        lblLstNm.setFont(new java.awt.Font("YuGothic", 1, 12)); // NOI18N
        lblLstNm.setForeground(new java.awt.Color(29, 51, 178));
        lblLstNm.setText("Last Name");

        inputLastName.setFont(new java.awt.Font("YuKyokasho", 0, 13)); // NOI18N
        inputLastName.setForeground(new java.awt.Color(29, 51, 178));

        lblSsn.setFont(new java.awt.Font("YuGothic", 1, 12)); // NOI18N
        lblSsn.setForeground(new java.awt.Color(29, 51, 178));
        lblSsn.setText("SSN");

        inputSsn.setFont(new java.awt.Font("YuKyokasho", 0, 13)); // NOI18N

        lblDtOfBrth.setFont(new java.awt.Font("YuGothic", 1, 12)); // NOI18N
        lblDtOfBrth.setForeground(new java.awt.Color(29, 51, 178));
        lblDtOfBrth.setText("Date of birth");

        inputAddress.setFont(new java.awt.Font("YuKyokasho", 0, 13)); // NOI18N
        inputAddress.setForeground(new java.awt.Color(29, 51, 178));

        lblGndr.setFont(new java.awt.Font("YuGothic", 1, 12)); // NOI18N
        lblGndr.setForeground(new java.awt.Color(29, 51, 178));
        lblGndr.setText("Gender");

        lblAddr.setFont(new java.awt.Font("YuGothic", 1, 12)); // NOI18N
        lblAddr.setForeground(new java.awt.Color(29, 51, 178));
        lblAddr.setText("Address");

        lblInsPlcyNm.setFont(new java.awt.Font("YuGothic", 1, 12)); // NOI18N
        lblInsPlcyNm.setForeground(new java.awt.Color(29, 51, 178));
        lblInsPlcyNm.setText("Ebt Card Type");

        txtInsPlcyNm.setFont(new java.awt.Font("YuKyokasho", 0, 13)); // NOI18N
        txtInsPlcyNm.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtInsPlcyNmFocusGained(evt);
            }
        });
        txtInsPlcyNm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtInsPlcyNmActionPerformed(evt);
            }
        });

        btnAddCstmr.setBackground(new java.awt.Color(0, 102, 102));
        btnAddCstmr.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnAddCstmr.setForeground(java.awt.Color.white);
        btnAddCstmr.setText("Add Customer");
        btnAddCstmr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddCstmrActionPerformed(evt);
            }
        });

        lblPrsnlInfo.setFont(new java.awt.Font("YuGothic", 1, 18)); // NOI18N
        lblPrsnlInfo.setForeground(new java.awt.Color(29, 51, 178));
        lblPrsnlInfo.setText("Personal Information");

        lblInsInfo.setFont(new java.awt.Font("YuGothic", 1, 18)); // NOI18N
        lblInsInfo.setForeground(new java.awt.Color(29, 51, 178));
        lblInsInfo.setText("EBT Information");

        lblPhn.setFont(new java.awt.Font("YuGothic", 1, 12)); // NOI18N
        lblPhn.setForeground(new java.awt.Color(29, 51, 178));
        lblPhn.setText("Phone");

        inputPhone.setFont(new java.awt.Font("YuKyokasho", 0, 13)); // NOI18N
        inputPhone.setForeground(new java.awt.Color(29, 51, 178));

        lblInsCvrgPercent.setFont(new java.awt.Font("YuGothic", 1, 12)); // NOI18N
        lblInsCvrgPercent.setForeground(new java.awt.Color(29, 51, 178));
        lblInsCvrgPercent.setText("Monthly Allowance");

        inputMonthlyAllowance.setFont(new java.awt.Font("YuKyokasho", 0, 13)); // NOI18N

        inputgender.setFont(new java.awt.Font("YuKyokasho", 0, 13)); // NOI18N
        inputgender.setForeground(new java.awt.Color(29, 51, 178));
        inputgender.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Female", "Male", "Other" }));

        tblNewCstmr.setBackground(new java.awt.Color(204, 204, 204));
        tblNewCstmr.setFont(new java.awt.Font("YuKyokasho", 1, 12)); // NOI18N
        tblNewCstmr.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Customer Name", "Policy Number", "Policy Name", "Coverage %"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblNewCstmr);

        lblAlCstmr.setFont(new java.awt.Font("YuKyokasho", 1, 12)); // NOI18N
        lblAlCstmr.setForeground(new java.awt.Color(98, 98, 98));
        lblAlCstmr.setText("All Customers");

        btnBack.setBackground(new java.awt.Color(204, 204, 204));
        btnBack.setFont(new java.awt.Font("YuGothic", 1, 12)); // NOI18N
        btnBack.setForeground(new java.awt.Color(29, 51, 178));
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        img.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/photos/card.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnBack)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAddCstmr, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblAddNewCust, javax.swing.GroupLayout.PREFERRED_SIZE, 1042, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 307, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 813, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblAlCstmr)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblInsPlcyNm)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtInsPlcyNm, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblInsCvrgPercent)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(inputMonthlyAllowance, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblDtOfBrth)
                                .addComponent(lblGndr))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(inputgender, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(inputSsn, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(inputAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(inputPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(lblFrstNm)
                            .addGap(18, 18, 18)
                            .addComponent(inputFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(lblLstNm)
                            .addGap(18, 18, 18)
                            .addComponent(inputLastName)))
                    .addComponent(lblPhn)
                    .addComponent(lblPrsnlInfo)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addComponent(txtPlcyNum, javax.swing.GroupLayout.PREFERRED_SIZE, 383, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblPlcyNo)
                    .addComponent(lblSsn)
                    .addComponent(lblAddr)
                    .addComponent(lblInsInfo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(img, javax.swing.GroupLayout.PREFERRED_SIZE, 466, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(325, 325, 325))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(lblAddNewCust)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblPrsnlInfo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPlcyNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblPlcyNo))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(inputLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(inputFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblFrstNm)
                                .addComponent(lblLstNm)))
                        .addGap(25, 25, 25)
                        .addComponent(lblDtOfBrth)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(inputgender, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblGndr))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(inputSsn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblSsn))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblAddr)
                            .addComponent(inputAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblPhn)
                            .addComponent(inputPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblInsInfo)
                        .addGap(18, 18, 18))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(img)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblInsPlcyNm)
                    .addComponent(txtInsPlcyNm, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputMonthlyAllowance, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblInsCvrgPercent))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAddCstmr, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addComponent(lblAlCstmr)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(702, 702, 702))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtInsPlcyNmFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtInsPlcyNmFocusGained
        System.out.println("Gained");
    }//GEN-LAST:event_txtInsPlcyNmFocusGained

    private void txtInsPlcyNmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtInsPlcyNmActionPerformed

        EBTCard selectedPolicy = (EBTCard) txtInsPlcyNm.getSelectedItem();
        inputMonthlyAllowance.setText(String.valueOf(selectedPolicy.getAllowance()));
    }//GEN-LAST:event_txtInsPlcyNmActionPerformed

    private void btnAddCstmrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddCstmrActionPerformed

        if (inputFirstName.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please provide first name");
            return;
        }

        if (inputLastName.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please provide last name");
            return;
        }

        if (dobJDateChooser.getDate() == null) {
            JOptionPane.showMessageDialog(null, "Please provide Date of birth");
            return;
        }

        if (inputgender.getItemCount() == 0) {
            JOptionPane.showMessageDialog(null, "Please provide Gender");
            return;
        }

        if (inputgender.getItemCount() == 0) {
            JOptionPane.showMessageDialog(null, "Please provide Gender");
            return;
        }

        if (inputSsn.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please provide SSN");
            return;
        }

        if (inputPhone.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please provide phone");
            return;
        }

        if (inputAddress.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please provide address");
            return;
        }

        if (inputMonthlyAllowance.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please provide Insurance Coverage");
            return;
        } else {

            String firstName = inputFirstName.getText().trim();
            String lastName = inputLastName.getText().trim();
            SimpleDateFormat sdf = new SimpleDateFormat("MM-dd-yyyy");
            String dateOfBirth = "";
            try {
                dateOfBirth = sdf.format(dobJDateChooser.getDate());
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Please select customer's dob");
            }
            String gender = inputgender.getSelectedItem().toString();

            String ssn = inputSsn.getText().trim();
            if (!ssnValidation()) {
                JOptionPane.showMessageDialog(null, "/* United States Social Security numbers are nine-digit numbers in the format AAA-GG-SSSS with following rules. */             \n"
                    + "              \"The first three digits called the area number. The area number cannot be 000, 666, or between 900 and 999\",\n"
                    + "                \" Digits four and five are called the group number and range from 01 to 99\",\n"
                    + "              \"The last four digits are serial numbers from 0001 to 9999.\"");
                inputSsn.setBorder(BorderFactory.createLineBorder(Color.RED));

                return;
            }

            if (ssnValidation()) {
                inputSsn.setBorder(BorderFactory.createLineBorder(Color.GRAY));

            }

            String address = inputAddress.getText().trim();

            String phone = inputPhone.getText().trim();

            if (!phoneValidation()) {
                JOptionPane.showMessageDialog(null, "/* Following are valid phone number examples */             \n"
                    + "              \"1234567890\", \"123-456-7890\", \"(123)4567890\", \"(123)456-7890\",\n"
                    + "              /* Following are invalid phone numbers */ \n"
                    + "              \"(1234567890)\",\"123)4567890\", \"12345678901\", \"(1)234567890\",");
                inputPhone.setBorder(BorderFactory.createLineBorder(Color.RED));

                return;
            }

            if (phoneValidation()) {
                inputPhone.setBorder(BorderFactory.createLineBorder(Color.GRAY));

            }

            String cardNumber = txtPlcyNum.getText().trim();
            String insurancePolicyName = txtInsPlcyNm.getSelectedItem().toString();

            double coverage = Double.parseDouble(inputMonthlyAllowance.getText().trim());

            try {
                Double.parseDouble(inputMonthlyAllowance.getText().trim());
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Please provide integer values in coverage textfield");
                return;
            }

            EBTCard ebtCard = new EBTCard(insurancePolicyName, ebtCardEntr.getName(), coverage);

            EBTMembers ebtMember = new EBTMembers(ebtCard, cardNumber);

            ebtMember.setMemFirstName(firstName);
            ebtMember.setMemLastName(lastName);
            ebtMember.setDob(dateOfBirth);
            ebtMember.setGender(gender);
            ebtMember.setSsn(ssn);
            ebtMember.setPhNo(phone);
            ebtMember.setAddress(address);

            ebtMember.setEbt(ebtCard);

            ebtCardEntr.getEbtMembersDirectory().getEbtMem().add(ebtMember);

            ebtCardEntr.getEbtMembersDirectory().getEbtMem();

            populateTable();
            refr();
            JOptionPane.showMessageDialog(null, "Customer is added");

        }
    }//GEN-LAST:event_btnAddCstmrActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

private boolean phoneValidation() {

        Pattern pattern = Pattern.compile("\\d{10}|(?:\\d{3}-){2}\\d{4}|\\(\\d{3}\\)\\d{3}-?\\d{4}");
        Matcher matcher = pattern.matcher(inputPhone.getText());

        boolean b = false;

        if (matcher.matches()) {
            b = true;
        } else {
            b = false;
        }

        return b;
    }

    private boolean ssnValidation() {

        Pattern pattern = Pattern.compile("^(?!000|666)[0-8][0-9]{2}-(?!00)[0-9]{2}-(?!0000)[0-9]{4}$");
        Matcher matcher = pattern.matcher(inputSsn.getText());

        boolean b = false;

        if (matcher.matches()) {
            b = true;
        } else {
            b = false;
        }

        return b;
    }

    private void refr() {

        txtPlcyNum.setText(UUID.randomUUID().toString().substring(0, 7));
        inputFirstName.setText("");
        inputLastName.setText("");
        inputPhone.setText("");
        inputSsn.setText("");
        dobJDateChooser.setDate(null);
        inputAddress.setText("");

    }

    private void populateFields() {
        txtPlcyNum.setText(ebtCardNo);
        List<EBTCard> policies = ebtCardEntr.getEbtCardDir().getEBTCards();

        for (EBTCard policy : policies) {
            txtInsPlcyNm.addItem(policy);
        }

        EBTCard selectedPolicy = (EBTCard) txtInsPlcyNm.getSelectedItem();
        
        if(selectedPolicy != null)
        {
        inputMonthlyAllowance.setText(String.valueOf(selectedPolicy.getAllowance()));
        }
        else{
            JOptionPane.showMessageDialog(null , "No Existing policy!");
            return;
        }

    }

    private void populateTable() {
        DefaultTableModel dtm = (DefaultTableModel) tblNewCstmr.getModel();

        dtm.setRowCount(0);
        List<EBTMembers> members = ebtCardEntr.getEbtMembersDirectory().getEbtMem();
        for (EBTMembers member : members) {
            Object[] row = new Object[4];
            row[0] = member.getMemFirstName() + " " + member.getMemLastName();
            row[1] = member;
            row[2] = member.getEbt().getEbtType();
            row[3] = member.getEbt().getAllowance();

            dtm.addRow(row);
        }
        TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<>(dtm);
        tblNewCstmr.setRowSorter(sorter);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddCstmr;
    private javax.swing.JButton btnBack;
    private javax.swing.JLabel img;
    private javax.swing.JTextField inputAddress;
    private javax.swing.JTextField inputFirstName;
    private javax.swing.JTextField inputLastName;
    private javax.swing.JTextField inputMonthlyAllowance;
    private javax.swing.JTextField inputPhone;
    private javax.swing.JTextField inputSsn;
    private javax.swing.JComboBox inputgender;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAddNewCust;
    private javax.swing.JLabel lblAddr;
    private javax.swing.JLabel lblAlCstmr;
    private javax.swing.JLabel lblDtOfBrth;
    private javax.swing.JLabel lblFrstNm;
    private javax.swing.JLabel lblGndr;
    private javax.swing.JLabel lblInsCvrgPercent;
    private javax.swing.JLabel lblInsInfo;
    private javax.swing.JLabel lblInsPlcyNm;
    private javax.swing.JLabel lblLstNm;
    private javax.swing.JLabel lblPhn;
    private javax.swing.JLabel lblPlcyNo;
    private javax.swing.JLabel lblPrsnlInfo;
    private javax.swing.JLabel lblSsn;
    private javax.swing.JTable tblNewCstmr;
    private javax.swing.JComboBox txtInsPlcyNm;
    private javax.swing.JTextField txtPlcyNum;
    // End of variables declaration//GEN-END:variables
}
