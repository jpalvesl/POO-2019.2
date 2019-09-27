package com.gmail.jpalvesl;

import java.util.ArrayList;
import java.util.List;

public class Universidade {
    private List<Funcionario> lista = new ArrayList<>();
    private String endereço;

    public Universidade(String endereço) {
        this.endereço = endereço;
    }

    public boolean adicionarFuncionário(Funcionario func){
        if ( func == null) return false;

        for (Funcionario f: lista) {
            if ( f.getMatricula() == func.getMatricula() ){
                return false;
            }
        }
        return lista.add(func);
    }

    public boolean removerFuncionário(int matricula){
        if (matricula < 0) return false;

        for (Funcionario f : lista ) {
            if (f.getMatricula() == matricula){
                return lista.remove(f);
            }
        }
        return false;
    }

    public String listarTodosFuncionários(){
        String ListaFuncionários = "";

        for (Funcionario f: lista) {
            ListaFuncionários += f.toString()+'\n';
        }
        return ListaFuncionários;
    }

    public int getQuantidade(){
        return lista.size();
    }

    public Funcionario buscarFuncionário(int matricula){
        for (Funcionario f: lista){
            if (f.getMatricula() == matricula) {
                return f;
            }
        }
        return null;
    }

}
