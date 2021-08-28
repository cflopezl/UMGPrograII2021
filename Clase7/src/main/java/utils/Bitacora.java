package utils;

import org.apache.log4j.Logger;

public class Bitacora {
    private static Logger instance;

    public Bitacora() {
    }

    public static Logger getInstance(){
        if( instance == null)
            instance = Logger.getLogger(Bitacora.class.getName());

        return instance;
    }
}
