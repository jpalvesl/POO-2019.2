package com.gmail.jpalvesl;

public class Produto {
    private int cod;
    private String descricao;
    private String cidadeOrigem;
    private double preco;
    private int quantidade;

    public Produto(int cod, String descricao, String cidadeOrigem, double preco, int quantidade) {
        this.cod = cod;
        this.descricao = descricao;
        this.cidadeOrigem = cidadeOrigem;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getCidadeOrigem() {
        return cidadeOrigem;
    }

    public void setCidadeOrigem(String cidadeOrigem) {
        this.cidadeOrigem = cidadeOrigem;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}
