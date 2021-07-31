package edu.umg;

import java.util.Date;

public class Competencia {
    //Atributos
    private String disciplina;
    private String lugar;
    private Date fecha_hora;
    private Atleta[] atletas;
    private int contadorAtletas;

    //Constructor
    public Competencia(String disciplina, String lugar,
                       Date fecha_hora) {
        this.disciplina = disciplina;
        this.lugar = lugar;
        this.fecha_hora = fecha_hora;
        atletas = new Atleta[50];
        contadorAtletas = 0;
    }

    public void addAtleta(Atleta pAtleta){
        if( pAtleta.getDeporte().equals(this.disciplina) ) {
            this.atletas[contadorAtletas] = pAtleta;
            contadorAtletas = contadorAtletas + 1;
        }else
            System.out.println("El atleta " +
                    pAtleta.getNombre() + " no forma" +
                    " parte de esta disciplina " +
                    this.disciplina);
    }

    public String getDisciplina(){
        return disciplina;
    }

    public void setDisciplina(String disciplina){
        this.disciplina = disciplina;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public Date getFecha_hora() {
        return fecha_hora;
    }

    public void setFecha_hora(Date fecha_hora) {
        this.fecha_hora = fecha_hora;
    }

    @Override
    public String toString() {
        return "Competencia{" +
                "disciplina='" + disciplina + '\'' +
                ", lugar='" + lugar + '\'' +
                ", fecha_hora=" + fecha_hora +
                '}';
    }
}
