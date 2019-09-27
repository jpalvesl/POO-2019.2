package com.gmail.jpalvesl;

public class Calculadora {
    private String descrição = "Calculadorinha 10/10";
    private double memoria;

    public double somar(double umNumero, double outroNumero){
        double aux = umNumero + outroNumero;
        gravarMemoria(aux);
        return aux;
    }

    public double subtrair(double umNumero, double outroNumero){
        double aux = umNumero - outroNumero;
        gravarMemoria(aux);
        return aux;
    }

    public double multiplicar(double umNumero, double outroNumero){
        double aux = umNumero * outroNumero;
        gravarMemoria(aux);
        return aux;
    }

    public double dividir(double umNumero, double outroNumero){
        double aux = umNumero / outroNumero;
        gravarMemoria(aux);
        return aux;
    }


    public String consultarDescrição() {
        return descrição;
    }

    public void alterarDescrição(String descrição) {
        this.descrição = descrição;
    }

    public double lerMemoria() {
        return memoria;
    }

    public void gravarMemoria(double memoria) {
        this.memoria = memoria;
    }


}
