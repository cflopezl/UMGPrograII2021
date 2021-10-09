package DAO;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public interface DbDAO<T> {
    public ArrayList<T> getAll();
    public void save(Object data);
}
