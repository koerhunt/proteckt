/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package config;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

/**
 *
 * @author KoerHunt
 */

public class Initialize {    
    
    private final String CONFIG_FILE = "src/config/configuration.txt";
    
    //Constructor
    public Initialize() throws FileNotFoundException, IOException{
        
        //Setup input stream properites file
        FileInputStream propFile = new FileInputStream(CONFIG_FILE);
        
        //Load properties
        Properties p = new Properties(System.getProperties());
        p.load(propFile);

        // set the system properties
        System.setProperties(p);
        
        // display new properties
        //System.out.println("Show list of properties");
        //System.getProperties().list(System.out);
        //System.out.println("- - - - - - - - - - -");
    }
    
}
