package com.gmail.jpalvesl;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface ObjetoRemotoData_IF extends Remote {
    boolean adicionarCliente(ClienteO cliente) throws RemoteException;
    boolean removerCliente(ClienteO cliente) throws RemoteException;
    ClienteO buscarCliente(ClienteO cliente) throws RemoteException;
    String listarCliente() throws RemoteException;
}
