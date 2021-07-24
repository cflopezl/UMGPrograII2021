package edu.umg;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //solicitar datos al usuario: nombre, pais, deporte
        Atleta atleta1 =  new Atleta();
        atleta1.setNombre("Erick Barrondo");
        atleta1.setDeporte("Marcha");
        atleta1.setPais("Guatemala");
        System.out.println(atleta1.toString());

        Atleta atleta2 = new Atleta("Michael Phelps", "EEUU", "natación");
        System.out.println(atleta2.toString());
    }
}
