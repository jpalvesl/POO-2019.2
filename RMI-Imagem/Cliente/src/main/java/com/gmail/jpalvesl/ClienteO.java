package com.gmail.jpalvesl;

import java.util.Objects;

public class ClienteO {
    private String nome;
    private String idade;
    private String cpf;

    public ClienteO(String nome, String idade, String cpf) {
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ClienteO clienteO = (ClienteO) o;

        if (!nome.equals(clienteO.nome)) return false;
        if (!idade.equals(clienteO.idade)) return false;
        return cpf.equals(clienteO.cpf);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, idade, cpf);
    }

    @Override
    public String toString() {
        return nome + ';' + idade + ';' + cpf;
    }
}
