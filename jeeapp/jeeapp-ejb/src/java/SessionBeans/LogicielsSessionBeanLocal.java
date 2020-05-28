/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SessionBeans;

import java.sql.*;
import javax.ejb.Local;

/**
 *
 * @author fahdo
 */
@Local
public interface LogicielsSessionBeanLocal {
    public void DeleteLogiciel(int codLogiciel);
    public void AjoutLogiciel(String nomLogiciel,String Taille ,String DescriptionLogiciel,String Dependences);
    public void ModifierLogiciel(int codLogiciel,String nomLogiciel,String Taille ,String DescriptionLogiciel,String Dependences);
    public ResultSet SelectLogiciel(int codLogiciel);
    public ResultSet SelectLogiciels();

}
