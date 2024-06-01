package org.clases;
import java.time.LocalDate;
public class Prestamo extends Operacion{

    private boolean devuelto = false;
    private LocalDate date;

    public Prestamo(Libro libro, String fecha, Miembro folio) {
        super(libro, fecha, folio);
    }
    
    
    public boolean isDevuelto(){
        return devuelto;
    }
    
    public void setDevuelto(boolean devuelto) {
        this.devuelto = devuelto;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}