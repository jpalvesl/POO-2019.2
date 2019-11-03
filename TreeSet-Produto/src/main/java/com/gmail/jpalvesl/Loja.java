package com.gmail.jpalvesl;

import java.util.*;

public class Loja implements Iterable<Produto>{
    private NavigableSet<Produto> produtos;

    public Loja( Comparator<Produto> comparator ) {
        Comparator<Produto> comp = Objects.requireNonNullElse( comparator, Comparator.naturalOrder() );
        produtos = new TreeSet<Produto>( comp );
    }

    public Loja() {
        this.produtos = new TreeSet<Produto>();
    }

    @Override
    public Iterator<Produto> iterator() {
        return produtos.iterator();
    }

    public boolean adicionarProduto( Produto produto ){
        return produtos.add( produto );
    }

    public boolean removerProduto( Produto produto ){
        return produtos.remove( produto );
    }

    public Produto buscarProduto( Produto produto ){
        Optional<Produto> optionalProduto =
                produtos.stream()
                .filter(prod -> produto.equals( prod ))
                .findAny();
        return optionalProduto.orElseThrow();
    }

    public NavigableSet<Produto> getProdutos() {
        return Collections.unmodifiableNavigableSet( produtos );
    }

    @Override
    public String toString() {
        return "Loja{" +
                "produtos=" + produtos +
                '}';
    }
}
