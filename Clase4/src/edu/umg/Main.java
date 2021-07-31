package edu.umg;


import java.util.Date;

public class Main {

    public static void main(String[] args) {
        /*
        //solicitar datos al usuario: nombre, pais, deporte
        Atleta atleta1 =  new Atleta();
        atleta1.setNombre("Erick Barrondo");
        atleta1.setDeporte("Marcha");
        atleta1.setPais("Guatemala");
        System.out.println(atleta1.toString());

        Atleta atleta2 = new Atleta("Michael Phelps", "EEUU", "natación");
        System.out.println(atleta2.toString());
         */
        Atleta atleta1 =  new Atleta();
        atleta1.setNombre("Erick Barrondo");
        atleta1.setDeporte("Marcha 20 Km");
        atleta1.setPais("Guatemala");

        //la panalla requiere los datos de una competencia
        //creamos instancia de esa competencia
        Competencia marcha = new Competencia(
                "Marcha 20 Km"
                ,"5ta Ave. Tokyo"
                , new Date());

        marcha.addAtleta(atleta1);
        marcha.addAtleta(new Atleta(
                "Michael Phelps", "EEUU",
                "natación"));
        marcha.addAtleta(new Atleta(
                "ABRAHAM Tadesse", "Suiza",
                "Marcha 20 Km"));



        System.out.println("marcha = " + marcha);
    }
}
