package com.gmail.jpalvesl;

public class Professor extends Funcionario {
    private int numHoras;

    public Professor() {
        super();
        setNumHoras(40);
    }

    public Professor(int matricula, String nome, int idade, double salárioBase, int numHoras) {
        super(matricula, nome, idade, salárioBase);
        setNumHoras(numHoras);
    }

    public int getNumHoras() {
        return numHoras;
    }

    public void setNumHoras(int numHoras) {
        if ( numHoras > 0 ){
            this.numHoras = numHoras;
        }
    }

    @Override
    public double getSalário() {
        return super.getSalário() + (2*numHoras);
    }

    @Override
    public String toString() {
        return "Professor:\n" + super.toString() + ", NumHoras=" + getNumHoras() + ", SalárioBase=" + super.getSalário();
    }
}
