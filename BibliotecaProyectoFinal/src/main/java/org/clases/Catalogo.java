package org.clases;

/**
 *
 * @author Keloc
 */
public class Catalogo {
    protected ListaSE<Libro> listaLibros;

    public Catalogo(ListaSE<Libro> listaLibros) {
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

    /* public void modificarLibro(Libro libroViejo, Libro libroNuevo) {
        int index = listaLibros.indexOf(libroViejo);
        if (index != -1) {
            listaLibros.set(index, libroNuevo);
        }
    }*/
}