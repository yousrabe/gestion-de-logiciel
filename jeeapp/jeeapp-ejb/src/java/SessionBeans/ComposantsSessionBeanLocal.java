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
public interface ComposantsSessionBeanLocal {
    public void DeleteComposant(String codeComposant);
    public void AjoutComposant(String nomComposant,String descriptionComposant,String dependencyComposant,int Code_catégorie);
    public void ModifierComposant(int codeComposant,String nomComposant,String descriptionComposant,String dependencyComposant,int Code_catégorie);
    public ResultSet SelectComposant(int codeComposant);
    public ResultSet SelectComposants();
}
