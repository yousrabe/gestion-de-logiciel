/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SessionBeans;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.ejb.Stateless;

/**
 *
 * @author fahdo
 */
@Stateless
public class RegisterSessionBean implements RegisterSessionBeanLocal {

    @Override
    public boolean RegisterUser(Connection conn ,String username,String email, String password ,String Date , String Sexe) {
        boolean test=false; 
        try {
            UsersSessionBean user = new UsersSessionBean();
            user.AjoutUser(username, username, Date, email, Sexe, username, password);
            test=true;
        } catch (Exception ex) {
             System.out.println(ex.toString());
            
        }
        return test;
    }

   
    /*public static void main(String[] args){
        
    }*/
}
