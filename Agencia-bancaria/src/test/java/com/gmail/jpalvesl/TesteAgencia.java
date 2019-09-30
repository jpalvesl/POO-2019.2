package com.gmail.jpalvesl;

import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Test;

public class TesteAgencia {
    @Test
    public void adicionarContaDeveFuncionar() {
        AgenciaBancaria agencia = new AgenciaBancaria("Rua de la");
        Conta c1, c2;

        c1 = new ContaCorrente("João");
        c2 = new ContaPoupança("Pedro");

        boolean aux1, aux2;

        aux1 = agencia.adicionarConta(c1);
        aux2 = agencia.adicionarConta(c2);

        Assert.assertTrue(aux1);
        Assert.assertTrue(aux2);
    }

    @Test
    public void adicionarContaNaoDeveFuncionar() {
        AgenciaBancaria agencia = new AgenciaBancaria("Rua de la");
        Conta c1;

        c1 = new ContaCorrente("João");
        agencia.adicionarConta(c1);

        boolean aux1, aux2;

        aux1 = agencia.adicionarConta(c1);
        aux2 = agencia.adicionarConta(null);

        Assert.assertFalse(aux1);
        Assert.assertFalse(aux2);
    }

    @Test
    public void removerContaDeveFuncionar() {
        AgenciaBancaria agencia = new AgenciaBancaria("Rua de la");
        Conta c1, c2;

        c1 = new ContaCorrente("João");
        c2 = new ContaPoupança("Pedro");

        agencia.adicionarConta(c1);
        agencia.adicionarConta(c2);

        boolean aux1, aux2;

        aux1 = agencia.removerConta(c1.getId());
        aux2 = agencia.removerConta(c2.getId());

        Assert.assertTrue(aux1);
        Assert.assertTrue(aux2);
    }

    @Test
    public void removerContaNaoDeveFuncionar() {
        AgenciaBancaria agencia = new AgenciaBancaria("Rua de la");
        Conta c1, c2;

        c1 = new ContaCorrente("João");
        c2 = new ContaPoupança("Pedro");

        agencia.adicionarConta(c1);
        agencia.adicionarConta(c2);

        boolean aux1, aux2, aux3;

        aux1 = agencia.removerConta(-1);
        aux2 = agencia.removerConta(99);
        aux3 = agencia.removerConta(0);

        Assert.assertFalse(aux1);
        Assert.assertFalse(aux2);
        Assert.assertFalse(aux3);
    }

    @Test
    public void buscarContaDeveFuncionar() {
        AgenciaBancaria agencia = new AgenciaBancaria("Rua de la");
        Conta c1, c2;

        c1 = new ContaCorrente("João");
        c2 = new ContaPoupança("Pedro");

        agencia.adicionarConta(c1);
        agencia.adicionarConta(c2);

        Conta aux1, aux2;

        aux1 = agencia.buscarConta(c1.getId());
        aux2 = agencia.buscarConta(c2.getId());

        Assert.assertEquals(aux1, c1);
        Assert.assertEquals(aux2, c2);
    }

    @Test
    public void buscarContaNaoDeveFuncionar() {
        AgenciaBancaria agencia = new AgenciaBancaria("Rua de la");
        Conta c1, c2;

        c1 = new ContaCorrente("João");
        c2 = new ContaPoupança("Pedro");

        agencia.adicionarConta(c1);
        agencia.adicionarConta(c2);

        Conta aux1, aux2, aux3;

        aux1 = agencia.buscarConta(99);
        aux2 = agencia.buscarConta(-1);
        aux3 = agencia.buscarConta(0);

        Assert.assertNull(aux1);
        Assert.assertNull(aux2);
        Assert.assertNull(aux3);
    }


}
