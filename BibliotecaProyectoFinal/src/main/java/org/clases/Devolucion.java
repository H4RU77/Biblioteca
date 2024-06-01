/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.clases;


/**
 *
 * @author Keloc
 */
public class Devolucion extends Operacion{
    private double monto;

    public Devolucion(Libro libro, String fecha, double monto, Miembro folio) {
        super(libro, fecha, folio);
        this.monto = monto;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }
    
    public String mostrar() {
        return "DEVOLUCIÓN: [Titulo: "+libro.getTitulo()+", ISBN: "+libro.getISBN()+", Fecha de entrega: "+fecha+", Id de Miembro: "+folio.getID()+"]";
    }
}
