/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SessionBeans;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.Stateless;

/**
 *
 * @author fahdo
 */
@Stateless
public class LogicielsSessionBean implements LogicielsSessionBeanLocal {

    @Override
    public void DeleteLogiciel(int codLogiciel) {
        try {
            ConnectionSingletonSessionBean cnx;
            cnx=new ConnectionSingletonSessionBean();
            Connection conn = cnx.ConnexionDB();
            PreparedStatement st = conn.prepareStatement("delete from logiciels where codLogiciel= ?");
            st.setInt(1,codLogiciel);
            st.executeUpdate(); 
            
        } catch (SQLException ex) {
            Logger.getLogger(LogicielsSessionBean.class.getName()).log(Level.SEVERE, null, ex);
        }

    
    }

    @Override
    public void AjoutLogiciel(String nomLogiciel, String Taille, String DescriptionLogiciel, String Dependences) {
try {
            ConnectionSingletonSessionBean cnx;
            cnx=new ConnectionSingletonSessionBean();
            Connection conn = cnx.ConnexionDB();
            Statement st = conn.createStatement();

            String sql="insert into logiciels (nomLogiciel,Taille,DescriptionLogiciel,Dependences) values(?,?,?,?)";
            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            preparedStatement.setString(1, nomLogiciel);
            preparedStatement.setString(2, Taille);
            preparedStatement.setString(3, DescriptionLogiciel);
            preparedStatement.setString(4, Dependences);

            preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(LogicielsSessionBean.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void ModifierLogiciel(int codLogiciel, String nomLogiciel, String Taille, String DescriptionLogiciel, String Dependences) {
       try {
            ConnectionSingletonSessionBean cnx;
            cnx=new ConnectionSingletonSessionBean();
            Connection conn = cnx.ConnexionDB();
            PreparedStatement st = conn.prepareStatement("update logiciels set nomLogiciel = ? , Taille= ? , DescriptionLogiciel= ? , Dependences=?   where codLogiciel= ?");
            st.setString(1,nomLogiciel);
            st.setString(2,Taille);
            st.setString(3,DescriptionLogiciel);
            st.setString(4,Dependences);
            st.setInt(5,codLogiciel);

            st.executeUpdate(); 
        } catch (SQLException ex) {
            Logger.getLogger(LogicielsSessionBean.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    

    @Override
    public ResultSet SelectLogiciel(int codLogiciel) {
        ResultSet resul=null;
        try {
            ConnectionSingletonSessionBean cnx;
            cnx=new ConnectionSingletonSessionBean();
            Connection conn = cnx.ConnexionDB();
            
            Statement st = conn.createStatement();
            resul= st.executeQuery("select * from logiciels where codLogiciel='"+codLogiciel+"' ");
            resul.last();
            resul.beforeFirst();
        } catch (SQLException ex) {
            Logger.getLogger(LogicielsSessionBean.class.getName()).log(Level.SEVERE, null, ex);
        }
            
            
        return resul;
            
    }

    @Override
    public ResultSet SelectLogiciels() {
                ResultSet resul=null;
        try {
            ConnectionSingletonSessionBean cnx;
            cnx=new ConnectionSingletonSessionBean();
            Connection conn = cnx.ConnexionDB();
            
            Statement st = conn.createStatement();
            resul= st.executeQuery("select * from logiciels ");
            resul.last();
            resul.beforeFirst();
        } catch (SQLException ex) {
            Logger.getLogger(LogicielsSessionBean.class.getName()).log(Level.SEVERE, null, ex);
        }
            
            
        return resul;
    }

/*public static void main(String[] args){
       
            LogicielsSessionBean l = new LogicielsSessionBean();
//l.AjoutLogiciel("Matlab 2017", "5GB", "Traitement mathematique", "i7,Ram4GB");
//l.AjoutLogiciel("Matlab 2016", "5GB", "Traitement mathematique", "i7,Ram4GB");
//l.DeleteLogiciel(4);
//l.ModifierLogiciel(3, "Matlab 2017", "15GB", "Traitement mathematique", "i3,Ram2GB");
try {
    ResultSet res=l.SelectLogiciels();
while(res.next()){
    System.out.println(res.getString("nomLogiciel"));
}       } 
catch (SQLException ex) {Logger.getLogger(LogicielsSessionBean.class.getName()).log(Level.SEVERE, null, ex);}
}*/
}
