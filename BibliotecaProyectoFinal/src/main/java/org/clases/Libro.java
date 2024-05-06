package org.clases;

public abstract class Libro(){
    protected final String titulo;
    protected final String autor;
    protected final String genero;
    protected final String idioma;
    protected String desc;
    protected boolean prestado;
    protected final String ISBN;

    public Libro(String titulo, String autor, String genero,
                 String idioma, String desc, boolean prestado, String ISBN){
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
        this.idioma = idioma;
        this.desc = desc;
        this.prestado = prestado;
        this.ISBN = ISBN;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getGenero() {
        return genero;
    }

    public String getIdioma() {
        return idioma;
    }

    public String getDesc() {
        return desc;
    }

    public boolean isPrestado() {
        return prestado;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public void setPrestado(boolean prestado) {
        this.prestado = prestado;
    }

    public abstract String mostrar();
}