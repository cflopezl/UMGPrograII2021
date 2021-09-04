package chain;

import utils.Bitacora;

import javax.swing.*;

public class ChainLog extends ManejoErrores {
    public ChainLog(int mask){
        this.mask = mask;
    }

    @Override
    public void execute(String msg, int priority) {
        if( priority <= mask ){
            Bitacora.getInstance().error(msg);
        }

        if( next != null )
            next.execute(msg, priority);
    }
}
