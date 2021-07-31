package edu.umg;

public class Atleta {
    //Atributos
    private String nombre;
    private String pais;
    private String deporte;

    //Constructores
    public Atleta(){}

    public Atleta(String nombre, String pais, String deporte) {
        this.nombre = nombre;
        this.pais = pais;
        this.deporte = deporte;
    }

    //Funcionalidades
    public void setNombre(String pNombre){
        nombre = pNombre;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public void setDeporte(String deporte) {
        this.deporte = deporte;
    }

    @Override
    public String toString() {
        return "Atleta{" +
                "nombre='" + nombre + '\'' +
                ", pais='" + pais + '\'' +
                ", deporte='" + deporte + '\'' +
                '}';
    }
}
