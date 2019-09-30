package com.gmail.jpalvesl;

import java.util.Random;

public class JogoNumeroSecreto {
    private int numeroSecreto;
    private int numeroMaxTentativas;
    private static final int DEFAULT_TENTATIVAS = 3;
    private static final int LIMITE_INICIAL = 1;
    private static final int LIMITE_FINAL = 6;

    public JogoNumeroSecreto(int numeroMaxTentaivas) {
        if ( numeroMaxTentaivas >= LIMITE_INICIAL && numeroMaxTentaivas <= LIMITE_FINAL ){
            this.numeroMaxTentativas = numeroMaxTentaivas;
        }
        else this.numeroMaxTentativas = DEFAULT_TENTATIVAS;
        this.gerarNumeroSecreto();
    }

    private void gerarNumeroSecreto(){
        Random numeroSecreto = new Random();
        this.numeroSecreto = this.LIMITE_INICIAL + numeroSecreto.nextInt(this.LIMITE_FINAL);
    }

    private boolean ehNumeroSecreto(int numero){
        if (numero == numeroSecreto) return true;
        this.numeroMaxTentativas--;

        return false;
    }
    public int getTentativas(){
        return numeroMaxTentativas;
    }

    public int getNumeroSecreto() {
        return numeroSecreto;
    }

    public String ajuda(){
        return "Insira um numero entre " + LIMITE_INICIAL + " e " + LIMITE_FINAL;
    }

    public boolean efetuarJogada(int palpite){
        if ( this.ehNumeroSecreto( palpite ) ){
            this.encerrarJogo();
            return true;
        }
        return false;
    }

    private void encerrarJogo(){
        this.numeroMaxTentativas = 0;
    }
}
