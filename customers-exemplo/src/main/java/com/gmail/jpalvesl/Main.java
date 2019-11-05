package com.gmail.jpalvesl;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.NavigableSet;
import java.util.TreeSet;

public class Main
{
    public static void main( String[] args ) {
        NavigableSet<Costumer> costumers = new TreeSet<>();

        Path origem = Paths.get("files/50-costumers.txt");
        Path destino = Paths.get("files/new-archive.txt");

        ProcessadorTexto.adicionandoAoTreeSet(costumers, origem);
        ProcessadorTexto.TreeSetParaArquivo(costumers, destino);
        System.out.println(costumers);
    }
}
