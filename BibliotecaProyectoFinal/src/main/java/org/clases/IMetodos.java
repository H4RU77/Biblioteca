package org.clases;

public interface IMetodos<T> {
    public int tamanio();
    public boolean EsVacia();
    public T Obtener(int i);
    public void Agregar(T x);
    public void Eliminar (int i);


}