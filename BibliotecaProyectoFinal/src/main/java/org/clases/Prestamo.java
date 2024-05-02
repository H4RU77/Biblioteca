public class Prestamo {

    private Libro libro;
    private int tiempo;
    private double monto;

    public Prestamo(Libro libro, int tiempo, double monto) {
        this.libro = libro;
        this.tiempo = tiempo;
        this.monto = monto;
    }

    public Libro getLibro() {
        return libro;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }

    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }
}