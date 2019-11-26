package com.gmail.jpalvesl;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.rmi.RemoteException;
import java.util.*;

public class Biblioteca implements Biblioteca_IF, Iterable<Livro> {
    private Set<Livro> catalogo = new HashSet<Livro>();

    public String buscarLivro(String ID) throws RemoteException {
        for (Livro l :
                catalogo) {
            if (l.getID().equals(ID)) {
                return l.toString();
            }
        }
        return "Livro não encontrado";
    }

    public String cadastrarLivro(String ID, String titulo, String autor, String tipo, String preco) throws RemoteException {
        Livro novoLivro = new Livro(ID, titulo, autor, tipo, preco);
        boolean funcionou = catalogo.add(novoLivro);

        if ( funcionou ){
            criarArquivo();
            return "Livro cadastrado com sucesso";
        }
        return "Erro - não foi possivel cadastrar o livro";
    }

    public String removerLivro(String ID) throws RemoteException {
        for (Livro l : catalogo) {
            if ( l.getID().equals(ID) ){
                catalogo.remove(l);
                criarArquivo();
                return "Livro foi removido com sucesso";
            }
        }
        return "Erro - não foi possivel remover o livro!";
    }

    /* funcao para criar arquivo caso nao exista e ficar sempre truncando o arquivo existe para evitar espacos em branco */
    public void criarArquivo() {
        Path destino = Paths.get("books.txt");

        try {
            List<String> linhas = new ArrayList<>();
            for (Livro livro :
                    catalogo) {
                linhas.add(livro.toString());
            }

            Files.write(destino,
                    linhas,
                    Charset.defaultCharset(),
                    StandardOpenOption.CREATE, // criar o arquivo, caso não exista
                    StandardOpenOption.TRUNCATE_EXISTING,
                    StandardOpenOption.WRITE);
        } catch (IOException e) {
            System.out.println("Erro ao adicionar em arquivo");
        }
    }

    /* funcao para ler os dados do arquivo e colocar no conjunto */
    public void carregarArquivo(){
        Path pathOrigem = Paths.get("books.txt");
        Livro livro = null;

        // declarando variaveis q seria usadas para instanciar o objeto
        String ID, titulo, autor, tipo, preco;

        try {
            List<String> linhas = Files.readAllLines(pathOrigem, Charset.defaultCharset());
            for (String linha :
                    linhas) {
                String[] palavras = linha.split(";");
                ID = palavras[0];
                titulo = palavras[1];
                autor = palavras[2];
                tipo = palavras[3];
                preco = palavras[4];

                livro = new Livro( ID, titulo, autor, tipo, preco );
                catalogo.add(livro);
            }
            System.out.println("Arquivo carregado com sucesso");
        } catch (IOException e) {
            System.out.println("Não há arquivos para serem carregados");
        }
    }

    @Override
    public Iterator<Livro> iterator() {
        return catalogo.iterator();
    }
}
