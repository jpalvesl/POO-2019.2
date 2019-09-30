package com.gmail.jpalvesl;

public abstract class Conta {
    private int id;
    private String titular;
    private TipoConta tipo;
    private double saldo;
    private String extrato;
    private static int contador = 0;


    public Conta(String titular) {
        setTitular(titular);
        setId();
        this.extrato = "Conta aberta com sucesso";
    }

    public int getId() {
        return id;
    }

    private void setId() {
        this.id = ++contador;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;

    }

    public TipoConta getTipo() {
        return tipo;
    }

    public void setTipo(TipoConta tipo) {
        this.tipo = tipo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getExtrato() {
        return extrato;
    }

    public boolean sacar(double valor){
        if ( valor > 0 && valor <= getSaldo() ){
            this.saldo -= valor;
            return true;
        }
        return false;
    }

    public boolean depositar(double valor){
        if (valor > 0){
            this.saldo += valor;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Conta" + ", tipo:" + getTipo() + '\n'+
                "id: " + getId() +
                ", titular: " + getTitular() +
                ", saldo: " + getSaldo();
    }

    public abstract void passarMes();
}
