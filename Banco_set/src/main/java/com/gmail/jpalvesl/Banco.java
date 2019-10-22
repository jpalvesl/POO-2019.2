package com.gmail.jpalvesl;

import java.util.*;

public class Banco implements Iterable<Conta>{
    private Set<Conta> conjunto = new HashSet<>();


    public boolean adicionarConta(Conta conta) {
        return conjunto.add( conta );
    }

    public boolean removerConta(Conta conta) {
        return conjunto.remove( conta );
    }


    public Conta buscarConta(int numero)  {
        Optional<Conta> optionalConta = conjunto.stream()
                .filter(conta -> conta.getNumero() == numero)
                .findFirst();
        return  optionalConta.orElseThrow( () ->
                new RuntimeException("Não existe esta conta")); // NoSuchEmementException



        /* // nao funcionanm "Erro de retorno"
        // percorrendo com iterador
        conjunto.iterator()
                .forEachRemaining( conta -> {
                    if ( conta.getNumero == numero ) return conta;
                } );

        // percorrendo com stream
        conjunto.stream()
                .forEach( conta -> {
                    if ( conta.getNumero == numero ) return conta;
                } );
        */

        /*
        // funciona
        for (Iterator<Conta> it = conjunto.iterator(); it.hasNext(); ){
            Conta c1 = it.next();
            if ( c1.getNumero()  == numero ) return c1;
        }
        return null;
        */
    }

    @Override
    public Iterator<Conta> iterator() {
        return conjunto.iterator();
    }
}