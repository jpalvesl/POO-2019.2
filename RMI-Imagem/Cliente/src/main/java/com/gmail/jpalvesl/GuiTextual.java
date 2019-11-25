package com.gmail.jpalvesl;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class GuiTextual {
    static void executarCliente(String host){
        try {
            Registry registry = LocateRegistry.getRegistry(host);
            ObjetoRemotoData_IF stub = (ObjetoRemotoData_IF) registry.lookup("data");


            String resposta = "Inhae";
            System.out.println("resposta: " + resposta);
        } catch (Exception e) {
            System.err.println("Cliente exception: " + e.toString());
            e.printStackTrace();
        }
    }
}
