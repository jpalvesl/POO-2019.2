package com.gmail.jpalvesl;

/**
 * Hello world!
 *
 */
public class Main
{
    public static void main( String[] args )
    {
        Universidade u =  new Universidade();
        Professor p1 = null;
        Gerente g1 = null;

        try {
            p1 = new Professor(500, "Joãozin", 20, 980.13, 44);
            g1 = new Gerente(55, "Amju", 19, 1050, 50);

            u.adicionarFuncionário(p1);
            u.adicionarFuncionário(g1);
        }
        catch (Exception e){
            System.err.println("Erro");
        }
        System.out.println(u.listarTodosFuncionários());
        System.out.println("\nu.getQuantidade() = " + u.getQuantidade());
        System.out.println("u.buscarFuncionário(g1) = " + u.buscarFuncionário(g1));
        System.out.println("u.removerFuncionário(p1) = " + u.removerFuncionário(p1));
        System.out.println("u.getQuantidade() = " + u.getQuantidade());
        System.out.println(u.listarTodosFuncionários());

    }
}
