package com.gmail.jpalvesl;

public class ProcessadorArquivo {
    public String extensao(String nome){
        String pastas[] = nome.split( "/" );
        String ultima_palavra = "";
        for (String palavra : pastas) {
            ultima_palavra = palavra;
        }
        return ultima_palavra.substring(ultima_palavra.indexOf(".") +  1 );
    }

    public String nomeArquivo(String nome){
        String pastas[] = nome.split( "/" );
        String ultima_palavra = "";
        for (String palavra : pastas) {
            ultima_palavra = palavra;
        }
        return ultima_palavra.substring(0, ultima_palavra.indexOf(".") );
    }

    public String caminho(String nome){
        String pastas[] = nome.split( "/" );
        StringBuilder caminho = new StringBuilder();
        for (int i =0; i < pastas.length - 1; i++ ) {
            caminho.append(pastas[i]).append('/');
        }
        return caminho.toString();
    }
}
