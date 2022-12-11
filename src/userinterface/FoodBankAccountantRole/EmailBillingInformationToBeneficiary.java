/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.FoodBankAccountantRole;

import code.ProcessQueue.AccountBillRqst;
import java.awt.CardLayout;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Rajvi
 */
public class EmailBillingInformationToBeneficiary extends javax.swing.JPanel {

    JPanel jPanel;
    private AccountBillRqst acntBillingReq;

    /**
     * Creates new form EmailBillingInformationToPatient
     */
//    public EmailBillingInformationToBeneficiary() {
//        
//    }
    EmailBillingInformationToBeneficiary(JPanel userProcessContainer, AccountBillRqst accountBillingRequest) {
        initComponents();
        this.jPanel = userProcessContainer;
        this.acntBillingReq = accountBillingRequest;
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
        jScrollPane1 = new javax.swing.JScrollPane();
        emailMesageText = new javax.swing.JTextArea();
        sendEmailButton = new javax.swing.JButton();
        clearTextButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
        emailImageButton = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 204, 204));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("EMAIL BILLING TO BENEFICIARY");

        emailMesageText.setColumns(20);
        emailMesageText.setRows(5);
        jScrollPane1.setViewportView(emailMesageText);

        sendEmailButton.setBackground(new java.awt.Color(0, 102, 102));
        sendEmailButton.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        sendEmailButton.setForeground(new java.awt.Color(255, 255, 255));
        sendEmailButton.setText("Send Email");
        sendEmailButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendEmailButtonActionPerformed(evt);
            }
        });

        clearTextButton.setBackground(new java.awt.Color(0, 102, 102));
        clearTextButton.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        clearTextButton.setForeground(new java.awt.Color(255, 255, 255));
        clearTextButton.setText("Clear");
        clearTextButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearTextButtonActionPerformed(evt);
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

        emailImageButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/email.gif"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(64, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 953, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47)
                        .addComponent(sendEmailButton)
                        .addGap(33, 33, 33)
                        .addComponent(clearTextButton, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(360, 360, 360))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(368, 368, 368)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(297, 297, 297)
                        .addComponent(emailImageButton)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(clearTextButton, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                    .addComponent(sendEmailButton, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                    .addComponent(backButton, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(emailImageButton, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void sendEmailButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendEmailButtonActionPerformed
        String text = emailMesageText.getText();
        if (emailMesageText.getText().trim().equals("")) {
            JOptionPane.showConfirmDialog(null, "You have not typed anything");
            return;
        }
        try {
            SendMail(acntBillingReq.getBeneficiary().getBenMail(), text);
        } catch (MessagingException ex) {
            Logger.getLogger(EmailBillingInformationToBeneficiary.class.getName()).log(Level.SEVERE, null, ex);
        }
        JOptionPane.showMessageDialog(null, "Billing information sent to " + acntBillingReq.getBeneficiary().getBenFirstName());
        acntBillingReq.setProcessStatus("Patient Transaction Completed");
    }//GEN-LAST:event_sendEmailButtonActionPerformed

    private void clearTextButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearTextButtonActionPerformed
        emailMesageText.setText("");
    }//GEN-LAST:event_clearTextButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        jPanel.remove(this);
        CardLayout layout = (CardLayout) jPanel.getLayout();
        layout.previous(jPanel);
    }//GEN-LAST:event_backButtonActionPerformed
    private void SendMail(String toMail, String text) throws MessagingException {
        Properties properties = new Properties();
        properties.put("mail.smtp.host", "smtp.gmail.com");
        properties.put("mail.smtp.port", "465");
        properties.put("mail.smtp.auth", "true");
        properties.put("mail.smtp.socketFactory.port", "465");
        properties.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
        properties.put("mail.smtp.ssl.protocols", "TLSv1.2");

        String to = toMail;
        final String from = "parthkatariaextra@gmail.com";
        final String password = "Qwerty123@";
        
        // login using this email address
        Session session = Session.getInstance(properties, new Authenticator(){
            @Override
            protected PasswordAuthentication getPasswordAuthentication(){
                return new PasswordAuthentication(from,password);
            
            }
        });
        
        Message message = prepareMessage(session, from, toMail,text);
        
        Transport.send(message);
        System.out.println("Message Sent Successfully");
   
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JButton clearTextButton;
    private javax.swing.JLabel emailImageButton;
    private javax.swing.JTextArea emailMesageText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton sendEmailButton;
    // End of variables declaration//GEN-END:variables

    private static Message prepareMessage(Session session, String myAccountEmail, String recepient,String text) {
        try {
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(myAccountEmail)); // from address
            message.setRecipient(Message.RecipientType.TO, new InternetAddress(recepient) );
            
            message.setSubject("Hospital Billing Statement");
            message.setText(text);
            
            return message;
        } catch (Exception ex) {
            ex.printStackTrace();
            //Logger.getLogger(JavaMailSystem.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;// if some exception happens
    }
}



