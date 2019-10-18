package com.gmail.jpalvesl;

import java.util.*;

public class Banco {
    private Set<Conta> conjunto = new HashSet<>();


    public boolean adicionarConta(Conta conta) {
        return conjunto.add( conta );
    }

    public boolean removerConta(Conta conta) {
        return conjunto.remove( conta );
    }


    public Conta buscarConta(int numero) {
        /* nao funcionanm "Erro de retorno"
        lista.iterator()
                .forEachRemaining( conta -> {
                    if ( conta.getNumero == numero ) return conta;
                } );


        lista.stream()
                .forEach( conta -> {
                    if ( conta.getNumero == numero ) return conta;
                } );
        */

        for (Iterator<Conta> it = conjunto.iterator(); it.hasNext(); ){
            Conta c1 = it.next();
            if ( c1.getNumero()  == numero ) return c1;
        }
        return null;
    }
}
