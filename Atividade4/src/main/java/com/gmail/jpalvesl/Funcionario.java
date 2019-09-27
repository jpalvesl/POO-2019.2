package com.gmail.jpalvesl;

public class Funcionario {
    private int matricula;
    private String nome;
    private int idade;
    private double salárioBase;

    public Funcionario() {
        this(0,  "--- sem nome ---", 20, 1000);
    }

    public Funcionario(int matricula, String nome, int idade, double salárioBase) {
        setMatricula(matricula);
        setNome(nome);
        setIdade(idade);
        setSalário(salárioBase);
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        if ( matricula > 0 ){
            this.matricula = matricula;
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        if ( idade >= 18 ){
            this.idade = idade;
        }
    }

    public double getSalário() {
        return salárioBase;
    }

    public void setSalário(double salárioBase) {
        if ( salárioBase > 0 ){
            this.salárioBase = salárioBase;
        }
    }

    @Override
    public String toString() {
        return  "matricula=" + getMatricula() +
                ", nome='" + getNome() + '\'' +
                ", idade=" + getIdade() +
                ", salário=" + getSalário() ;
    }
}
