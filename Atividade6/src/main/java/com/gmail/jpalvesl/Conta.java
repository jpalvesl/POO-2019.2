package com.gmail.jpalvesl;

import java.util.Objects;

public class Conta {
    private double saldo;
    private int numero;
    private String titular;
    private static final String NOME_DEFAULT = "---sem nome---";


    public Conta(){
        this(500, 2, NOME_DEFAULT);
    }

    public Conta(double saldo, int numero, String titular) {
        this.saldo = saldo;
        this.numero = numero;
        this.titular = titular;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public boolean depositar(double valor){
        double resultado = getSaldo() - valor;

        if ( valor > 0 && resultado >= 0 ){
            setSaldo(resultado);
            return true;
        }
        return false;
    }

    public boolean sacar(double valor){
        if ( valor > 0 ){
            setSaldo( getSaldo() + valor );
            return true;
        }
        return false;
    }

    public double consultarSaldo(){
        return getSaldo();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Conta conta = (Conta) o;

        return getNumero() == conta.getNumero();
    }

    @Override
    public int hashCode() {
        return Objects.hashCode( getNumero() );
    }

    @Override
    public String toString() {
        return "Conta{" +
                "saldo=" + getSaldo() +
                ", numero=" + getNumero() +
                ", titular=" + getTitular() +
                '}';
    }
}
