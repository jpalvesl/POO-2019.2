package com.gmail.jpalvesl;

/**
 * Hello world!
 *
 */
public class Main
{
    public static void main( String[] args )
    {
        Livro l1 = new Livro("O pequeno principe", "Saint n sei q", "Rocco", 1990, 7, 50, 7);
        Livro l2 = new Livro("Não sei q la", "Aquele autor la", "The mood", 2010, 3, 200, 1);
        Livro l3 = new Livro("The main", "Kamikat", "Pain", 1997, 1, 23, 3);
        CatalogoLivros cat = new CatalogoLivros();

        cat.adicionarLivro(l1);
        cat.adicionarLivro(l2);
        cat.adicionarLivro(l3);
        System.out.printf("Lista de livros:\n%s\n", cat.listarLivros());

        cat.removerLivro(l1);

        System.out.printf("Lista de livros:\n%s", cat.listarLivros());
    }
}
