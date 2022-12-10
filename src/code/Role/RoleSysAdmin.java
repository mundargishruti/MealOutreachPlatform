/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package code.Role;
import code.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Org.Organization;
import Business.SystemUserAccount.SystemUsers;
import code.Enterprise.Enterprise;
import code.Org.Organization;
import code.SystemUserAccount.SystemUsers;
import userinterface.SystemAdminWorkArea.SystemAdminWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author Rajvi
 */
public class RoleSysAdmin extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, SystemUsers account, Organization organization, Enterprise enterprise, EcoSystem ecosystem) {
        return new SystemAdminWorkAreaJPanel(userProcessContainer, ecosystem);
    }
    
}