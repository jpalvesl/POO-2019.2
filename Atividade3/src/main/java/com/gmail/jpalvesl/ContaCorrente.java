package com.gmail.jpalvesl;

public class ContaCorrente {
    private int numero;
    private String titular;
    private double saldo;

    public ContaCorrente() {
        setNumero(0);
        setTitular("--- sem titular ---");
        setSaldo(0);
    }

    public ContaCorrente(int numero, String titular, double saldo) {
        setNumero(numero);
        setTitular(titular);
        setSaldo(saldo);
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        if ( numero > 0 ){
            this.numero = numero;
        }
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

    private void setSaldo(double saldo) {
        if ( saldo > 0 ){
            this.saldo = saldo;
        }
    }

    public boolean saque(double valor){
        if ( (valor > 0) && (this.saldo - valor >= 0) ){
            this.saldo -= valor;
            return true;
        }
        return false;
    }

    public boolean deposito(double valor){
        if ( valor > 0 ){
            this.saldo += valor;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return  "numero=" + numero +
                ", titular='" + titular + '\'' +
                ", saldo=" + saldo ;
    }
}
