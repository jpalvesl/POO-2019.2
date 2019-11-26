package com.gmail.jpalvesl;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Scanner;

public class GuiTextual {
    static void executarCliente(String host){
        Scanner input = new Scanner(System.in);
        String resposta = "";
        int op = 0;

        // entradas para criar o objeto na memoria
        String nome = "";
        int idade = 0;

        do {
            try {
                Registry registry = LocateRegistry.getRegistry(host);
                ObjetoRemoto stub = (ObjetoRemoto) registry.lookup("data");
                System.out.print(gui());
                op = Integer.parseInt(input.nextLine());

                switch (op){
                    case 1:
                        nome = input.nextLine();
                        idade = Integer.parseInt(input.nextLine());
                        stub.adicionarPessoa(nome, idade);
                        System.out.println("Adicionando cliente");
                        break;
                    case 2:
                        nome = input.nextLine();
                        idade = Integer.parseInt(input.nextLine());
                        stub.removerPessoa(nome, idade);
                        System.out.println("Removendo cliente");
                        break;
                    case 3:
                        nome = input.nextLine();
                        idade = Integer.parseInt(input.nextLine());
                        resposta = stub.buscarPessoa(nome, idade);
                        System.out.println("Cliente encontrado" + resposta);
                        break;
                    case 4:
                        resposta = stub.listarPessoas();
                        System.out.println("Listando clientes\n" + resposta);
                        break;
                    case 5:
                        System.out.println("Saindo...");
                        break;
                    default:
                        System.out.println("Opção não encontrada");
                }

            } catch (Exception e) {
                System.err.println("Cliente exception: " + e.toString());
                e.printStackTrace();
            }
        }while ( op != 5 );
    }

    static String gui(){
        return "1. Adicionar cliente\n" +
               "2. Remover cliente\n" +
               "3. Buscar cliente\n" +
               "4. Listar cliente\n" +
               "5. Sair\n" +
               "   Digite sua sua opção: ";
    }
}
