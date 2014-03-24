package puzzle;

public class Arbol<T> {
    private static final int SIZE = 9;
    
    private static String PROFUNDIDAD = "PROFUNDIDAD";
    private static String ITERATIVO = "ITERATIVO";
    private static String AMPLITUD = "AMPLITUD";
    
    private Nodo<T> raiz;    
    
    public void insertarProfundidad (T keyNodo){
        
    }

    public void insertarIterativo(T keyNodo) {
    
    }

    public void insertarAmplitud(T keyNodo) {
    
    }
    
    private void addHijo(Nodo hijo, int[] tablero, String tipoInsercion){
        switch(tipoInsercion){
            case "PROFUNDIDAD":
                    insertarProfundidad((T) hijo);
                break;
            case "ITERATIVO":
                    insertarIterativo((T) hijo);
                break;
            case "AMPLITUD":
                    insertarAmplitud((T) hijo);
                break;
        }
    }
    
    
    private boolean esMismoEstado(int [] tablero, Nodo nodo){
        return false;
    }
    
    private boolean esMismoEstado(int [] tablero, T key){
        return false;
    }
    
    private int getPosicion(Nodo nodo){
        return 0;
    }
    
    private void nuevoEstado(int [] tablero, int estadoActual, int posicion, int nuevaPosicion){
    }
    
    private boolean generarEstadoNodoNoDuplicado(Nodo nodoActual, String tipoInsercion){
        int posicion;
        int estadoActual;
        int[] tablero = new int[SIZE];
        
        estadoActual = (int) nodoActual.key;                    //es el estado del tablero
        posicion = getPosicion(nodoActual);                     //este metodo buscara en que posicion esta el simbolo de vacio
        
        if( (posicion-3)>=0 ){
            nuevoEstado(tablero, estadoActual, posicion, posicion - 3);        //          aca se agrega un nuevo estado en la hash
            if(nodoActual.padre == null){
                addHijo(nodoActual, tablero, tipoInsercion);
            }
            else{
                if(!esMismoEstado(tablero, nodoActual)){            //         se revisa si es un nuevo estado y se crea un hijo
                    addHijo(nodoActual, tablero, tipoInsercion);
                }
            }
        }

        if( (posicion-1)>=0 && (posicion-1)!=2 && (posicion-1)!=5){
            nuevoEstado(tablero, estadoActual, posicion, posicion - 1);        //          aca se agrega un nuevo estado en la hash
            if(nodoActual.padre==null){ 
                addHijo(nodoActual, tablero, tipoInsercion);
            }
            else{
                if(!esMismoEstado(tablero, nodoActual)){ 
                    addHijo(nodoActual, tablero, tipoInsercion);
                }
            }           
        }

        if( (posicion+3)<SIZE ){
            nuevoEstado(tablero, estadoActual, posicion, posicion + 3);        //          aca se agrega un nuevo estado en la hash
            if(nodoActual.padre == null){ 
                addHijo(nodoActual, tablero, tipoInsercion);
            }
            else{
                if(!esMismoEstado(tablero, nodoActual)){ 
                    addHijo(nodoActual, tablero, tipoInsercion);
                }
            }
        }

        if( (posicion+1)<SIZE && (posicion+1)!=3 && (posicion+1)!=6){
            nuevoEstado(tablero, estadoActual, posicion, posicion +1);        //          aca se agrega un nuevo estado en la hash
            if(nodoActual.padre == null){ 
                addHijo(nodoActual, tablero, tipoInsercion);
            }
            else{
                if(!esMismoEstado(tablero, nodoActual)){
                    addHijo(nodoActual, tablero, tipoInsercion); 
                }
            }
        }
        return false;
    }
    
    private boolean generarEstadoNodo(Nodo nodoActual, String tipoInsercion){
        int posicion;
        int estadoActual;
        int[] tablero = new int[SIZE];
        
        estadoActual = (int) nodoActual.key;                    //es el estado del tablero
        posicion = getPosicion(nodoActual);                     //este metodo buscara en que posicion esta el simbolo de vacio
        
        if( (posicion-3)>=0 ){
            nuevoEstado(tablero, estadoActual, posicion, posicion-3);
            if(nodoActual.padre == null){
                addHijo(nodoActual, tablero, tipoInsercion);
            }
            else{
                if(!esMismoEstado(tablero, (T) nodoActual.padre.key)){
                    addHijo(nodoActual, tablero, tipoInsercion);
                }
            }
        }
        if( (posicion-1)>=0 && (posicion-1)!=2 && (posicion-1)!=5){
            nuevoEstado(tablero, estadoActual, posicion, posicion-1);
            if(nodoActual.padre == null){
                addHijo(nodoActual, tablero, tipoInsercion);
            }
            else{
                if(!esMismoEstado(tablero, (T) nodoActual.padre.key)){
                    addHijo(nodoActual, tablero, tipoInsercion);
                }
            }
        }
        if( (posicion+3)<SIZE ){
            nuevoEstado(tablero, estadoActual, posicion, posicion+3);
            if(nodoActual.padre == null){ 
                addHijo(nodoActual, tablero, tipoInsercion);
            }
            else{
                if(!esMismoEstado(tablero, (T) nodoActual.padre.key)){ 
                    addHijo(nodoActual, tablero, tipoInsercion);
                }
            }
        }
        if( (posicion+1)<SIZE && (posicion+1)!=3 && (posicion+1)!=6){
            nuevoEstado(tablero, estadoActual, posicion, posicion+1);
            if(nodoActual.padre == null){ 
                addHijo(nodoActual, tablero, tipoInsercion);
            }
            else{
                if(!esMismoEstado(tablero, (T) nodoActual.padre.key)){
                    addHijo(nodoActual, tablero, tipoInsercion);
                }
            }
        }
        return false;
    }
    
    
    public Arbol (T keyNodo){
        raiz = new Nodo<T>();
        raiz.key = keyNodo;
    }
    
}
