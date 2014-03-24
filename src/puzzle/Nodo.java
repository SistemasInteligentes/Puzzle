package puzzle;

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
    /*
     * a partir de la llave entera genera un array con el estado del puzzle
     */
    private int [] toArray(int key) {
        int mapa [] = new int [9];
        //
        
        for(int i = 0; i <8; i++){
          mapa[i] = ((int)key)%10;
          key = key/10;
        }
        return mapa;
    }
    
    /*
     * busca y retorna la posicion vacia en el array de estado
     */
    public int getPos(int[] key) {
        int pos = 0;

        for (int i = 0; i < 9; i++) {
            if (key[i] == 9) {
                pos = i;
            }
        }
        return pos;

    }

    /**
     * @return the posVacia
     */
    public int getPosVacia() {
        
        return this.getPos(this.toArray((Integer)key));
        //return posVacia;
    }

   

    
    
}
