/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MDB;

import SessionBeans.UsersSessionBean;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.ActivationConfigProperty;
import javax.ejb.MessageDriven;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

/**
 *
 * @author fahdo
 */
@MessageDriven(mappedName = "jms/dest", activationConfig = {
    @ActivationConfigProperty(propertyName = "destinationType", propertyValue = "javax.jms.Queue")
})
public class Composants_Delete_MessageBean implements MessageListener {
    
    public Composants_Delete_MessageBean() {
    }
    
    @Override
    public void onMessage(Message message) {
        try {
            TextMessage mes = (TextMessage) message;
            System.out.println(mes.getText());
            UsersSessionBean user = new UsersSessionBean();
            user.DeleteUser(Integer.parseInt(mes.getText()));
            System.out.println("l'utilisateur ayant le code "+mes.getText()+"est supprimer ");
        } catch (JMSException ex) {
            Logger.getLogger(Composants_Delete_MessageBean.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
