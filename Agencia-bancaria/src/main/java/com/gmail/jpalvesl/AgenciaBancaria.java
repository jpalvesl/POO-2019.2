package com.gmail.jpalvesl;

import java.util.ArrayList;
import java.util.List;

public class AgenciaBancaria {
    private List<Conta> listaContas;
    private String endereço;

    public AgenciaBancaria(String endereço) {
        setEndereço(endereço);
        this.listaContas = new ArrayList<>();
    }

    public String getEndereço() {
        return endereço;
    }

    public void setEndereço(String endereço) {
        if ( endereço.length() > 0 ) {
            this.endereço = endereço;
        }
    }

    public boolean adicionarConta(Conta conta){
        if ( conta == null ) return false;

        for (Conta contas:
             listaContas) {

            if ( contas.getId() == conta.getId() ) return false;
        }
        return listaContas.add(conta);
    }

    public boolean removerConta(int id){
        if ( id <= 0 ) return false;

        for (Conta conta:
             listaContas) {

            if (conta.getId() == id ){
                return listaContas.remove(conta);
            }
        }
        return false;
    }

    public Conta buscarConta(int id){
        if ( id <= 0 ) return null;

        for (Conta conta:
                listaContas) {

            if (conta.getId() == id) {
                return conta;
            }
        }
        return null;
    }

    public String listaContas(){
        String lista = "";

        for (Conta conta:
             listaContas) {
            lista += conta.toString() + '\n';
        }
        return lista;
    }

}
