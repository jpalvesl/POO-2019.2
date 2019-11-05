package com.gmail.jpalvesl;

import java.io.*;
import java.util.HashSet;
import java.util.Set;

public class ProcessadorTexto {
    static void lerColocandoNoHashSet( Set<Livro> livros ) {

        try (FileReader fr = new FileReader("files/books.txt");
             BufferedReader br = new BufferedReader(fr);) {
            String linha = null;
            Livro l = null;

            while ((linha = br.readLine()) != null) {
                String palavras[] = linha.split(";"); // separando palavras por ponto e virgula

                int id = Integer.parseInt(palavras[0]); //convertendo stringo em int
                String name = palavras[1];
                String author = palavras[2];
                String type = palavras[3];
                double price = Double.parseDouble(palavras[4]); // convertendo string em double

                l = new Livro(id, name, author, type, price);
                livros.add( l );
            }
        } catch (FileNotFoundException e) {
            System.out.println("Erro: arquivo não existe.");
        } catch (IOException e) {
            System.out.println("Erro na varredura do arquivo.");
        } catch ( Exception e ) {
            System.err.println("Erro desconhecido");
        }

    }

    static void GravandoNumArquivo( Set<Livro> livros ){
        try ( FileWriter fw = new FileWriter( "files/new-books.txt" );
              BufferedWriter bw = new BufferedWriter( fw ); )

        {
            for (Livro l:
                 livros) {
                bw.write(l.toString());
                bw.newLine();
            }

        }
        catch ( FileNotFoundException e )
        {
            System.out.println( "Erro: arquivo não existe." );
        } catch ( IOException e )
        {
            System.out.println( "Erro na varredura do arquivo." );
        }
    }



}

