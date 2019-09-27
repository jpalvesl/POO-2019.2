package com.gmail.jpalvesl;

/**
 * Hello world!
 *
 */
public class Main
{
    public static void main( String[] args )
    {
        Universidade u =  new Universidade("Do lado daquele lugar la");

        Professor p1 = new Professor(53, "Joãozin", 20, 980.13, 44);
        Gerente g1 = new Gerente(55, "Amju", 19, 1050, 50);

        u.adicionarFuncionário(p1);
        u.adicionarFuncionário(g1);

        System.out.println(u.listarTodosFuncionários());
        //System.out.println(g1);

    }
}
