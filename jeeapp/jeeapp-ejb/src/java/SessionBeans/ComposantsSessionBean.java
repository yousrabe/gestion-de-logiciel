/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SessionBeans;

import javax.ejb.Stateless;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author fahdo
 */
@Stateless
public class ComposantsSessionBean implements ComposantsSessionBeanLocal {

    @Override
        public void DeleteComposant(String codeComposant){
        try {
            ConnectionSingletonSessionBean cnx;
            cnx=new ConnectionSingletonSessionBean();
            Connection conn = cnx.ConnexionDB();
            PreparedStatement st = conn.prepareStatement("delete from composants where codeComposant= ?");
            st.setInt(1,Integer.parseInt(codeComposant));
            st.executeUpdate(); 
            
        } catch (SQLException ex) {
            Logger.getLogger(ComposantsSessionBean.class.getName()).log(Level.SEVERE, null, ex);
        }

    
    }
    
    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")


    @Override
    public void AjoutComposant(String nomComposant,String descriptionComposant,String dependencyComposant,int Code_catégorie) {
        try {
            ConnectionSingletonSessionBean cnx;
            cnx=new ConnectionSingletonSessionBean();
            Connection conn = cnx.ConnexionDB();
            Statement st = conn.createStatement();

            String sql="insert into composants (nomComposant,descriptionComposant,dependencyComposant,Code_catégorie) values(?,?,?,?)";
            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            preparedStatement.setString(1, nomComposant);
            preparedStatement.setString(2, descriptionComposant);
            preparedStatement.setString(3, dependencyComposant);
            preparedStatement.setInt(4, Code_catégorie);

            preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ComposantsSessionBean.class.getName()).log(Level.SEVERE, null, ex);
        }
 }

    @Override
    public void ModifierComposant(int codeComposant, String nomComposant, String descriptionComposant, String dependencyComposant, int Code_catégorie) {
        try {
            ConnectionSingletonSessionBean cnx;
            cnx=new ConnectionSingletonSessionBean();
            Connection conn = cnx.ConnexionDB();
            PreparedStatement st = conn.prepareStatement("update composants set nomComposant = ? , descriptionComposant= ? , dependencyComposant= ? , Code_catégorie=?   where codeComposant= ?");
            st.setString(1,nomComposant);
            st.setString(2,descriptionComposant);
            st.setString(3,dependencyComposant);
            st.setInt(4,Code_catégorie);
            st.setInt(5,codeComposant);

            st.executeUpdate(); 
        } catch (SQLException ex) {
            Logger.getLogger(ComposantsSessionBean.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public ResultSet SelectComposant(int codeComposant) {
        ResultSet resul=null;
        try {
            ConnectionSingletonSessionBean cnx;
            cnx=new ConnectionSingletonSessionBean();
            Connection conn = cnx.ConnexionDB();
            
            Statement st = conn.createStatement();
            resul= st.executeQuery("select * from composants where codeComposant='"+codeComposant+"' ");
            resul.last();
            resul.beforeFirst();
        } catch (SQLException ex) {
            Logger.getLogger(ComposantsSessionBean.class.getName()).log(Level.SEVERE, null, ex);
        }
            
            
        return resul;       }

    @Override
    public ResultSet SelectComposants() {
        ResultSet resul=null;
        try {
            ConnectionSingletonSessionBean cnx;
            cnx=new ConnectionSingletonSessionBean();
            Connection conn = cnx.ConnexionDB();
            
            Statement st = conn.createStatement();
            resul= st.executeQuery("select * from composants");
            resul.last();
            resul.beforeFirst();
        } catch (SQLException ex) {
            Logger.getLogger(ComposantsSessionBean.class.getName()).log(Level.SEVERE, null, ex);
        }
            
            
        return resul;
    }
        /*public static void main(String[] args){
        ComposantsSessionBean c = new ComposantsSessionBean();
        //c.AjoutComposant("RamDDR4", "4GHZ", "8GB", 2);
        //c.AjoutComposant("RamDDR4", "4GHZ", "4GB", 2);
       // c.ModifierComposant(5,"RamDDR2", "8GHZ", "4GB", 2);
        //c.DeleteComposant("4");
        try {
    //ResultSet res=c.SelectComposant(2);
        ResultSet res=c.SelectComposants();

while(res.next()){
    System.out.println(res.getString("nomComposant"));
}       } 
catch (SQLException ex) {Logger.getLogger(LogicielsSessionBean.class.getName()).log(Level.SEVERE, null, ex);}
        }
*/
}
