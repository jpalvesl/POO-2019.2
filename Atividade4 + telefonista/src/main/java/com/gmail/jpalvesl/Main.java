package com.gmail.jpalvesl;

public class Main
{
    public static void main( String[] args )
    {
        //Funcionario f = new Funcionario(); nao pode ser instanciado visto que eh uma classe abstrata
        Universidade u =  new Universidade("Do lado daquele lugar la");

        Professor p1 = new Professor(53, "Joãozin", 20, 980.13, 44);
        Gerente g1 = new Gerente(55, "Amju", 19, 1050, 50);

        u.adicionarFuncionário(p1);
        u.adicionarFuncionário(g1);

        System.out.println("p1.CalculaIRPF() = " + p1.CalculaIRPF());
        System.out.println("g1.CalculaIRPF() = " + g1.CalculaIRPF());

    }
}
