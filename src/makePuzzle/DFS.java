package makePuzzle;

import Grafos.*;
import java.util.*;

public class DFS {

    private static ListEdgesGraph grafo = new ListEdgesGraph();
    private static String solucion;

    public static void DFS_Resolver(String solucion) {
        DFS.solucion = solucion;
        agregarPadre(solucion);
        while (grafo.numVertices() > 0) {
            Puzzle lista = new Puzzle(solucion);
            if(lista.solucion()){
                break;
            }
            
        }
    }

    public static void agregarPadre(String padre) {
        Vertex p = grafo.insertVertex(padre);
    }
}
