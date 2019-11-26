package com.gmail.jpalvesl;

import java.util.Objects;

public class ClienteO {
    private String nome;
    private String id;

    public ClienteO(String nome, String id) {
        this.nome = nome;
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ClienteO clienteO = (ClienteO) o;

        if (!nome.equals(clienteO.nome)) return false;
        return id.equals(clienteO.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, id);
    }

    @Override
    public String toString() {
        return nome + ';' + id;
    }
}
