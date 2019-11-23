package com.gmail.jpalvesl;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Scanner;

public class Cliente
{
    private static ObjetoRemotoSignos_IF stub;
    private static Registry registry;

    public static void executarCliente(String host){
        String signo = "";
        Scanner input = new Scanner(System.in);
        while(!signo.equals("-1")) {
            try {
                Registry registry = LocateRegistry.getRegistry(host);
                ObjetoRemotoSignos_IF stub = (ObjetoRemotoSignos_IF) registry.lookup("mensagem");

                System.out.print("Digite um signo: ");
                signo = input.nextLine();
                String resposta = stub.getMensagem(signo);
                System.out.println("resposta: " + resposta);
            } catch (Exception e) {
                System.err.println("Signo nao existe");
            }
        }
    }

    public static void main( String[] args )
    {
        String host = (args.length < 1) ? "localhost" : args[0];
        executarCliente(host);
    }
}