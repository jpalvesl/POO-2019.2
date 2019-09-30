package com.gmail.jpalvesl;

public class ContaPoupança extends Conta {
    private final int LIMITE_SAQUES = 2;
    private int saquesDisponiveis;

    public ContaPoupança(String titular) {
        super(titular);
        setTipo(TipoConta.POUPANÇA);
        setSaquesDisponiveis(LIMITE_SAQUES);
    }

    public int getSaquesDisponiveis() {
        return this.saquesDisponiveis;
    }

    public void setSaquesDisponiveis(int saquesDisponiveis) {
        this.saquesDisponiveis = saquesDisponiveis;
    }

    @Override
    public boolean sacar(double valor) {
        boolean aux;
        if (valor <= 0) return false;

        if (getSaquesDisponiveis() > 0){
            aux = super.sacar(valor);
        }
        else {
            aux = super.sacar(valor + 1);
        }

        if (aux){
            --this.saquesDisponiveis;
        }
        return aux;

    }

    @Override
    public void passarMes() {
        super.setSaldo(getSaldo() + 1);
        setSaquesDisponiveis(LIMITE_SAQUES);
    }
}
