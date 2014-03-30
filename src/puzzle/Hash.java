package puzzle;

import java.util.Hashtable;

public class Hash {
   static Hashtable tabla = new Hashtable();
   
      public Hash(){}
      
      
      public void insertar(Nodo nodo){
          tabla.put(nodo.key,nodo);
          System.out.println("  Hash insert nodo: "+nodo.key);
      }
      
      public Nodo buscar (int key){
          System.out.println("  Hash buscar nodo "+key+" : "+(Nodo)tabla.get(key));
          return (Nodo)tabla.get(key);
      }
}
