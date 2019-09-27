package com.gmail.jpalvesl;

public class Telefonista extends Funcionario {
    @Override
    public String CalculaIRPF() {
        return "Aliquota 0%";
    }
}
