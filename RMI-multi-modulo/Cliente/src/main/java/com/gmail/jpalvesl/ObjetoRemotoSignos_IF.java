package com.gmail.jpalvesl;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface ObjetoRemotoSignos_IF extends Remote {
    public String getMensagem(String umSigno) throws RemoteException;
}