package edu.umg;

import java.util.Date;

public class Competencia {
    //Atributos
    private String disciplina;
    private String lugar;
    private Date fecha_hora;

    //Constructor
    public Competencia(String disciplina, String lugar,
                       Date fecha_hora) {
        this.disciplina = disciplina;
        this.lugar = lugar;
        this.fecha_hora = fecha_hora;
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
