/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SessionBeans;

import java.sql.*;
import javax.ejb.Singleton;

/**
 *
 * @author fahdo
 */
@Singleton
public class ConnectionSingletonSessionBean implements ConnectionSingletonSessionBeanLocal {
    String user="root";
    String password="";
    public Connection conn;
    @Override
    public Connection ConnexionDB() {
          try {
            Class.forName("com.mysql.jdbc.Driver");
        
        this.conn = DriverManager.getConnection("jdbc:mysql://localhost/jee_base1?useSSL=false","root","");
              System.out.println("SessionBeans.ConnectionSingletonSessionBean.ConnexionDB()");
    } catch (Exception ex) {
            System.out.println("DefaultClasses.ConnexionDB.<init>()");
        }
              return this.conn;

        }


    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    /*public static void main(String[] args){
        ConnectionSingletonSessionBean c = new ConnectionSingletonSessionBean();
        c.ConnexionDB();
    }*/
}
