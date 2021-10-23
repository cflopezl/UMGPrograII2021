/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;
import model.Videojuego;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import utils.DataBaseAccess;
/**
 *
 * @author chris
 */
public class VideoJuegoDAO implements DbDAO {

    @Override
    public ArrayList<Videojuego> getAll() {
        ResultSet rset=null;
        ArrayList<Videojuego> lstVideojuego = new ArrayList();
        try {

            Statement stmt = DataBaseAccess.conn.createStatement();
            String sql = "SELECT * FROM videojuego";
            rset = stmt.executeQuery(sql);
            while(rset.next()){
                lstVideojuego.add( new Videojuego(
                        rset.getInt("id"),
                        rset.getString("nombre")));
            }

        }catch(SQLException ex){
            System.out.println("Exception = " + ex.getMessage());
        }
        return lstVideojuego;
    }

    @Override
    public void save(Object data) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
