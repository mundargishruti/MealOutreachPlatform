/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.HotelOrderAssistantRole;


import code.ProcessQueue.OrderPlaceRequest;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author shruti
 */
public class HotelWorkRequestJPanel extends javax.swing.JPanel {

    JPanel userProcessContainer;
    OrderPlaceRequest patientTreatmentWorkRequest;

    /**
     * Creates new form ProcessWorkRequestJPanel
     */
    public HotelWorkRequestJPanel(JPanel userProcessContainer, OrderPlaceRequest patientTreatmentWorkRequest) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.patientTreatmentWorkRequest = patientTreatmentWorkRequest;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        SubmitReportButton = new javax.swing.JButton();
        StatusLabel = new javax.swing.JLabel();
        statusText = new javax.swing.JTextField();
        backButton = new javax.swing.JButton();
        OrderStatusLabel = new javax.swing.JLabel();
        img = new javax.swing.JLabel();

        setBackground(new java.awt.Color(253, 249, 232));
        setForeground(new java.awt.Color(255, 255, 255));
        setLayout(null);

        SubmitReportButton.setBackground(new java.awt.Color(204, 130, 43));
        SubmitReportButton.setFont(new java.awt.Font("YuGothic", 1, 14)); // NOI18N
        SubmitReportButton.setForeground(java.awt.Color.white);
        SubmitReportButton.setText("Submit Status");
        SubmitReportButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitReportButtonActionPerformed(evt);
            }
        });
        add(SubmitReportButton);
        SubmitReportButton.setBounds(500, 170, 140, 36);

        StatusLabel.setBackground(new java.awt.Color(255, 255, 255));
        StatusLabel.setFont(new java.awt.Font("YuGothic", 1, 14)); // NOI18N
        StatusLabel.setForeground(new java.awt.Color(204, 130, 43));
        StatusLabel.setText("Status");
        add(StatusLabel);
        StatusLabel.setBounds(428, 130, 50, 22);
        add(statusText);
        statusText.setBounds(490, 120, 160, 30);

        backButton.setBackground(new java.awt.Color(204, 204, 204));
        backButton.setFont(new java.awt.Font("YuGothic", 1, 11)); // NOI18N
        backButton.setText(" Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });
        add(backButton);
        backButton.setBounds(10, 11, 75, 29);

        OrderStatusLabel.setFont(new java.awt.Font("YuGothic", 1, 24)); // NOI18N
        OrderStatusLabel.setForeground(new java.awt.Color(204, 130, 43));
        OrderStatusLabel.setText("Order Process Status");
        add(OrderStatusLabel);
        OrderStatusLabel.setBounds(230, 20, 260, 37);

        img.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/drrive.gif"))); // NOI18N
        add(img);
        img.setBounds(30, 70, 650, 460);
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed

        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        HotelStaffWorkAreaJPanel dwjp = (HotelStaffWorkAreaJPanel) component;
        dwjp.popLabAsstTbl();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backButtonActionPerformed

    private void SubmitReportButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitReportButtonActionPerformed
        String labResult = statusText.getText().trim();
        if (labResult.equals("")) {
            JOptionPane.showMessageDialog(null, "Result is mandatory");
            return;
        } else {
            int dialogResult = JOptionPane.showConfirmDialog(null, "Do you want to proceed?");
            if (dialogResult == JOptionPane.YES_OPTION) {
                patientTreatmentWorkRequest.setOrderResult(labResult);
                patientTreatmentWorkRequest.setOrderStatus("Lab Test Completed");
                JOptionPane.showMessageDialog(null, "Result submitted successfully");
                statusText.setText("");
                SubmitReportButton.setEnabled(false);
            }

        }


    }//GEN-LAST:event_SubmitReportButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel OrderStatusLabel;
    private javax.swing.JLabel StatusLabel;
    private javax.swing.JButton SubmitReportButton;
    private javax.swing.JButton backButton;
    private javax.swing.JLabel img;
    private javax.swing.JTextField statusText;
    // End of variables declaration//GEN-END:variables
}
