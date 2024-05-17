package org.clases;
public class Prestamo {

    private Libro libro;
    private int tiempo;
    private double monto;
    private Miembro folio;
    private boolean devuelto;

    public Prestamo(Libro libro, int tiempo, double monto, Miembro folio) {
        this.libro = libro;
        this.tiempo = tiempo;
        this.monto = monto;
        this.folio = folio;
        this.devuelto = false; //Default
    }
    
    public Miembro getFolio() {
        return folio;
    }
    
    public void setFolio(Miembro folio) {
        this.folio = folio;
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
    
    public boolean isDevuelto(){
        return devuelto;
    }
    
    public void setDevuelto(boolean devuelto) {
        this.devuelto = devuelto;
    }
}