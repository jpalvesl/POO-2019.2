package com.gmail.jpalvesl;

import java.util.HashSet;
import java.util.NavigableSet;
import java.util.Set;

public class Main
{
    public static void main( String[] args ) {
        Set<Livro> livros = new HashSet<>();

        ProcessadorTexto.lerColocandoNoHashSet( livros );
        ProcessadorTexto.GravandoNumArquivo( livros );
        for (Livro l :
             livros) {
            System.out.println(l);
        }

    }
}
