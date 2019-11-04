package com.gmail.jpalvesl;

public class Main {
    public static void main(String[] args) {
        HashMapLivros map = new HashMapLivros();

        Livro l = new Livro(10, "Lie to me");
        map.addLivro( l );

        l = new Livro(33, "So hard to find");
        map.addLivro( l );

        l = new Livro(15, "How do we make?");
        map.addLivro( l );

        System.out.println("map = " + map);
    }
}
