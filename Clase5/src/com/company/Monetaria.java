package com.company;

public class Monetaria extends Cuenta{
    public Monetaria(String noCuenta, double saldo) {
        super(noCuenta, saldo);
    }

    @Override
    public String toString() {
        return "Monetaria{"+
                super.toString()+
                "}";
    }
}
