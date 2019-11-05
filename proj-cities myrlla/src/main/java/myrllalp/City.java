package myrllalp;

import java.util.Objects;

public class City implements Comparable<City>{
    private String sigla;
    private String nome;
    private String zipCode;

    public City(String nome, String sigla, String zipCode) {
        this.sigla = sigla;
        this.nome = nome;
        this.zipCode = zipCode;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof City)) return false;
        City city = (City) o;
        return getNome().equals(city.getNome());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNome());
    }

    @Override
    public String toString() {
        return "City{" +
                "sigla='" + sigla + '\'' +
                ", nome='" + nome + '\'' +
                ", zipCode=" + zipCode +
                '}';
    }

    @Override
    public int compareTo(City city) {
        return this.getNome().compareTo(city.getNome());
    }
}
