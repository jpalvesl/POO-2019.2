package com.gmail.jpalvesl;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface ObjetoRemotoData_IF extends Remote {
    void adicionarCliente(String nome, int id) throws RemoteException;
    void removerCliente(int id) throws RemoteException;
    String buscarCliente(int id) throws RemoteException;
    String listarCliente() throws RemoteException;
}
