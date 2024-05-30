
package org.clases;

public class LibroDigital extends Libro{
    private final String formato;

    public LibroDigital(String titulo, String autor, String genero,
                        String idioma, String desc, String ISBN, String formato) {
        super(titulo, autor, genero, idioma, desc, ISBN);
        this.formato = formato;
    }

    public String getFormato() {
        return formato;
    }
    
    public String getTipo(){
        return "Libro Digital";
    }
    
    public String mostrar(){
        return "Libro Digital - [Titulo: "+getTitulo()+", Autor: "+getAutor()+", Genero: "+getGenero()+", Idioma: "+getIdioma()+", Formato: "+getFormato()+"\n"+getDesc()+"]";
    }
}