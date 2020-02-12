package com.gmail.jpalvesl;

public class Notebook_Touch extends Notebook {
    public Notebook_Touch(Marca marca, String modelo) {
        super(marca, modelo);
    }

    public Notebook_Touch() {
        super();
    }

    @Override
    public String getDescicao() {
        return "Notebook com touchScreen";
    }
}
