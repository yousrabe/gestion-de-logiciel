/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SessionBeans;

import javax.ejb.Local;
import java.sql.*;
/**
 *
 * @author fahdo
 */
@Local
public interface LoginSessionBeanLocal {
    public boolean verifier_user(Connection con ,String username , String password);
}
