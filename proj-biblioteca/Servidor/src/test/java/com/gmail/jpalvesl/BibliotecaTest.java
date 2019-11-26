package com.gmail.jpalvesl;

import org.junit.*;

import java.rmi.RemoteException;

public class BibliotecaTest {
    // Livros que vao ser usados durante os testes
    static final Livro l1 = new Livro("99", "The fallen", "João", "ebook", "10.56");

    static final Livro l2 = new Livro("105", "Angels", "Amjah", "paperbook", "20.88");

    static final Livro clone_l1 = new Livro("99", "The fallen", "João", "ebook", "10.56");

    // biblioteca que sera usada ao longo do teste
    Biblioteca biblioteca = new Biblioteca();

    @Test
    public void cadastrarLivroDeveFuncionar() throws RemoteException {
        String resposta1, resposta2;

        resposta1 = biblioteca.cadastrarLivro(l1.getID(), l1.getTitulo(), l1.getAutor(), l1.getTipo(), l1.getPreco());
        resposta2 = biblioteca.cadastrarLivro(l2.getID(), l2.getTitulo(), l2.getAutor(), l2.getTipo(), l2.getPreco());

        // testando a saida esperada do programa
        Assert.assertEquals("Livro cadastrado com sucesso", resposta1);
        Assert.assertEquals("Livro cadastrado com sucesso", resposta2);
    }

    @Test
    public void cadastrarLivroNaoDeveFuncionar() throws RemoteException {
        String resposta1, resposta2, respostaClone;

        resposta1 = biblioteca.cadastrarLivro(l1.getID(), l1.getTitulo(), l1.getAutor(), l1.getTipo(), l1.getPreco());
        resposta2 = biblioteca.cadastrarLivro(l2.getID(), l2.getTitulo(), l2.getAutor(), l2.getTipo(), l2.getPreco());
        respostaClone = biblioteca.cadastrarLivro(clone_l1.getID(), clone_l1.getTitulo(), clone_l1.getAutor(), clone_l1.getTipo(), clone_l1.getPreco());

        // vendo se a reposta foi a esperada
        Assert.assertEquals("Erro - não foi possivel cadastrar o livro", respostaClone);
    }

    @Test
    public void removerLivroDeveFuncionar() throws RemoteException {
        String resposta1, resposta2, respostaRemovendo, respostaRemovendo2;

        resposta1 = biblioteca.cadastrarLivro(l1.getID(), l1.getTitulo(), l1.getAutor(), l1.getTipo(), l1.getPreco());
        resposta2 = biblioteca.cadastrarLivro(l2.getID(), l2.getTitulo(), l2.getAutor(), l2.getTipo(), l2.getPreco());
        respostaRemovendo = biblioteca.removerLivro(l1.getID());
        respostaRemovendo2 = biblioteca.removerLivro(l2.getID());

        Assert.assertEquals("Livro foi removido com sucesso", respostaRemovendo);
        Assert.assertEquals("Livro foi removido com sucesso", respostaRemovendo2);
    }

    @Test
    public void removerLivroNaoDeveFuncionar() throws RemoteException {
        String respostaRemovendo, respostaRemovendo2;

        respostaRemovendo = biblioteca.removerLivro(l1.getID());
        respostaRemovendo2 = biblioteca.removerLivro(l2.getID());

        Assert.assertEquals("Erro - não foi possivel remover o livro!", respostaRemovendo);
        Assert.assertEquals("Erro - não foi possivel remover o livro!", respostaRemovendo2);


    }

    @Test
    public void buscarLivroDeveFuncionar() throws RemoteException {
        String resposta1, resposta2;

        biblioteca.cadastrarLivro(l1.getID(), l1.getTitulo(), l1.getAutor(), l1.getTipo(), l1.getPreco());
        biblioteca.cadastrarLivro(l2.getID(), l2.getTitulo(), l2.getAutor(), l2.getTipo(), l2.getPreco());

        resposta1 = biblioteca.buscarLivro(l1.getID());
        resposta2 = biblioteca.buscarLivro(l2.getID());

        Assert.assertEquals(l1.toString(), resposta1);
        Assert.assertEquals(l2.toString(), resposta2);
    }

    @Test
    public void buscarLivroNaoDeveFuncionar() throws RemoteException {
        String resposta1, resposta2;

        resposta1 = biblioteca.buscarLivro(l1.getID());
        resposta2 = biblioteca.buscarLivro(l2.getID());

        Assert.assertEquals("Livro não encontrado", resposta1);
        Assert.assertEquals("Livro não encontrado", resposta2);


    }
}
