package puzzle;

import java.util.Hashtable;

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
