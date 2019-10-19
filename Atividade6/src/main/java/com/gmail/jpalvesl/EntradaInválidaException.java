package com.gmail.jpalvesl;

public class EntradaInválidaException extends Exception {
    public EntradaInválidaException(){
        super( "Entrada de dados não adequada" );
    }

    public EntradaInválidaException(String mensagem){
        super( mensagem );
    }
}
