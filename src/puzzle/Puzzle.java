/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package puzzle;


/**
 *
 * @author familiacetina
 */
public class Puzzle {
    Hash hash = new Hash();
    int key;
    
    int mapa [] = new int [9]; 
   
    public Puzzle (){
        
        this.key = generarKey();
        Nodo actual = new Nodo(key);
        hash.insertar(actual);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }

    private int generarKey() {
        return 0;
    }
    
    private void toArray(){
        
    }
    
    
    
    
}
