package com.gmail.jpalvesl;

public class ContaCorrente extends Conta {

    public ContaCorrente(String titular) {
        super(titular);
        setTipo(TipoConta.CORRENTE);
    }

    @Override
    public void passarMes() {
        super.setSaldo(getSaldo() - 1);
    }
}
