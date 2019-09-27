package com.gmail.jpalvesl;

import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Test;


public class ContaCorrenteTest
{
    @Test
    public void saqueDeveFuncionar()
    {
        ContaCorrente conta = new ContaCorrente(3, "João Lima", 500);

        boolean saque1 = conta.saque(100);
        boolean saque2 = conta.saque(400);

        Assert.assertTrue(saque1);
        Assert.assertTrue(saque2);
    }

    @Test
    public void saqueNãoDeveFuncionar(){
        ContaCorrente conta = new ContaCorrente(3, "João Lima", 500);

        boolean saque1 = conta.saque(-100);
        boolean saque2 = conta.saque(600);

        Assert.assertFalse(saque1);
        Assert.assertFalse(saque2);
    }

    @Test
    public void depositoDeveFuncionar()
    {
        ContaCorrente conta = new ContaCorrente(3, "João Lima", 500);

        boolean deposito1 = conta.deposito(0.1);
        boolean deposito2 = conta.deposito(99999);

        Assert.assertTrue(deposito1);
        Assert.assertTrue(deposito2);
    }

    @Test
    public void depositoNãoDeveFuncionar() {
        ContaCorrente conta = new ContaCorrente(3, "João Lima", 500);

        boolean deposito1 = conta.deposito(-0.1);
        boolean deposito2 = conta.deposito(-99999);

        Assert.assertFalse(deposito1);
        Assert.assertFalse(deposito2);
    }
}
