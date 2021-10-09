package utils;

import java.sql.Connection;
import java.sql.DriverManager;

public class DataBaseAccess {
    public static Connection conn;

    static{
        try{
            if(conn == null){
                Class.forName("org.postgresql.Driver");
                conn = DriverManager.getConnection("jdbc:postgresql://HOST/DATABASE","USER","PASSWORD");
            }
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }

}
