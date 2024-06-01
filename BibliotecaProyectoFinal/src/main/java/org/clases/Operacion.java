/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.clases;



public abstract class Operacion {
    protected Libro libro;
    protected String fecha;
    protected Miembro folio;
    
    public Operacion(Libro libro, String fecha, Miembro folio){
        this.libro = libro;
        this.fecha = fecha;
        this.folio = folio;
    }

    public Libro getLibro() {
        return libro;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }

    public String getTiempo() {
        return fecha;
    }

    public void setTiempo(String tiempo) {
        this.fecha = tiempo;
    }

    public Miembro getFolio() {
        return folio;
    }

    public void setFolio(Miembro folio) {
        this.folio = folio;
    }
    
    
}
