/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package puzzle;

import java.util.Stack;

/**
 *
 * @author Nicolas
 */
public class Inserciones {
    
    private Stack stack = new Stack();
    
    private Hash nuestroHash = null;
    
    
    public void insertarProfundidad (Nodo keyNodo){
        
        Nodo actual;
        
        
        actual = keyNodo; /*aca hay un error en cual es el actual*/
        stack.add(keyNodo);
        nuestroHash.insertar(keyNodo);
        while(actual.key != 123456789 && !stack.empty()){ /*aca el actual.key que compara 
         * no esta cambiando tonces nunca se cumple la condicion*/
//            System.out.println("inicio while, actual.key: "+actual.key);
            actual =(Nodo) stack.pop();
            System.out.println("while actual.key = "+actual.key);
//            generarEstadoNodoNoDuplicado(actual, "PROFUNDIDAD");   
        }
//        System.out.println("2 actual.key = "+actual.key);        
    }
    public void insertarIterativo (Nodo keyNodo){
        
    }
    public void insertarAmplitud (Nodo keyNodo){
        
    }
}
