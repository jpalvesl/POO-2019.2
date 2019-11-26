package com.gmail.jpalvesl;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class Servidor {
    // atributo biblioteca
    Biblioteca biblioteca = new Biblioteca();

    public Biblioteca getBiblioteca() {
        return biblioteca;
    }

    public static void main(String[] args) {
        try {
            Servidor obj = new Servidor();
            Biblioteca_IF stub = (Biblioteca_IF) UnicastRemoteObject.exportObject(obj.getBiblioteca(), 0);

            // carregando arquivos de books.txt na raiz de onde esta sendo rodado o servidor
            obj.getBiblioteca().carregarArquivo();

            Registry registry = LocateRegistry.createRegistry(1099); // default
            registry.bind("biblioteca", stub);

            System.err.println("Servidor funcionando corretamente");
        } catch (Exception e) {
            System.err.println("Servidor exception: " + e.toString());
            e.printStackTrace();
        }
    }
}
