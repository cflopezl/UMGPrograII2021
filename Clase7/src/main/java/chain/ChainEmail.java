package chain;

import utils.Bitacora;
import utils.Correo;

public class ChainEmail extends ManejoErrores{
    public ChainEmail(int mask){
        this.mask = mask;
    }

    @Override
    public void execute(String msg, int priority) {
        if( priority <= mask ){
            Correo.sendFromGMail("Error critico",
                    "Ocurrio el siguiente error "
                    + msg);
        }

        if( next != null )
            next.execute(msg, priority);
    }
}
