package org.clases;

import java.io.Serializable;

/**
 *
 * @author Keloc
 */
public class Catalogo implements Serializable{
    public ListaSE<Libro> listaLibros;

    public Catalogo(ListaSE<Libro> listaLibros) {
        this.listaLibros = listaLibros;
    }

    public ListaSE<Libro> getListaLibros() {
        return listaLibros;
    }

    public void setListaLibros(ListaSE<Libro> listaLibros) {
        this.listaLibros = listaLibros;
    }
    
    public ListaSE<Libro> mostrarPorAutor (String autor) {
        ListaSE<Libro> librosEncontrados = new ListaSE<Libro>(); ;
        for (int i=0;i<listaLibros.tamanio();i++) {
            if (autor==listaLibros.Obtener(i).getAutor()) {
                librosEncontrados.Agregar(listaLibros.Obtener(i));
            }
        }
        return librosEncontrados;
    }



    public ListaSE<Libro> mostrarPorGenero (String genero) {
        ListaSE<Libro> librosEncontrados = new ListaSE<Libro>(); ;
        for (int i=0;i<listaLibros.tamanio();i++) {
            if (genero==listaLibros.Obtener(i).getGenero()) {
                librosEncontrados.Agregar(listaLibros.Obtener(i));
            }
        }
        return librosEncontrados;
    }

    public ListaSE<Libro> mostrarPorTitulo (String titulo) {
        ListaSE<Libro> librosEncontrados = new ListaSE<Libro>(); ;
        for (int i=0;i<listaLibros.tamanio();i++) {
            if (titulo==listaLibros.Obtener(i).getTitulo()) {
                librosEncontrados.Agregar(listaLibros.Obtener(i));
            }
        }
        return librosEncontrados;
    }

    public void adicionarLibro (Libro libro) {
        listaLibros.Agregar(listaLibros.Obtener(listaLibros.Buscar(libro)));
    }

    public void eliminarLibro(Libro libro) {
        listaLibros.Eliminar(listaLibros.Buscar(libro));
    }

    public void modificarTitulo(Libro libroACambiar, String titulo) {
        int index = listaLibros.Buscar(libroACambiar);

        if (index != -1) {
            libroACambiar.setTitulo(titulo);
            
        }
    }
    public void modificarAutor(Libro libroACambiar, String autor) {
        int index = listaLibros.Buscar(libroACambiar);

        if (index != -1) {
            libroACambiar.setAutor(autor);
            
        }
    }
    public void modificarGenero(Libro libroACambiar, String genero) {
        int index = listaLibros.Buscar(libroACambiar);

        if (index != -1) {
            libroACambiar.setGenero(genero);
            
        }
    }
    public void modificarIdioma(Libro libroACambiar, String idioma) {
        int index = listaLibros.Buscar(libroACambiar);

        if (index != -1) {
            libroACambiar.setIdioma(idioma);
            
        }
    }
    public void modificarDesc(Libro libroACambiar, String desc) {
        int index = listaLibros.Buscar(libroACambiar);
        if (index != -1) {
            libroACambiar.setDesc(desc);
            
        }
    }
 
    public void modificarISBN(Libro libroACambiar, String ISBN) {
        int index = listaLibros.Buscar(libroACambiar);
        if (index != -1) {
            libroACambiar.setISBN(ISBN);
            
        }
    }
    
}