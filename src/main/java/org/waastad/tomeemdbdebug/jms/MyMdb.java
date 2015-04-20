/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.waastad.tomeemdbdebug.jms;

import javax.ejb.ActivationConfigProperty;
import javax.ejb.MessageDriven;
import javax.jms.Message;
import javax.jms.MessageListener;

/**
 *
 * @author Helge Waastad <helge.waastad@waastad.org>
 */
@MessageDriven(activationConfig = {
    @ActivationConfigProperty(propertyName = "destinationType", propertyValue = "javax.jms.Topic"),
    @ActivationConfigProperty(propertyName = "destination", propertyValue = "TomEETopic"),
    @ActivationConfigProperty(propertyName = "maxSessions", propertyValue = "1")
})
public class MyMdb implements MessageListener {

    @Override
    public void onMessage(Message msg) {
        System.out.println("Got a topic message.....");
    }

}
