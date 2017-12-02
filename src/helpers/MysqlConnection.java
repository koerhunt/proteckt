package helpers;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author KoerHunt
 */
public class MysqlConnection {
    
    private String HOSTNAME = "127.0.0.1";
    private String PORT = "3306";
    private String DATABASE = "proteckt";
    private String user, password;
    
    private String baseUrl = "jdbc:mysql://" + HOSTNAME + ":" + Integer.valueOf(PORT) + "/" + DATABASE;

    private Connection rawConnection;
    
    public MysqlConnection(String usr, String pwd){
        this.user = usr;
        this.password = pwd;
    }

    public Connection conectar() throws ClassNotFoundException, SQLException{
        
        //class for the driver
        Class.forName("com.mysql.jdbc.Driver");
        
        //Realiza la conexion y retorna el objeto
        rawConnection = DriverManager.getConnection(baseUrl,this.user,this.password);
        return rawConnection;
        
    }    
    
}