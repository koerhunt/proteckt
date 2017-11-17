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
    
    String HOSTNAME = System.getProperty("db.host");
    String PORT = System.getProperty("db.port");
    String DATABASE = System.getProperty("db.database");
    String user, password;
    
    String baseUrl = "jdbc:mysql://" + HOSTNAME + ":" + Integer.valueOf(PORT) + "/" + DATABASE;

    public Connection rawConnection;

    public MysqlConnection(String user_name, String password) throws ClassNotFoundException, SQLException{
        
        //class for the driver
        Class.forName("com.mysql.jdbc.Driver");
        
        rawConnection = DriverManager.getConnection(baseUrl,user_name,password);
        
    }    
    
}