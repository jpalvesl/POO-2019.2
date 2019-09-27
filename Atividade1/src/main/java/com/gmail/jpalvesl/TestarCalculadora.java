package com.gmail.jpalvesl;

import java.util.Scanner;

public class TestarCalculadora
{
    public static void main( String[] args ) {
        int opção = 0;
        double[] numeros = new double[2];
        Scanner input = new Scanner(System.in);

        MenuCalculadora Menu = new MenuCalculadora();

        while (opção != 6) {
            Menu.exibirMenu();

            opção = input.nextInt();
            if (opção >= 6 || opção <= 0 ){
                continue;
            }
            else if (opção == 5) {
                System.out.println(Menu.c1.consultarDescrição());
                continue;
            }

            numeros = Menu.capturarNumeros();

            switch (opção) {
                case 1:
                    Menu.c1.somar(numeros[0], numeros[1]);
                    break;
                case 2:
                    Menu.c1.subtrair(numeros[0], numeros[1]);
                    break;
                case 3:
                    Menu.c1.multiplicar(numeros[0], numeros[1]);
                    break;
                case 4:
                    Menu.c1.dividir(numeros[0], numeros[1]);
                    break;
            }
            System.out.printf("O resultado é %.2f\n\n", Menu.c1.lerMemoria());
        }
    }
}
