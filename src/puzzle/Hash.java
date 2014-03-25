package puzzle;

import java.util.Hashtable;

public class Hash {
   static Hashtable tabla = new Hashtable();
   
      public Hash(){}
      
      
      public void insertar(Nodo nodo){
          tabla.put(nodo.key,nodo);
      }
      
      public Nodo buscar (int key){
          System.out.println("Hash buscar nodo: "+(Nodo)tabla.get(key));
          return (Nodo)tabla.get(key);
      }
}
