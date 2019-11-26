package com.gmail.jpalvesl;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Scanner;

public class Cliente {
    public static void main(String[] args) {
    String host = (args.length < 1) ? "localhost" : args[0];

    Scanner input = new Scanner(System.in);
    String resposta = "";
    int op = 0;

    // entradas para criar o objeto na memoria
    String ID = "";
    String titulo = "";
    String autor = "";
    String tipo = "";
    String preco = "";

        do {
        try {
            Registry registry = LocateRegistry.getRegistry(host);
            Biblioteca_IF stub = (Biblioteca_IF) registry.lookup("biblioteca");
            System.out.print(menu());
            op = Integer.parseInt(input.nextLine());

            switch (op){
                case 1:
                    System.out.print("Digite o ID do livro: ");
                    ID = input.nextLine();
                    System.out.print("Digite o titulo do livro: ");
                    titulo = input.nextLine();
                    System.out.print("Digite o autor do livro: ");
                    autor = input.nextLine();
                    System.out.print("Digite o tipo do livro: ");
                    tipo = input.nextLine();
                    System.out.print("Digite o preço do livro: ");
                    preco = input.nextLine();
                    resposta = stub.cadastrarLivro( ID, titulo, autor, tipo, preco );

                    System.out.println("Adicionando livro...");
                    break;
                case 2:
                    System.out.print("Digite o ID do livro: ");
                    ID = input.nextLine();
                    resposta = stub.removerLivro( ID );
                    System.out.println("Removendo livro...");
                    break;
                case 3:
                    System.out.print("Digite o ID do livro: ");
                    ID = input.nextLine();
                    resposta = stub.buscarLivro( ID );
                    System.out.println("Buscando livro...");
                    break;
                case 4:
                    resposta = "Saindo...";
                    break;
                default:
                    resposta = "Opção não encontrada";
            }
            System.out.println(resposta+"\n\n");
        } catch (Exception e) {
            System.err.println("Cliente exception: " + e.toString());
            e.printStackTrace();
        }
    }while ( op != 4 );
}

    static String menu(){
        return  "       Menu Principal\n"+
                "=============================\n" +
                "1. Cadastrar livro\n" +
                "2. Remover livro\n" +
                "3. Buscar livro\n" +
                "4. Sair\n" +
                "   Digite sua sua opção: ";
    }
}
