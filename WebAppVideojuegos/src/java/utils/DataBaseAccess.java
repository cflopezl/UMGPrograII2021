/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;
import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author chris
 */
public class DataBaseAccess {
    public static Connection conn;

    static{
        try{
            if(conn == null){
                Class.forName("org.postgresql.Driver");
                conn = DriverManager.getConnection("jdbc:postgresql://servidor/database","usuario","password");
            }
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }    
}
