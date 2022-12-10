/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package code.Role;
import code.EcoSystem;
import code.Enterprise.Enterprise;
import code.Org.Organization;
import code.SystemUserAccount.SystemUsers;
import userinterface.LabAssistantRole.LabAssistantWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author Rajvi
 */
public class RoleOrderVolunterr extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, SystemUsers account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new LabAssistantWorkAreaJPanel(userProcessContainer, account, organization, business);
    }
    
}