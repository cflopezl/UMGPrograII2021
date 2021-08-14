package com.company;

public class Ahorro extends Cuenta{
    private double tasaInteres;

    public Ahorro(String noCuenta, double saldo, double tasaInteres) {
        super(noCuenta, saldo);
        this.tasaInteres = tasaInteres;
    }

    @Override
    public String toString() {
        return "Ahorro{" +
                super.toString()+
                "tasaInteres=" + tasaInteres +
                '}';
    }
}
