package com.gmail.jpalvesl;

import java.util.Objects;

public class ClienteO {
    private String nome;
    private int idade;

    public ClienteO(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ClienteO clienteO = (ClienteO) o;

        if (idade != clienteO.idade) return false;
        return nome.equals(clienteO.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, idade);
    }

    @Override
    public String toString() {
        return nome + ";" + idade;
    }
}
