package puzzle;

import java.util.HashMap;
import java.util.Stack;

public class Arbol {
    private static int SIZE;
    
    private static String PROFUNDIDAD = "PROFUNDIDAD";
    private static String ITERATIVO = "ITERATIVO";
    private static String AMPLITUD = "AMPLITUD";
    
    private Nodo raiz;   
    
    private int[] tablero = null;
    private Hash nuestroHash = null;
    
    Nodo actual;
    Heuristicas heuristica = new Heuristicas();
    
    public Arbol (int keyNodo, int[] tablero){
        raiz = new Nodo();
        raiz.key = keyNodo;
        nuestroHash = new Hash();
//        
//        nuestroHash.insertar(raiz);
        
        this.tablero = tablero;
        SIZE = tablero.length;        
    }
    
    private int getPosicion(Nodo nodo){
        return nodo.getPosVacia();
    }
    
    private int nuevoEstado(int [] tablero, int posicion, int nuevaPosicion){
        int aux = tablero[posicion];        
        tablero[posicion] = tablero[nuevaPosicion];
        tablero[nuevaPosicion] = aux;
        String stringEstado = Integer.toString(tablero[0]) ;
        for (int i=1; i < SIZE; i++) {
            stringEstado =  stringEstado +tablero[i] ;
        }        
        System.out.println("nuevo estado "+ pintar(tablero));
        return Integer.parseInt(stringEstado) ;
    }
    
