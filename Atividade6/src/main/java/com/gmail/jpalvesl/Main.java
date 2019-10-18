package com.gmail.jpalvesl;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int opcao;
        double valor;
        Scanner input = new Scanner(System.in);
        Conta c1 = new Conta();

        do {
            System.out.print(Menu.menu());
            opcao = input.nextInt();

            switch (opcao){
                case 1: // criar conta
                    int numero = input.nextInt();
                    String nome = input.nextLine();
                    double saldo = input.nextDouble();

                    // criando as contas com base nos novos dados
                    c1 = new Conta(saldo, numero, nome);
                    break;

                case 2:// depositar
                    valor = input.nextDouble();
                    c1.depositar( valor );
                    break;

                case 3: // sacar
                    valor = input.nextDouble();
                    c1.sacar( valor );
                    break;

                case 4:
                    //System.out.println(c1.extrato);
                    break;
                case 5:
                    System.out.println(c1.consultarSaldo());
                    break;
            }

        } while ( opcao != 6);

    }

}
