/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import config.Initialize;
import interfaces.Login;
import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author shikami
 */
public class Main {
    
    public static void main(String args[]){
        
        try {
            
            //init enverioment
            Initialize init = new config.Initialize();
            
            
            //launch login form
            java.awt.EventQueue.invokeLater(() -> {
                new Login().setVisible(true);
            });
            
            
        } catch (IOException ex) {
            
            JOptionPane.showMessageDialog(
                    null, 
                    "No se ha podido cargar el archivo de configuracion", 
                    "Ha ocurrido un error", 
                    JOptionPane.ERROR_MESSAGE
            );
            
            System.exit(0);
        }
        
        
    }
    
}
