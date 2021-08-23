package edu.umg;

import java.util.ArrayList;

public class Persona {
    private String nombre;
    private double viaticos;

    public Persona(String nombre) {
        this.nombre = nombre;
    }

    public Persona(String nombre, double viaticos) {
        this.nombre = nombre;
        this.viaticos = viaticos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getViaticos() {
        return viaticos;
    }

    public void setViaticos(double viaticos) {
        this.viaticos = viaticos;
    }

}
