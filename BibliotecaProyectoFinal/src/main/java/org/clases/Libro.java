package org.clases;

public abstract class Libro {
    protected String titulo;
    protected String autor;
    protected String genero;
    protected String idioma;
    protected String desc;
    protected String ISBN;

    public Libro(String titulo, String autor, String genero,
                 String idioma, String desc, String ISBN){
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
        this.idioma = idioma;
        this.desc = desc;
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

 
    public String getISBN() {
        return ISBN;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

 
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

   

    public abstract String mostrar();
}