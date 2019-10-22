package com.gmail.jpalvesl;

public class Produto {
    private int id;
    private String name;
    private double price;

    public Produto(int id, String name, double price) {
        setId( id );
        setName( name );
        setPrice( price );
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


}
