package utils;

import java.sql.Connection;
import java.sql.DriverManager;

public class DataBaseAccess {
    public static Connection conn;

    static{
        try{
            if(conn == null){
                Class.forName("org.postgresql.Driver");
                conn = DriverManager.getConnection("jdbc:postgresql://ec2-54-161-58-21.compute-1.amazonaws.com/d3icpgjetmg86s","wgelxjooeiwwxn","815648e8fc3d1574d8ac42d4d925b64a3c655cf386bd85c4a45c08e7c51c6adf");
            }
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }

}
