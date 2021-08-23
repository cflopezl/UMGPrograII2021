package edu.umg;

public class Atleta extends Persona{
    public Atleta(String nombre, double viaticos) {
        super(nombre, viaticos);
    }

    @Override
    public double getViaticos() {

        return super.getViaticos()+5000;

    }

    public String competir(){
        return "Estoy compitiendo";
    }
}
