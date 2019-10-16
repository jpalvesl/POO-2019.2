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


    public Conta buscarConta(int numero) {
        lista.stream();
        return null;

    }
}
