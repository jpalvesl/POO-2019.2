package com.gmail.jpalvesl;

public class Main
{
    public static void main( String[] args ) {
        AgenciaBancaria agencia = new AgenciaBancaria("Rua de la");
        Conta c1, c2;

        c1 = new ContaCorrente("João");
        c2 = new ContaPoupança("Pedro");
        agencia.adicionarConta(c1);
        agencia.adicionarConta(c2);

        System.out.println("agencia.listaContas() = \n" + agencia.listaContas());

    }
}
