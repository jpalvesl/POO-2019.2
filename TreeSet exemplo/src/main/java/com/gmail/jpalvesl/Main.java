package com.gmail.jpalvesl;

import java.util.HashSet;
import java.util.Set;

public class Main
{
    public static void main( String[] args )
    {
        Produto p1 = new Produto( 100, "Jaum", 500 );
        Produto p2 = new Produto( 200, "Amju", 61.3 );
        Produto p3 = new Produto( 300, "Amjah", 700.99 );

        Loja loja = new Loja();

        loja.adicionarProduto( p3 );
        loja.adicionarProduto( p1 );
        loja.adicionarProduto( p2 );

        /*Set<Produto> teste = new HashSet<>();

        teste.add( p3 );
        teste.add( p1 );
        teste.add( p2 );

        System.out.println("teste = " + teste);
        System.out.println();*/

        System.out.println("loja = " + loja);
    }
}
