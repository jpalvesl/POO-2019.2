package com.gmail.jpalvesl;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;
import java.util.*;

public class ServidorDeSignos implements ObjetoRemotoSignos_IF {
    private Map<String, List<String>> mapaSignos = new HashMap<>();

    public ServidorDeSignos() {
        /* Prova de conceito */
        List<String> gem = new ArrayList<>();
        gem.add("Cara de cu");
        gem.add("Jogador de lol");

        // adicionando gemeos no mapa
        mapaSignos.put("gemeos", gem);
    }

    @Override
    public String getMensagem(String umSigno) throws RemoteException {
        Random random = new Random();
        int n = random.nextInt(2);
        String resposta = mapaSignos.get(umSigno).get(n);
        try {
            resposta = mapaSignos.get(umSigno).get(random.nextInt(2));
        }catch (Exception e ){
            System.err.println("erro");
            resposta = "Nao ha este signo";
        }
        return resposta;
    }

    public static void main(String[] args) {
        try {
            ServidorDeSignos obj = new ServidorDeSignos();
            ObjetoRemotoSignos_IF stub = (ObjetoRemotoSignos_IF) UnicastRemoteObject.exportObject(obj, 0);

            Registry registry = LocateRegistry.createRegistry(1099); // default
            registry.bind("mensagem", stub);

            System.err.println("Servidor pronto...");
        } catch (Exception e) {
            System.err.println("Servidor exception: " + e.toString());
            e.printStackTrace();
        }
    }
}