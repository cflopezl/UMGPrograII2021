package edu.umg;

public class Entrenador extends Persona{
    public Entrenador(String nombre, double viaticos) {
        super(nombre, viaticos);
    }

    @Override
    public double getViaticos() {
        return super.getViaticos()+super.getViaticos()*0.25;
    }
}