    public String pintar(int[] tablero){
        String r="";
        for(int i=0; i<9;i++){
            r+=tablero[i];
        }
        return r;
    }
    
    
    public int [] toArray(int key) {
        int mapa [] = new int [9];
        int aux[]= new int[9];
        //
        int j =8;
        for(int i = 0; i <9; i++){
          mapa[i] = ((int)key)%10;
          key = key/10;
          aux[j]=mapa[i];
          j--;
        }
        mapa=aux;
        return mapa;
    }
    
    
    private int generarEstado(Nodo nodoActual, int heuris){
        int posicion;                    //es el estado del tablero
        posicion = getPosicion(nodoActual);        
        HashMap mapa = new HashMap();
        //este metodo buscara en que posicion esta el simbolo de vacio
        int estado1 = 0;
        int costo1 = 100;
        int estado2 = 0;
        int costo2 = 100;
        int estado3 = 0;
        int costo3 = 100;
        int estado4 = 0;
        int costo4 = 100;
        int menor = 0;
        
        switch(heuris){
            case 1:
                System.out.println("caso 1");
                if( (posicion+3)<SIZE ){
                    estado1 = nuevoEstado(toArray(nodoActual.key), posicion, posicion + 3);
                    costo1 = heuristica.heuristica1(toArray(estado1));
                    mapa.put(costo1, estado1);
            System.out.println("costo1: "+costo1);
                }
                if( (posicion-1)>=0 && (posicion-1)!=2 && (posicion-1)!=5){
                    estado2 = nuevoEstado(toArray(nodoActual.key), posicion, posicion -1);
                    costo2 = heuristica.heuristica1(toArray(estado2));
                    mapa.put(costo2, estado2);
            System.out.println("costo2: "+costo2);
                }
                if( (posicion-3)>=0 ){
                    estado3 = nuevoEstado(toArray(nodoActual.key), posicion, posicion - 3);
                    costo3 = heuristica.heuristica1(toArray(estado3));
                    mapa.put(costo3, estado3);
            System.out.println("costo3: "+costo3);
                }
                if( (posicion+1)<SIZE && (posicion+1)!=3 && (posicion+1)!=6){
                    estado4 = nuevoEstado(toArray(nodoActual.key), posicion, posicion + 1);
                    costo4 = heuristica.heuristica1(toArray(estado4));
                    mapa.put(costo4, estado4);
            System.out.println("costo4: "+costo4);
                }
            break;
            case 2:
                System.out.println("caso 2");
                if( (posicion+3)<SIZE ){
                estado1 = nuevoEstado(toArray(nodoActual.key), posicion, posicion + 3);
                costo1 = heuristica.heuristica2(toArray(nodoActual.key));
                mapa.put(costo1, estado1);
                }
                if( (posicion-1)>=0 && (posicion-1)!=2 && (posicion-1)!=5){
                    estado2 = nuevoEstado(toArray(nodoActual.key), posicion, posicion -1);
                    costo1 = heuristica.heuristica2(toArray(nodoActual.key));
                    mapa.put(costo2, estado2);
                }
                if( (posicion-3)>=0 ){
                    estado3 = nuevoEstado(toArray(nodoActual.key), posicion, posicion - 3);
                    costo1 = heuristica.heuristica2(toArray(nodoActual.key));
                    mapa.put(costo3, estado3);
                }
                if( (posicion+1)<SIZE && (posicion+1)!=3 && (posicion+1)!=6){
                    estado4 = nuevoEstado(toArray(nodoActual.key), posicion, posicion + 1);
                    costo1 = heuristica.heuristica2(toArray(nodoActual.key));
                    mapa.put(costo4, estado4);
                }
            break;
            case 3:
                System.out.println("caso 3");
                if( (posicion+3)<SIZE ){
                estado1 = nuevoEstado(toArray(nodoActual.key), posicion, posicion + 3);
                costo1 = heuristica.heuristica3(toArray(nodoActual.key));
                mapa.put(costo1, estado1);
                }
                if( (posicion-1)>=0 && (posicion-1)!=2 && (posicion-1)!=5){
                    estado2 = nuevoEstado(toArray(nodoActual.key), posicion, posicion -1);
                    costo1 = heuristica.heuristica3(toArray(nodoActual.key));
                    mapa.put(costo2, estado2);
                }
                if( (posicion-3)>=0 ){
                    estado3 = nuevoEstado(toArray(nodoActual.key), posicion, posicion - 3);
                    costo1 = heuristica.heuristica3(toArray(nodoActual.key));
                    mapa.put(costo3, estado3);
                }
                if( (posicion+1)<SIZE && (posicion+1)!=3 && (posicion+1)!=6){
                    estado4 = nuevoEstado(toArray(nodoActual.key), posicion, posicion + 1);
                    costo1 = heuristica.heuristica3(toArray(nodoActual.key));
                    mapa.put(costo4, estado4);
                }
        }
        
        //evaluar menor costo y saber a cual estado le corresponde

        if(costo1 <= costo2 && costo1 <= costo3 && costo1 <= costo4){  
            menor=costo1;  
            System.out.println("costo1:menor "+costo1);
        }else{  
            if(costo2 <= costo1 && costo2 <= costo3 && costo2 <= costo4){  
                menor=costo2;  
            System.out.println("costo2: "+costo2);
            }else{  
                if(costo3 <= costo1 && costo3 <= costo2 && costo3 <= costo4){  
                    menor=costo3;  
            System.out.println("costo3: "+costo3);
                }else  
                    menor=costo4;  
            System.out.println("costo4: "+costo4);
            }  
        }  
        
        System.out.println("mapa: "+mapa.toString()+"\n menor: "+menor+" mapa.get(menor)"+(int) mapa.get(menor));
        return (int) mapa.get(menor); // retorna el estado de menor costo
    }
    
    public void insertar(Nodo padre, int heuristica){
        
        /* hay un error y es que el padre.key que se valida en el while 
        no varia a medida de las iteraciones por favor revisarlo*/
        
        Nodo hijo = new Nodo();
        while(padre.key != 123456789 && !noRepetido(padre)){ //revisar esta condicion
            System.out.println("while padre.key: "+padre.key);
            hijo = new Nodo(generarEstado(padre, heuristica));
            hijo.padre = padre; 
            System.out.println("while hijo.key: "+hijo.key);
            nuestroHash.insertar(hijo);
            System.out.println("fin while");
        }
            insertar(hijo, heuristica);
        
    }
    
    public boolean noRepetido(Nodo nodo){
        if(nuestroHash.buscar(nodo.key)==null){
            return false;
        }        
        return true;
    }
    
}