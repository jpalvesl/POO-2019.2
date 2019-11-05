package com.gmail.jpalvesl;

import java.util.Objects;

public class Livro {
    private int id;
    private String name;
    private String author;
    private String type;
    private double price;

    public Livro(int id, String name, String author, String type, double price) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.type = type;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Livro livro = (Livro) o;

        return id == livro.id;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode( this.id );
    }

    @Override
    public String toString() {
        return "id= " + id +
                ", name= " + name +
                ", author= " + author +
                ", type= " + type +
                ", price= " + price;
    }
}
