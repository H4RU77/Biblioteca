package org.clases;

import java.io.Serializable;

public class  Miembro implements Serializable{
    private String ID;
    private String nombre;
    private String apellidos;
    private String email;
    private ListaSE<Prestamo> prestamosActivos;
    private ListaSE<Operacion> historialPrestamos;
    private EstadoCuenta estado;

    public Miembro(String ID, String nombre, String apellidos, String email, ListaSE<Prestamo> prestamosActivos, ListaSE<Operacion> historialPrestamos, EstadoCuenta estado) {
        this.ID = ID;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.email = email;
        this.prestamosActivos = prestamosActivos;
        this.historialPrestamos = historialPrestamos;
        this.estado = estado;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ListaSE<Prestamo> getPrestamosActivos() {
        return prestamosActivos;
    }

    public void setPrestamosActivos(ListaSE<Prestamo> prestamosActivos) {
        this.prestamosActivos = prestamosActivos;
    }

    public ListaSE<Operacion> getHistorialPrestamos() {
        return historialPrestamos;
    }

    public void setHistorialPrestamos(ListaSE<Operacion> historialPrestamos) {
        this.historialPrestamos = historialPrestamos;
    }

    public EstadoCuenta getEstado() {
        return estado;
    }

    public void setEstado(EstadoCuenta estado) {
        this.estado = estado;
    }
    
    @Override
     public String toString(){
         return "[Id: "+getID()+", Nombre: "+getNombre()+", Apellidos: "+getApellidos()+", Estado: "+getEstado()+"]";
     }
}


