package com.gmail.jpalvesl;

public class SaldoInsuficienteException extends Exception {
    public SaldoInsuficienteException(){
        super( "Você não tem dinheiro para realizar essa operação" );
    }

    public SaldoInsuficienteException( String mensagem ) {
        super( mensagem );
    }
}
