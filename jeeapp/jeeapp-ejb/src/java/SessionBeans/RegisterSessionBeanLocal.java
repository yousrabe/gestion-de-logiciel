/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SessionBeans;

import java.sql.Connection;
import javax.ejb.Local;

/**
 *
 * @author fahdo
 */
@Local
public interface RegisterSessionBeanLocal {
    public boolean RegisterUser(Connection conn ,String username,String email, String password ,String Date , String Sexe);
}
