package com.gmail.jpalvesl;

import java.util.*;

public class Banco {
    Set<Conta> lista = new HashSet<>();


    public boolean adicionarConta(Conta conta) {
        return lista.add( conta );
    }

    public boolean removerConta(Conta conta) {
        return lista.remove( conta );
    }


    public boolean buscarConta(int numero) {
        return lista.stream()
                .anyMatch(conta -> conta.getNumero() == numero);

    }
}
