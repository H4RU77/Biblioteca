package org.clases;
public class Biblioteca {
    protected Catalogo catalogo;
    protected ListaSE<Miembro> miembroLista;
    
    public Biblioteca(Catalogo catalogo, ListaSE<Miembro> miembroLista){
        this.catalogo = catalogo;
        this.miembroLista = miembroLista;
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

}