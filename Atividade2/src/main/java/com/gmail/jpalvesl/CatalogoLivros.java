package com.gmail.jpalvesl;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    private List<Livro> lista;

    public CatalogoLivros(){
        lista = new ArrayList<Livro>();
    }

    public boolean adicionarLivro(Livro livro){
        return lista.add(livro);
    }

    public boolean removerLivro(Livro livro){
        return lista.remove(livro);
    }

    public String listarLivros(){
        String lista_str = "";

        for ( Livro livro: lista ) {
            lista_str += livro.toString();
        }
        return lista_str;
    }
}
