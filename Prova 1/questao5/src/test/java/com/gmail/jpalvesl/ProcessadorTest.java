package com.gmail.jpalvesl;

import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Test;


public class ProcessadorTest {
    static ProcessadorArquivo processador = new ProcessadorArquivo();


    @Test
    public void caminhoArquivo() {
        Assert.assertEquals("/home/pedro/" ,processador.caminho("/home/pedro/monografia.docx"));
        Assert.assertEquals("/home/joao/" ,processador.caminho("/home/joao/texto.txt"));
    }

    @Test
    public void extArquivo(){
        Assert.assertEquals("docx" ,processador.extensao("/home/pedro/monografia.docx"));
        Assert.assertEquals("txt" ,processador.extensao("/home/joao/texto.txt"));
    }

    @Test
    public void nomeArquivo(){
        Assert.assertEquals("monografia" ,processador.nomeArquivo("/home/pedro/monografia.docx"));
        Assert.assertEquals("texto" ,processador.nomeArquivo("/home/joao/texto.txt"));
    }
}
