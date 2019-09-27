package com.gmail.jpalvesl;

import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Test;


public class UniversidadeTest
{
    @Test
    public void adicionarDeveFuncionar(){
        Universidade u = new Universidade("");

        Professor p1 = new Professor(53, "Joãozin", 20, 980.13, 44);
        Gerente g1 = new Gerente(55, "Amju", 19, 1050, 50);

        boolean resultado1 = u.adicionarFuncionário(p1);
        boolean resultado2 = u.adicionarFuncionário(g1);

        Assert.assertTrue(resultado1);
        Assert.assertTrue(resultado2);
    }

    @Test
    public void adicionarNãoDeveFuncionar() {
        Universidade u = new Universidade("");

        Professor p1 = new Professor(53, "Joãozin", 20, 980.13, 44);
        Professor pNull = null;

        u.adicionarFuncionário(p1);

        boolean resultado1 = u.adicionarFuncionário(p1);
        boolean resultado2 = u.adicionarFuncionário(pNull);

        Assert.assertFalse(resultado1);
        Assert.assertFalse(resultado2);
    }

    @Test
    public void removerDeveFuncionar(){
        Universidade u = new Universidade("");

        Professor p1 = new Professor(53, "Joãozin", 20, 980.13, 44);
        Gerente g1 = new Gerente(55, "Amju", 19, 1050, 50);

        u.adicionarFuncionário(p1);
        u.adicionarFuncionário(g1);

        boolean resultado1 = u.removerFuncionário(53);
        boolean resultado2 = u.removerFuncionário(55);

        Assert.assertTrue(resultado1);
        Assert.assertTrue(resultado2);
    }

    @Test
    public void removerNãoDeveFuncionar() {
        Universidade u = new Universidade("");

        Professor p1 = new Professor(53, "Joãozin", 20, 980.13, 44);
        Gerente g1 = new Gerente(55, "Amju", 19, 1050, 50);

        u.adicionarFuncionário(p1);
        u.adicionarFuncionário(g1);

        boolean resultado1 = u.removerFuncionário(5);
        boolean resultado2 = u.removerFuncionário(-1);

        Assert.assertFalse(resultado1);
        Assert.assertFalse(resultado2);
    }

    @Test
    public void buscaDeveFuncionar(){
        Universidade u = new Universidade("");

        Professor p1 = new Professor(53, "Joãozin", 20, 980.13, 44);
        Gerente g1 = new Gerente(55, "Amju", 19, 1050, 50);

        u.adicionarFuncionário(p1);
        u.adicionarFuncionário(g1);

        Funcionario f1, f2;

        f1 = u.buscarFuncionário(53);
        f2 = u.buscarFuncionário(55);

        Assert.assertEquals(f1, p1);
        Assert.assertEquals(f2, g1);
    }

    @Test
    public void buscaNãoDeveFuncionar(){
        Universidade u = new Universidade("");

        Professor p1 = new Professor(53, "Joãozin", 20, 980.13, 44);
        Gerente g1 = new Gerente(55, "Amju", 19, 1050, 50);

        Funcionario f1, f2;

        f1 = u.buscarFuncionário(-1);
        f2 = u.buscarFuncionário(60);

        Assert.assertEquals(f1, null);
        Assert.assertEquals(f2, null);
    }

    @Test
    public void getQuantidadeFuncionariosTest(){
        Universidade u = new Universidade("");

        Professor p1 = new Professor(53, "Joãozin", 20, 980.13, 44);
        Gerente g1 = new Gerente(55, "Amju", 19, 1050, 50);

        u.adicionarFuncionário(p1);
        u.adicionarFuncionário(g1);

        int numero1, numero2;

        numero1 = u.getQuantidade();

        u.removerFuncionário(55);
        u. removerFuncionário(53);

        numero2 = u.getQuantidade();

        Assert.assertEquals(2, numero1);
        Assert.assertEquals(0, numero2);

    }

}
