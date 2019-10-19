package com.gmail.jpalvesl;

public class QuantiaNegativaException extends Exception {
    public QuantiaNegativaException(String mensagem){
        super( mensagem );
    }

    public QuantiaNegativaException(){
        super( "Valores negativos não são suportados" );
    }

}

