package com.gmail.jpalvesl;

import java.util.*;

public class HashMapLivros implements RepositorioLivros_IF {
    private Map<Integer, Livro> mapa = new HashMap<>();

    @Override
    public Livro getLivroById(int id) {
        return mapa.get( id );
    }

    @Override
    public void addLivro(Livro l) {
        mapa.put( l.getId(), l );
    }

    @Override
    public void apagarLivros() {
        mapa.clear();
    }

    @Override
    public String toString() {
        return "HashMapLivros\n" +
                "mapa=" + mapa;
    }
}
