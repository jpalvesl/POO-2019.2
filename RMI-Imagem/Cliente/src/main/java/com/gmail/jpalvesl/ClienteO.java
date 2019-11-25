package com.gmail.jpalvesl;

import java.util.Objects;

public class ClienteO {
    private String nome;
    private String idade;
    private String cpf;
    private static String DEFAULT_STR = "---";

    public ClienteO(String nome, String idade, String cpf) {
        setNome(nome);
        setIdade(idade);
        setCpf(cpf);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        nome = DEFAULT_STR;
        if ( nome != null )
            this.nome = nome;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        idade = DEFAULT_STR;
        if ( idade != null )
            this.idade = idade;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        cpf = DEFAULT_STR;
        if ( cpf != null )
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
