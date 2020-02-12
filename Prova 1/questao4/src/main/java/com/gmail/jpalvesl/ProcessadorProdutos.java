package com.gmail.jpalvesl;

import java.util.ArrayList;

public class ProcessadorProdutos {
    private ArrayList<Produto> listaProdutos;

    public ProcessadorProdutos(ArrayList<Produto> listaProdutos) {
        this.listaProdutos = listaProdutos;
    }

    public void mostrarGraficoDistribuicaoPrecos() {
        System.out.println("Gráfico de Distribuição de Preços:\n" +
                           "---------------------------------------");


        int contador_100 = 0;
        for (int i = 0; i < 10; i++){
            System.out.print(i + "0-" + i + 9 + ": ");
            for (Produto p : listaProdutos) {
                if ( p.getPreco() > i*10 && p.getPreco() < (i+1)*10 ){
                    System.out.print("+ ");
                }
            }
            System.out.println();
        }
        System.out.print("  100: ");
        for (Produto p : listaProdutos) {
            if (p.getPreco() == 100){
                System.out.print("+ ");
            }
        }
        System.out.println();



        double menor_preco = 9999999;
        double maior_preco = 0;
        double media = 0;

        for (Produto p : listaProdutos) {
            if ( p.getPreco() > maior_preco ){
                maior_preco = p.getPreco();
            }

            if ( p.getPreco() < menor_preco ){
                menor_preco = p.getPreco();
            }

            media += p.getPreco();
        }
        System.out.println();
        System.out.printf("Menor preco: %d\nMaior preco: %d\nMedia dos precos: %.2f", (int) menor_preco, (int)maior_preco, (float)(media/listaProdutos.size()));

    }
}
