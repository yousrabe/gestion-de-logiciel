/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SessionBeans;

import java.sql.ResultSet;
import javax.ejb.Local;

/**
 *
 * @author fahdo
 */
@Local
public interface UsersSessionBeanLocal {
    public void DeleteUser(int codeUser);
    public void AjoutUser(String nom,String prenom,String Date_naissance,String email ,String sexe,String login,String password  );
    public void ModifierUser(int codeUser,String nom,String prenom,String Date_naissance,String email ,String sexe,String login,String password);
    public ResultSet SelectUser(int codeUser);
    public ResultSet SelectUsers();
    
}
