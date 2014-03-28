/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package puzzle;

/**
 *
 * @author Nicolas
 */
public class Heuristicas {
    
    int[] objetivo = {1,2,3,4,5,6,7,8,9};
    
    public int heuristica1(int[] estado){
        int contador = 0;
        for(int i=0;i<9;i++){
            if(estado[i]!=objetivo[i]){
                contador++;
            }
        }
        return contador;
    }
            
    
    
}
