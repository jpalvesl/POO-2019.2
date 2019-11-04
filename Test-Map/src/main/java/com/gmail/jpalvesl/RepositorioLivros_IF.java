package com.gmail.jpalvesl;

public interface RepositorioLivros_IF {
    public Livro getLivroById( int id );

    public void addLivro( Livro l );

    public void apagarLivros();
}
