package org.clases;
public class Biblioteca {
    private Catalogo catalogo;
    private ListaSE<Miembro> miembroLista;
    private ListaSE<Operacion> operaciones;
    
    public Biblioteca(Catalogo catalogo, ListaSE<Miembro> miembroLista, ListaSE<Operacion> operaciones){
        this.catalogo = catalogo;
        this.miembroLista = miembroLista;
        this.operaciones = operaciones;
    }

    public ListaSE<Miembro> getMiembroLista() {
        return miembroLista;
    }

    public void setMiembroLista(ListaSE<Miembro> miembroLista) {
        this.miembroLista = miembroLista;
    }

    public Catalogo getCatalogo() {
        return catalogo;
    }

    public void setCatalogo(Catalogo catalogo) {
        this.catalogo = catalogo;
    }

    public ListaSE<Operacion> getOperaciones() {
        return operaciones;
    }

    public void setOperaciones(ListaSE<Operacion> operaciones) {
        this.operaciones = operaciones;
    }
}