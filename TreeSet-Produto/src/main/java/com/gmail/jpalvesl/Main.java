package com.gmail.jpalvesl;

import java.text.Collator;
import java.util.Comparator;

public class Main
{
    public static void main( String[] args ) {
        // comparadores para serem passados como parametro da TreeSet
        Comparator<Produto> comp1 = Comparator.comparing(Produto::getName);
        Comparator<Produto> comp2 = Comparator.comparing(Produto::getPrice);

        // Loja esta sendo naturalmente ordenada pelo id
        Loja loja = new Loja();


        Produto p1 = new Produto(100, "Leite", 3.5);
        Produto p2 = new Produto(1, "Pippo's", 2.0);
        Produto p3 = new Produto(30, "Coca-Cola", 7.00);
        Produto p4 = new Produto(15, "Halls", 1);
        Produto p_clone = new Produto(15, "Halls", 1);

        loja.adicionarProduto(p1);
        loja.adicionarProduto(p2);
        loja.adicionarProduto(p3);
        loja.adicionarProduto(p4);

        System.out.println(loja);

    }
}
