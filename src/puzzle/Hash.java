/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package puzzle;

import java.util.Hashtable;



/**
 *
 * @author familiacetina
 */
public class Hash {
   static Hashtable tabla = new Hashtable();
   
      public Hash(){}
      
      
      public void insertar(Nodo nodo){
          tabla.put(nodo.key,nodo);
      }
      
      public Nodo buscar (int key){
          return (Nodo)tabla.get(key);
      }
   
   
    
}
