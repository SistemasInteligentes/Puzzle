package puzzle;

public class Nodo<T> {
    
    Nodo<T> hijoArriba = null;
    Nodo<T> hijoAbajo = null;
    Nodo<T> hijoDerecha = null;
    Nodo<T> hijoIzquierda = null;
    
    Nodo<T> padre = null;
    
    T key;
    
   Nodo() {
        
    }

    Nodo(T key) {
        
    }
}
