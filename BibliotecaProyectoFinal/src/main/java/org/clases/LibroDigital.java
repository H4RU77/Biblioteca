
package org.clases;

public class LibroDigital extends Libro{
    private final String formato;

    public LibroDigital(String titulo, String autor, String genero,
                        String idioma, String desc, boolean prestado, String ISBN, String formato) {
        super(titulo, autor, genero, idioma, desc, prestado, ISBN);
        this.formato = formato;
    }

    public String getFormato() {
        return formato;
    }

    public String mostrar(){
        return "Libro Digital - [Titulo: "+getTitulo()+", Autor: "+getAutor()+", Genero: "+getGenero()+", Idioma: "+getIdioma()+", Formato: "+getFormato()+"\n"+getDesc()+"]";
    }
}