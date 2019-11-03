package com.gmail.jpalvesl;

import java.util.Objects;

public class Produto implements Comparable<Produto> {
    private int id;
    private String name;
    private double price;

    public Produto(int id, String name, double price) {
        this.id = id;
        this.name = name;
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

        Produto produto = (Produto) o;

        return id == produto.id;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode( this.id );
    }

    @Override
    public int compareTo(Produto produto) {
        return Integer.compare( this.getId(), produto.getId() );
    }

    @Override
    public String toString() {
        return "Produto{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
