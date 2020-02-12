package com.gmail.jpalvesl;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class Main
{
    public static void main( String[] args ) {
        ProcessadorArquivo p = new ProcessadorArquivo();

        Scanner input = new Scanner (System.in);
        System.out.print("Digite o caminho do arquivo: ");
        String caminho = input.nextLine();

        System.out.println("Resultado do processamento:");
        System.out.println("Extensão = " + p.extensao(caminho));
        System.out.println("Nome do arquivo = " + p.nomeArquivo(caminho));
        System.out.println("Path = " + p.caminho(caminho));
    }
}
