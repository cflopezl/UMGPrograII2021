package DAO;

import model.Videojuego;
import utils.DataBaseAccess;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

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
        Videojuego videojuego = (Videojuego) data;
        try {
            Statement stmt = DataBaseAccess.conn.createStatement();
            String sql = "INSERT INTO videojuego VALUES(" + videojuego.getId() + ",'" + videojuego.getNombre() + "')";
            stmt.executeUpdate(sql);
        }catch(SQLException ex){
            System.out.println("Exception = " + ex.getMessage());
        }
    }
}
