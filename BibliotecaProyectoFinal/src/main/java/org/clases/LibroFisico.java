public class LibroFisico extends Libro{
    private int cantidad;

    public LibroFisico(String titulo, String autor, String genero,
                       String idioma, String desc, boolean prestado, String ISBN, int cantidad) {
        super(titulo, autor, genero, idioma, desc, prestado, ISBN);
        this.cantidad = cantidad;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String mostrar(){
        return "Libro Digital - [Titulo: "+getTitulo()+", Autor: "+getAutor()+", Genero: "+getGenero()+", Idioma: "+getIdioma()+", Cantidad: "+getCantidad()+""\n"+getDesc()+"]";
    }
}