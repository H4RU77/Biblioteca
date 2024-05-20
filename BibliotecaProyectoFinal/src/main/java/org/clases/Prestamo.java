package org.clases;
public class Prestamo extends Operacion{

    private boolean devuelto = false;

    public Prestamo(Libro libro, int tiempo, double monto, Miembro folio) {
        super(libro, tiempo, monto, folio);
    }
    
    
    public boolean isDevuelto(){
        return devuelto;
    }
    
    public void setDevuelto(boolean devuelto) {
        this.devuelto = devuelto;
    }
}