package com.gmail.jpalvesl;

public class NomeInvalidoException extends Exception {
    NomeInvalidoException(){
        super( "Erro no formato da String" );
    }

    NomeInvalidoException( String mensagem ){
        super( mensagem );
    }
}
