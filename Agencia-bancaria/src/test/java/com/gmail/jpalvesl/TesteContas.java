package com.gmail.jpalvesl;

import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Test;

public class TesteContas {
    @Test
    public void getIdTest(){
        Conta c1 = new ContaPoupança("João");
        Conta c2 = new ContaCorrente("Pedro");

        int id1, id2;
        id1 = c1.getId();
        id2 = c2.getId();

        Assert.assertEquals(1, id2-id1);
    }

    @Test
    public void depositarDeveFuncionar(){
        Conta c1 = new ContaPoupança("João");

        boolean aux1, aux2;

        aux1 = c1.depositar(10);
        aux2 = c1.depositar(999);

        Assert.assertTrue(aux1);
        Assert.assertTrue(aux2);
    }

    @Test
    public void depositarNaoDeveFuncionar(){
        Conta c1 = new ContaPoupança("João");

        boolean aux1, aux2;

        aux1 = c1.depositar(-0.1);
        aux2 = c1.depositar(0);

        Assert.assertFalse(aux1);
        Assert.assertFalse(aux2);
    }


    @Test
    public void sacarDeveFuncionar(){
        Conta c1 = new ContaPoupança("João");
        c1.depositar(10);

        boolean aux1, aux2;

        aux1 = c1.sacar(1);
        aux2 = c1.sacar(9);

        Assert.assertTrue(aux1);
        Assert.assertTrue(aux2);
    }

    @Test
    public void sacarNaoDeveFuncionar(){
        Conta c1 = new ContaPoupança("João");
        c1.depositar(10);
        c1.sacar(1);
        c1.sacar(1);

        boolean aux1, aux2, aux3;

        aux1 = c1.sacar(8);
        aux2 = c1.sacar(-1);
        aux3 = c1.sacar(0);

        Assert.assertFalse(aux1);
        Assert.assertFalse(aux2);
        Assert.assertFalse(aux3);
    }

    @Test
    public void getTipoTest(){
        Conta c1, c2;
        c1 = new ContaPoupança("João");
        c2 = new ContaCorrente("Pedro");

        TipoConta aux1, aux2;

        aux1 = c1.getTipo();
        aux2 = c2.getTipo();

        Assert.assertEquals(TipoConta.POUPANÇA, aux1);
        Assert.assertEquals(TipoConta.CORRENTE, aux2);
    }

}
