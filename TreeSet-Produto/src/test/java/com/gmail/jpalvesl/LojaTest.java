package com.gmail.jpalvesl;


import com.sun.source.tree.AssertTree;
import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;


public class LojaTest {
    static final Produto p1 = new Produto(100, "Leite", 3.5);
    static final Produto p2 = new Produto(1, "Pippo's", 2.0);
    static final Produto p3 = new Produto(30, "Coca-Cola", 7.00);
    static final Produto p4 = new Produto(15, "Halls", 1);
    static final Produto p_clone = new Produto(15, "Halls", 1);

    private Loja loja = new Loja();

    @Test
    public void adicionarFuncionarioDeveFuncionar(){
        loja.adicionarProduto(p1);
        loja.adicionarProduto(p2);
        loja.adicionarProduto(p4);
        loja.adicionarProduto(p3);

        // apesar de o conjunto estar em ordem quando printo nao aparenta estar em ordem
        assertThat(loja.getProdutos(), contains(p1, p2, p4, p3));
        assertThat(loja, containsInAnyOrder(p2, p4, p3, p1));
    }

    @Test
    public void adicionarProdutoNaoDeveFuncionar(){
        loja.adicionarProduto(p1);
        loja.adicionarProduto(p4);

        Assert.assertFalse( loja.adicionarProduto(p1) );
        Assert.assertFalse( loja.adicionarProduto(p4) );
        Assert.assertFalse( loja.adicionarProduto(p_clone) );
    }

    @Test
    public void removerProdutoDeveFuncionar(){
        loja.adicionarProduto(p1);
        loja.adicionarProduto(p4);

        Assert.assertTrue( loja.removerProduto( p1 ) );
        Assert.assertTrue( loja.removerProduto( p4 ) );
    }

    @Test
    public void removerProdutoNaoDeveFuncionar(){
        Assert.assertFalse( loja.removerProduto( p1 ) );
        Assert.assertFalse( loja.removerProduto( p4 ) );
    }

    @Test
    public void buscarProdutoDeveFuncionar(){
        loja.adicionarProduto(p1);
        loja.adicionarProduto(p4);

        Assert.assertEquals( p1, loja.buscarProduto( p1 ) );
        Assert.assertEquals( p4, loja.buscarProduto( p4 ) );
    }

    @Test
    public void buscarProdutoNaoDeveFuncionar(){
        try{
            loja.buscarProduto( p1 );
        }
        catch (Exception e){
            Assert.assertTrue( true );
        }

        try{
            loja.buscarProduto( p2 );
        }
        catch (Exception e){
            Assert.assertTrue( true );
        }


    }


}
