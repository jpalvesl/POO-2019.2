package com.gmail.jpalvesl;

public class Cliente {
    public static void main(String[] args) {
        String host = (args.length < 1) ? "localhost" : args[0];
        GuiTextual.executarCliente(host);
    }
}
