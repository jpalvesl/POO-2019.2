package com.gmail.jpalvesl;

import java.util.Scanner;

public class InterfaceTextual
{
    public static void main( String[] args )
    {
        int palpite;
        boolean acertou = false;

        JogoNumeroSecreto jogo = new JogoNumeroSecreto(10);

        System.out.println(jogo.ajuda());

        while( jogo.getTentativas() > 0 ){
            System.out.printf("Você tem %d tentativas\n", jogo.getTentativas());
            System.out.print("Digite um numero: ");
            palpite = lerEntrada();
            acertou = jogo.efetuarJogada(palpite);
        }

        if (acertou){
            System.out.println("Você acertou");
        }
        else System.out.printf("Você errou, o numero era %d\n", jogo.getNumeroSecreto());


    }

    public static int lerEntrada(){
        Scanner input = new Scanner(System.in);
        return input.nextInt();
    }
}
