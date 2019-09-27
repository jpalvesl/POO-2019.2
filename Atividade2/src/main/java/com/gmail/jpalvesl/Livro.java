package com.gmail.jpalvesl;

public class Livro {
    private String titulo;
    private String autor;
    private String editora;
    private int lançamento;
    private int edição;
    private int paginas;
    private int id;

    public Livro(){
        setEditora("Não identificada");
        setTitulo("Não identificado");
        setAutor("Não identificado");
    }

    public Livro(String titulo, String autor, String editora, int lançamento, int edição, int paginas, int id) {
        setTitulo(titulo);
        setAutor(autor);
        setEditora(editora);
        setLançamento(lançamento);
        setEdição(edição);
        setPaginas(paginas);
        setId(id);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public int getLançamento() {
        return lançamento;
    }

    public void setLançamento(int lançamento) {
        if ( lançamento > 0 ){
            this.lançamento = lançamento;
        }
    }

    public int getEdição() {
        return edição;
    }

    public void setEdição(int edição) {
        if ( edição > 0 ){
            this.edição = edição;
        }
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        if ( paginas > 0 ){
            this.paginas = paginas;
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        if ( id > 0 ){
            this.id = id;
        }
    }

    @Override
    public String toString() {
        return "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", editora='" + editora + '\'' +
                ", lançamento=" + lançamento +
                ", edição=" + edição +
                ", paginas=" + paginas +
                ", id=" + id+ '\n';
    }
}
