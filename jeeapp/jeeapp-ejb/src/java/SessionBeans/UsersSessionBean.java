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
public class UsersSessionBean implements UsersSessionBeanLocal {

    @Override
    public void DeleteUser(int codeUser) {
           try {
            ConnectionSingletonSessionBean cnx;
            cnx=new ConnectionSingletonSessionBean();
            Connection conn = cnx.ConnexionDB();
            PreparedStatement st = conn.prepareStatement("delete from utilisateurs where codeUser= ?");
            st.setInt(1,codeUser);
            st.executeUpdate(); 
            
        } catch (SQLException ex) {
            Logger.getLogger(UsersSessionBean.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void AjoutUser(String nom, String prenom, String Date_naissance, String email, String sexe, String login, String password) {
try {
            ConnectionSingletonSessionBean cnx;
            cnx=new ConnectionSingletonSessionBean();
            Connection conn = cnx.ConnexionDB();
            Statement st = conn.createStatement();

           String sql="insert into utilisateurs(nom,prenom,Date_naissance,email,sexe,login,password) values(?,?,?,?,?,?,?)";
            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            preparedStatement.setString(1, nom);
            preparedStatement.setString(2, prenom);
            preparedStatement.setString(3, Date_naissance);
            preparedStatement.setString(4, email);
            preparedStatement.setString(5, sexe);
            preparedStatement.setString(6, login);
            preparedStatement.setString(7, password);
            preparedStatement.executeUpdate(); 

        } catch (SQLException ex) {
            Logger.getLogger(UsersSessionBean.class.getName()).log(Level.SEVERE, null, ex);
        }    }

    @Override
    public void ModifierUser(int codeUser, String nom, String prenom, String Date_naissance, String email, String sexe, String login, String password) {
       try {
            ConnectionSingletonSessionBean cnx;
            cnx=new ConnectionSingletonSessionBean();
            Connection conn = cnx.ConnexionDB();
            PreparedStatement st = conn.prepareStatement("update utilisateurs set nom = ? , prenom= ? , Date_naissance= ? ,  email=?  , sexe= ? , login=? , password = ? where codeUser= ?");
            st.setString(1,nom);
            st.setString(2,prenom);
            st.setString(3,Date_naissance);
            st.setString(4,email);
            st.setString(5,sexe);
            st.setString(6,login);
            st.setString(7,password);
            st.setInt(8,codeUser);


            st.executeUpdate(); 
        } catch (SQLException ex) {
            Logger.getLogger(LogicielsSessionBean.class.getName()).log(Level.SEVERE, null, ex);
        }    
    }

    @Override
    public ResultSet SelectUser(int codeUser) {
ResultSet resul=null;
        try {
            ConnectionSingletonSessionBean cnx;
            cnx=new ConnectionSingletonSessionBean();
            Connection conn = cnx.ConnexionDB();
            
            Statement st = conn.createStatement();
            resul= st.executeQuery("select * from utilisateurs where codeUser='"+codeUser+"' ");
            resul.last();
            resul.beforeFirst();
        } catch (SQLException ex) {
            Logger.getLogger(UsersSessionBean.class.getName()).log(Level.SEVERE, null, ex);
        }
            
            
        return resul;    }

    @Override
    public ResultSet SelectUsers() {
ResultSet resul=null;
        try {
            ConnectionSingletonSessionBean cnx;
            cnx=new ConnectionSingletonSessionBean();
            Connection conn = cnx.ConnexionDB();
            
            Statement st = conn.createStatement();
            resul= st.executeQuery("select * from utilisateurs ");
            resul.last();
            resul.beforeFirst();
        } catch (SQLException ex) {
            Logger.getLogger(UsersSessionBean.class.getName()).log(Level.SEVERE, null, ex);
        }
            
            
        return resul;  
    }

/*public static void main(String[] args){
UsersSessionBean user = new UsersSessionBean();
/*user.AjoutUser("Mouahmed", "Bin Aziza", "19/01/2019", "benaziza@gmail.com", "Homme", "123", "123");
user.AjoutUser("Motez", "Abdelhamid", "19/01/2019", "motez@gmail.com", "Homme", "123", "123");
user.AjoutUser("Haifa", "Ayechi", "19/01/2019", "haifa@gmail.com", "Femme", "123", "123");
user.AjoutUser("Oumaima", "Amri", "19/01/2019", "amri@gmail.com", "Femme", "123", "123");*/
//user.ModifierUser(12, "aa", "bb", "ccc", "dd", "xx", "vv", "ww");
//user.DeleteUser(12);
/*try {
    ResultSet res=user.SelectUsers();
while(res.next()){
    System.out.println(res.getString("nom"));
}       } 
catch (SQLException ex) {Logger.getLogger(UsersSessionBean.class.getName()).log(Level.SEVERE, null, ex);}*/
//}
}
