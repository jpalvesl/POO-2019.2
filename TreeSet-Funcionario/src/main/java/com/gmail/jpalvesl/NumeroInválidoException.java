package com.gmail.jpalvesl;

public class NumeroInválidoException extends Exception {
    NumeroInválidoException(){
        super( "Aceitos apenas numeros maior que 0" );
    }


    NumeroInválidoException( String mensagem ){
        super( mensagem );
    }
}
