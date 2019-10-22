package com.gmail.jpalvesl;

import java.util.*;

public class Loja implements Iterable, Comparable {
    private Set<Produto> produtos = new TreeSet<>();

    public boolean adicionarProduto( Produto produto ){
        return produtos.add( produto );
    }

    public boolean removerProduto( Produto produto ){
        return produtos.remove( produto );
    }

    public Set<Produto> getProdutos() {
        return Collections.unmodifiableSet( this.produtos );
    }

    @Override
    public Iterator iterator() {
        return produtos.iterator();
    }


    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
