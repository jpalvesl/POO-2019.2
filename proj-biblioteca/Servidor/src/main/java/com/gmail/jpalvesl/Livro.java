package com.gmail.jpalvesl;

import java.util.Objects;

public class Livro {
    private String ID;
    private String titulo;
    private String autor;
    private String tipo;
    private String preco;

    public Livro(String ID, String titulo, String autor, String tipo, String preco) {
        this.ID = ID;
        this.titulo = titulo;
        this.autor = autor;
        this.tipo = tipo;
        this.preco = preco;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getPreco() {
        return preco;
    }

    public void setPreco(String preco) {
        this.preco = preco;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Livro livro = (Livro) o;

        return ID.equals(livro.ID);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ID);
    }

    @Override
    public String toString() {
        return this.getID() + ';' + this.getTitulo() + ';' + this.getAutor() +
                ';' + getTipo() + ';' + getPreco();
    }
}
