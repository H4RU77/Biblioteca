package org.clases;
public class ListaSE<T> implements IMetodos<T>{
    private NodoSE<T> cabeza;
    private int tamano;

    public ListaSE(){
        this.tamano=0;

    }
    public int tamanio() {
        return tamano;
    }

    public boolean EsVacia(){
        if(cabeza==null){
            return true;
        }else{
            return false;
        }
    }
    public T Obtener(int pos){

        if(pos<tamano && pos>=0){
            int contador=0; NodoSE<T> nodoActual;
            nodoActual=cabeza;
            while(contador<pos){
                nodoActual = nodoActual.getSiguiente();
                contador++;
            }

            return nodoActual.getDato();
        }else{
            System.out.println("Posición inválida");
            return null;
        }
    }
    public void Agregar(T nuevaInfo){
        NodoSE<T> nuevoNodo= new NodoSE<>(nuevaInfo);
        if(EsVacia()){
            cabeza = nuevoNodo;
        }else{
            NodoSE<T> ultimoNodo=cabeza;
            while(ultimoNodo.getSiguiente()!=null){
                ultimoNodo = ultimoNodo.getSiguiente();
            }
            ultimoNodo.setSiguiente(nuevoNodo);

        }
        System.out.println("Se agregó exitosamente.");
        tamano++;

    }
    public void Eliminar(int pos){

        if(pos<tamanio() && pos>=0){
            if(pos==0){
                cabeza= cabeza.getSiguiente(); //solo queda la cabeza apuntando a null
            }else{
                NodoSE<T> nodoAnterior = cabeza;
                for(int i=0;i<pos-1;i++){
                    nodoAnterior=nodoAnterior.getSiguiente();
                }
                if(pos==tamanio()-1){
                    nodoAnterior.setSiguiente(null);
                }else{
                    NodoSE<T> nodoAEliminar = nodoAnterior.getSiguiente(); //el siguiente a nodo Anterior es el que se va a eliminar
                    nodoAnterior.setSiguiente(nodoAEliminar.getSiguiente()); //apuntar el anterior al nodo que sigue despues del nodo a eliminar
                    nodoAEliminar.setSiguiente(null);//terminar de desconectar el nodo
                }
            }
            tamano--;
        }
        else{
            System.out.println("Posición inválida");
        }
    }
    
     public int Buscar(T pInfo){
         NodoSE<T> nodoActual = new NodoSE<>(pInfo);
         nodoActual= cabeza;
         for(int i=0;i<tamano;i++){
             if(nodoActual.getDato()==pInfo){
                 return i;
             }
             nodoActual = nodoActual.getSiguiente();
         }
         return -1;
     }
    
    public void insertar(T nuevaInfo, int pos){
        NodoSE<T> nuevoNodo= new NodoSE<>(nuevaInfo);
        NodoSE<T> nodoActual = cabeza;
        NodoSE<T> nodoAnterior = cabeza;
        if (pos >= tamano){
            System.out.println("Out of Bounds");
        } else {
            for (int i = 0; i<tamano; i++){
                if (nodoActual == nodoAnterior){
                    cabeza = nuevoNodo;
                    cabeza.setSiguiente(nodoActual);
                } else {
                    if (i == pos){
                        nuevoNodo.setSiguiente(nodoActual);
                        nodoAnterior.setSiguiente(nuevoNodo);
                    }
                    nodoAnterior = nodoActual;
                    nodoActual = nodoActual.getSiguiente();
                }
            }
        }
        tamano++;
    }
    
    public void editar(T nuevaInfo, int pos){
        insertar(nuevaInfo, pos);
        Eliminar(pos+1);
        show();
    }
    
    public String show(){
        NodoSE<T> nodoActual = cabeza;
        String res = "";
        for (int i = 0; i<tamano; i++){
            res = res.concat(nodoActual.getDato().toString()+"\n");
        }
        return res;
    }
}
