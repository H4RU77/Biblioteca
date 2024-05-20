/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.clases;


public abstract class Operacion {
    protected Libro libro;
    protected int tiempo;
    protected double monto;
    protected Miembro folio;
    
    public Operacion(Libro libro, int tiempo, double monto, Miembro folio){
        this.libro = libro;
        this.tiempo = tiempo;
        this.monto = monto;
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

    public Miembro getFolio() {
        return folio;
    }

    public void setFolio(Miembro folio) {
        this.folio = folio;
    }
    
    
}
