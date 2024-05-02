public class Catalogo () {
    protected ListaSE<Libro> listaLibros;

    public Catalogo() {
        this.listaLibros = new ListaSE();
    }

    public mostrarPorAutor (String autor) {
        for (Libro libro : listaLibros) {
            if (libro.getAutor().equalsIgnoreCase(autor)) {
                System.out.println(libro);
            }
        }
    }

    public mostrarPorCategoria (String categoria) {
        for (Libro libro : listaLibros) {
            if (libro.getAutor().equalsIgnoreCase(categoria)) {
                System.out.println(libro);
            }
        }
    }

    public mostrarPorGenero (String genero) {
        for (Libro libro : listaLibros) {
            if (libro.getAutor().equalsIgnoreCase(genero)) {
                System.out.println(libro);
            }
        }
    }

    public mostrarPorTitulo (String titulo) {
        for (Libro libro : listaLibros) {
            if (libro.getAutor().equalsIgnoreCase(titulo)) {
                System.out.println(libro);
            }
        }
    }

    public adicionarLibro (Libro libro) {
        listaLibros.Agregar(libro);
    }

    public eliminarLibro(Libro libro) {
        listaLibros.Eliminar(libro);
    }

    public modificarLibro(Libro libroViejo, Libro libroNuevo) {
        int index = listaLibros.indexOf(libroViejo);
        if (index != -1) {
            listaLibros.set(index, libroNuevo);
        }
    }
}