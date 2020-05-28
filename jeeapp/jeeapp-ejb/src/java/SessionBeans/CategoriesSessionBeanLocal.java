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
public interface CategoriesSessionBeanLocal {
    public void DeleteCategorie(int Code_Categorie);
    public void AjoutCategorie(String Type_Categorie,String Description_Categorie );
    public void ModifierCategorie(int Code_Categorie,String Type_Categorie,String Description_Categorie);
    public ResultSet SelectCategorie(int Code_Categorie);
    public ResultSet SelectCategories();
}
