package com.gmail.jpalvesl;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;
import java.util.NavigableSet;

public class ProcessadorTexto {
    static void adicionandoAoTreeSet (NavigableSet<Costumer> costumers, Path origem ){

        Costumer c = null;
        try
        {
            List<String> linhas = Files.readAllLines( origem, Charset.defaultCharset() );
            for (String linha:
                 linhas) {
                String[] palavras = linha.split(";");

                int id = Integer.parseInt(palavras[0]);
                String nome = palavras[1];
                String sobrenome = palavras[2];
                int idade = Integer.parseInt(palavras[3]);
                String  hospedado_em = palavras[4];
                String cidade = palavras[5];
                String pais = palavras[6];
                String cep = palavras[7];

                c = new Costumer(id, nome, sobrenome, idade, hospedado_em, cidade, pais, cep);
                costumers.add( c );
            }
        } catch ( IOException e )
        {
            System.out.println( "Erro: na varredura do arquivo." );
        } catch ( Exception e ){
            System.err.println("Erros desconhecido");
        }
    }

    static void TreeSetParaArquivo(NavigableSet<Costumer> costumers, Path destino){

        // como tranformar um mapa em uma lista???
        List<String> linhas = new ArrayList<>();
        linhas.add("a");
        linhas.add("b");
        linhas.add("c");

        try
        {
            Files.write( destino,
                    linhas,
                    Charset.defaultCharset(),
                    StandardOpenOption.CREATE, // criar o arquivo, caso não exista
                    StandardOpenOption.TRUNCATE_EXISTING,
                    StandardOpenOption.WRITE );
        } catch ( IOException e )
        {
            System.out.println( "Erro: na varredura do arquivo." );
        }
    }

}
