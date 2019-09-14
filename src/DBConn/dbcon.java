/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DBConn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author LahirukaPW
 */
public class dbcon {
    String sourceURL;
    Connection conn =null;
    
    public dbcon() {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            // Connection URL.
            sourceURL = new String("jdbc:mysql://localhost:3306/data_base"); //"Data Source=HP\\SQLEQHEXPRESS;Initial Catalog=dbequipment ;Persist Security Info=T" +
             //                 "rue;User ID=Dilshan;Password=nokian76"
            
        }
        catch(ClassNotFoundException classNotFoundException){
            System.out.println(classNotFoundException + "-----------Unable to load database driver classes");
        }
        }
    
    
    
    public Connection connect(){
       try{
           conn = DriverManager.getConnection(sourceURL, "root", "");
       }
       catch(SQLException sQLException){
           System.out.println(sQLException + "-----------DB connection failure");
       } 
       return conn;
    }
    
    
    public void con_close(Connection dbConn) {
        try {
        dbConn.close();
            } catch (SQLException sQLException) {
        System.out.println(sQLException + "-----------DB connection closing failure");
            }
        }
    
    }
    

