package com.gmail.jpalvesl;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface ObjetoRemoto extends Remote {
    boolean adicionarPessoa(String nome, int idade) throws RemoteException;
    boolean removerPessoa(String nome, int idade) throws RemoteException;
    String buscarPessoa(String nome, int idade) throws RemoteException;
    String listarPessoas() throws RemoteException;
}
