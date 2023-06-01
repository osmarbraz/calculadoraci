package com.calculadoraci;

public class Calculadora {

    private double valorA;
    private double valorB;

    public Calculadora() {
        this(0.0, 0.0);
    }

    public Calculadora(double valorA, double valorB) {
        setValorA(valorA);
        setValorB(valorB);
    }

    public double getValorA() {
        return valorA;
    }

    public double getValorB() {
        return valorB;
    }

    public void setValorA(double valorA) {
        this.valorA = valorA;
    }

    public void setValorB(double valorB) {
        this.valorB = valorB;
    }

    public double getSoma() {
        return (getValorA() + getValorB());
    }

    public double getDiferenca() {
        return (getValorA() - getValorB());
    }

    public double getProduto() {
        return (getValorA() * getValorB());
    }

    public double getQuociente() {
        return (getValorA() / getValorB());
    }
}
