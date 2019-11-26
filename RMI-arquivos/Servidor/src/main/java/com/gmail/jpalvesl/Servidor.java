package com.gmail.jpalvesl;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;
import java.util.*;

public class Servidor implements ObjetoRemoto{
    Set<ClienteO> conjunto = new HashSet<>();

    @Override
    public boolean adicionarPessoa(String nome, int idade) throws RemoteException {
        ClienteO cliente = new ClienteO(nome, idade);
        boolean retorno = conjunto.add(cliente);

        if ( retorno ) {
            criarArquivo();
        }

        return retorno;
    }

    @Override
    public boolean removerPessoa(String nome, int idade) throws RemoteException {
        ClienteO cliente = new ClienteO(nome, idade);
        boolean retorno = conjunto.remove(cliente);

        if ( retorno ) {
            criarArquivo();
        }

        return retorno;
    }

    @Override
    public String buscarPessoa(String nome, int idade) throws RemoteException {
        ClienteO cliente = new ClienteO(nome, idade);

        for (ClienteO c1 : conjunto) {
            if (c1.equals(cliente)) return c1.toString();
        }
        return "Cliente não encontrado";
    }

    @Override
    public String listarPessoas() throws RemoteException {
        StringBuilder retorno = new StringBuilder();

        for (ClienteO c1 :
                conjunto) {
            retorno.append(c1.toString()).append('\n');
        }
        return retorno.toString();
    }

     void criarArquivo() {
         Path destino = Paths.get("data_set.txt");

         try {
             List<String> linhas = new ArrayList<>();
             for (ClienteO c1 :
                     conjunto) {
                 linhas.add(c1.toString());
             }

             Files.write(destino,
                     linhas,
                     Charset.defaultCharset(),
                     StandardOpenOption.CREATE, // criar o arquivo, caso não exista
                     StandardOpenOption.TRUNCATE_EXISTING,
                     StandardOpenOption.WRITE);
         } catch (IOException e) {
             System.out.println("Erro ao adicionara em arquivo");
         }
     }

         void carregarArquivo(){
             Path pathOrigem = Paths.get("data_set.txt");
             ClienteO cliente = null;

             try {
                 List<String> linhas = Files.readAllLines(pathOrigem, Charset.defaultCharset());
                 for (String linha :
                         linhas) {
                     String[] palavras = linha.split(";");
                     cliente = new ClienteO(palavras[0], Integer.parseInt(palavras[1]));
                     conjunto.add(cliente);
                 }
                 
             } catch (IOException e) {
                 System.out.println("Não há arquivos para serem carregados");
             }
         }

    public static void main(String[] args) {
        try {
            Servidor obj = new Servidor();
            obj.carregarArquivo();
            ObjetoRemoto stub = (ObjetoRemoto) UnicastRemoteObject.exportObject(obj, 0);

            // cadastrar o stub no registry
            //System.setProperty("java.rmi.server.hostname","192.168.15.226");
            Registry registry = LocateRegistry.createRegistry(1099); // default
            registry.bind("data", stub);

            System.err.println("Servidor funcionando");
        } catch (Exception e) {
            System.err.println("Servidor exception: " + e.toString());
            e.printStackTrace();
        }
    }
}
