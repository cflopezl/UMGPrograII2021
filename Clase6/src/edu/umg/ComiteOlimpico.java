package edu.umg;

import java.util.ArrayList;

public class ComiteOlimpico {
    public ArrayList<Persona> comite;
    public String nombre;

    public ComiteOlimpico(String nombre) {
        comite= new ArrayList<Persona>();
        this.nombre = nombre;
    }
}
