package com.gmail.jpalvesl;

public class Notebook {
    private Marca marca;
    private String modelo;
    private int n ;
    static int contador = 0;

    public Notebook(Marca marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
        n = ++contador;
    }

    public Notebook() {
        this.marca = Marca.HP;
        this.modelo = "Modelo 3301";
        n = ++contador;
    }

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getDescicao(){
        return "Notebook generico";
    }

    @Override
    public String toString() {
        return "Notebook{" +
                "marca=" + marca +
                ", modelo='" + modelo + '\'' +
                ", n=" + n +
                '}';
    }
}
