package com.gmail.jpalvesl;

import org.junit.*;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;

public class TesteBanco {
    // contas que serão usadas para insercao e remocao no banco
    static final Conta c1 = new Conta(700, 26, "João");

    static final Conta c2 = new Conta(650, 10, "Amjah");

    static final Conta c3 = new Conta(1790.29, 99, "Amju");

    static final Conta clone_c1 = new Conta(700, 26, "João");

    // banco que sera usado ao longo do teste
    private Banco banco = new Banco();

    @Test
    public void adicionarContaDeveFuncionar(){
        // adicionando as contas no HashSet
        banco.adicionarConta( c1 );
        banco.adicionarConta( c2 );
        banco.adicionarConta( c3 );

        assertThat( banco.conjunto, containsInAnyOrder( c1, c2 , c3 ) );
    }

    @Test
    public void adicionarContaNaoDeveFuncionar(){
        // adicionando as contas no HashSet
        banco.adicionarConta( c1 );
        banco.adicionarConta( c2 );
        banco.adicionarConta( null ); //nao deve adicionar
        banco.adicionarConta( clone_c1 ); //nao deve adicionar

        //assegurando que o clone e null nao estao no HashSet
        assertThat( banco.conjunto, not( containsInAnyOrder( null, clone_c1 ) ) );
    }

    @Test
    public void removerContaDeveFuncionar(){
        // adicionando contas
        banco.adicionarConta( c1 );
        banco.adicionarConta( c2 );
        banco.adicionarConta( c3 );

        // removendo contas
        banco.removerConta( c1 );
        banco.removerConta( c2 );
        banco.removerConta( c3 );

        // verificando se os itens nao estao no HashSet
        assertThat( banco.conjunto, not( contains( c1, c2, c3 ) ) );
    }

    @Test
    public void removerContaNaoDeveFuncionar(){
        // adicionando contas
        banco.adicionarConta( c1 );
        banco.adicionarConta( c2 );

        // contas que nao devem ser removidas
        banco.removerConta( null );
        banco.removerConta( c3 );

        assertThat( banco.conjunto, containsInAnyOrder( c1, c2 ) );
    }

    @Test
    public void buscarContaDeveFuncionar(){
        // adicionando contas no banco
        banco.adicionarConta( c1 );
        banco.adicionarConta( c2 );
        banco.adicionarConta( c3 );

        // auxiliares para guardar o retorno da funcao
        Conta aux1, aux2, aux3;
        aux1 = banco.buscarConta( 26 );
        aux2 = banco.buscarConta( 10 );
        aux3 = banco.buscarConta( 99 );

        // verificando se o retorno foi de acordo com o esperado
        assertThat( aux1, is( c1 ) );
        assertThat( aux2, is( c2 ) );
        assertThat( aux3, is( c3 ) );
    }

    @Test
    public void buscarContaNaoDeveFuncionar(){
        Assert.assertNull( banco.buscarConta(26) );
        Assert.assertNull( banco.buscarConta(10) );
        Assert.assertNull( banco.buscarConta(99) );
    }


}
