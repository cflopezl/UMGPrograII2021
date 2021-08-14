package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Monetaria mon1 = new Monetaria("001",1000);
        System.out.println("mon1 = " + mon1);
        Ahorro ahorro1 = new Ahorro("10001", 300, 0.005);
        System.out.println("ahorro1 = " + ahorro1);
        Monetaria mon2 = new Monetaria("002", 800);
        int division=5;
        try {
            division=50;
            division = 10 / 0;
            division=100;
        }catch (ArithmeticException ex1){
            division = 3;
            System.out.println("Ocurrió un error = " + ex1.getMessage());
        }
        finally {
            division=80;
        }
        System.out.println("division = " + division);
        
    }
}
