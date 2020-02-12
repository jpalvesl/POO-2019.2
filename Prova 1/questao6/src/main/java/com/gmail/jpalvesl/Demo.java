package com.gmail.jpalvesl;


public class Demo
{
    public static void main( String[] args ) {
        Notebook note = new Notebook(Marca.APPLE, "modelo789");
        System.out.println(note.getDescicao());
        System.out.println(note);

        note = new Notebook_Touch();
        System.out.println(note.getDescicao());
        System.out.println(note);
    }
}
