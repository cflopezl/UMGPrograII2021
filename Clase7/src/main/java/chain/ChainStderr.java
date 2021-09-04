package chain;

import javax.swing.*;

public class ChainStderr extends ManejoErrores{

    public ChainStderr(int mask){
        this.mask = mask;
    }

    @Override
    public void execute(String msg, int priority) {
        if( priority <= mask ){
            JOptionPane.showMessageDialog(null, msg, "Mensaje de Error", JOptionPane.INFORMATION_MESSAGE);
        }

        if( next != null )
            next.execute(msg, priority);
    }
}
