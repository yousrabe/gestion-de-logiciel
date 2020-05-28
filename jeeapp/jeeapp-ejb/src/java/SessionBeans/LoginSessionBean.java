/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SessionBeans;

import javax.ejb.Stateless;
import java.sql.*;
/**
 *
 * @author fahdo
 */
@Stateless
public class LoginSessionBean implements LoginSessionBeanLocal {


    @Override
    public boolean verifier_user(Connection conn ,String username, String password) {
         int n=0;
         boolean test=false;
        try {
            Statement st = conn.createStatement();
            ResultSet resul= st.executeQuery("select * from utilisateurs where login='"+username+"' and password='"+password+"' ");
            resul.last();
            n = resul.getRow();
            resul.beforeFirst();
        System.out.println(n);
            
            
            if (n==1){test=true;}
        } catch (SQLException ex) {
            
        }
                return test;
        
    }
  /*  public static void main(String[] args){
        ConnectionSingletonSessionBean c = new ConnectionSingletonSessionBean();
        Connection conn=c.ConnexionDB();
        LoginSessionBean l = new LoginSessionBean();
        System.out.println(l.verifier_user(conn ,"fahd123", "fahd123"));
        
}*/
}
