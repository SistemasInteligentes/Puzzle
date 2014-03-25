package puzzle;

import java.util.Stack;

public class Arbol {
    private static int SIZE;
    
    private static String PROFUNDIDAD = "PROFUNDIDAD";
    private static String ITERATIVO = "ITERATIVO";
    private static String AMPLITUD = "AMPLITUD";
    
    private Nodo raiz;   
    private Hash nuestroHash = null;
    private Stack stack = new Stack();
    
    private int[] tablero = null;
    
    public Arbol (int keyNodo, int[] tablero){
        raiz = new Nodo();
        raiz.key = keyNodo;
        nuestroHash = new Hash();
        
        nuestroHash.insertar(raiz);
        
        this.tablero = tablero;
        SIZE = tablero.length;        
    }

    
    public void insertarProfundidad (Nodo keyNodo){
        
        Nodo actual = keyNodo;
        stack.add(keyNodo);
        nuestroHash.insertar(keyNodo);
        while(!stack.empty() && actual.key != 123456789){
            actual =(Nodo) stack.pop();
            System.out.println("1 actual.key = "+actual.key);
            generarEstadoNodoNoDuplicado(actual, PROFUNDIDAD);   
        }
        System.out.println("2 actual.key = "+actual.key);        
    }
    public void insertarIterativo (Nodo keyNodo){
        
    }
    public void insertarAmplitud (Nodo keyNodo){
        
    }
    
    private void addHijo(Nodo hijo, String tipoInsercion){
        switch(tipoInsercion){
            case "PROFUNDIDAD":
                    stack.add(hijo);
                break;
            case "ITERATIVO":
                    insertarIterativo(hijo);
                break;
            case "AMPLITUD":
                    insertarAmplitud(hijo);
                break;
        }
    }
    
    private boolean esMismoEstado(int key){
        if(nuestroHash.buscar(key) == null){
            return false;
        }
        return true;
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
            stringEstado =  tablero[i] + stringEstado ;
        }        
        System.out.println("cambio de arreglo a int: "+Integer.parseInt(stringEstado));
        return Integer.parseInt(stringEstado) ;
    }
    
    private void generarEstadoNodoNoDuplicado(Nodo nodoActual, String tipoInsercion){
        int posicion;                    //es el estado del tablero
        posicion = getPosicion(nodoActual);                     //este metodo buscara en que posicion esta el simbolo de vacio
        
        if( (posicion-3)>=0 ){
            if(!esMismoEstado(nuevoEstado(tablero, posicion, posicion - 3))){   //se revisa si es un nuevo estado y se crea un hijo
                Nodo nuevo = new Nodo(nuevoEstado(tablero, posicion, posicion - 3));
                nuevo.padre= nodoActual;
                addHijo(nuevo, tipoInsercion);
            System.out.println("condicion 1: "+nuevo.key);
            }            
        }

        if( (posicion-1)>=0 && (posicion-1)!=2 && (posicion-1)!=5){
            if(!esMismoEstado(nuevoEstado(tablero, posicion, posicion - 1))){ 
                Nodo nuevo = new Nodo(nuevoEstado(tablero, posicion, posicion - 1));
                nuevo.padre= nodoActual;
                addHijo(nuevo, tipoInsercion);
            System.out.println("condicion 2: "+nuevo.key);
            }           
        }

        if( (posicion+3)<SIZE ){
            if(!esMismoEstado(nuevoEstado(tablero, posicion, posicion + 3))){ 
                Nodo nuevo= new Nodo(nuevoEstado(tablero, posicion, posicion + 3));
                nuevo.padre= nodoActual;
                addHijo(nuevo, tipoInsercion);
            System.out.println("condicion 3: "+nuevo.key);
            }
        }

        if( (posicion+1)<SIZE && (posicion+1)!=3 && (posicion+1)!=6){
            if(!esMismoEstado(nuevoEstado(tablero, posicion, posicion +1))){
                Nodo nuevo = new Nodo(nuevoEstado(tablero, posicion, posicion +1));
                nuevo.padre= nodoActual;
                addHijo(nuevo, tipoInsercion);
            System.out.println("condicion 4: "+nuevo.key);
            }
        }
//        return false;
    }
    
//    private boolean generarEstadoNodo(Nodo nodoActual, String tipoInsercion){
//        int posicion;
//        int estadoActual;
//        int[] tablero = new int[SIZE];
//        
//        estadoActual = (int) nodoActual.key;                    //es el estado del tablero
//        posicion = getPosicion(nodoActual);                     //este metodo buscara en que posicion esta el simbolo de vacio
//        
//        if( (posicion-3)>=0 ){
//            nuevoEstado(tablero, estadoActual, posicion, posicion-3);
//            if(nodoActual.padre == null){
//                addHijo(nodoActual, tablero, tipoInsercion);
//            }
//            else{
//                if(!esMismoEstado(tablero, nodoActual.padre.key)){
//                    addHijo(nodoActual, tablero, tipoInsercion);
//                }
//            }
//        }
//        if( (posicion-1)>=0 && (posicion-1)!=2 && (posicion-1)!=5){
//            nuevoEstado(tablero, estadoActual, posicion, posicion-1);
//            if(nodoActual.padre == null){
//                addHijo(nodoActual, tablero, tipoInsercion);
//            }
//            else{
//                if(!esMismoEstado(tablero, nodoActual.padre.key)){
//                    addHijo(nodoActual, tablero, tipoInsercion);
//                }
//            }
//        }
//        if( (posicion+3)<SIZE ){
//            nuevoEstado(tablero, estadoActual, posicion, posicion+3);
//            if(nodoActual.padre == null){ 
//                addHijo(nodoActual, tablero, tipoInsercion);
//            }
//            else{
//                if(!esMismoEstado(tablero, nodoActual.padre.key)){ 
//                    addHijo(nodoActual, tablero, tipoInsercion);
//                }
//            }
//        }
//        if( (posicion+1)<SIZE && (posicion+1)!=3 && (posicion+1)!=6){
//            nuevoEstado(tablero, estadoActual, posicion, posicion+1);
//            if(nodoActual.padre == null){ 
//                addHijo(nodoActual, tablero, tipoInsercion);
//            }
//            else{
//                if(!esMismoEstado(tablero, nodoActual.padre.key)){
//                    addHijo(nodoActual, tablero, tipoInsercion);
//                }
//            }
//        }
//        return false;
//    }
}