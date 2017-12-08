/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helpers;

import interfaces.Login;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author KoerHunt
 */

public class SourceJForm extends javax.swing.JFrame {
    
    //Conexion
    protected Connection rawConnection;
    
    //Encriptador
    protected Encriptador cryp;
    
    //Archivo de credenciales
    private final String USER_DATA = "src/config/user_data.db";
    private final String PWD = "src/config/pass.db";
    
    //System properites
    protected final Properties props;
    
    public SourceJForm() throws FileNotFoundException, IOException, ClassNotFoundException, Exception{
                
        //Encriptador
        cryp = new Encriptador();
        
        //Get system properties
        props = new Properties(System.getProperties());
        
        //Setup input stream properites file
        FileInputStream propFileIn = new FileInputStream(USER_DATA);
        
        props.load(propFileIn);

        // set the system properties
        System.setProperties(props);
        
        //Obtener el usuario de las propiedades
        String dbuser = props.getProperty("db.user");
            
        //obtener la contrasenia del usuario        
        FileInputStream pwdin = new FileInputStream(PWD);
        
        String readed = "";
        int lengt = 0;
        
        boolean terminado = false;
        while(!terminado){
            int b = pwdin.read();
            if(b==-1){
                terminado = true;
            }else{
                lengt++;
                if(lengt==1){
                    readed += b;
                }else{
                    readed += ","+b;
                }
            }   
        }
        
        byte pwdbytes[] = new byte[lengt];
        String[] splited = readed.split(",");
        
        
        for(int i =0; i<lengt;i++){
            pwdbytes[i] = (byte)Integer.parseInt(splited[i]);
        }
        
        //Prepara el driver
        Class.forName("com.mysql.jdbc.Driver");
        
         try {
             
            //Decifra la contraseña
            String dbpass = cryp.descifra(pwdbytes);
        
            //Estabiliza la conexion
            this.rawConnection = new MysqlConnection(dbuser,dbpass).conectar();
            
            //
            System.out.println("conexion realizada :D");
                       
        } catch (ClassNotFoundException ex) {
            //Imprime los detalles del error
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {            
            //exception cause: Sintaxis incorrenta o credenciales incorrecta
            if(ex.getErrorCode()==1045||ex.getErrorCode()==1044){
                
                JOptionPane.showMessageDialog(
                    null, 
                    "Ha ocurrido un error en la comunicacion con la base de datos, por favor ingrese de nuevo", 
                    "Error de conexion", 
                    JOptionPane.ERROR_MESSAGE
                );
                
                System.exit(0);
            }            
            
        } catch(NullPointerException e){
            System.out.println("No hay datos de acceso disponibles");
        }
        
        
    }
    
}
