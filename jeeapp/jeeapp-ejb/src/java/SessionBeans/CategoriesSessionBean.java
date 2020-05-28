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
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.Stateless;

/**
 *
 * @author fahdo
 */
@Stateless
public class CategoriesSessionBean implements CategoriesSessionBeanLocal {

    @Override
    public void DeleteCategorie(int Code_Categorie) {
        try {
            ConnectionSingletonSessionBean cnx;
            cnx=new ConnectionSingletonSessionBean();
            Connection conn = cnx.ConnexionDB();
            PreparedStatement st = conn.prepareStatement("delete from categories where Code_Categorie= ?");
            st.setInt(1,Code_Categorie);
            st.executeUpdate(); 
            
        } catch (SQLException ex) {
            Logger.getLogger(CategoriesSessionBean.class.getName()).log(Level.SEVERE, null, ex);
        }

    
    }

    @Override
    public void AjoutCategorie(String Type_Categorie, String Description_Categorie) {
        try {
            ConnectionSingletonSessionBean cnx;
            cnx=new ConnectionSingletonSessionBean();
            Connection conn = cnx.ConnexionDB();
            Statement st = conn.createStatement();

            String sql="insert into categories (Type_Categorie,Description_Categorie) values(?,?)";
            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            preparedStatement.setString(1, Type_Categorie);
            preparedStatement.setString(2, Description_Categorie);

            preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(CategoriesSessionBean.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void ModifierCategorie(int Code_Categorie, String Type_Categorie, String Description_Categorie) {
         try {
            ConnectionSingletonSessionBean cnx;
            cnx=new ConnectionSingletonSessionBean();
            Connection conn = cnx.ConnexionDB();
            PreparedStatement st = conn.prepareStatement("update categories set Type_Categorie = ? , Description_Categorie= ?    where Code_Categorie= ?");
            st.setString(1,Type_Categorie);
            st.setString(2,Description_Categorie);
            st.setInt(3,Code_Categorie);
           

            st.executeUpdate(); 
        } catch (SQLException ex) {
            Logger.getLogger(CategoriesSessionBean.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public ResultSet SelectCategorie(int Code_Categorie) {
        ResultSet resul=null;
        try {
            ConnectionSingletonSessionBean cnx;
            cnx=new ConnectionSingletonSessionBean();
            Connection conn = cnx.ConnexionDB();
            
            Statement st = conn.createStatement();
            resul= st.executeQuery("select * from categories where Code_Categorie='"+Code_Categorie+"' ");
            resul.last();
            resul.beforeFirst();
        } catch (SQLException ex) {
            Logger.getLogger(CategoriesSessionBean.class.getName()).log(Level.SEVERE, null, ex);
        }
            
            
        return resul;
    }

    @Override
    public ResultSet SelectCategories() {
            ResultSet resul=null;
        try {
            ConnectionSingletonSessionBean cnx;
            cnx=new ConnectionSingletonSessionBean();
            Connection conn = cnx.ConnexionDB();
            
            Statement st = conn.createStatement();
            resul= st.executeQuery("select * from categories ");
            resul.last();
            resul.beforeFirst();
        } catch (SQLException ex) {
            Logger.getLogger(CategoriesSessionBean.class.getName()).log(Level.SEVERE, null, ex);
        }
            
            
        return resul;    }

/*public static void main(String[] args){
    CategoriesSessionBean c = new CategoriesSessionBean();
    //c.AjoutCategorie("CarteMere", "MotherBoard");
    //c.AjoutCategorie("CarteSon", "SonorBoard");
    //c.AjoutCategorie("CarteReseau", "NetworkBoard");
    //c.ModifierCategorie(6, "CarteWifi", "WifiBoard");
    //c.DeleteCategorie(6);
   /* try {
    //ResultSet res=c.SelectCategorie(5);
    ResultSet res=c.SelectCategories();
while(res.next()){
    System.out.println(res.getString("Type_Categorie"));
}       } 
catch (SQLException ex) {Logger.getLogger(LogicielsSessionBean.class.getName()).log(Level.SEVERE, null, ex);}*/
//}

}

