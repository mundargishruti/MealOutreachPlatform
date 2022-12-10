/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package code.Role;
import code.EcoSystem;
import code.Enterprise.Enterprise;
import code.Org.Organization;
import code.SystemUserAccount.SystemUsers;
import javax.swing.JPanel;
import userinterface.BloodBankManagerRole.BloodBankManagerWorkAreaJPanel;

/**
 *
 * @author Rajvi
 */
public class RoleRestaurantManager extends Role {
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, SystemUsers account, Organization organization,
            Enterprise enterprise, EcoSystem business) {
        return new BloodBankManagerWorkAreaJPanel(userProcessContainer, account, organization, business);
    }
}
