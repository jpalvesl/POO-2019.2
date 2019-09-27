package com.gmail.jpalvesl;

import java.util.Scanner;

public class MenuCalculadora {
    Calculadora c1 = new Calculadora();


    public void exibirMenu(){
        String menu =
                "Calculadora\n" +
                "======================\n" +
                "1 - Somar\n" +
                "2 - Subtrair\n" +
                "3 - Multiplicar\n" +
                "4 - Dividir\n"  +
                "5 - Sobre a Calculadora\n" +
                "6 - Sair\n" +
                "Digite uma opção: ";
        System.out.print(menu);
    }

    public double[] capturarNumeros(){
        Scanner input = new Scanner(System.in);
        double[] numeros = new double[2];

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = input.nextDouble();
        }
        return numeros;
    }
}
