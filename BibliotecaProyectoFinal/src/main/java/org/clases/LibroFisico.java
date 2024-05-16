package org.clases;

public class LibroFisico extends Libro{
    private int cantidad;

    public LibroFisico(String titulo, String autor, String genero,
                       String idioma, String desc, String ISBN, int cantidad) {
        super(titulo, autor, genero, idioma, desc, ISBN);
        this.cantidad = cantidad;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String mostrar(){
        return "Libro Fisico - [Titulo: "+getTitulo()+", Autor: "+getAutor()+", Genero: "+getGenero()+", Idioma: "+getIdioma()+", Cantidad: "+getCantidad()+"\n"+getDesc()+"]";
    }
}