/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package puzzle;

import java.util.Stack;

/**
 *
 * @author familiacetina
 */
public class Arbol<T> {

    private Nodo<T> raiz;

    public void insertarProfundidad(T keyNodo) {//no deberia pedir un nodo y no solo la key?
        Stack s = new Stack();
    }

    public void insertarIterativo(T keyNodo) {
    
    }

    public void insertarAmplitud(T keyNodo) {
    
    }

    public Arbol(T keyNodo) {
        raiz = new Nodo<T>();
        raiz.key = keyNodo;

    }
    
}
