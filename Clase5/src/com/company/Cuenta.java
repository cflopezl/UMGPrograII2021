package com.company;

public class Cuenta {
    private String noCuenta;
    private double saldo;

    public Cuenta(String noCuenta, double saldo) {
        this.noCuenta = noCuenta;
        this.saldo = saldo;
    }

    public String getNoCuenta() {
        return noCuenta;
    }

    public void setNoCuenta(String noCuenta) {
        this.noCuenta = noCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Cuenta{" +
                "noCuenta='" + noCuenta + '\'' +
                ", saldo=" + saldo +
                '}';
    }
}
