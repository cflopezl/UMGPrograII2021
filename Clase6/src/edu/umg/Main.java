package edu.umg;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ComiteOlimpico comisiongt = new ComiteOlimpico("Comité olímpico de Guatemala");
        Atleta atleta1 = new Atleta("Kevin Cordón",10000);
        Atleta atleta2 = new Atleta("Luis Grijalva",12000);
        comisiongt.comite.add(atleta1);
        comisiongt.comite.add(atleta2);

        comisiongt.comite.add(new Entrenador("Jorge Pérez",
                5000));
        comisiongt.comite.add(new Administrativo("María Mercedes",
                7000));

        for( Persona temp : comisiongt.comite ){
            System.out.format("%25s %,10.2f \n", temp.getNombre(), temp.getViaticos() );
            if( temp instanceof Atleta ) {
                Atleta at = (Atleta)temp;
                System.out.println(at.competir());
            }
        }


    }
}
