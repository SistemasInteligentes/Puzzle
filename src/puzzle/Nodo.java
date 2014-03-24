/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package puzzle;

/**
 *
 * @author familiacetina
 */
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
