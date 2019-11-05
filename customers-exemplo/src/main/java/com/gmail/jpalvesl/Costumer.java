package com.gmail.jpalvesl;

import java.util.Objects;

public class Costumer implements Comparable<Costumer>{
    private int id;
    private String nome;
    private String sobrenome;
    private int idade;
    private String  hospedado_em;
    private String cidade;
    private String pais;
    private String cep;

    public Costumer(int id, String nome, String sobrenome, int idade, String hospedado_em, String cidade, String pais, String cep) {
        this.id = id;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.idade = idade;
        this.hospedado_em = hospedado_em;
        this.cidade = cidade;
        this.pais = pais;
        this.cep = cep;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getHospedado_em() {
        return hospedado_em;
    }

    public void setHospedado_em(String hospedado_em) {
        this.hospedado_em = hospedado_em;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Costumer costumer = (Costumer) o;

        return id == costumer.id;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public int compareTo(Costumer other) {
        return Integer.compare( this.getId(), other.getId() );
    }

    @Override
    public String toString() {
        return  "id=" + id +
                ", nome='" + nome +
                ", sobrenome=" + sobrenome +
                ", hospedado_em=" + hospedado_em +
                ", cidade=" + cidade +
                ", pais=" + pais +
                ", cep=" + cep;
    }
}
