/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package code.Role;

import code.Enterprise.Enterprise;
import code.Org.OrgEBTFinance;
import code.Org.Organization;
import javax.swing.JPanel;

/**
 *
 * @author shruti
 */
public class RoleEbtFinanceManager extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, SystemUsers account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new InsuranceFinanceWorkAreaJPanel(userProcessContainer, account, (OrgEBTFinance)organization, enterprise);
    }
    
}
