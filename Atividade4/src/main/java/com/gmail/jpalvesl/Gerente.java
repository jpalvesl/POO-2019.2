package com.gmail.jpalvesl;

public class Gerente extends Funcionario {
    private double comissão;

    public Gerente() {
        super();
    }

    public Gerente(int matricula, String nome, int idade, double salárioBase, double comissão) {
        super(matricula, nome, idade, salárioBase);
        setComissão(comissão);
    }

    public double getComissão() {
        return comissão;
    }

    public void setComissão(double comissão) {
        if ( comissão > 0 ){
            this.comissão = comissão;
        }
    }

    @Override
    public double getSalário() {
        return super.getSalário() + (2*getComissão());
    }

    @Override
    public String toString() {
        return "Gerente:\n" + super.toString() + ", comissão=" + getComissão() + ", SalárioBase=" + super.getSalário();
    }
}
