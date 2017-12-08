/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import interfaces.PreLogin;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Koerhunt
 */
public class Main {
    
    public static void main(String args[]){
        //launch login form
        java.awt.EventQueue.invokeLater(() -> {
            try {
                new PreLogin().setVisible(true);
            } catch (Exception ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
        
    }
    
}
