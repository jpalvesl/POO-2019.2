package com.gmail.jpalvesl;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;
import java.util.*;


public class Servidor implements ObjetoRemotoData_IF {
    private Set<ClienteO> data = new HashSet<ClienteO>();

    public Servidor() {
        ClienteO novoCliente = new ClienteO("João", "17");
        data.add(novoCliente);
    }

    public void adicionarCliente() throws RemoteException {
        ClienteO cliente = new ClienteO("Amju", "10");
        data.add(cliente);
    }

    public void removerCliente(int id) throws RemoteException {
        ClienteO aux = null;
        for (ClienteO c :
                data) {
            if (c.getId() == id) {
                aux = c;
            }
            data.remove(aux);
    }

    public String buscarCliente(ClienteO cliente) throws RemoteException {
        Optional<ClienteO> optionalCliente = data.stream()
                .filter(c -> c.equals(cliente))
                .findFirst();
        return "Nao implementado";

    }

    public String listarCliente() throws RemoteException {
        StringBuilder retorno = new StringBuilder();

        for (ClienteO c :
                data) {
            retorno.append(c.toString())
                    .append("\n");
        }
        return retorno.toString();
    }

    public static void main(String[] args) {
        try {
            Servidor obj = new Servidor();
            ObjetoRemotoData_IF stub = (ObjetoRemotoData_IF) UnicastRemoteObject.exportObject(obj, 0);

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

