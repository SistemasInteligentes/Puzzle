/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package puzzle;

/**
 *
 * @author Camilo
 */
public class TestPuzzle {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        
        int m[] =  {1,3,2,4,5,6,7,8,9,0};
       // System.out.println(m[1]);
        //revisar(m);
        
        
        // TODO code application logic here
    }
    
    
    public static void print(int[] m){
        for(int i= 0; i < m.length; i++){
            System.out.print(m[i]+" ");
        }
        System.out.println("");
    }
    
    public static int revisar(int[] m){
        int d = 0;        
        //0
        if((m[0] == 2 && m[1] == 1 )||( m[0]== 4 && m[4]==1)){
            d++;
        }
        //2
        if((m[5] == 3 && m[2] == 6 )||( m[1]== 3 && m[2]==2)){
            d++;
        }
        //6
        if((m[6] == 4 && m[3] == 7 )||( m[6]== 8 && m[7] == 7)){
            d++;
        }        
        //8
        if((m[8] == 8 && m[7] == 9 )||( m[8]== 6 && m[5]==9)){
            d++;
        }        
        //4
        if((m[1] == 5 && m[4] == 2 )||( m[4]== 4 && m[3] == 5)||(m[4] == 6 && m[5] == 5 )||( m[4]== 8 && m[7] == 5)){
            d++;
        }                   
        System.out.println(d+ ": d");
        return d;
    }
}
