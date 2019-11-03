package com.gmail.jpalvesl;

import java.util.*;

public class Universidade implements Iterable<Funcionario> {
    private NavigableSet<Funcionario> conjunto;

    public Universidade( Comparator<Funcionario> comparator ) {
        Comparator<Funcionario> comp = Objects.requireNonNullElse( comparator, Comparator.naturalOrder() );
        this.conjunto = new TreeSet<>( comp );
    }

    public Universidade() {
        this.conjunto = new TreeSet<>();
    }

    public boolean adicionarFuncionário(Funcionario func){
        return conjunto.add( func );
    }

    public boolean removerFuncionário(Funcionario func){
        return conjunto.remove( func );
    }

    public String listarTodosFuncionários(){
        String retorno = "";
        for (Funcionario func :
                conjunto) {
            retorno += func + "\n";
        }
        return retorno;
    }

    public int getQuantidade(){
        return conjunto.size();
    }

    public Funcionario buscarFuncionário(Funcionario func){
        Optional<Funcionario> optionalFuncionario =
                conjunto.stream()
                .filter(funcionario -> funcionario.equals(func))
                .findAny();
        return optionalFuncionario.orElseThrow( () -> new RuntimeException("Funcionario nao existe") );
    }


    @Override
    public Iterator<Funcionario> iterator() {
        return conjunto.iterator();
    }
}
