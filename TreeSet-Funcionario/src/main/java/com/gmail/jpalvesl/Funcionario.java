package com.gmail.jpalvesl;
import org.apache.commons.lang3.StringUtils;

import java.util.Objects;

public class Funcionario implements Comparable<Funcionario>{
    private int matricula;
    private String nome;
    private int idade;
    private double salárioBase;

    public static final String NOME_DEFAULT = "--- sem nome ---";

    public Funcionario() throws NumeroInválidoException, NomeInvalidoException {
        this(0, NOME_DEFAULT, 20, 1000);
    }

    public Funcionario(int matricula, String nome, int idade, double salárioBase) throws NomeInvalidoException, NumeroInválidoException {
            setMatricula(matricula);
            setNome(nome);
            setIdade(idade);
            setSalário(salárioBase);
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) throws NumeroInválidoException{
        if ( matricula < 0 ) throw new NumeroInválidoException();
            this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) throws NomeInvalidoException {
        if ( !StringUtils.isAlphaSpace( nome ) ) throw new NomeInvalidoException();
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) throws NumeroInválidoException {
        if ( idade <= 18 ) throw new NumeroInválidoException("Idades negativas nao existem");
            this.idade = idade;
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

    @Override
    public int compareTo(Funcionario func) {
        return Integer.compare( this.matricula, func.matricula );
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Funcionario that = (Funcionario) o;

        return matricula == that.matricula;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode( this.matricula );
    }
}
